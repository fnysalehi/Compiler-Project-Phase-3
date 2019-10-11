%{
  package phase2;
  import java.io.*;
  import java.util.ArrayList;

%}

%token <EVal> LEFT_BRACE RIGHT_BRACE LEFT_BRACKET RIGHT_BRACKET LEFT_PARENTHESES RIGHT_PARENTHESES SEMICOLON COLON COMMA INTEGER_KW REAL_KW CHAR_KW BOOL_KW IF_KW THEN_KW ELSE_KW WHILE_KW SWITCH_KW CASE_KW DEFAULT_KW END_KW RETURN_KW BREAK_KW AND_KW OR_KW NOT_KW STATIC_KW RECORD_KW DOT_KW PLUS MINUS MULTIPLY DIVIDER MODUL QUESTION PLUS_EQUAL MINUS_EQUAL MULTIPLY_EQUAL DIVIDER_EQUAL PLUS_PLUS MINUS_MINUS ASSIGN LT LE GT GE EQ NE 


%token <EVal> ID
%type <EVal> saved_id
%token <EVal> NUMCONST
%type <EVal> saved_NUMCONST
%token <EVal> REALCONST
%type <EVal> saved_REALCONST
%token <EVal> CHARCONST
%type <EVal> saved_CHARCONST
%token <EVal> BOOLCONST
%type <EVal> saved_BOOLCONST

%type <EVal> program declarations_list declaration rec_declaration var_declaration scoped_var_declaration var_decl_list var_decl_initialize var_decl_id scoped_type_specifier type_specifier fun_declaration params param_list param_type_list param_id_list param_id statement compound_stmt local_declarations statement_list expression_stmt  selection_stmt break_stmt return_stmt iteration_stmt default_element case_element expression simple_expression rel_expression mathlogic_expression unary_expression constant factor mutable immutable call args arg_list return_type_specifier
////////////////////////////////////////////////////////////////////////////////////
//%type <EVal> M N 

%code {
public static final String TYPE_STRING_INTEGER = "int";
	public static final String TYPE_STRING_REAL = "double";
	public static final String TYPE_STRING_CHAR = "char";
	public static final String TYPE_STRING_BOOLEAN = "int";
	private static final String tempStr = "__SHLangTempVar";
	public static final String startStr = "__SHLangStartVar";
	public static final String sizeStr = "__SHLangSizeVar";
	public static final String indexStr = "__SHLangIndexVar";
	public static final String condStr = "__SHLangConditionVar"; 
	
	public static String lexIdentifier;
	public static int lexInt;
	public static double lexReal;
	public static boolean lexBoolean;
	public static char lexChar;
	// quadruple and symboltable
	
	private ArrayList<Quadruple> quadruples = new ArrayList<>();
	private SymbolTable symbolTable = new SymbolTable();
	//
	private int tempCounter = 0;
	public String fileAddress;
	
	static PrintStream writer;
    	public static void main(String args[]) throws IOException, FileNotFoundException {
       	YYParser mainclass;
       	final Yylex lexer;
	String inputCode = "testcase.txt";
       	String outputCode = "compiler.c";
       	String output = "output.txt";

       	if (args.length == 1) {
            inputCode = args[0];
            outputCode = args[0] + ".c";
            output = args[0] + ".txt";
       	}
       	if (args.length == 2) {
            inputCode = args[0];
            outputCode = args[1];
            output = args[0] + ".txt";
        }
        if (args.length == 3) {
            inputCode = args[0];
            outputCode = args[1];
            output = args[2];
        }

        writer = new PrintStream(new File(output));
        lexer = new Yylex(new InputStreamReader(new FileInputStream(inputCode)));

       mainclass = new YYParser(new Lexer() {

            @Override
            public int yylex() {
                int yyl_return = -1;
                try {
                    yyl_return = lexer.yylex();
                } catch (IOException e) {
                    System.err.println("IO error: " + e);
                }
                return yyl_return;
            }

            @Override
            public void yyerror(String error) {
                System.err.println("Error! " + error);
            }

            @Override
            public Object getLVal() {
                return null;
            }
        });
        mainclass.fileAddress = outputCode;
        mainclass.parse();

        return;
	}
	private void emit(String operation, String arg0, String arg1, String result) {
		quadruples.add(new Quadruple(operation, arg0, arg1, result));
	}
	
	private void backpatch(ArrayList<Integer> list, int quadNumber) {
		for (int i = 0; i < list.size(); i++)
			quadruples.get(list.get(i)).result = String.valueOf(quadNumber);
	}
	private String newTemp(int type, boolean array) {
		String name = tempStr + tempCounter++;
		symbolTable.addToSymbolTable(name, type, array);
		return name;
	}

	private int nextQuad() {
		return quadruples.size();
	}
		
		private String getTypeString(int typeCode){
		switch(typeCode){
			case EVal.TYPE_CODE_INTEGER:
				return TYPE_STRING_INTEGER;
			case EVal.TYPE_CODE_REAL:
				return TYPE_STRING_REAL;
			case EVal.TYPE_CODE_CHAR:
				return TYPE_STRING_CHAR;
			case EVal.TYPE_CODE_BOOLEAN:
				return TYPE_STRING_BOOLEAN;
				case EVal.TYPE_CODE_UNKNOWN:
			default:
				return null;
		}
		}
		private void exportIntermediateCode() {
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream(fileAddress));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			dos.writeBytes("#include <stdio.h>\n\nint main() {\n\t// ////////////////// Symbol Table \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ \\\\\n\n");
			dos.writeBytes(symbolTable.toString());
			dos.writeBytes("\n\t// ////////////////// Quadruples \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ \\\\\n\n");
			// Backpatch of error controllers.
			//backpatch(EVal.arrayIndexOutOfBoundList, (quadruples.size() + 1)); // Array index out of bound error.
			//backpatch(EVal.invalidArraySizeList, (quadruples.size() + 2)); // Invalid array size error.
			for (int i = 0; i < quadruples.size() && i < 100; i++) {
				dos.writeBytes(Quadruple.LINE_STR + i + ":" + "\t\t" + quadruples.get(i) + "\n");
			}
			for (int i = 100; i < quadruples.size(); i++) {
				dos.writeBytes(Quadruple.LINE_STR + i + ":" + "\t\t" + quadruples.get(i) + "\n");
			}
			// Normal Finish
			if(quadruples.size() < 100)
				dos.writeBytes(Quadruple.LINE_STR + quadruples.size() + ":" + "\t\tprintf(\"Process is terminated with no error.\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\t\treturn 0;\n");
			else
				dos.writeBytes(Quadruple.LINE_STR + quadruples.size() + ":" + "\t\tprintf(\"Process is terminated with no error.\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\t\treturn 0;\n");

			// Array index out of bound error.
			if(quadruples.size() < 100)
				dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 1) + ":" + "\t\tprintf(\"Array Error: Index out of bound!\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\treturn -1;\n");
			else
				dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 1) + ":" + "\t\tprintf(\"Array Error: Index out of bound!\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\treturn -1;\n");

			// Invalid array size error.
			if(quadruples.size() < 100)
				dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 2) + ":" + "\t\tprintf(\"Array Error: Invalid array size!\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\treturn -2;\n");
			else
				dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 2) + ":" + "\t\tprintf(\"Array Error: Invalid array size!\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\treturn -2;\n");

			dos.writeBytes("}\n");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

%right ASSIGN PLUS_EQUAL MINUS_EQUAL MULTIPLY_EQUAL DIVIDER_EQUAL
%left OR_KW 
%left AND_KW
%left EQ NE
%left LT GT LE GE
%left PLUS MINUS
%left MULTIPLY DIVIDER MODUL
%right PLUS_PLUS MINUS_MINUS 
%right NOT_KW
%nonassoc ELSE_CON
%nonassoc ELSE_KW
%left OR_ELSE AND_THEN
%left MINUS_Unary MULTIPLY_Unary Question_Unary

///////////////////////////////////////////////////////////////////////////////////////////////////
%%
program:
	 declarations_list {
		System.out.println("Rule 1: " +
			"program: declarations_list");
			exportIntermediateCode();
	};
	

declarations_list:
	declarations_list declaration{
	System.out.println("Rule 2.1: " +
			"declarations_list: declarations_list declaration");
	};
	|declaration{
	System.out.println("Rule 2.2: " +
			"declarations_list: declaration");
	
	};


declaration:
	var_declaration{
	System.out.println("Rule 3.1: " +
			"declaration: var_declaration");
	};
	|fun_declaration{
	System.out.println("Rule 3.2: " +
			"declaration: fun_declaration");
	};
	|rec_declaration{
	System.out.println("Rule 3.3: " +
			"declaration: rec_declaration");
	};
	

rec_declaration:
	RECORD_KW saved_id LEFT_BRACE local_declarations RIGHT_BRACE {
	System.out.println("Rule 4: " +
			"rec_declaration: RECORD_KW ID LEFT_BRACE local_declarations RIGHT_BRACE ");
	};
	

var_declaration:
	type_specifier var_decl_list SEMICOLON{
	System.out.println("Rule 5: " +
			"var_declaration: type_specifier var_decl_list SEMICOLON ");
	};
	
	
scoped_var_declaration:
	scoped_type_specifier var_decl_list SEMICOLON{
	System.out.println("Rule 6: " +
			"scoped_var_declaration: scoped_type_specifier var_decl_list SEMICOLON ");
	};
	
	
var_decl_list:
	var_decl_list COMMA var_decl_initialize{
	System.out.println("Rule 7.1: " +
			"var_decl_list: var_decl_list COMMA var_decl_initialize ");
	if($1.type == EVal.TYPE_CODE_UNKNOWN || $1.type == $2.type) {
		$$ = new EVal();
		//((EVal)$$).declareds = $1.declareds;
		//((EVal)$$).declareds.add($3);
	}
	else {
		System.err.println("Error! Declarator type mismatch.");
		return YYABORT;
	}
	};
	|var_decl_initialize{
	System.out.println("Rule 7.2: " +
			"var_decl_list: var_decl_initialize ");
	$$ = new EVal();
	//((EVal)$$).declareds = EVal.makeDeclareds($1);
	};
	
	
var_decl_initialize:
	var_decl_id {
	System.out.println("Rule 8.1: " +
			"var_decl_initialize: var_decl_id ");
			/*$$ = new EVal();
			((EVal)$$).place = $1.place;
			((EVal)$$).array = $1.array;
			((EVal)$$).initialize = null ;
			((EVal)$$).arraySize = $1.arraySize;*/
	};
	|var_decl_id COLON simple_expression{
	System.out.println("Rule 8.2: " +
			"var_decl_initialize: var_decl_id COLON simple_expression ");
	$$ = new EVal();
	((EVal)$$).place = $1.place;
	((EVal)$$).array = $1.array;
	((EVal)$$).arraySize = $1.arraySize;
	};
	
	
//////////////////////////////ok e
var_decl_id:
	saved_id{
	System.out.println("Rule 9.1: " +
			"var_decl_id: ID");
			$$ = new EVal();
    ((EVal)$$).place = $1.place;
    ((EVal)$$).array = false;
	};
	|saved_id LEFT_BRACKET saved_NUMCONST RIGHT_BRACKET{
	System.out.println("Rule 9.2: " +
			"var_decl_id: ID LEFT_BRACKET NUMCONST RIGHT_BRACKET");
			$$ = new EVal();
    ((EVal)$$).place = $1.place;
    ((EVal)$$).array = true;
	((EVal)$$).arraySize=lexInt;

//shahri inaro nadare
/*    symbolTable.addToSymbolTable(startStr + ((EVal)$$).place, EVal.TYPE_CODE_INTEGER, false);
    emit(":=", "0", null , startStr + ((EVal)$$).place);

    symbolTable.addToSymbolTable(sizeStr + ((EVal)$$).place, EVal.TYPE_CODE_INTEGER, false);
    emit(":=", $3.place, null , sizeStr + ((EVal)$$).place);

    symbolTable.addToSymbolTable(indexStr + ((EVal)$$).place, EVal.TYPE_CODE_INTEGER, false);
    symbolTable.addToSymbolTable(condStr + ((EVal)$$).place, EVal.TYPE_CODE_INTEGER, false);
*/
	};
///////////////////////////////////////	

scoped_type_specifier:
	STATIC_KW type_specifier{
	System.out.println("Rule 10.1: " +
			"scoped_type_specifier: STATIC_KW type_specifier");
	$$ = new EVal();
	((EVal)$$).type = $2.type;
	};
	|type_specifier{
	System.out.println("Rule 10.2: " +
			"scoped_type_specifier: type_specifier");
	$$ = new EVal();
	((EVal)$$).type = $1.type;
	};	

type_specifier : return_type_specifier {
				System.out.println("rule 11.1 : type_specifier -> return_type_specifier \n");
				$$ = new EVal();
			    ((EVal)$$).type = $1.type;
			};
			|saved_id {
				System.out.println("rule 11.2  : typeSpecifier -> RECTYPE \n");
			};

return_type_specifier : INTEGER_KW{
	System.out.println("Rule 12.1: " +
			"return_type_specifier: INTEGER_KW");
			 $$ = new EVal();
			((EVal)$$).type = EVal.TYPE_CODE_INTEGER;
	};
	|REAL_KW{
	System.out.println("Rule 12.2: " +
			"return_type_specifier: REAL_KW");
			$$ = new EVal();
			((EVal)$$).type = EVal.TYPE_CODE_REAL;
	};
	|BOOL_KW{
	System.out.println("Rule 12.3: " +
			"return_type_specifier: BOOL_KW");
			 $$ = new EVal();
			((EVal)$$).type = EVal.TYPE_CODE_BOOLEAN;
	};
	|CHAR_KW{
	System.out.println("Rule 12.4: " +
			"return_type_specifier: CHAR_KW");
			 $$ = new EVal();
			((EVal)$$).type = EVal.TYPE_CODE_CHAR;
			};
/*type_specifier:
	INTEGER_KW{
	System.out.println("Rule 12.1: " +
			"return_type_specifier: INTEGER_KW");
			 $$ = new EVal();
			((EVal)$$).type = EVal.TYPE_CODE_INTEGER;
	};
	|REAL_KW{
	System.out.println("Rule 12.2: " +
			"return_type_specifier: REAL_KW");
			$$ = new EVal();
			((EVal)$$).type = EVal.TYPE_CODE_REAL;
	};
	|BOOL_KW{
	System.out.println("Rule 12.3: " +
			"return_type_specifier: BOOL_KW");
			 $$ = new EVal();
			((EVal)$$).type = EVal.TYPE_CODE_BOOLEAN;
	};
	|CHAR_KW{
	System.out.println("Rule 12.4: " +
			"return_type_specifier: CHAR_KW");
			 $$ = new EVal();
			((EVal)$$).type = EVal.TYPE_CODE_CHAR;
	};
	|saved_id{
	System.out.println("Rule 11.2: " +
	"type_specifier:  ID(saved_id)");
	}
*/
	//////////byd bezarim

//////////////////////////////////////////////////////////////////////////////////////////
/*return_type_specifier:
	INTEGER_KW{
	System.out.println("Rule 12.1: " +
			"return_type_specifier: INTEGER_KW");
			 $$ = new EVal();
			((EVal)$$).type = EVal.TYPE_CODE_INTEGER;
	};
	|REAL_KW{
	System.out.println("Rule 12.2: " +
			"return_type_specifier: REAL_KW");
			$$ = new EVal();
			((EVal)$$).type = EVal.TYPE_CODE_REAL;
	};
	|BOOL_KW{
	System.out.println("Rule 12.3: " +
			"return_type_specifier: BOOL_KW");
			 $$ = new EVal();
			((EVal)$$).type = EVal.TYPE_CODE_BOOLEAN;
	};
	|CHAR_KW{
	System.out.println("Rule 12.4: " +
			"return_type_specifier: CHAR_KW");
			 $$ = new EVal();
			((EVal)$$).type = EVal.TYPE_CODE_CHAR;
	};*/
////////////////////////////////////////////////////////////////////////////////////////////

fun_declaration:
	type_specifier saved_id LEFT_PARENTHESES params RIGHT_PARENTHESES statement{
	System.out.println("Rule 13.1: " +
			"fun_declaration: type_specifier ID LEFT_PARENTHESES params RIGHT_PARENTHESES statement");
	};
	|saved_id LEFT_PARENTHESES params RIGHT_PARENTHESES statement{
	System.out.println("Rule 13.2: " +
			"fun_declaration: ID LEFT_PARENTHESES params RIGHT_PARENTHESES statement");
	};


params:
	param_list{
	System.out.println("Rule 14.1: " +
			"params: param_list");
	};
	|{
	System.out.println("Rule 14.2: " +
			"params:");
	};


param_list:
	param_list SEMICOLON param_type_list{
	System.out.println("Rule 15.1: " +
			"param_list: param_list SEMICOLON param_type_list");
	};
	|param_type_list{
	System.out.println("Rule 15.2: " +
			"param_list: param_type_list");
	};


param_type_list:
	type_specifier param_id_list{
	System.out.println("Rule 16: " +
			"param_type_list: type_specifier param_id_list");
	};


param_id_list:
	param_id_list COMMA param_id{
	System.out.println("Rule 17.1: " +
			"param_id_list: param_id_list COMMA param_id");
	};
	|param_id{
	System.out.println("Rule 17.2: " +
			"param_id_list: param_id");
	};


param_id:
	saved_id{
	System.out.println("Rule 18.1: " +
			"param_id: ID");
	};
	|saved_id LEFT_BRACKET RIGHT_BRACKET{
	System.out.println("Rule 18.2: " +
			"param_id: ID LEFT_BRACKET RIGHT_BRACKET");
	};

statement:
	expression_stmt{
	System.out.println("Rule 19.1: " +
			"statement: expression_stmt");
	};
	|compound_stmt{
	System.out.println("Rule 19.2: " +
			"statement: compound_stmt");
	};
	|selection_stmt{
	System.out.println("Rule 19.3: " +
			"statement: selection_stmt");
	};
	|iteration_stmt{
	System.out.println("Rule 19.4: " +
			"statement: iteration_stmt");
	};
	|return_stmt{
	System.out.println("Rule 19.5: " +
			"statement: return_stmt");
	};
	|break_stmt{
	System.out.println("Rule 19.6: " +
			"statement: break_stmt");
	};


compound_stmt:
	LEFT_BRACE local_declarations statement_list RIGHT_BRACE{
	System.out.println("Rule 20.1: " +
			"compound_stmt: LEFT_BRACE local_declarations statement_list RIGHT_BRACE");
	};
	|LEFT_BRACE local_declarations RIGHT_BRACE{
	System.out.println("Rule 20.2: " +
			"compound_stmt: LEFT_BRACE local_declarations RIGHT_BRACE ");
	};


local_declarations:
	local_declarations scoped_var_declaration{
	System.out.println("Rule 21.1: " +
			"local_declarations: local_declarations scoped_var_declaration");
	};
	|{
	System.out.println("Rule 21.2: " +
			"local_declarations: ");
	};


statement_list:
	statement_list statement{
	System.out.println("Rule 22.1: " +
			"statement_list: statement_list statement");
	};
	|statement{
	System.out.println("Rule 22.2: " +
			"statement_list:statement ");
	};


expression_stmt:
	expression SEMICOLON{
	System.out.println("Rule 23.1: " +
			"expression_stmt: expression SEMICOLON");
	};
	|SEMICOLON{
	System.out.println("Rule 23.2: " +
			"expression_stmt: SEMICOLON");
	};

////////az inja mundim************************************************KETABBBB
selection_stmt:	
IF_KW LEFT_PARENTHESES simple_expression RIGHT_PARENTHESES statement %prec ELSE_CON{
System.out.println("rule 24.1 : selectionStmt :IF_KW LEFT_PARENTHESES simple_expression RIGHT_PARENTHESES statement");
};	
|
IF_KW LEFT_PARENTHESES simple_expression RIGHT_PARENTHESES statement ELSE_KW statement %prec ELSE_KW{
System.out.println("rule 24.2 : selectionStmt :IF_KW LEFT_PARENTHESES simple_expression RIGHT_PARENTHESES statement ELSE_KW statement");
};
|SWITCH_KW LEFT_PARENTHESES simple_expression RIGHT_PARENTHESES case_element default_element END_KW{
System.out.println("rule 24.3 : selectionStmt :SWITCH_KW LEFT_PARENTHESES simple_expression RIGHT_PARENTHESES case_element default_element END_KW");

};
	

	

case_element:
	CASE_KW NUMCONST COLON statement SEMICOLON{
	System.out.println("Rule 25.1: " +
			"case_element: CASE_KW NUMCONST COLON statement SEMICOLON");
	};
	|case_element CASE_KW NUMCONST COLON statement SEMICOLON{
	System.out.println("Rule 25.2: " +
			"case_element: case_element CASE_KW NUMCONST COLON statement SEMICOLON");
	};


default_element:
	DEFAULT_KW COLON statement SEMICOLON{
	System.out.println("Rule 26.1: " +
			"default_element: DEFAULT_KW COLON statement SEMICOLON");
	};
	|{
	System.out.println("Rule 26.2: " +
			"default_element: ");
	};


iteration_stmt:
	WHILE_KW LEFT_PARENTHESES simple_expression RIGHT_PARENTHESES statement{
	System.out.println("Rule 27: " +
			"iteration_stmt: WHILE_KW LEFT_PARENTHESES simple_expression RIGHT_PARENTHESES statement");
	};


return_stmt:
	RETURN_KW SEMICOLON{
	System.out.println("Rule 28.1: " +
			"return_stmt: RETURN_KW SEMICOLON");
	};
	|RETURN_KW expression SEMICOLON{
	System.out.println("Rule 28.2: " +
			"return_stmt: RETURN_KW expression SEMICOLON");
	};


break_stmt:
	BREAK_KW SEMICOLON{
	System.out.println("Rule 29: " +
			"break_stmt: BREAK_KW SEMICOLON");
	};


expression:
	mutable ASSIGN expression{
	System.out.println("Rule 30.1: " +
			"expression: mutable ASSIGN expression");

//male khodemune vali moshkel dash tu java
	/*String srcPlace = $3.place;
    if($1.type != $3.type)
      && !($1.type == EVal.TYPE_CODE_INTEGER
          || $1.type == EVal.TYPE_CODE_CHAR
          || $1.type == EVal.TYPE_CODE_BOOLEAN)
        && ($3.type == EVal.TYPE_CODE_INTEGER
          || $3.type == EVal.TYPE_CODE_CHAR
          || $3.type == EVal.TYPE_CODE_BOOLEAN))) {
      if($1.type == EVal.TYPE_CODE_REAL)
        && ($3.type == EVal.TYPE_CODE_INTEGER
          || $3.type == EVal.TYPE_CODE_CHAR
          || $3.type == EVal.TYPE_CODE_BOOLEAN)) {
        srcPlace = newTemp(EVal.TYPE_CODE_REAL, false);
        emit("cast", $3.place, TYPE_STRING_REAL, srcPlace);
      } else if($1.type == EVal.TYPE_CODE_INTEGER
          || $1.type == EVal.TYPE_CODE_CHAR
          || $1.type == EVal.TYPE_CODE_BOOLEAN)
        && ($3.type == EVal.TYPE_CODE_REAL)) {
        srcPlace = newTemp($1.type, false);
        emit("cast", $3.place, getTypeString($1.type), srcPlace);
      } else {
        System.err.println("Error! Type mismatch: " + $1.place + ", " + $3.place);
        return YYABORT;
      }
    }
    if ($1.type) {
      System.err.println("Error! \"" + lexIdentifier + "\" is an array, it can not be used without index.");
      return YYABORT;
    }

    if($1.type != EVal.TYPE_CODE_BOOLEAN) {
      ((EVal)$$).nextList = $1.nextList;
      emit(":=", srcPlace, null, $1.place);
      switch ($1.type) {
        case EVal.TYPE_CODE_INTEGER:
          emit("iprint", null, null, $1.place);
          break;
        case EVal.TYPE_CODE_REAL:
          emit("rprint", null, null, $1.place);
          break;
        case EVal.TYPE_CODE_CHAR:
          emit("cprint", null, null, $1.place);
          break;
      }
    } else {
      backpatch($3.falseList, nextQuad());
      backpatch($3.trueList, nextQuad() + 2);
      emit(":=", "0", null, ((EVal)$$).place);
      emit("goto", null, null, String.valueOf(nextQuad() + 2));
      emit(":=", "1", null, ((EVal)$$).place);
      emit("bprint", null, null, $1.place);
    }
    ((EVal)$$).nextList = EVal.makeList(nextQuad());
    emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.*/
//shahri

if((($1.type == EVal.TYPE_CODE_INTEGER || $1.type == EVal.TYPE_CODE_CHAR || $1.type == EVal.TYPE_CODE_BOOLEAN)
			&& ($3.type == EVal.TYPE_CODE_INTEGER || $3.type == EVal.TYPE_CODE_CHAR || $3.type == EVal.TYPE_CODE_BOOLEAN))
			|| ($1.type == EVal.TYPE_CODE_REAL && $3.type == EVal.TYPE_CODE_REAL)) {
	
			$1.place = $3.place;
			$1.type  = $3.type;
			$$ = $1;
			emit("=", $3.place, null,  $1.place);

		} else if(($1.type == EVal.TYPE_CODE_INTEGER || $1.type == EVal.TYPE_CODE_CHAR || $1.type == EVal.TYPE_CODE_BOOLEAN)
			&& $3.type == EVal.TYPE_CODE_REAL) {

			$1.place = $3.place;
			$1.type  =EVal.TYPE_CODE_REAL;
			$$ = $1;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", $1.place, TYPE_STRING_REAL, tmp);
			emit("=", $3.place,null, tmp);


		} else if($1.type == EVal.TYPE_CODE_REAL
			&& ($3.type == EVal.TYPE_CODE_INTEGER || $3.type == EVal.TYPE_CODE_CHAR || $3.type == EVal.TYPE_CODE_BOOLEAN)) {

			$1.place = $3.place;
			$1.type  =EVal.TYPE_CODE_REAL;
			$$ = $1;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("=", $3.place,null, tmp);
			emit("cast", $3.place, TYPE_STRING_REAL, tmp);
			emit("=", tmp, null, $1.place);
		} else {
			System.err.println("Error! Invalid type for " + $2.operand );
			
		}
	};
	|mutable PLUS_EQUAL expression{
	System.out.println("Rule 30.2: " +
			"expression: mutable PLUS_EQUAL expression");
	};
	|mutable MINUS_EQUAL expression{
	System.out.println("Rule 30.3: " +
			"expression: mutable MINUS_EQUAL expression");
	};
	|mutable MULTIPLY_EQUAL expression{
	System.out.println("Rule 30.4: " +
			"expression: mutable MULTIPLY_EQUAL expression");
	};
	|mutable DIVIDER_EQUAL expression{
	System.out.println("Rule 30.5: " +
			"expression: mutable DIVIDER_EQUAL expression");
	};
	|mutable PLUS_PLUS{
	System.out.println("Rule 30.6: " +
			"expression: mutable PLUS_PLUS");
	};
	|mutable MINUS_MINUS{
	System.out.println("Rule 30.7: " +
			"expression: mutable MINUS_MINUS");
	};
	|simple_expression{
	System.out.println("Rule 30.8: " +
			"expression: simple_expression");
	};
	
	
simple_expression:
	simple_expression OR_KW simple_expression{
	System.out.println("Rule 31.1: " +
	"simple_expression: simple_expression OR_KW simple_expression");
	};
	|simple_expression AND_KW simple_expression{
	System.out.println("Rule 31.2: " +
	"simple_expression: simple_expression AND_KW simple_expression");
	};
	|simple_expression OR_KW ELSE_KW simple_expression %prec OR_ELSE{
	System.out.println("Rule 31.3: " +
	"simple_expression: simple_expression OR ELSE_KW simple_expression");
	};
	|simple_expression AND_KW THEN_KW simple_expression %prec AND_THEN{
	System.out.println("Rule 31.4: " +
	"simple_expression: simple_expression AND THEN_KW simple_expression");
	};
	|NOT_KW simple_expression{
	System.out.println("Rule 31.5: " +
	"simple_expression: NOT_KW simple_expression");
	};
	|rel_expression{
	System.out.println("Rule 31.6: " +
	"simple_expression: rel_expression");
	};
	
/////////////////////////////////////////////////////////////////////	
rel_expression:
	mathlogic_expression LE mathlogic_expression{
	System.out.println("Rule 32.1: " +
	"rel_expression: mathlogic_expression LE mathlogic_expression");
	};
	|mathlogic_expression LT mathlogic_expression{
	System.out.println("Rule 32.2: " +
	"rel_expression: mathlogic_expression LT mathlogic_expression");
	};
	|mathlogic_expression GT mathlogic_expression{
	System.out.println("Rule 32.3: " +
	"rel_expression: mathlogic_expression GT mathlogic_expression");
	};
	|mathlogic_expression GE mathlogic_expression{
	System.out.println("Rule 32.4: " +
	"rel_expression: mathlogic_expression GE mathlogic_expression");
	};
	|mathlogic_expression EQ mathlogic_expression{
	System.out.println("Rule 32.5: " +
	"rel_expression: mathlogic_expression EQ mathlogic_expression");
	};
	|mathlogic_expression NE mathlogic_expression{
	System.out.println("Rule 32.6: " +
	"rel_expression: mathlogic_expression NE mathlogic_expression");
	};
	|mathlogic_expression{
	System.out.println("Rule 32.7: " +
	"rel_expression: mathlogic_expression");
	};
///////////////////////////////////////////////////////////////////////////////////	

	
/*relop:
	LE{
	System.out.println("Rule 33.1: " +
	"relop: LE");
	};
	|LT{
	System.out.println("Rule 33.2: " +
	"relop: LT");
	};
	|GT{
	System.out.println("Rule 33.3: " +
	"relop: GT");
	};
	|GE{
	System.out.println("Rule 33.4: " +
	"relop: GE");
	};
	|EQ{
	System.out.println("Rule 33.5: " +
	"relop: EQ");
	};
	|NE{
	System.out.println("Rule 33.6: " +
	"relop: NE");
	};*/
	////////////////////////////////////////////
	
mathlogic_expression:
	mathlogic_expression PLUS unary_expression{
	System.out.println("Rule 34.1: " +
	"mathlogic_expression: mathlogic_expression PLUS unary_expression");
	if((($1.type == EVal.TYPE_CODE_INTEGER || $1.type == EVal.TYPE_CODE_CHAR || $1.type == EVal.TYPE_CODE_BOOLEAN)
        && ($3.type == EVal.TYPE_CODE_INTEGER || $3.type == EVal.TYPE_CODE_CHAR || $3.type == EVal.TYPE_CODE_BOOLEAN))
      || ($1.type == EVal.TYPE_CODE_REAL && $3.type == EVal.TYPE_CODE_REAL)) {
      $$ = new EVal();
      ((EVal)$$).place = newTemp($1.type, false);
      ((EVal)$$).type = $1.type;
      emit("+", $1.place, $3.place, ((EVal)$$).place);
    } else if(($1.type == EVal.TYPE_CODE_INTEGER || $1.type == EVal.TYPE_CODE_CHAR || $1.type == EVal.TYPE_CODE_BOOLEAN)
      && $3.type == EVal.TYPE_CODE_REAL) {
      $$ = new EVal();
      ((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
      ((EVal)$$).type = EVal.TYPE_CODE_REAL;
      String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
      emit("cast", $1.place, TYPE_STRING_REAL, tmp);
      emit("+", tmp, $3.place, ((EVal)$$).place);
    } else if($1.type == EVal.TYPE_CODE_REAL
      && ($3.type == EVal.TYPE_CODE_INTEGER || $3.type == EVal.TYPE_CODE_CHAR || $3.type == EVal.TYPE_CODE_BOOLEAN)) {
      $$ = new EVal();
      ((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
      ((EVal)$$).type = EVal.TYPE_CODE_REAL;
      String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
      emit("cast", $3.place, TYPE_STRING_REAL, tmp);
      emit("+", $1.place, tmp, ((EVal)$$).place);
    } else {
      System.err.println("Error! Invalid type for \"+\" operation.");
      return YYABORT;
    }

    ((EVal)$$).trueList = EVal.makeList(nextQuad());
    ((EVal)$$).falseList = EVal.makeList(nextQuad() + 1);
    ((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);

    emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
    emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
	|mathlogic_expression MINUS unary_expression{
	System.out.println("Rule 34.2: " +
	"mathlogic_expression: mathlogic_expression MINUS unary_expression");
	if((($1.type == EVal.TYPE_CODE_INTEGER || $1.type == EVal.TYPE_CODE_CHAR || $1.type == EVal.TYPE_CODE_BOOLEAN)
        && ($3.type == EVal.TYPE_CODE_INTEGER || $3.type == EVal.TYPE_CODE_CHAR || $3.type == EVal.TYPE_CODE_BOOLEAN))
      || ($1.type == EVal.TYPE_CODE_REAL && $3.type == EVal.TYPE_CODE_REAL)) {
      $$ = new EVal();
      ((EVal)$$).place = newTemp($1.type, false);
      ((EVal)$$).type = $1.type;
      emit("-", $1.place, $3.place, ((EVal)$$).place);
    } else if(($1.type == EVal.TYPE_CODE_INTEGER || $1.type == EVal.TYPE_CODE_CHAR || $1.type == EVal.TYPE_CODE_BOOLEAN)
      && $3.type == EVal.TYPE_CODE_REAL) {
      $$ = new EVal();
      ((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
      ((EVal)$$).type = EVal.TYPE_CODE_REAL;
      String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
      emit("cast", $1.place, TYPE_STRING_REAL, tmp);
      emit("-", tmp, $3.place, ((EVal)$$).place);
    } else if($1.type == EVal.TYPE_CODE_REAL
      && ($3.type == EVal.TYPE_CODE_INTEGER || $3.type == EVal.TYPE_CODE_CHAR || $3.type == EVal.TYPE_CODE_BOOLEAN)) {
      $$ = new EVal();
      ((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
      ((EVal)$$).type = EVal.TYPE_CODE_REAL;
      String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
      emit("cast", $3.place, TYPE_STRING_REAL, tmp);
      emit("-", $1.place, tmp, ((EVal)$$).place);
    } else {
      System.err.println("Error! Invalid type for \"-\" operation.");
      return YYABORT;
    }

    ((EVal)$$).trueList = EVal.makeList(nextQuad());
    ((EVal)$$).falseList = EVal.makeList(nextQuad() + 1);
    ((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);

    emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
    emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
	|mathlogic_expression MULTIPLY unary_expression{
	System.out.println("Rule 34.3: " +
	"mathlogic_expression: mathlogic_expression MULTIPLY unary_expression");
	if((($1.type == EVal.TYPE_CODE_INTEGER || $1.type == EVal.TYPE_CODE_CHAR || $1.type == EVal.TYPE_CODE_BOOLEAN)
        && ($3.type == EVal.TYPE_CODE_INTEGER || $3.type == EVal.TYPE_CODE_CHAR || $3.type == EVal.TYPE_CODE_BOOLEAN))
      || ($1.type == EVal.TYPE_CODE_REAL && $3.type == EVal.TYPE_CODE_REAL)) {
      $$ = new EVal();
      ((EVal)$$).place = newTemp($1.type, false);
      ((EVal)$$).type = $1.type;
      emit("*", $1.place, $3.place, ((EVal)$$).place);
    } else if(($1.type == EVal.TYPE_CODE_INTEGER || $1.type == EVal.TYPE_CODE_CHAR || $1.type == EVal.TYPE_CODE_BOOLEAN)
      && $3.type == EVal.TYPE_CODE_REAL) {
      $$ = new EVal();
      ((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
      ((EVal)$$).type = EVal.TYPE_CODE_REAL;
      String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
      emit("cast", $1.place, TYPE_STRING_REAL, tmp);
      emit("*", tmp, $3.place, ((EVal)$$).place);
    } else if($1.type == EVal.TYPE_CODE_REAL
      && ($3.type == EVal.TYPE_CODE_INTEGER || $3.type == EVal.TYPE_CODE_CHAR || $3.type == EVal.TYPE_CODE_BOOLEAN)) {
      $$ = new EVal();
      ((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
      ((EVal)$$).type = EVal.TYPE_CODE_REAL;
      String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
      emit("cast", $3.place, TYPE_STRING_REAL, tmp);
      emit("*", $1.place, tmp, ((EVal)$$).place);
    } else {
      System.err.println("Error! Invalid type for \"*\" operation.");
      return YYABORT;
    }

    ((EVal)$$).trueList = EVal.makeList(nextQuad());
    ((EVal)$$).falseList = EVal.makeList(nextQuad() + 1);
    ((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);

    emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
    emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
	|mathlogic_expression DIVIDER unary_expression{
	System.out.println("Rule 34.4: " +
	"mathlogic_expression: mathlogic_expression DIVIDER unary_expression");
	if((($1.type == EVal.TYPE_CODE_INTEGER || $1.type == EVal.TYPE_CODE_CHAR || $1.type == EVal.TYPE_CODE_BOOLEAN)
        && ($3.type == EVal.TYPE_CODE_INTEGER || $3.type == EVal.TYPE_CODE_CHAR || $3.type == EVal.TYPE_CODE_BOOLEAN))
      || ($1.type == EVal.TYPE_CODE_REAL && $3.type == EVal.TYPE_CODE_REAL)) {
      $$ = new EVal();
      ((EVal)$$).place = newTemp($1.type, false);
      ((EVal)$$).type = $1.type;
      emit("/", $1.place, $3.place, ((EVal)$$).place);
    } else if(($1.type == EVal.TYPE_CODE_INTEGER || $1.type == EVal.TYPE_CODE_CHAR || $1.type == EVal.TYPE_CODE_BOOLEAN)
      && $3.type == EVal.TYPE_CODE_REAL) {
      $$ = new EVal();
      ((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
      ((EVal)$$).type = EVal.TYPE_CODE_REAL;
      String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
      emit("cast", $1.place, TYPE_STRING_REAL, tmp);
      emit("/", tmp, $3.place, ((EVal)$$).place);
    } else if($1.type == EVal.TYPE_CODE_REAL
      && ($3.type == EVal.TYPE_CODE_INTEGER || $3.type == EVal.TYPE_CODE_CHAR || $3.type == EVal.TYPE_CODE_BOOLEAN)) {
      $$ = new EVal();
      ((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
      ((EVal)$$).type = EVal.TYPE_CODE_REAL;
      String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
      emit("cast", $3.place, TYPE_STRING_REAL, tmp);
      emit("/", $1.place, tmp, ((EVal)$$).place);
    } else {
      System.err.println("Error! Invalid type for \"/\" operation.");
      return YYABORT;
    }

    ((EVal)$$).trueList = EVal.makeList(nextQuad());
    ((EVal)$$).falseList = EVal.makeList(nextQuad() + 1);
    ((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);

    emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
    emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
	|mathlogic_expression MODUL unary_expression{
	System.out.println("Rule 34.5: " +
	"mathlogic_expression: mathlogic_expression MODUL unary_expression");
	if(($1.type == EVal.TYPE_CODE_INTEGER
        || $1.type == EVal.TYPE_CODE_CHAR
        || $1.type == EVal.TYPE_CODE_BOOLEAN)
      && ($3.type == EVal.TYPE_CODE_INTEGER
        || $3.type == EVal.TYPE_CODE_CHAR
        || $3.type == EVal.TYPE_CODE_BOOLEAN)) {
      $$ = new EVal();
      ((EVal)$$).place = newTemp(EVal.TYPE_CODE_INTEGER, false);
      ((EVal)$$).type = EVal.TYPE_CODE_INTEGER;
      emit("%", $1.place, $3.place, ((EVal)$$).place);
    } else if(($1.type == EVal.TYPE_CODE_INTEGER
        || $1.type == EVal.TYPE_CODE_CHAR
        || $1.type == EVal.TYPE_CODE_BOOLEAN)
      && $3.type == EVal.TYPE_CODE_REAL) {
      $$ = new EVal();
      ((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
      ((EVal)$$).type = EVal.TYPE_CODE_INTEGER;
      String tmp = newTemp(EVal.TYPE_CODE_INTEGER, false);
      emit("cast", $3.place, TYPE_STRING_INTEGER, tmp);
      emit("%", $1.place, tmp, ((EVal)$$).place);
    } else if($1.type == EVal.TYPE_CODE_REAL
      && ($3.type == EVal.TYPE_CODE_INTEGER
        || $3.type == EVal.TYPE_CODE_CHAR
        || $3.type == EVal.TYPE_CODE_BOOLEAN)) {
      $$ = new EVal();
      ((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
      ((EVal)$$).type = EVal.TYPE_CODE_INTEGER;
      String tmp = newTemp(EVal.TYPE_CODE_INTEGER, false);
      emit("cast", $1.place, TYPE_STRING_INTEGER, tmp);
      emit("%", tmp, $3.place, ((EVal)$$).place);
    } else {
      System.err.println("Error! Invalid type for \"%\" operation.");
      return YYABORT;
    }

    ((EVal)$$).trueList = EVal.makeList(nextQuad());
    ((EVal)$$).falseList = EVal.makeList(nextQuad() + 1);
    ((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);

    emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
    emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
	|unary_expression{
	System.out.println("Rule 34.6: " +
	"mathlogic_expression: unary_expression");
	};
	
	//////////////////////////////////////////////////
/*mathop:
	PLUS{
	System.out.println("Rule 35.1: " +
	"mathop:unary_expression: PLUS");
	};
	|MINUS{
	System.out.println("Rule 35.2: " +
	"mathop:unary_expression: MINUS");
	};
	|MULTIPLY{
	System.out.println("Rule 35.3: " +
	"mathop:unary_expression: MULTIPLY");
	};
	|DIVIDER{
	System.out.println("Rule 35.4: " +
	"mathop:unary_expression: DIVIDER");
	};
	|MODUL{
	System.out.println("Rule 35.5: " +
	"mathop:unary_expression: MODUL");
	};*/
	
/////////////////////////////////////////	
unary_expression:
	MINUS unary_expression %prec MINUS_Unary{
	System.out.println("Rule 36.1: " +
	"unary_expression: MINUS unary_expression");
	$$ = new EVal();
      ((EVal)$$).place = newTemp($2.type, false);
      ((EVal)$$).type = $2.type;
      emit("MINUS_Unary", $2.place, null, ((EVal)$$).place);
	  ((EVal)$$).trueList = EVal.makeList(nextQuad());
    ((EVal)$$).falseList = EVal.makeList(nextQuad() + 1);
    ((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);
    emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
    emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
	|MULTIPLY unary_expression MULTIPLY_Unary{
	System.out.println("Rule 36.2: " +
	"unary_expression: MULTIPLY unary_expression");
	$$ = new EVal();
      ((EVal)$$).place = newTemp($2.type, false);
      ((EVal)$$).type = $2.type;
      emit("MULTIPLY_Unary", $2.place, null, ((EVal)$$).place);
	  ((EVal)$$).trueList = EVal.makeList(nextQuad());
    ((EVal)$$).falseList = EVal.makeList(nextQuad() + 1);
    ((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);
    emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
    emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
	|QUESTION unary_expression %prec Question_Unary{
	System.out.println("Rule 36.3: " +
	"unary_expression: QUESTION unary_expression");
	$$ = new EVal();
      ((EVal)$$).place = newTemp($2.type, false);
      ((EVal)$$).type = $2.type;
      emit("Question_Unary", $2.place, null, ((EVal)$$).place);
	  ((EVal)$$).trueList = EVal.makeList(nextQuad());
    ((EVal)$$).falseList = EVal.makeList(nextQuad() + 1);
    ((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);
    emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
    emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
	//////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////
	|factor{
	System.out.println("Rule 36.4: " +
	"unary_expression: factor");
	};
/////////////////////////////////////////////////	
	
/*unaryop:
	MINUS{
	System.out.println("Rule 37.1 : " +
	"unaryop: MINUS ");
	};
	|MULTIPLY{
	System.out.println("Rule 37.2 : " +
	"unaryop: MULTIPLY");
	};
	|QUESTION{
	System.out.println("Rule 37.3 : " +
	"unaryop: QUESTION");
	};
	*/
	
	
factor:
	immutable{
	System.out.println("Rule 38.1 : " +
	"factor: immutable");
	};
	|mutable{
	System.out.println("Rule 38.2 : " +
	"factor: mutable");
	};
	
	
mutable:
	saved_id{
	System.out.println("Rule 39.1 : " +
	"mutable: ID");
	};
	
	|mutable LEFT_BRACKET expression RIGHT_BRACKET{
	System.out.println("Rule 39.2 : " +
	"mutable: mutable LEFT_BRACKET expression RIGHT_BRACKET ");
	};
	|mutable DOT_KW saved_id{
	System.out.println("Rule 39.3 : " +
	"mutable: mutable DOT_KW ID");
	};
	
	
immutable:
	LEFT_PARENTHESES expression RIGHT_PARENTHESES{
	System.out.println("Rule 40.1 : " +
	"immutable: LEFT_PARENTHESES expression RIGHT_PARENTHESES");
	$$ = new EVal();
	((EVal)$$).place = newTemp($2.type, false);
	((EVal)$$).type = $2.type;
	emit("()", $2.place , null , ((EVal)$$).place);
	};
	|call{
	System.out.println("Rule 40.2 : " +
	"immutable: call");
	};
	|constant{
	System.out.println("Rule 40.3 : " +
	"immutable: constant");
	$$ = new EVal();
	$$ = $1;
	};
	
	
call:
	saved_id LEFT_PARENTHESES args RIGHT_PARENTHESES{
	System.out.println("Rule 41 : " +
	"call: ID LEFT_PARENTHESES args RIGHT_PARENTHESES");
	};
	
	
args:
	arg_list{
	System.out.println("Rule 42.1 : " +
	"args: arg_list");
	};
	|{
	System.out.println("Rule 42.2 : " +
	"arg_list:");
	};
	
	
arg_list:
	arg_list COMMA expression{
	System.out.println("Rule 43.1 : " +
	"arg_list: arg_list COMMA expression");
	};
	|expression{
	System.out.println("Rule 43.2 : " +
	"arg_list: expression");
	};
	
////////////////////////////////////////////////////////////////////////	
constant:
	
saved_NUMCONST {
    System.out.println("Rule 44.1: " +
      "constant: saved_NUMCONST");
    $$ = new EVal();
    ((EVal)$$).place = $1.place;
    ((EVal)$$).type = $1.type;
    ((EVal)$$).trueList = $1.trueList;
    ((EVal)$$).falseList = $1.falseList;
    ((EVal)$$).nextList = $1.nextList;
  }
  | saved_REALCONST {
    System.out.println("Rule 44.2: " +
      "constant: saved_REALCONST");
    $$ = new EVal();
    ((EVal)$$).place = $1.place;
    ((EVal)$$).type = $1.type;
    ((EVal)$$).trueList = $1.trueList;
    ((EVal)$$).falseList = $1.falseList;
    ((EVal)$$).nextList = $1.nextList;
  }
  | saved_CHARCONST {
    System.out.println("Rule 44.3: " +
      "constant: saved_CHARCONST");
    $$ = new EVal();
    ((EVal)$$).place = $1.place;
    ((EVal)$$).type = $1.type;
    ((EVal)$$).trueList = $1.trueList;
    ((EVal)$$).falseList = $1.falseList;
    ((EVal)$$).nextList = $1.nextList;
  }
  | saved_BOOLCONST {
    System.out.println("Rule 44.4: " +
      "constant: saved_BOOLCONST");
    $$ = new EVal();
    ((EVal)$$).place = $1.place;
    ((EVal)$$).type = $1.type;
    ((EVal)$$).trueList = $1.trueList;
    ((EVal)$$).falseList = $1.falseList;
    ((EVal)$$).nextList = $1.nextList;
  }	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
saved_id:
	ID {
		System.out.println("Rule 46: " +
			"saved_id: ID");
		$$ = new EVal();
		((EVal)$$).place = lexIdentifier;
	}


saved_NUMCONST:
	NUMCONST {
		System.out.println("Rule 47: " +
			"saved_NUMCONST: NUMCONST");
		$$ = new EVal();
		((EVal)$$).place = newTemp(EVal.TYPE_CODE_INTEGER, false);
		((EVal)$$).type = EVal.TYPE_CODE_INTEGER;
		((EVal)$$).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)$$).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);

		emit(":=", String.valueOf(lexInt), null, ((EVal)$$).place);
		emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.

	}

saved_REALCONST:
	REALCONST {
		System.out.println("Rule 48: " +
			"saved_REALCONST: REALCONST");
		$$ = new EVal();
		((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
		((EVal)$$).type = EVal.TYPE_CODE_REAL;
		((EVal)$$).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)$$).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);

		emit(":=", String.valueOf(lexReal), null, ((EVal)$$).place);
		emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	}

saved_CHARCONST:
	CHARCONST {
		System.out.println("Rule 49: " +
			"saved_CHARCONST: CHARCONST");
		$$ = new EVal();
		((EVal)$$).place = newTemp(EVal.TYPE_CODE_CHAR, false);
		((EVal)$$).type = EVal.TYPE_CODE_CHAR;
		((EVal)$$).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)$$).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);

		emit(":=", "'" + String.valueOf(lexChar) + "'", null, ((EVal)$$).place);
		emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	}

saved_BOOLCONST:
	BOOLCONST {
		System.out.println("Rule 50: " +
			"saved_BOOLCONST: BOOLCONST");
		$$ = new EVal();
		((EVal)$$).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)$$).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)$$).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)$$).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);

		if(lexBoolean)
			emit(":=", "1", null, ((EVal)$$).place);
		else
			emit(":=", "0", null, ((EVal)$$).place);
		emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	}

/*M:
	{
		System.out.println("Rule 35: " +
			"M: ");
		$$ = new EVal();
		((EVal)$$).quad = nextQuad();
	}

N:
	{
		System.out.println("Rule 36: " +
			"N: ");
		$$ = new EVal();
		((EVal)$$).nextList = EVal.makeList(nextQuad());
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.
	}*/

%%
// Classes
// // EVal
class EVal {

	public static final int TYPE_CODE_UNKNOWN = -1;
	public static final int TYPE_CODE_INTEGER = 0;
	public static final int TYPE_CODE_REAL = 1;
	public static final int TYPE_CODE_CHAR = 2;
	public static final int TYPE_CODE_BOOLEAN = 3;
	public static final int TYPE_CODE_RANGE = 4;
	
	public String place;
	public int type;
	public boolean array;
	public int arraySize;
	public int quad;
	public String operand;
	public boolean isbool;
	
	public ArrayList<Integer> nextList;
	public ArrayList<Integer> trueList;
	public ArrayList<Integer> falseList;
	public EVal initialize;

	public EVal() {
	}

	public static ArrayList<Integer> makeList(int number) {
		ArrayList<Integer> result = new ArrayList<>();
		result.add(number);
		return result;
	}

	public static ArrayList<Integer> merge(ArrayList<Integer> al1, ArrayList<Integer> al2) {
		ArrayList<Integer> result = new ArrayList<>();
		result.addAll(al1);
		result.addAll(al2);
		return result;
	}
	public static ArrayList<EVal> makeDeclareds() {
		ArrayList<EVal> result = new ArrayList<>();
		return result;
	}


}

// // Quadruple
/*  ______________________________________________________________________________
 * |                                                                              |
 * |                                  Quadruples                                  |
 * |______________________________________________________________________________|
 * |              Statement             | Operation |    Arg0   |  Arg1 |  Result |
 * |____________________________________|___________|___________|_______|_________|
 * |               goto L               |    goto   |           |       |    L    |
 * |       if BOOLEAN then goto L       |   check   |  BOOLEAN  |       |    L    |
 * |             E = E1 < E2            |     <     |     E1    |   E2  |    E    |
 * |            E = E1 <= E2            |     <=    |     E1    |   E2  |    E    |
 * |             E = E1 > E2            |     >     |     E1    |   E2  |    E    |
 * |            E = E1 >= E2            |     >=    |     E1    |   E2  |    E    |
 * |            E = E1 == E2            |     =     |     E1    |   E2  |    E    |
 * |            E = E1 <> E2            |     <>    |     E1    |   E2  |    E    |
 * |             E = E1 + E2            |     +     |     E1    |   E2  |    E    |
 * |             E = E1 - E2            |     -     |     E1    |   E2  |    E    |
 * |             E = E1 * E2            |     *     |     E1    |   E2  |    E    |
 * |             E = E1 / E2            |     /     |     E1    |   E2  |    E    |
 * |             E = E1 % E2            |     %     |     E1    |   E2  |    E    |
 * |               E = -E1              |    usub   |     E1    |       |    E    |
 * |               E = E1               |     :=    |     E1    |       |    E    |
 * |            E = (TYPE) E1           |    cast   |     E1    |  TYPE |    E    |
 * |               TYPE E               |    init   |           |  TYPE |    E    |
 * |         printf("E = E.val")        |   iprint  |           |       |   int   |
 * |         printf("E = E.val")        |   rprint  |           |       |   real  |
 * |         printf("E = E.val")        |   cprint  |           |       |   char  |
 * |         printf("E = E.val")        |   bprint  |           |       | boolean |
 * |  printf("E[PLACE] = E[INDEX].val") |  aiprint  |   PLACE   | INDEX |   int   |
 * |  printf("E[PLACE] = E[INDEX].val") |  arprint  |   PLACE   | INDEX |   real  |
 * |  printf("E[PLACE] = E[INDEX].val") |  acprint  |   PLACE   | INDEX |   char  |
 * |  printf("E[PLACE] = E[INDEX].val") |  abprint  |   PLACE   | INDEX | boolean |
 * | NAME = malloc(sizeOf(TYPE) * SIZE) |   malloc  |    TYPE   |  SIZE |   NAME  |
 * |          *(E + INDEX) = E1         |    []=    |     E1    | INDEX |    E    |
 * |          E = *(E1 + INDEX)         |    =[]    |     E1    | INDEX |    E    |
 * |____________________________________|___________|___________|_______|_________|
 */
class Quadruple {

	public static final String LINE_STR = "Line";

	public String operation;
	public String arg0;
	public String arg1;
	public String result;

	public Quadruple(String operation, String arg0, String arg1, String result) {
		this.operation = operation;
		this.arg0 = arg0;
		this.arg1 = arg1;
		this.result = result;
	}

	@Override
	public String toString() {
		switch(operation.toLowerCase()){
			case "goto":
				return operation + " " + LINE_STR + result + ";";
			case "check":
				return "if (" + arg0 + ") goto " + LINE_STR + result + ";";
			case "LT":
			case "LE":
			case "GT":
			case "GE":
			case "PLUS":
			case "MINUS":
			case "MULTIPLY":
			case "DIVIDER":
			case "MODUL":
			case "PLUS_EQUAL":
			case "MINUS_EQUAL":
			case "DIVIDER_EQUAL":
			case "MULTIPLY_EQUAL":
				return result + " = " + arg0 + " " + operation + " " + arg1 + ";";
			case "EQ_KW":
				return result + " = " + arg0 + " " + "==" + " " + arg1 + ";";
				case "ASSIGN":
				return result + " = " + arg0 + ";";
				case ":=":
				return result + " = " + arg0 + ";";
			default:
				return null;
		}
	}
}

// Symbol Table
class SymbolTable {

	public static final int NOT_IN_SYMBOL_TABLE = -1;

	public ArrayList<String> names;
	public ArrayList<Integer> types;
	public ArrayList<Boolean> arrays;

	public SymbolTable() {
		names = new ArrayList<>();
		types = new ArrayList<>();
		arrays = new ArrayList<>();
	}

	public int lookUp(String name) {
		return names.indexOf(name);
	}

	public boolean addToSymbolTable(String name, int type, boolean array) {
		if (lookUp(name) == -1) {
			names.add(name);
			types.add(type);
			arrays.add(array);
			return true;
		}
		return false;
	}

	@Override
    public String toString() {
        if(names.size() == 0)
            return null;
        String res = "";
        for(int i = 0; i < names.size(); i++) {
            switch (types.get(i)) {
                case EVal.TYPE_CODE_INTEGER:
                    res += "\t" + YYParser.TYPE_STRING_INTEGER;
                    break;
                case EVal.TYPE_CODE_REAL:
                    res += "\t" + YYParser.TYPE_STRING_REAL;
                    break;
                case EVal.TYPE_CODE_CHAR:
                    res += "\t" + YYParser.TYPE_STRING_CHAR;
                    break;
                case EVal.TYPE_CODE_BOOLEAN:
                    res += "\t" + YYParser.TYPE_STRING_BOOLEAN;
                    break;
            }
            res += (arrays.get(i) ? " *" : " ") + names.get(i) + ";\n";
        }
        return res;
	}

}

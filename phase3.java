/* A Bison parser, made by GNU Bison 2.5.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java
   
      Copyright (C) 2007-2011 Free Software Foundation, Inc.
   
   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.
   
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.
   
   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* First part of user declarations.  */

/* Line 32 of lalr1.java  */
/* Line 1 of "phase3.y"  */

  package phase2;
  import java.io.*;
  import java.util.ArrayList;



/**
 * A Bison parser, automatically generated from <tt>phase3.y</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
class YYParser
{
    /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "2.5";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";


  /** True if verbose error messages are enabled.  */
  public boolean errorVerbose = false;



  /** Token returned by the scanner to signal the end of its input.  */
  public static final int EOF = 0;

/* Tokens.  */
  /** Token number, to be returned by the scanner.  */
  public static final int LEFT_BRACE = 258;
  /** Token number, to be returned by the scanner.  */
  public static final int RIGHT_BRACE = 259;
  /** Token number, to be returned by the scanner.  */
  public static final int LEFT_BRACKET = 260;
  /** Token number, to be returned by the scanner.  */
  public static final int RIGHT_BRACKET = 261;
  /** Token number, to be returned by the scanner.  */
  public static final int LEFT_PARENTHESES = 262;
  /** Token number, to be returned by the scanner.  */
  public static final int RIGHT_PARENTHESES = 263;
  /** Token number, to be returned by the scanner.  */
  public static final int SEMICOLON = 264;
  /** Token number, to be returned by the scanner.  */
  public static final int COLON = 265;
  /** Token number, to be returned by the scanner.  */
  public static final int COMMA = 266;
  /** Token number, to be returned by the scanner.  */
  public static final int INTEGER_KW = 267;
  /** Token number, to be returned by the scanner.  */
  public static final int REAL_KW = 268;
  /** Token number, to be returned by the scanner.  */
  public static final int CHAR_KW = 269;
  /** Token number, to be returned by the scanner.  */
  public static final int BOOL_KW = 270;
  /** Token number, to be returned by the scanner.  */
  public static final int IF_KW = 271;
  /** Token number, to be returned by the scanner.  */
  public static final int THEN_KW = 272;
  /** Token number, to be returned by the scanner.  */
  public static final int ELSE_KW = 273;
  /** Token number, to be returned by the scanner.  */
  public static final int WHILE_KW = 274;
  /** Token number, to be returned by the scanner.  */
  public static final int SWITCH_KW = 275;
  /** Token number, to be returned by the scanner.  */
  public static final int CASE_KW = 276;
  /** Token number, to be returned by the scanner.  */
  public static final int DEFAULT_KW = 277;
  /** Token number, to be returned by the scanner.  */
  public static final int END_KW = 278;
  /** Token number, to be returned by the scanner.  */
  public static final int RETURN_KW = 279;
  /** Token number, to be returned by the scanner.  */
  public static final int BREAK_KW = 280;
  /** Token number, to be returned by the scanner.  */
  public static final int AND_KW = 281;
  /** Token number, to be returned by the scanner.  */
  public static final int OR_KW = 282;
  /** Token number, to be returned by the scanner.  */
  public static final int NOT_KW = 283;
  /** Token number, to be returned by the scanner.  */
  public static final int STATIC_KW = 284;
  /** Token number, to be returned by the scanner.  */
  public static final int RECORD_KW = 285;
  /** Token number, to be returned by the scanner.  */
  public static final int DOT_KW = 286;
  /** Token number, to be returned by the scanner.  */
  public static final int PLUS = 287;
  /** Token number, to be returned by the scanner.  */
  public static final int MINUS = 288;
  /** Token number, to be returned by the scanner.  */
  public static final int MULTIPLY = 289;
  /** Token number, to be returned by the scanner.  */
  public static final int DIVIDER = 290;
  /** Token number, to be returned by the scanner.  */
  public static final int MODUL = 291;
  /** Token number, to be returned by the scanner.  */
  public static final int QUESTION = 292;
  /** Token number, to be returned by the scanner.  */
  public static final int PLUS_EQUAL = 293;
  /** Token number, to be returned by the scanner.  */
  public static final int MINUS_EQUAL = 294;
  /** Token number, to be returned by the scanner.  */
  public static final int MULTIPLY_EQUAL = 295;
  /** Token number, to be returned by the scanner.  */
  public static final int DIVIDER_EQUAL = 296;
  /** Token number, to be returned by the scanner.  */
  public static final int PLUS_PLUS = 297;
  /** Token number, to be returned by the scanner.  */
  public static final int MINUS_MINUS = 298;
  /** Token number, to be returned by the scanner.  */
  public static final int ASSIGN = 299;
  /** Token number, to be returned by the scanner.  */
  public static final int LT = 300;
  /** Token number, to be returned by the scanner.  */
  public static final int LE = 301;
  /** Token number, to be returned by the scanner.  */
  public static final int GT = 302;
  /** Token number, to be returned by the scanner.  */
  public static final int GE = 303;
  /** Token number, to be returned by the scanner.  */
  public static final int EQ = 304;
  /** Token number, to be returned by the scanner.  */
  public static final int NE = 305;
  /** Token number, to be returned by the scanner.  */
  public static final int ID = 306;
  /** Token number, to be returned by the scanner.  */
  public static final int NUMCONST = 307;
  /** Token number, to be returned by the scanner.  */
  public static final int REALCONST = 308;
  /** Token number, to be returned by the scanner.  */
  public static final int CHARCONST = 309;
  /** Token number, to be returned by the scanner.  */
  public static final int BOOLCONST = 310;
  /** Token number, to be returned by the scanner.  */
  public static final int ELSE_CON = 311;
  /** Token number, to be returned by the scanner.  */
  public static final int AND_THEN = 312;
  /** Token number, to be returned by the scanner.  */
  public static final int OR_ELSE = 313;
  /** Token number, to be returned by the scanner.  */
  public static final int Question_Unary = 314;
  /** Token number, to be returned by the scanner.  */
  public static final int MULTIPLY_Unary = 315;
  /** Token number, to be returned by the scanner.  */
  public static final int MINUS_Unary = 316;



  

  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>YYParser</tt>.
   */
  public interface Lexer {
    

    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.  */
    Object getLVal ();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token.
     * @return the token identifier corresponding to the next token. */
    int yylex () throws java.io.IOException;

    /**
     * Entry point for error reporting.  Emits an error
     * in a user-defined way.
     *
     * 
     * @param s The string for the error message.  */
     void yyerror (String s);
  }

  /** The object doing lexical analysis for us.  */
  private Lexer yylexer;
  
  



  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public YYParser (Lexer yylexer) {
    this.yylexer = yylexer;
    
  }

  private java.io.PrintStream yyDebugStream = System.err;

  /**
   * Return the <tt>PrintStream</tt> on which the debugging output is
   * printed.
   */
  public final java.io.PrintStream getDebugStream () { return yyDebugStream; }

  /**
   * Set the <tt>PrintStream</tt> on which the debug output is printed.
   * @param s The stream that is used for debugging output.
   */
  public final void setDebugStream(java.io.PrintStream s) { yyDebugStream = s; }

  private int yydebug = 0;

  /**
   * Answer the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   */
  public final int getDebugLevel() { return yydebug; }

  /**
   * Set the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   * @param level The verbosity level for debugging output.
   */
  public final void setDebugLevel(int level) { yydebug = level; }

  private final int yylex () throws java.io.IOException {
    return yylexer.yylex ();
  }
  protected final void yyerror (String s) {
    yylexer.yyerror (s);
  }

  

  protected final void yycdebug (String s) {
    if (yydebug > 0)
      yyDebugStream.println (s);
  }

  private final class YYStack {
    private int[] stateStack = new int[16];
    
    private Object[] valueStack = new Object[16];

    public int size = 16;
    public int height = -1;

    public final void push (int state, Object value			    ) {
      height++;
      if (size == height)
        {
	  int[] newStateStack = new int[size * 2];
	  System.arraycopy (stateStack, 0, newStateStack, 0, height);
	  stateStack = newStateStack;
	  

	  Object[] newValueStack = new Object[size * 2];
	  System.arraycopy (valueStack, 0, newValueStack, 0, height);
	  valueStack = newValueStack;

	  size *= 2;
	}

      stateStack[height] = state;
      
      valueStack[height] = value;
    }

    public final void pop () {
      pop (1);
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (num > 0) {
	java.util.Arrays.fill (valueStack, height - num + 1, height + 1, null);
        
      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }

    public final Object valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out)
    {
      out.print ("Stack now");

      for (int i = 0; i <= height; i++)
        {
	  out.print (' ');
	  out.print (stateStack[i]);
        }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).  */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).  */
  public static final int YYABORT = 1;

  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.  */
  public static final int YYERROR = 2;

  // Internal return codes that are not supported for user semantic
  // actions.
  private static final int YYERRLAB = 3;
  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;

  private int yyerrstatus_ = 0;

  /**
   * Return whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.  */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  private int yyaction (int yyn, YYStack yystack, int yylen) 
  {
    Object yyval;
    

    /* If YYLEN is nonzero, implement the default value of the action:
       `$$ = $1'.  Otherwise, use the top of the stack.

       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    if (yylen > 0)
      yyval = yystack.valueAt (yylen - 1);
    else
      yyval = yystack.valueAt (0);

    yy_reduce_print (yyn, yystack);

    switch (yyn)
      {
	  case 2:
  if (yyn == 2)
    
/* Line 351 of lalr1.java  */
/* Line 208 of "phase3.y"  */
    {
		System.out.println("Rule 1: " +
			"program: declarations_list");
			exportIntermediateCode();
	};
  break;
    

  case 3:
  if (yyn == 3)
    
/* Line 351 of lalr1.java  */
/* Line 216 of "phase3.y"  */
    {
	System.out.println("Rule 2.1: " +
			"declarations_list: declarations_list declaration");
	};
  break;
    

  case 4:
  if (yyn == 4)
    
/* Line 351 of lalr1.java  */
/* Line 220 of "phase3.y"  */
    {
	System.out.println("Rule 2.2: " +
			"declarations_list: declaration");
	
	};
  break;
    

  case 5:
  if (yyn == 5)
    
/* Line 351 of lalr1.java  */
/* Line 228 of "phase3.y"  */
    {
	System.out.println("Rule 3.1: " +
			"declaration: var_declaration");
	};
  break;
    

  case 6:
  if (yyn == 6)
    
/* Line 351 of lalr1.java  */
/* Line 232 of "phase3.y"  */
    {
	System.out.println("Rule 3.2: " +
			"declaration: fun_declaration");
	};
  break;
    

  case 7:
  if (yyn == 7)
    
/* Line 351 of lalr1.java  */
/* Line 236 of "phase3.y"  */
    {
	System.out.println("Rule 3.3: " +
			"declaration: rec_declaration");
	};
  break;
    

  case 8:
  if (yyn == 8)
    
/* Line 351 of lalr1.java  */
/* Line 243 of "phase3.y"  */
    {
	System.out.println("Rule 4: " +
			"rec_declaration: RECORD_KW ID LEFT_BRACE local_declarations RIGHT_BRACE ");
	};
  break;
    

  case 9:
  if (yyn == 9)
    
/* Line 351 of lalr1.java  */
/* Line 250 of "phase3.y"  */
    {
	System.out.println("Rule 5: " +
			"var_declaration: type_specifier var_decl_list SEMICOLON ");
	};
  break;
    

  case 10:
  if (yyn == 10)
    
/* Line 351 of lalr1.java  */
/* Line 257 of "phase3.y"  */
    {
	System.out.println("Rule 6: " +
			"scoped_var_declaration: scoped_type_specifier var_decl_list SEMICOLON ");
	};
  break;
    

  case 11:
  if (yyn == 11)
    
/* Line 351 of lalr1.java  */
/* Line 264 of "phase3.y"  */
    {
	System.out.println("Rule 7.1: " +
			"var_decl_list: var_decl_list COMMA var_decl_initialize ");
	if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_UNKNOWN || ((EVal)(yystack.valueAt (3-(1)))).type == ((EVal)(yystack.valueAt (3-(2)))).type) {
		yyval = new EVal();
		//((EVal)$$).declareds = $1.declareds;
		//((EVal)$$).declareds.add($3);
	}
	else {
		System.err.println("Error! Declarator type mismatch.");
		return YYABORT;
	}
	};
  break;
    

  case 12:
  if (yyn == 12)
    
/* Line 351 of lalr1.java  */
/* Line 277 of "phase3.y"  */
    {
	System.out.println("Rule 7.2: " +
			"var_decl_list: var_decl_initialize ");
	yyval = new EVal();
	//((EVal)$$).declareds = EVal.makeDeclareds($1);
	};
  break;
    

  case 13:
  if (yyn == 13)
    
/* Line 351 of lalr1.java  */
/* Line 286 of "phase3.y"  */
    {
	System.out.println("Rule 8.1: " +
			"var_decl_initialize: var_decl_id ");
			/*$$ = new EVal();
			((EVal)$$).place = $1.place;
			((EVal)$$).array = $1.array;
			((EVal)$$).initialize = null ;
			((EVal)$$).arraySize = $1.arraySize;*/
	};
  break;
    

  case 14:
  if (yyn == 14)
    
/* Line 351 of lalr1.java  */
/* Line 295 of "phase3.y"  */
    {
	System.out.println("Rule 8.2: " +
			"var_decl_initialize: var_decl_id COLON simple_expression ");
	yyval = new EVal();
	((EVal)yyval).place = ((EVal)(yystack.valueAt (3-(1)))).place;
	((EVal)yyval).array = ((EVal)(yystack.valueAt (3-(1)))).array;
	((EVal)yyval).arraySize = ((EVal)(yystack.valueAt (3-(1)))).arraySize;
	};
  break;
    

  case 15:
  if (yyn == 15)
    
/* Line 351 of lalr1.java  */
/* Line 307 of "phase3.y"  */
    {
	System.out.println("Rule 9.1: " +
			"var_decl_id: ID");
			yyval = new EVal();
    ((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
    ((EVal)yyval).array = false;
	};
  break;
    

  case 16:
  if (yyn == 16)
    
/* Line 351 of lalr1.java  */
/* Line 314 of "phase3.y"  */
    {
	System.out.println("Rule 9.2: " +
			"var_decl_id: ID LEFT_BRACKET NUMCONST RIGHT_BRACKET");
			yyval = new EVal();
    ((EVal)yyval).place = ((EVal)(yystack.valueAt (4-(1)))).place;
    ((EVal)yyval).array = true;
	((EVal)yyval).arraySize=lexInt;

//shahri inaro nadare
/*    symbolTable.addToSymbolTable(startStr + ((EVal)$$).place, EVal.TYPE_CODE_INTEGER, false);
    emit(":=", "0", null , startStr + ((EVal)$$).place);

    symbolTable.addToSymbolTable(sizeStr + ((EVal)$$).place, EVal.TYPE_CODE_INTEGER, false);
    emit(":=", $3.place, null , sizeStr + ((EVal)$$).place);

    symbolTable.addToSymbolTable(indexStr + ((EVal)$$).place, EVal.TYPE_CODE_INTEGER, false);
    symbolTable.addToSymbolTable(condStr + ((EVal)$$).place, EVal.TYPE_CODE_INTEGER, false);
*/
	};
  break;
    

  case 17:
  if (yyn == 17)
    
/* Line 351 of lalr1.java  */
/* Line 336 of "phase3.y"  */
    {
	System.out.println("Rule 10.1: " +
			"scoped_type_specifier: STATIC_KW type_specifier");
	yyval = new EVal();
	((EVal)yyval).type = ((EVal)(yystack.valueAt (2-(2)))).type;
	};
  break;
    

  case 18:
  if (yyn == 18)
    
/* Line 351 of lalr1.java  */
/* Line 342 of "phase3.y"  */
    {
	System.out.println("Rule 10.2: " +
			"scoped_type_specifier: type_specifier");
	yyval = new EVal();
	((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
	};
  break;
    

  case 19:
  if (yyn == 19)
    
/* Line 351 of lalr1.java  */
/* Line 349 of "phase3.y"  */
    {
				System.out.println("rule 11.1 : type_specifier -> return_type_specifier \n");
				yyval = new EVal();
			    ((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
			};
  break;
    

  case 20:
  if (yyn == 20)
    
/* Line 351 of lalr1.java  */
/* Line 354 of "phase3.y"  */
    {
				System.out.println("rule 11.2  : typeSpecifier -> RECTYPE \n");
			};
  break;
    

  case 21:
  if (yyn == 21)
    
/* Line 351 of lalr1.java  */
/* Line 358 of "phase3.y"  */
    {
	System.out.println("Rule 12.1: " +
			"return_type_specifier: INTEGER_KW");
			 yyval = new EVal();
			((EVal)yyval).type = EVal.TYPE_CODE_INTEGER;
	};
  break;
    

  case 22:
  if (yyn == 22)
    
/* Line 351 of lalr1.java  */
/* Line 364 of "phase3.y"  */
    {
	System.out.println("Rule 12.2: " +
			"return_type_specifier: REAL_KW");
			yyval = new EVal();
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
	};
  break;
    

  case 23:
  if (yyn == 23)
    
/* Line 351 of lalr1.java  */
/* Line 370 of "phase3.y"  */
    {
	System.out.println("Rule 12.3: " +
			"return_type_specifier: BOOL_KW");
			 yyval = new EVal();
			((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
	};
  break;
    

  case 24:
  if (yyn == 24)
    
/* Line 351 of lalr1.java  */
/* Line 376 of "phase3.y"  */
    {
	System.out.println("Rule 12.4: " +
			"return_type_specifier: CHAR_KW");
			 yyval = new EVal();
			((EVal)yyval).type = EVal.TYPE_CODE_CHAR;
			};
  break;
    

  case 25:
  if (yyn == 25)
    
/* Line 351 of lalr1.java  */
/* Line 443 of "phase3.y"  */
    {
	System.out.println("Rule 13.1: " +
			"fun_declaration: type_specifier ID LEFT_PARENTHESES params RIGHT_PARENTHESES statement");
	};
  break;
    

  case 26:
  if (yyn == 26)
    
/* Line 351 of lalr1.java  */
/* Line 447 of "phase3.y"  */
    {
	System.out.println("Rule 13.2: " +
			"fun_declaration: ID LEFT_PARENTHESES params RIGHT_PARENTHESES statement");
	};
  break;
    

  case 27:
  if (yyn == 27)
    
/* Line 351 of lalr1.java  */
/* Line 454 of "phase3.y"  */
    {
	System.out.println("Rule 14.1: " +
			"params: param_list");
	};
  break;
    

  case 28:
  if (yyn == 28)
    
/* Line 351 of lalr1.java  */
/* Line 458 of "phase3.y"  */
    {
	System.out.println("Rule 14.2: " +
			"params:");
	};
  break;
    

  case 29:
  if (yyn == 29)
    
/* Line 351 of lalr1.java  */
/* Line 465 of "phase3.y"  */
    {
	System.out.println("Rule 15.1: " +
			"param_list: param_list SEMICOLON param_type_list");
	};
  break;
    

  case 30:
  if (yyn == 30)
    
/* Line 351 of lalr1.java  */
/* Line 469 of "phase3.y"  */
    {
	System.out.println("Rule 15.2: " +
			"param_list: param_type_list");
	};
  break;
    

  case 31:
  if (yyn == 31)
    
/* Line 351 of lalr1.java  */
/* Line 476 of "phase3.y"  */
    {
	System.out.println("Rule 16: " +
			"param_type_list: type_specifier param_id_list");
	};
  break;
    

  case 32:
  if (yyn == 32)
    
/* Line 351 of lalr1.java  */
/* Line 483 of "phase3.y"  */
    {
	System.out.println("Rule 17.1: " +
			"param_id_list: param_id_list COMMA param_id");
	};
  break;
    

  case 33:
  if (yyn == 33)
    
/* Line 351 of lalr1.java  */
/* Line 487 of "phase3.y"  */
    {
	System.out.println("Rule 17.2: " +
			"param_id_list: param_id");
	};
  break;
    

  case 34:
  if (yyn == 34)
    
/* Line 351 of lalr1.java  */
/* Line 494 of "phase3.y"  */
    {
	System.out.println("Rule 18.1: " +
			"param_id: ID");
	};
  break;
    

  case 35:
  if (yyn == 35)
    
/* Line 351 of lalr1.java  */
/* Line 498 of "phase3.y"  */
    {
	System.out.println("Rule 18.2: " +
			"param_id: ID LEFT_BRACKET RIGHT_BRACKET");
	};
  break;
    

  case 36:
  if (yyn == 36)
    
/* Line 351 of lalr1.java  */
/* Line 504 of "phase3.y"  */
    {
	System.out.println("Rule 19.1: " +
			"statement: expression_stmt");
	};
  break;
    

  case 37:
  if (yyn == 37)
    
/* Line 351 of lalr1.java  */
/* Line 508 of "phase3.y"  */
    {
	System.out.println("Rule 19.2: " +
			"statement: compound_stmt");
	};
  break;
    

  case 38:
  if (yyn == 38)
    
/* Line 351 of lalr1.java  */
/* Line 512 of "phase3.y"  */
    {
	System.out.println("Rule 19.3: " +
			"statement: selection_stmt");
	};
  break;
    

  case 39:
  if (yyn == 39)
    
/* Line 351 of lalr1.java  */
/* Line 516 of "phase3.y"  */
    {
	System.out.println("Rule 19.4: " +
			"statement: iteration_stmt");
	};
  break;
    

  case 40:
  if (yyn == 40)
    
/* Line 351 of lalr1.java  */
/* Line 520 of "phase3.y"  */
    {
	System.out.println("Rule 19.5: " +
			"statement: return_stmt");
	};
  break;
    

  case 41:
  if (yyn == 41)
    
/* Line 351 of lalr1.java  */
/* Line 524 of "phase3.y"  */
    {
	System.out.println("Rule 19.6: " +
			"statement: break_stmt");
	};
  break;
    

  case 42:
  if (yyn == 42)
    
/* Line 351 of lalr1.java  */
/* Line 531 of "phase3.y"  */
    {
	System.out.println("Rule 20.1: " +
			"compound_stmt: LEFT_BRACE local_declarations statement_list RIGHT_BRACE");
	};
  break;
    

  case 43:
  if (yyn == 43)
    
/* Line 351 of lalr1.java  */
/* Line 535 of "phase3.y"  */
    {
	System.out.println("Rule 20.2: " +
			"compound_stmt: LEFT_BRACE local_declarations RIGHT_BRACE ");
	};
  break;
    

  case 44:
  if (yyn == 44)
    
/* Line 351 of lalr1.java  */
/* Line 542 of "phase3.y"  */
    {
	System.out.println("Rule 21.1: " +
			"local_declarations: local_declarations scoped_var_declaration");
	};
  break;
    

  case 45:
  if (yyn == 45)
    
/* Line 351 of lalr1.java  */
/* Line 546 of "phase3.y"  */
    {
	System.out.println("Rule 21.2: " +
			"local_declarations: ");
	};
  break;
    

  case 46:
  if (yyn == 46)
    
/* Line 351 of lalr1.java  */
/* Line 553 of "phase3.y"  */
    {
	System.out.println("Rule 22.1: " +
			"statement_list: statement_list statement");
	};
  break;
    

  case 47:
  if (yyn == 47)
    
/* Line 351 of lalr1.java  */
/* Line 557 of "phase3.y"  */
    {
	System.out.println("Rule 22.2: " +
			"statement_list:statement ");
	};
  break;
    

  case 48:
  if (yyn == 48)
    
/* Line 351 of lalr1.java  */
/* Line 564 of "phase3.y"  */
    {
	System.out.println("Rule 23.1: " +
			"expression_stmt: expression SEMICOLON");
	};
  break;
    

  case 49:
  if (yyn == 49)
    
/* Line 351 of lalr1.java  */
/* Line 568 of "phase3.y"  */
    {
	System.out.println("Rule 23.2: " +
			"expression_stmt: SEMICOLON");
	};
  break;
    

  case 50:
  if (yyn == 50)
    
/* Line 351 of lalr1.java  */
/* Line 575 of "phase3.y"  */
    {
System.out.println("rule 24.1 : selectionStmt :IF_KW LEFT_PARENTHESES simple_expression RIGHT_PARENTHESES statement");
};
  break;
    

  case 51:
  if (yyn == 51)
    
/* Line 351 of lalr1.java  */
/* Line 579 of "phase3.y"  */
    {
System.out.println("rule 24.2 : selectionStmt :IF_KW LEFT_PARENTHESES simple_expression RIGHT_PARENTHESES statement ELSE_KW statement");
};
  break;
    

  case 52:
  if (yyn == 52)
    
/* Line 351 of lalr1.java  */
/* Line 582 of "phase3.y"  */
    {
System.out.println("rule 24.3 : selectionStmt :SWITCH_KW LEFT_PARENTHESES simple_expression RIGHT_PARENTHESES case_element default_element END_KW");

};
  break;
    

  case 53:
  if (yyn == 53)
    
/* Line 351 of lalr1.java  */
/* Line 591 of "phase3.y"  */
    {
	System.out.println("Rule 25.1: " +
			"case_element: CASE_KW NUMCONST COLON statement SEMICOLON");
	};
  break;
    

  case 54:
  if (yyn == 54)
    
/* Line 351 of lalr1.java  */
/* Line 595 of "phase3.y"  */
    {
	System.out.println("Rule 25.2: " +
			"case_element: case_element CASE_KW NUMCONST COLON statement SEMICOLON");
	};
  break;
    

  case 55:
  if (yyn == 55)
    
/* Line 351 of lalr1.java  */
/* Line 602 of "phase3.y"  */
    {
	System.out.println("Rule 26.1: " +
			"default_element: DEFAULT_KW COLON statement SEMICOLON");
	};
  break;
    

  case 56:
  if (yyn == 56)
    
/* Line 351 of lalr1.java  */
/* Line 606 of "phase3.y"  */
    {
	System.out.println("Rule 26.2: " +
			"default_element: ");
	};
  break;
    

  case 57:
  if (yyn == 57)
    
/* Line 351 of lalr1.java  */
/* Line 613 of "phase3.y"  */
    {
	System.out.println("Rule 27: " +
			"iteration_stmt: WHILE_KW LEFT_PARENTHESES simple_expression RIGHT_PARENTHESES statement");
	};
  break;
    

  case 58:
  if (yyn == 58)
    
/* Line 351 of lalr1.java  */
/* Line 620 of "phase3.y"  */
    {
	System.out.println("Rule 28.1: " +
			"return_stmt: RETURN_KW SEMICOLON");
	};
  break;
    

  case 59:
  if (yyn == 59)
    
/* Line 351 of lalr1.java  */
/* Line 624 of "phase3.y"  */
    {
	System.out.println("Rule 28.2: " +
			"return_stmt: RETURN_KW expression SEMICOLON");
	};
  break;
    

  case 60:
  if (yyn == 60)
    
/* Line 351 of lalr1.java  */
/* Line 631 of "phase3.y"  */
    {
	System.out.println("Rule 29: " +
			"break_stmt: BREAK_KW SEMICOLON");
	};
  break;
    

  case 61:
  if (yyn == 61)
    
/* Line 351 of lalr1.java  */
/* Line 638 of "phase3.y"  */
    {
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

if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
	
			((EVal)(yystack.valueAt (3-(1)))).place = ((EVal)(yystack.valueAt (3-(3)))).place;
			((EVal)(yystack.valueAt (3-(1)))).type  = ((EVal)(yystack.valueAt (3-(3)))).type;
			yyval = ((EVal)(yystack.valueAt (3-(1))));
			emit("=", ((EVal)(yystack.valueAt (3-(3)))).place, null,  ((EVal)(yystack.valueAt (3-(1)))).place);

		} else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {

			((EVal)(yystack.valueAt (3-(1)))).place = ((EVal)(yystack.valueAt (3-(3)))).place;
			((EVal)(yystack.valueAt (3-(1)))).type  =EVal.TYPE_CODE_REAL;
			yyval = ((EVal)(yystack.valueAt (3-(1))));
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
			emit("=", ((EVal)(yystack.valueAt (3-(3)))).place,null, tmp);


		} else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {

			((EVal)(yystack.valueAt (3-(1)))).place = ((EVal)(yystack.valueAt (3-(3)))).place;
			((EVal)(yystack.valueAt (3-(1)))).type  =EVal.TYPE_CODE_REAL;
			yyval = ((EVal)(yystack.valueAt (3-(1))));
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("=", ((EVal)(yystack.valueAt (3-(3)))).place,null, tmp);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("=", tmp, null, ((EVal)(yystack.valueAt (3-(1)))).place);
		} else {
			System.err.println("Error! Invalid type for " + ((EVal)(yystack.valueAt (3-(2)))).operand );
			
		}
	};
  break;
    

  case 62:
  if (yyn == 62)
    
/* Line 351 of lalr1.java  */
/* Line 734 of "phase3.y"  */
    {
	System.out.println("Rule 30.2: " +
			"expression: mutable PLUS_EQUAL expression");
	};
  break;
    

  case 63:
  if (yyn == 63)
    
/* Line 351 of lalr1.java  */
/* Line 738 of "phase3.y"  */
    {
	System.out.println("Rule 30.3: " +
			"expression: mutable MINUS_EQUAL expression");
	};
  break;
    

  case 64:
  if (yyn == 64)
    
/* Line 351 of lalr1.java  */
/* Line 742 of "phase3.y"  */
    {
	System.out.println("Rule 30.4: " +
			"expression: mutable MULTIPLY_EQUAL expression");
	};
  break;
    

  case 65:
  if (yyn == 65)
    
/* Line 351 of lalr1.java  */
/* Line 746 of "phase3.y"  */
    {
	System.out.println("Rule 30.5: " +
			"expression: mutable DIVIDER_EQUAL expression");
	};
  break;
    

  case 66:
  if (yyn == 66)
    
/* Line 351 of lalr1.java  */
/* Line 750 of "phase3.y"  */
    {
	System.out.println("Rule 30.6: " +
			"expression: mutable PLUS_PLUS");
	};
  break;
    

  case 67:
  if (yyn == 67)
    
/* Line 351 of lalr1.java  */
/* Line 754 of "phase3.y"  */
    {
	System.out.println("Rule 30.7: " +
			"expression: mutable MINUS_MINUS");
	};
  break;
    

  case 68:
  if (yyn == 68)
    
/* Line 351 of lalr1.java  */
/* Line 758 of "phase3.y"  */
    {
	System.out.println("Rule 30.8: " +
			"expression: simple_expression");
	};
  break;
    

  case 69:
  if (yyn == 69)
    
/* Line 351 of lalr1.java  */
/* Line 765 of "phase3.y"  */
    {
	System.out.println("Rule 31.1: " +
	"simple_expression: simple_expression OR_KW simple_expression");
	};
  break;
    

  case 70:
  if (yyn == 70)
    
/* Line 351 of lalr1.java  */
/* Line 769 of "phase3.y"  */
    {
	System.out.println("Rule 31.2: " +
	"simple_expression: simple_expression AND_KW simple_expression");
	};
  break;
    

  case 71:
  if (yyn == 71)
    
/* Line 351 of lalr1.java  */
/* Line 773 of "phase3.y"  */
    {
	System.out.println("Rule 31.3: " +
	"simple_expression: simple_expression OR ELSE_KW simple_expression");
	};
  break;
    

  case 72:
  if (yyn == 72)
    
/* Line 351 of lalr1.java  */
/* Line 777 of "phase3.y"  */
    {
	System.out.println("Rule 31.4: " +
	"simple_expression: simple_expression AND THEN_KW simple_expression");
	};
  break;
    

  case 73:
  if (yyn == 73)
    
/* Line 351 of lalr1.java  */
/* Line 781 of "phase3.y"  */
    {
	System.out.println("Rule 31.5: " +
	"simple_expression: NOT_KW simple_expression");
	};
  break;
    

  case 74:
  if (yyn == 74)
    
/* Line 351 of lalr1.java  */
/* Line 785 of "phase3.y"  */
    {
	System.out.println("Rule 31.6: " +
	"simple_expression: rel_expression");
	};
  break;
    

  case 75:
  if (yyn == 75)
    
/* Line 351 of lalr1.java  */
/* Line 792 of "phase3.y"  */
    {
	System.out.println("Rule 32.1: " +
	"rel_expression: mathlogic_expression LE mathlogic_expression");
	};
  break;
    

  case 76:
  if (yyn == 76)
    
/* Line 351 of lalr1.java  */
/* Line 796 of "phase3.y"  */
    {
	System.out.println("Rule 32.2: " +
	"rel_expression: mathlogic_expression LT mathlogic_expression");
	};
  break;
    

  case 77:
  if (yyn == 77)
    
/* Line 351 of lalr1.java  */
/* Line 800 of "phase3.y"  */
    {
	System.out.println("Rule 32.3: " +
	"rel_expression: mathlogic_expression GT mathlogic_expression");
	};
  break;
    

  case 78:
  if (yyn == 78)
    
/* Line 351 of lalr1.java  */
/* Line 804 of "phase3.y"  */
    {
	System.out.println("Rule 32.4: " +
	"rel_expression: mathlogic_expression GE mathlogic_expression");
	};
  break;
    

  case 79:
  if (yyn == 79)
    
/* Line 351 of lalr1.java  */
/* Line 808 of "phase3.y"  */
    {
	System.out.println("Rule 32.5: " +
	"rel_expression: mathlogic_expression EQ mathlogic_expression");
	};
  break;
    

  case 80:
  if (yyn == 80)
    
/* Line 351 of lalr1.java  */
/* Line 812 of "phase3.y"  */
    {
	System.out.println("Rule 32.6: " +
	"rel_expression: mathlogic_expression NE mathlogic_expression");
	};
  break;
    

  case 81:
  if (yyn == 81)
    
/* Line 351 of lalr1.java  */
/* Line 816 of "phase3.y"  */
    {
	System.out.println("Rule 32.7: " +
	"rel_expression: mathlogic_expression");
	};
  break;
    

  case 82:
  if (yyn == 82)
    
/* Line 351 of lalr1.java  */
/* Line 851 of "phase3.y"  */
    {
	System.out.println("Rule 34.1: " +
	"mathlogic_expression: mathlogic_expression PLUS unary_expression");
	if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
        && (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
      || (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
      yyval = new EVal();
      ((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (3-(1)))).type, false);
      ((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(1)))).type;
      emit("+", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
    } else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
      && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
      yyval = new EVal();
      ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
      ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
      String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
      emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
      emit("+", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
    } else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
      && (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
      yyval = new EVal();
      ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
      ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
      String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
      emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
      emit("+", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, ((EVal)yyval).place);
    } else {
      System.err.println("Error! Invalid type for \"+\" operation.");
      return YYABORT;
    }

    ((EVal)yyval).trueList = EVal.makeList(nextQuad());
    ((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
    ((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

    emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
    emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 83:
  if (yyn == 83)
    
/* Line 351 of lalr1.java  */
/* Line 889 of "phase3.y"  */
    {
	System.out.println("Rule 34.2: " +
	"mathlogic_expression: mathlogic_expression MINUS unary_expression");
	if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
        && (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
      || (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
      yyval = new EVal();
      ((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (3-(1)))).type, false);
      ((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(1)))).type;
      emit("-", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
    } else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
      && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
      yyval = new EVal();
      ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
      ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
      String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
      emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
      emit("-", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
    } else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
      && (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
      yyval = new EVal();
      ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
      ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
      String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
      emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
      emit("-", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, ((EVal)yyval).place);
    } else {
      System.err.println("Error! Invalid type for \"-\" operation.");
      return YYABORT;
    }

    ((EVal)yyval).trueList = EVal.makeList(nextQuad());
    ((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
    ((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

    emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
    emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 84:
  if (yyn == 84)
    
/* Line 351 of lalr1.java  */
/* Line 927 of "phase3.y"  */
    {
	System.out.println("Rule 34.3: " +
	"mathlogic_expression: mathlogic_expression MULTIPLY unary_expression");
	if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
        && (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
      || (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
      yyval = new EVal();
      ((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (3-(1)))).type, false);
      ((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(1)))).type;
      emit("*", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
    } else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
      && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
      yyval = new EVal();
      ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
      ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
      String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
      emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
      emit("*", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
    } else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
      && (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
      yyval = new EVal();
      ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
      ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
      String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
      emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
      emit("*", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, ((EVal)yyval).place);
    } else {
      System.err.println("Error! Invalid type for \"*\" operation.");
      return YYABORT;
    }

    ((EVal)yyval).trueList = EVal.makeList(nextQuad());
    ((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
    ((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

    emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
    emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 85:
  if (yyn == 85)
    
/* Line 351 of lalr1.java  */
/* Line 965 of "phase3.y"  */
    {
	System.out.println("Rule 34.4: " +
	"mathlogic_expression: mathlogic_expression DIVIDER unary_expression");
	if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
        && (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
      || (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
      yyval = new EVal();
      ((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (3-(1)))).type, false);
      ((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(1)))).type;
      emit("/", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
    } else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
      && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
      yyval = new EVal();
      ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
      ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
      String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
      emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
      emit("/", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
    } else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
      && (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
      yyval = new EVal();
      ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
      ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
      String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
      emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
      emit("/", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, ((EVal)yyval).place);
    } else {
      System.err.println("Error! Invalid type for \"/\" operation.");
      return YYABORT;
    }

    ((EVal)yyval).trueList = EVal.makeList(nextQuad());
    ((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
    ((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

    emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
    emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 86:
  if (yyn == 86)
    
/* Line 351 of lalr1.java  */
/* Line 1003 of "phase3.y"  */
    {
	System.out.println("Rule 34.5: " +
	"mathlogic_expression: mathlogic_expression MODUL unary_expression");
	if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER
        || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR
        || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
      && (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER
        || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR
        || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
      yyval = new EVal();
      ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_INTEGER, false);
      ((EVal)yyval).type = EVal.TYPE_CODE_INTEGER;
      emit("%", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
    } else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER
        || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR
        || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
      && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
      yyval = new EVal();
      ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
      ((EVal)yyval).type = EVal.TYPE_CODE_INTEGER;
      String tmp = newTemp(EVal.TYPE_CODE_INTEGER, false);
      emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_INTEGER, tmp);
      emit("%", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, ((EVal)yyval).place);
    } else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
      && (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER
        || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR
        || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
      yyval = new EVal();
      ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
      ((EVal)yyval).type = EVal.TYPE_CODE_INTEGER;
      String tmp = newTemp(EVal.TYPE_CODE_INTEGER, false);
      emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_INTEGER, tmp);
      emit("%", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
    } else {
      System.err.println("Error! Invalid type for \"%\" operation.");
      return YYABORT;
    }

    ((EVal)yyval).trueList = EVal.makeList(nextQuad());
    ((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
    ((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

    emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
    emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 87:
  if (yyn == 87)
    
/* Line 351 of lalr1.java  */
/* Line 1048 of "phase3.y"  */
    {
	System.out.println("Rule 34.6: " +
	"mathlogic_expression: unary_expression");
	};
  break;
    

  case 88:
  if (yyn == 88)
    
/* Line 351 of lalr1.java  */
/* Line 1078 of "phase3.y"  */
    {
	System.out.println("Rule 36.1: " +
	"unary_expression: MINUS unary_expression");
	yyval = new EVal();
      ((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (2-(2)))).type, false);
      ((EVal)yyval).type = ((EVal)(yystack.valueAt (2-(2)))).type;
      emit("MINUS_Unary", ((EVal)(yystack.valueAt (2-(2)))).place, null, ((EVal)yyval).place);
	  ((EVal)yyval).trueList = EVal.makeList(nextQuad());
    ((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
    ((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);
    emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
    emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 89:
  if (yyn == 89)
    
/* Line 351 of lalr1.java  */
/* Line 1091 of "phase3.y"  */
    {
	System.out.println("Rule 36.2: " +
	"unary_expression: MULTIPLY unary_expression");
	yyval = new EVal();
      ((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (3-(2)))).type, false);
      ((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(2)))).type;
      emit("MULTIPLY_Unary", ((EVal)(yystack.valueAt (3-(2)))).place, null, ((EVal)yyval).place);
	  ((EVal)yyval).trueList = EVal.makeList(nextQuad());
    ((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
    ((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);
    emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
    emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 90:
  if (yyn == 90)
    
/* Line 351 of lalr1.java  */
/* Line 1104 of "phase3.y"  */
    {
	System.out.println("Rule 36.3: " +
	"unary_expression: QUESTION unary_expression");
	yyval = new EVal();
      ((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (2-(2)))).type, false);
      ((EVal)yyval).type = ((EVal)(yystack.valueAt (2-(2)))).type;
      emit("Question_Unary", ((EVal)(yystack.valueAt (2-(2)))).place, null, ((EVal)yyval).place);
	  ((EVal)yyval).trueList = EVal.makeList(nextQuad());
    ((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
    ((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);
    emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
    emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 91:
  if (yyn == 91)
    
/* Line 351 of lalr1.java  */
/* Line 1119 of "phase3.y"  */
    {
	System.out.println("Rule 36.4: " +
	"unary_expression: factor");
	};
  break;
    

  case 92:
  if (yyn == 92)
    
/* Line 351 of lalr1.java  */
/* Line 1142 of "phase3.y"  */
    {
	System.out.println("Rule 38.1 : " +
	"factor: immutable");
	};
  break;
    

  case 93:
  if (yyn == 93)
    
/* Line 351 of lalr1.java  */
/* Line 1146 of "phase3.y"  */
    {
	System.out.println("Rule 38.2 : " +
	"factor: mutable");
	};
  break;
    

  case 94:
  if (yyn == 94)
    
/* Line 351 of lalr1.java  */
/* Line 1153 of "phase3.y"  */
    {
	System.out.println("Rule 39.1 : " +
	"mutable: ID");
	};
  break;
    

  case 95:
  if (yyn == 95)
    
/* Line 351 of lalr1.java  */
/* Line 1158 of "phase3.y"  */
    {
	System.out.println("Rule 39.2 : " +
	"mutable: mutable LEFT_BRACKET expression RIGHT_BRACKET ");
	};
  break;
    

  case 96:
  if (yyn == 96)
    
/* Line 351 of lalr1.java  */
/* Line 1162 of "phase3.y"  */
    {
	System.out.println("Rule 39.3 : " +
	"mutable: mutable DOT_KW ID");
	};
  break;
    

  case 97:
  if (yyn == 97)
    
/* Line 351 of lalr1.java  */
/* Line 1169 of "phase3.y"  */
    {
	System.out.println("Rule 40.1 : " +
	"immutable: LEFT_PARENTHESES expression RIGHT_PARENTHESES");
	yyval = new EVal();
	((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (3-(2)))).type, false);
	((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(2)))).type;
	emit("()", ((EVal)(yystack.valueAt (3-(2)))).place , null , ((EVal)yyval).place);
	};
  break;
    

  case 98:
  if (yyn == 98)
    
/* Line 351 of lalr1.java  */
/* Line 1177 of "phase3.y"  */
    {
	System.out.println("Rule 40.2 : " +
	"immutable: call");
	};
  break;
    

  case 99:
  if (yyn == 99)
    
/* Line 351 of lalr1.java  */
/* Line 1181 of "phase3.y"  */
    {
	System.out.println("Rule 40.3 : " +
	"immutable: constant");
	yyval = new EVal();
	yyval = ((EVal)(yystack.valueAt (1-(1))));
	};
  break;
    

  case 100:
  if (yyn == 100)
    
/* Line 351 of lalr1.java  */
/* Line 1190 of "phase3.y"  */
    {
	System.out.println("Rule 41 : " +
	"call: ID LEFT_PARENTHESES args RIGHT_PARENTHESES");
	};
  break;
    

  case 101:
  if (yyn == 101)
    
/* Line 351 of lalr1.java  */
/* Line 1197 of "phase3.y"  */
    {
	System.out.println("Rule 42.1 : " +
	"args: arg_list");
	};
  break;
    

  case 102:
  if (yyn == 102)
    
/* Line 351 of lalr1.java  */
/* Line 1201 of "phase3.y"  */
    {
	System.out.println("Rule 42.2 : " +
	"arg_list:");
	};
  break;
    

  case 103:
  if (yyn == 103)
    
/* Line 351 of lalr1.java  */
/* Line 1208 of "phase3.y"  */
    {
	System.out.println("Rule 43.1 : " +
	"arg_list: arg_list COMMA expression");
	};
  break;
    

  case 104:
  if (yyn == 104)
    
/* Line 351 of lalr1.java  */
/* Line 1212 of "phase3.y"  */
    {
	System.out.println("Rule 43.2 : " +
	"arg_list: expression");
	};
  break;
    

  case 105:
  if (yyn == 105)
    
/* Line 351 of lalr1.java  */
/* Line 1220 of "phase3.y"  */
    {
    System.out.println("Rule 44.1: " +
      "constant: saved_NUMCONST");
    yyval = new EVal();
    ((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
    ((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
    ((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
    ((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
    ((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
  };
  break;
    

  case 106:
  if (yyn == 106)
    
/* Line 351 of lalr1.java  */
/* Line 1230 of "phase3.y"  */
    {
    System.out.println("Rule 44.2: " +
      "constant: saved_REALCONST");
    yyval = new EVal();
    ((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
    ((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
    ((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
    ((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
    ((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
  };
  break;
    

  case 107:
  if (yyn == 107)
    
/* Line 351 of lalr1.java  */
/* Line 1240 of "phase3.y"  */
    {
    System.out.println("Rule 44.3: " +
      "constant: saved_CHARCONST");
    yyval = new EVal();
    ((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
    ((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
    ((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
    ((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
    ((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
  };
  break;
    

  case 108:
  if (yyn == 108)
    
/* Line 351 of lalr1.java  */
/* Line 1250 of "phase3.y"  */
    {
    System.out.println("Rule 44.4: " +
      "constant: saved_BOOLCONST");
    yyval = new EVal();
    ((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
    ((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
    ((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
    ((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
    ((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
  };
  break;
    

  case 109:
  if (yyn == 109)
    
/* Line 351 of lalr1.java  */
/* Line 1263 of "phase3.y"  */
    {
		System.out.println("Rule 46: " +
			"saved_id: ID");
		yyval = new EVal();
		((EVal)yyval).place = lexIdentifier;
	};
  break;
    

  case 110:
  if (yyn == 110)
    
/* Line 351 of lalr1.java  */
/* Line 1272 of "phase3.y"  */
    {
		System.out.println("Rule 47: " +
			"saved_NUMCONST: NUMCONST");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_INTEGER, false);
		((EVal)yyval).type = EVal.TYPE_CODE_INTEGER;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		emit(":=", String.valueOf(lexInt), null, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.

	};
  break;
    

  case 111:
  if (yyn == 111)
    
/* Line 351 of lalr1.java  */
/* Line 1289 of "phase3.y"  */
    {
		System.out.println("Rule 48: " +
			"saved_REALCONST: REALCONST");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
		((EVal)yyval).type = EVal.TYPE_CODE_REAL;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		emit(":=", String.valueOf(lexReal), null, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 112:
  if (yyn == 112)
    
/* Line 351 of lalr1.java  */
/* Line 1305 of "phase3.y"  */
    {
		System.out.println("Rule 49: " +
			"saved_CHARCONST: CHARCONST");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_CHAR, false);
		((EVal)yyval).type = EVal.TYPE_CODE_CHAR;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		emit(":=", "'" + String.valueOf(lexChar) + "'", null, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 113:
  if (yyn == 113)
    
/* Line 351 of lalr1.java  */
/* Line 1321 of "phase3.y"  */
    {
		System.out.println("Rule 50: " +
			"saved_BOOLCONST: BOOLCONST");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		if(lexBoolean)
			emit(":=", "1", null, ((EVal)yyval).place);
		else
			emit(":=", "0", null, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    



/* Line 351 of lalr1.java  */
/* Line 2166 of "phase3.java"  */
	default: break;
      }

    yy_symbol_print ("-> $$ =", yyr1_[yyn], yyval);

    yystack.pop (yylen);
    yylen = 0;

    /* Shift the result of the reduction.  */
    yyn = yyr1_[yyn];
    int yystate = yypgoto_[yyn - yyntokens_] + yystack.stateAt (0);
    if (0 <= yystate && yystate <= yylast_
	&& yycheck_[yystate] == yystack.stateAt (0))
      yystate = yytable_[yystate];
    else
      yystate = yydefgoto_[yyn - yyntokens_];

    yystack.push (yystate, yyval);
    return YYNEWSTATE;
  }

  /* Return YYSTR after stripping away unnecessary quotes and
     backslashes, so that it's suitable for yyerror.  The heuristic is
     that double-quoting is unnecessary unless the string contains an
     apostrophe, a comma, or backslash (other than backslash-backslash).
     YYSTR is taken from yytname.  */
  private final String yytnamerr_ (String yystr)
  {
    if (yystr.charAt (0) == '"')
      {
        StringBuffer yyr = new StringBuffer ();
        strip_quotes: for (int i = 1; i < yystr.length (); i++)
          switch (yystr.charAt (i))
            {
            case '\'':
            case ',':
              break strip_quotes;

            case '\\':
	      if (yystr.charAt(++i) != '\\')
                break strip_quotes;
              /* Fall through.  */
            default:
              yyr.append (yystr.charAt (i));
              break;

            case '"':
              return yyr.toString ();
            }
      }
    else if (yystr.equals ("$end"))
      return "end of input";

    return yystr;
  }

  /*--------------------------------.
  | Print this symbol on YYOUTPUT.  |
  `--------------------------------*/

  private void yy_symbol_print (String s, int yytype,
			         Object yyvaluep				 )
  {
    if (yydebug > 0)
    yycdebug (s + (yytype < yyntokens_ ? " token " : " nterm ")
	      + yytname_[yytype] + " ("
	      + (yyvaluep == null ? "(null)" : yyvaluep.toString ()) + ")");
  }

  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
  public boolean parse () throws java.io.IOException
  {
    /// Lookahead and lookahead in internal form.
    int yychar = yyempty_;
    int yytoken = 0;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;

    YYStack yystack = new YYStack ();

    /* Error handling.  */
    int yynerrs_ = 0;
    

    /// Semantic value of the lookahead.
    Object yylval = null;

    int yyresult;

    yycdebug ("Starting parse\n");
    yyerrstatus_ = 0;


    /* Initialize the stack.  */
    yystack.push (yystate, yylval);

    int label = YYNEWSTATE;
    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
	   pushed when we come here.  */
      case YYNEWSTATE:
        yycdebug ("Entering state " + yystate + "\n");
        if (yydebug > 0)
          yystack.print (yyDebugStream);

        /* Accept?  */
        if (yystate == yyfinal_)
          return true;

        /* Take a decision.  First try without lookahead.  */
        yyn = yypact_[yystate];
        if (yy_pact_value_is_default_ (yyn))
          {
            label = YYDEFAULT;
	    break;
          }

        /* Read a lookahead token.  */
        if (yychar == yyempty_)
          {
	    yycdebug ("Reading a token: ");
	    yychar = yylex ();
            
            yylval = yylexer.getLVal ();
          }

        /* Convert token to internal form.  */
        if (yychar <= EOF)
          {
	    yychar = yytoken = EOF;
	    yycdebug ("Now at end of input.\n");
          }
        else
          {
	    yytoken = yytranslate_ (yychar);
	    yy_symbol_print ("Next token is", yytoken,
			     yylval);
          }

        /* If the proper action on seeing token YYTOKEN is to reduce or to
           detect an error, take that action.  */
        yyn += yytoken;
        if (yyn < 0 || yylast_ < yyn || yycheck_[yyn] != yytoken)
          label = YYDEFAULT;

        /* <= 0 means reduce or error.  */
        else if ((yyn = yytable_[yyn]) <= 0)
          {
	    if (yy_table_value_is_error_ (yyn))
	      label = YYERRLAB;
	    else
	      {
	        yyn = -yyn;
	        label = YYREDUCE;
	      }
          }

        else
          {
            /* Shift the lookahead token.  */
	    yy_symbol_print ("Shifting", yytoken,
			     yylval);

            /* Discard the token being shifted.  */
            yychar = yyempty_;

            /* Count tokens shifted since error; after three, turn off error
               status.  */
            if (yyerrstatus_ > 0)
              --yyerrstatus_;

            yystate = yyn;
            yystack.push (yystate, yylval);
            label = YYNEWSTATE;
          }
        break;

      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
      case YYDEFAULT:
        yyn = yydefact_[yystate];
        if (yyn == 0)
          label = YYERRLAB;
        else
          label = YYREDUCE;
        break;

      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
      case YYREDUCE:
        yylen = yyr2_[yyn];
        label = yyaction (yyn, yystack, yylen);
	yystate = yystack.stateAt (0);
        break;

      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
      case YYERRLAB:
        /* If not already recovering from an error, report this error.  */
        if (yyerrstatus_ == 0)
          {
            ++yynerrs_;
            if (yychar == yyempty_)
              yytoken = yyempty_;
            yyerror (yysyntax_error (yystate, yytoken));
          }

        
        if (yyerrstatus_ == 3)
          {
	    /* If just tried and failed to reuse lookahead token after an
	     error, discard it.  */

	    if (yychar <= EOF)
	      {
	      /* Return failure if at end of input.  */
	      if (yychar == EOF)
	        return false;
	      }
	    else
	      yychar = yyempty_;
          }

        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;

      /*---------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `---------------------------------------------------*/
      case YYERROR:

        
        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
        yystack.pop (yylen);
        yylen = 0;
        yystate = yystack.stateAt (0);
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
      case YYERRLAB1:
        yyerrstatus_ = 3;	/* Each real token shifted decrements this.  */

        for (;;)
          {
	    yyn = yypact_[yystate];
	    if (!yy_pact_value_is_default_ (yyn))
	      {
	        yyn += yyterror_;
	        if (0 <= yyn && yyn <= yylast_ && yycheck_[yyn] == yyterror_)
	          {
	            yyn = yytable_[yyn];
	            if (0 < yyn)
		      break;
	          }
	      }

	    /* Pop the current state because it cannot handle the error token.  */
	    if (yystack.height == 1)
	      return false;

	    
	    yystack.pop ();
	    yystate = yystack.stateAt (0);
	    if (yydebug > 0)
	      yystack.print (yyDebugStream);
          }

	

        /* Shift the error token.  */
        yy_symbol_print ("Shifting", yystos_[yyn],
			 yylval);

        yystate = yyn;
	yystack.push (yyn, yylval);
        label = YYNEWSTATE;
        break;

        /* Accept.  */
      case YYACCEPT:
        return true;

        /* Abort.  */
      case YYABORT:
        return false;
      }
  }

  // Generate an error message.
  private String yysyntax_error (int yystate, int tok)
  {
    if (errorVerbose)
      {
        /* There are many possibilities here to consider:
           - Assume YYFAIL is not used.  It's too flawed to consider.
             See
             <http://lists.gnu.org/archive/html/bison-patches/2009-12/msg00024.html>
             for details.  YYERROR is fine as it does not invoke this
             function.
           - If this state is a consistent state with a default action,
             then the only way this function was invoked is if the
             default action is an error action.  In that case, don't
             check for expected tokens because there are none.
           - The only way there can be no lookahead present (in tok) is
             if this state is a consistent state with a default action.
             Thus, detecting the absence of a lookahead is sufficient to
             determine that there is no unexpected or expected token to
             report.  In that case, just report a simple "syntax error".
           - Don't assume there isn't a lookahead just because this
             state is a consistent state with a default action.  There
             might have been a previous inconsistent state, consistent
             state with a non-default action, or user semantic action
             that manipulated yychar.  (However, yychar is currently out
             of scope during semantic actions.)
           - Of course, the expected token list depends on states to
             have correct lookahead information, and it depends on the
             parser not to perform extra reductions after fetching a
             lookahead from the scanner and before detecting a syntax
             error.  Thus, state merging (from LALR or IELR) and default
             reductions corrupt the expected token list.  However, the
             list is correct for canonical LR with one exception: it
             will still contain any token that will not be accepted due
             to an error action in a later state.
        */
        if (tok != yyempty_)
          {
            // FIXME: This method of building the message is not compatible
            // with internationalization.
            StringBuffer res =
              new StringBuffer ("syntax error, unexpected ");
            res.append (yytnamerr_ (yytname_[tok]));
            int yyn = yypact_[yystate];
            if (!yy_pact_value_is_default_ (yyn))
              {
                /* Start YYX at -YYN if negative to avoid negative
                   indexes in YYCHECK.  In other words, skip the first
                   -YYN actions for this state because they are default
                   actions.  */
                int yyxbegin = yyn < 0 ? -yyn : 0;
                /* Stay within bounds of both yycheck and yytname.  */
                int yychecklim = yylast_ - yyn + 1;
                int yyxend = yychecklim < yyntokens_ ? yychecklim : yyntokens_;
                int count = 0;
                for (int x = yyxbegin; x < yyxend; ++x)
                  if (yycheck_[x + yyn] == x && x != yyterror_
                      && !yy_table_value_is_error_ (yytable_[x + yyn]))
                    ++count;
                if (count < 5)
                  {
                    count = 0;
                    for (int x = yyxbegin; x < yyxend; ++x)
                      if (yycheck_[x + yyn] == x && x != yyterror_
                          && !yy_table_value_is_error_ (yytable_[x + yyn]))
                        {
                          res.append (count++ == 0 ? ", expecting " : " or ");
                          res.append (yytnamerr_ (yytname_[x]));
                        }
                  }
              }
            return res.toString ();
          }
      }

    return "syntax error";
  }

  /**
   * Whether the given <code>yypact_</code> value indicates a defaulted state.
   * @param yyvalue   the value to check
   */
  private static boolean yy_pact_value_is_default_ (int yyvalue)
  {
    return yyvalue == yypact_ninf_;
  }

  /**
   * Whether the given <code>yytable_</code> value indicates a syntax error.
   * @param yyvalue   the value to check
   */
  private static boolean yy_table_value_is_error_ (int yyvalue)
  {
    return yyvalue == yytable_ninf_;
  }

  /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
     STATE-NUM.  */
  private static final short yypact_ninf_ = -65;
  private static final short yypact_[] =
  {
        28,   -65,   -65,   -65,   -65,   -43,   -65,    11,    28,   -65,
     -65,   -65,   -43,   -65,   -65,     7,    17,   -65,   -65,    10,
     -65,    25,   101,     3,   -65,   -65,   -43,   301,   -13,     3,
     -43,    52,    56,   -65,   -65,    34,   -65,    61,   301,   301,
     306,   306,   306,   -65,   -65,   -65,   -65,   -22,   -65,   332,
     -65,   -65,    -2,   -65,   -65,   -65,    54,   -65,   -65,   -65,
     -65,    63,    65,    66,   -65,    75,   235,     3,   -65,     3,
     -65,   -43,   -65,    84,   -22,   331,   -65,   -65,    33,   -65,
     224,   263,   306,   306,   306,   306,   306,   306,   306,   306,
     306,   306,   306,   301,   -43,   301,   -65,   235,   -43,    92,
     -65,   -65,   102,   103,   104,   273,   105,   -65,   -65,   -65,
     -65,   -65,   -65,   -65,   106,   -65,   -65,    14,   -65,   301,
     301,   301,   301,   -65,   -65,   301,   -65,   301,   -65,   301,
      87,   -65,   -65,   -65,   -65,   -65,   161,   161,   161,   161,
     161,   161,   112,   -65,   -65,   111,   109,   -65,   -65,   -65,
     155,   301,   301,   301,   -65,   116,   -65,   -65,   -65,   -65,
     -65,   -65,   -65,   -65,   -65,   -65,   -65,   -65,   301,   -65,
     -65,   195,     5,    18,    24,    70,   -65,   -65,   -65,   -65,
     235,   235,   100,   108,   -65,    76,    31,   235,   117,    80,
     125,   113,   -65,   235,   128,   235,   -65,   130,   235,   131,
     -65,   132,   -65,   -65
  };

  /* YYDEFACT[S] -- default reduction number in state S.  Performed when
     YYTABLE doesn't specify something else to do.  Zero means the
     default is an error.  */
  private static final byte yydefact_[] =
  {
         0,    21,    22,    24,    23,     0,   109,     0,     2,     4,
       7,     5,     0,    19,     6,    20,     0,     1,     3,     0,
      12,    13,    15,    28,    45,     9,     0,     0,     0,    28,
       0,     0,    27,    30,    20,     0,    11,    15,     0,     0,
       0,     0,     0,   110,   111,   112,   113,    14,    74,    81,
      87,    91,    93,    92,    98,    99,    94,   105,   106,   107,
     108,     0,     0,    31,    33,    34,     0,     0,     8,     0,
      44,     0,    18,     0,    68,    93,    73,    88,     0,    90,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,   102,    16,     0,     0,     0,
      45,    49,     0,     0,     0,     0,     0,    26,    37,    36,
      38,    39,    40,    41,     0,    29,    17,     0,    97,     0,
       0,     0,     0,    66,    67,     0,    89,     0,    70,     0,
      69,    82,    83,    84,    85,    86,    76,    75,    77,    78,
      79,    80,     0,    96,   104,     0,   101,    25,    32,    35,
       0,     0,     0,     0,    58,     0,    60,    48,    10,    62,
      63,    64,    65,    61,    72,    71,    95,   100,     0,    43,
      47,     0,    94,     0,     0,     0,    59,   103,    42,    46,
       0,     0,     0,    50,    57,     0,    56,     0,     0,     0,
       0,     0,    51,     0,     0,     0,    52,     0,     0,     0,
      53,     0,    55,    54
  };

  /* YYPGOTO[NTERM-NUM].  */
  private static final short yypgoto_[] =
  {
       -65,   -65,   -65,   136,   -65,   -65,   -65,    74,   124,   -65,
     -65,     2,   -65,   -65,   127,   -65,    86,   -65,    67,   -64,
     -65,    72,   -65,   -65,   -65,   -65,   -65,   -65,   -65,   -65,
     -31,    -5,   -65,    13,   262,   -65,   -38,   -65,   -65,   -65,
     -65,   -65,     1,   126,   -65,   -65,   -65
  };

  /* YYDEFGOTO[NTERM-NUM].  */
  private static final short
  yydefgoto_[] =
  {
        -1,     7,     8,     9,    10,    11,    70,    19,    20,    21,
      71,    30,    13,    14,    31,    32,    33,    63,    64,   107,
     108,    35,   171,   109,   110,   186,   191,   111,   112,   113,
     114,    74,    48,    49,    50,    51,    52,    53,    54,   145,
     146,    55,    56,    57,    58,    59,    60
  };

  /* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
     positive, shift that token.  If negative, reduce the rule which
     number is the opposite.  If YYTABLE_NINF_, syntax error.  */
  private static final short yytable_ninf_ = -21;
  private static final short
  yytable_[] =
  {
        75,    15,    12,    93,    80,    81,    16,    73,     6,    15,
      12,    17,    95,    22,    23,     1,     2,     3,     4,    25,
      24,    26,    47,   158,    34,    26,   180,    37,    75,    94,
      34,    65,   181,   147,    76,    27,    34,    72,    68,    43,
       1,     2,     3,     4,    80,    81,     1,     2,     3,     4,
      80,    81,   189,   190,     6,    75,   -20,    75,     5,    75,
      66,    95,   142,    69,   144,    67,    28,    75,    34,    96,
      34,   116,    37,    97,   155,   128,   130,    98,   182,     6,
      99,    75,    75,    75,    75,     6,   170,    75,   159,   160,
     161,   162,   118,   126,   163,   143,    80,    81,   149,    65,
     136,   137,   138,   139,   140,   141,    28,   179,    29,   151,
     152,   153,    75,    80,   156,   157,   183,   184,   166,   167,
     168,   185,   164,   192,   165,   176,   187,   193,   188,   197,
      75,   199,   194,    75,   201,   195,   196,   177,   198,   200,
     202,   203,    75,    75,    18,   117,   173,   174,   175,    75,
      36,   172,    72,   115,    61,    75,    62,    75,   100,   169,
      75,     0,    38,     0,   101,   148,     0,     1,     2,     3,
       4,   102,   150,     0,   103,   104,     0,     0,     0,   105,
     106,     0,     0,    39,    69,     0,     0,     0,    40,    41,
       0,     0,    42,    82,    83,    84,    85,    86,   100,   178,
       0,     0,    38,     0,   101,     0,     6,    43,    44,    45,
      46,   102,     0,     0,   103,   104,     0,     0,     0,   105,
     106,     0,     0,    39,     0,     0,     0,     0,    40,    41,
       0,    38,    42,     0,     0,     0,     0,     0,   100,     0,
       0,   127,    38,     0,   101,     0,     6,    43,    44,    45,
      46,   102,    39,     0,   103,   104,     0,    40,    41,   105,
     106,    42,     0,    39,     0,     0,     0,     0,    40,    41,
      38,     0,    42,     0,     0,     6,    43,    44,    45,    46,
      38,   129,   154,     0,     0,     0,     6,    43,    44,    45,
      46,    39,     0,     0,     0,     0,    40,    41,     0,     0,
      42,    39,    77,    78,    79,     0,    40,    41,    38,     0,
      42,     0,     0,    38,     6,    43,    44,    45,    46,     0,
       0,     0,     0,     0,     6,    43,    44,    45,    46,    39,
       0,     0,     0,     0,    40,    41,    93,     0,    42,    40,
      41,     0,     0,    42,   131,   132,   133,   134,   135,     0,
       0,     0,     6,    43,    44,    45,    46,     6,    43,    44,
      45,    46,    94,     0,    82,    83,    84,    85,    86,   119,
     120,   121,   122,   123,   124,   125,     0,    87,    88,    89,
      90,    91,    92
  };

  /* YYCHECK.  */
  private static final short
  yycheck_[] =
  {
        38,     0,     0,     5,    26,    27,     5,    38,    51,     8,
       8,     0,     7,    12,     7,    12,    13,    14,    15,     9,
       3,    11,    27,     9,    23,    11,     8,    26,    66,    31,
      29,    30,     8,    97,    39,    10,    35,    35,     4,    52,
      12,    13,    14,    15,    26,    27,    12,    13,    14,    15,
      26,    27,    21,    22,    51,    93,    51,    95,    30,    97,
       8,     7,    93,    29,    95,     9,     5,   105,    67,     6,
      69,    69,    71,     8,   105,    80,    81,    11,     8,    51,
       5,   119,   120,   121,   122,    51,   150,   125,   119,   120,
     121,   122,     8,    60,   125,    94,    26,    27,     6,    98,
      87,    88,    89,    90,    91,    92,     5,   171,     7,     7,
       7,     7,   150,    26,     9,     9,   180,   181,     6,     8,
      11,    21,   127,   187,   129,     9,    18,    10,    52,   193,
     168,   195,    52,   171,   198,    10,    23,   168,    10,     9,
       9,     9,   180,   181,     8,    71,   151,   152,   153,   187,
      26,   150,   150,    67,    28,   193,    29,   195,     3,     4,
     198,    -1,     7,    -1,     9,    98,    -1,    12,    13,    14,
      15,    16,   100,    -1,    19,    20,    -1,    -1,    -1,    24,
      25,    -1,    -1,    28,    29,    -1,    -1,    -1,    33,    34,
      -1,    -1,    37,    32,    33,    34,    35,    36,     3,     4,
      -1,    -1,     7,    -1,     9,    -1,    51,    52,    53,    54,
      55,    16,    -1,    -1,    19,    20,    -1,    -1,    -1,    24,
      25,    -1,    -1,    28,    -1,    -1,    -1,    -1,    33,    34,
      -1,     7,    37,    -1,    -1,    -1,    -1,    -1,     3,    -1,
      -1,    17,     7,    -1,     9,    -1,    51,    52,    53,    54,
      55,    16,    28,    -1,    19,    20,    -1,    33,    34,    24,
      25,    37,    -1,    28,    -1,    -1,    -1,    -1,    33,    34,
       7,    -1,    37,    -1,    -1,    51,    52,    53,    54,    55,
       7,    18,     9,    -1,    -1,    -1,    51,    52,    53,    54,
      55,    28,    -1,    -1,    -1,    -1,    33,    34,    -1,    -1,
      37,    28,    40,    41,    42,    -1,    33,    34,     7,    -1,
      37,    -1,    -1,     7,    51,    52,    53,    54,    55,    -1,
      -1,    -1,    -1,    -1,    51,    52,    53,    54,    55,    28,
      -1,    -1,    -1,    -1,    33,    34,     5,    -1,    37,    33,
      34,    -1,    -1,    37,    82,    83,    84,    85,    86,    -1,
      -1,    -1,    51,    52,    53,    54,    55,    51,    52,    53,
      54,    55,    31,    -1,    32,    33,    34,    35,    36,    38,
      39,    40,    41,    42,    43,    44,    -1,    45,    46,    47,
      48,    49,    50
  };

  /* STOS_[STATE-NUM] -- The (internal number of the) accessing
     symbol of state STATE-NUM.  */
  private static final byte
  yystos_[] =
  {
         0,    12,    13,    14,    15,    30,    51,    63,    64,    65,
      66,    67,    73,    74,    75,   104,   104,     0,    65,    69,
      70,    71,   104,     7,     3,     9,    11,    10,     5,     7,
      73,    76,    77,    78,   104,    83,    70,   104,     7,    28,
      33,    34,    37,    52,    53,    54,    55,    93,    94,    95,
      96,    97,    98,    99,   100,   103,   104,   105,   106,   107,
     108,   105,    76,    79,    80,   104,     8,     9,     4,    29,
      68,    72,    73,    92,    93,    98,    93,    96,    96,    96,
      26,    27,    32,    33,    34,    35,    36,    45,    46,    47,
      48,    49,    50,     5,    31,     7,     6,     8,    11,     5,
       3,     9,    16,    19,    20,    24,    25,    81,    82,    85,
      86,    89,    90,    91,    92,    78,    73,    69,     8,    38,
      39,    40,    41,    42,    43,    44,    60,    17,    93,    18,
      93,    96,    96,    96,    96,    96,    95,    95,    95,    95,
      95,    95,    92,   104,    92,   101,   102,    81,    80,     6,
      83,     7,     7,     7,     9,    92,     9,     9,     9,    92,
      92,    92,    92,    92,    93,    93,     6,     8,    11,     4,
      81,    84,   104,    93,    93,    93,     9,    92,     4,    81,
       8,     8,     8,    81,    81,    21,    87,    18,    52,    21,
      22,    88,    81,    10,    52,    10,    23,    81,    10,    81,
       9,    81,     9,     9
  };

  /* TOKEN_NUMBER_[YYLEX-NUM] -- Internal symbol number corresponding
     to YYLEX-NUM.  */
  private static final short
  yytoken_number_[] =
  {
         0,   256,   257,   258,   259,   260,   261,   262,   263,   264,
     265,   266,   267,   268,   269,   270,   271,   272,   273,   274,
     275,   276,   277,   278,   279,   280,   281,   282,   283,   284,
     285,   286,   287,   288,   289,   290,   291,   292,   293,   294,
     295,   296,   297,   298,   299,   300,   301,   302,   303,   304,
     305,   306,   307,   308,   309,   310,   311,   312,   313,   314,
     315,   316
  };

  /* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final byte
  yyr1_[] =
  {
         0,    62,    63,    64,    64,    65,    65,    65,    66,    67,
      68,    69,    69,    70,    70,    71,    71,    72,    72,    73,
      73,    74,    74,    74,    74,    75,    75,    76,    76,    77,
      77,    78,    79,    79,    80,    80,    81,    81,    81,    81,
      81,    81,    82,    82,    83,    83,    84,    84,    85,    85,
      86,    86,    86,    87,    87,    88,    88,    89,    90,    90,
      91,    92,    92,    92,    92,    92,    92,    92,    92,    93,
      93,    93,    93,    93,    93,    94,    94,    94,    94,    94,
      94,    94,    95,    95,    95,    95,    95,    95,    96,    96,
      96,    96,    97,    97,    98,    98,    98,    99,    99,    99,
     100,   101,   101,   102,   102,   103,   103,   103,   103,   104,
     105,   106,   107,   108
  };

  /* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
  private static final byte
  yyr2_[] =
  {
         0,     2,     1,     2,     1,     1,     1,     1,     5,     3,
       3,     3,     1,     1,     3,     1,     4,     2,     1,     1,
       1,     1,     1,     1,     1,     6,     5,     1,     0,     3,
       1,     2,     3,     1,     1,     3,     1,     1,     1,     1,
       1,     1,     4,     3,     2,     0,     2,     1,     2,     1,
       5,     7,     7,     5,     6,     4,     0,     5,     2,     3,
       2,     3,     3,     3,     3,     3,     2,     2,     1,     3,
       3,     4,     4,     2,     1,     3,     3,     3,     3,     3,
       3,     1,     3,     3,     3,     3,     3,     1,     2,     3,
       2,     1,     1,     1,     1,     4,     3,     3,     1,     1,
       4,     1,     0,     3,     1,     1,     1,     1,     1,     1,
       1,     1,     1,     1
  };

  /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
     First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
  private static final String yytname_[] =
  {
    "$end", "error", "$undefined", "LEFT_BRACE", "RIGHT_BRACE",
  "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_PARENTHESES", "RIGHT_PARENTHESES",
  "SEMICOLON", "COLON", "COMMA", "INTEGER_KW", "REAL_KW", "CHAR_KW",
  "BOOL_KW", "IF_KW", "THEN_KW", "ELSE_KW", "WHILE_KW", "SWITCH_KW",
  "CASE_KW", "DEFAULT_KW", "END_KW", "RETURN_KW", "BREAK_KW", "AND_KW",
  "OR_KW", "NOT_KW", "STATIC_KW", "RECORD_KW", "DOT_KW", "PLUS", "MINUS",
  "MULTIPLY", "DIVIDER", "MODUL", "QUESTION", "PLUS_EQUAL", "MINUS_EQUAL",
  "MULTIPLY_EQUAL", "DIVIDER_EQUAL", "PLUS_PLUS", "MINUS_MINUS", "ASSIGN",
  "LT", "LE", "GT", "GE", "EQ", "NE", "ID", "NUMCONST", "REALCONST",
  "CHARCONST", "BOOLCONST", "ELSE_CON", "AND_THEN", "OR_ELSE",
  "Question_Unary", "MULTIPLY_Unary", "MINUS_Unary", "$accept", "program",
  "declarations_list", "declaration", "rec_declaration", "var_declaration",
  "scoped_var_declaration", "var_decl_list", "var_decl_initialize",
  "var_decl_id", "scoped_type_specifier", "type_specifier",
  "return_type_specifier", "fun_declaration", "params", "param_list",
  "param_type_list", "param_id_list", "param_id", "statement",
  "compound_stmt", "local_declarations", "statement_list",
  "expression_stmt", "selection_stmt", "case_element", "default_element",
  "iteration_stmt", "return_stmt", "break_stmt", "expression",
  "simple_expression", "rel_expression", "mathlogic_expression",
  "unary_expression", "factor", "mutable", "immutable", "call", "args",
  "arg_list", "constant", "saved_id", "saved_NUMCONST", "saved_REALCONST",
  "saved_CHARCONST", "saved_BOOLCONST", null
  };

  /* YYRHS -- A `-1'-separated list of the rules' RHS.  */
  private static final byte yyrhs_[] =
  {
        63,     0,    -1,    64,    -1,    64,    65,    -1,    65,    -1,
      67,    -1,    75,    -1,    66,    -1,    30,   104,     3,    83,
       4,    -1,    73,    69,     9,    -1,    72,    69,     9,    -1,
      69,    11,    70,    -1,    70,    -1,    71,    -1,    71,    10,
      93,    -1,   104,    -1,   104,     5,   105,     6,    -1,    29,
      73,    -1,    73,    -1,    74,    -1,   104,    -1,    12,    -1,
      13,    -1,    15,    -1,    14,    -1,    73,   104,     7,    76,
       8,    81,    -1,   104,     7,    76,     8,    81,    -1,    77,
      -1,    -1,    77,     9,    78,    -1,    78,    -1,    73,    79,
      -1,    79,    11,    80,    -1,    80,    -1,   104,    -1,   104,
       5,     6,    -1,    85,    -1,    82,    -1,    86,    -1,    89,
      -1,    90,    -1,    91,    -1,     3,    83,    84,     4,    -1,
       3,    83,     4,    -1,    83,    68,    -1,    -1,    84,    81,
      -1,    81,    -1,    92,     9,    -1,     9,    -1,    16,     7,
      93,     8,    81,    -1,    16,     7,    93,     8,    81,    18,
      81,    -1,    20,     7,    93,     8,    87,    88,    23,    -1,
      21,    52,    10,    81,     9,    -1,    87,    21,    52,    10,
      81,     9,    -1,    22,    10,    81,     9,    -1,    -1,    19,
       7,    93,     8,    81,    -1,    24,     9,    -1,    24,    92,
       9,    -1,    25,     9,    -1,    98,    44,    92,    -1,    98,
      38,    92,    -1,    98,    39,    92,    -1,    98,    40,    92,
      -1,    98,    41,    92,    -1,    98,    42,    -1,    98,    43,
      -1,    93,    -1,    93,    27,    93,    -1,    93,    26,    93,
      -1,    93,    27,    18,    93,    -1,    93,    26,    17,    93,
      -1,    28,    93,    -1,    94,    -1,    95,    46,    95,    -1,
      95,    45,    95,    -1,    95,    47,    95,    -1,    95,    48,
      95,    -1,    95,    49,    95,    -1,    95,    50,    95,    -1,
      95,    -1,    95,    32,    96,    -1,    95,    33,    96,    -1,
      95,    34,    96,    -1,    95,    35,    96,    -1,    95,    36,
      96,    -1,    96,    -1,    33,    96,    -1,    34,    96,    60,
      -1,    37,    96,    -1,    97,    -1,    99,    -1,    98,    -1,
     104,    -1,    98,     5,    92,     6,    -1,    98,    31,   104,
      -1,     7,    92,     8,    -1,   100,    -1,   103,    -1,   104,
       7,   101,     8,    -1,   102,    -1,    -1,   102,    11,    92,
      -1,    92,    -1,   105,    -1,   106,    -1,   107,    -1,   108,
      -1,    51,    -1,    52,    -1,    53,    -1,    54,    -1,    55,
      -1
  };

  /* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
     YYRHS.  */
  private static final short yyprhs_[] =
  {
         0,     0,     3,     5,     8,    10,    12,    14,    16,    22,
      26,    30,    34,    36,    38,    42,    44,    49,    52,    54,
      56,    58,    60,    62,    64,    66,    73,    79,    81,    82,
      86,    88,    91,    95,    97,    99,   103,   105,   107,   109,
     111,   113,   115,   120,   124,   127,   128,   131,   133,   136,
     138,   144,   152,   160,   166,   173,   178,   179,   185,   188,
     192,   195,   199,   203,   207,   211,   215,   218,   221,   223,
     227,   231,   236,   241,   244,   246,   250,   254,   258,   262,
     266,   270,   272,   276,   280,   284,   288,   292,   294,   297,
     301,   304,   306,   308,   310,   312,   317,   321,   325,   327,
     329,   334,   336,   337,   341,   343,   345,   347,   349,   351,
     353,   355,   357,   359
  };

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] =
  {
         0,   208,   208,   216,   220,   228,   232,   236,   243,   250,
     257,   264,   277,   286,   295,   307,   314,   336,   342,   349,
     354,   358,   364,   370,   376,   443,   447,   454,   458,   465,
     469,   476,   483,   487,   494,   498,   504,   508,   512,   516,
     520,   524,   531,   535,   542,   546,   553,   557,   564,   568,
     575,   579,   582,   591,   595,   602,   606,   613,   620,   624,
     631,   638,   734,   738,   742,   746,   750,   754,   758,   765,
     769,   773,   777,   781,   785,   792,   796,   800,   804,   808,
     812,   816,   851,   889,   927,   965,  1003,  1048,  1078,  1091,
    1104,  1119,  1142,  1146,  1153,  1158,  1162,  1169,  1177,  1181,
    1190,  1197,  1201,  1208,  1212,  1220,  1230,  1240,  1250,  1263,
    1272,  1289,  1305,  1321
  };

  // Report on the debug stream that the rule yyrule is going to be reduced.
  private void yy_reduce_print (int yyrule, YYStack yystack)
  {
    if (yydebug == 0)
      return;

    int yylno = yyrline_[yyrule];
    int yynrhs = yyr2_[yyrule];
    /* Print the symbols being reduced, and their result.  */
    yycdebug ("Reducing stack by rule " + (yyrule - 1)
	      + " (line " + yylno + "), ");

    /* The symbols being reduced.  */
    for (int yyi = 0; yyi < yynrhs; yyi++)
      yy_symbol_print ("   $" + (yyi + 1) + " =",
		       yyrhs_[yyprhs_[yyrule] + yyi],
		       ((yystack.valueAt (yynrhs-(yyi + 1)))));
  }

  /* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */
  private static final byte yytranslate_table_[] =
  {
         0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    32,    33,    34,
      35,    36,    37,    38,    39,    40,    41,    42,    43,    44,
      45,    46,    47,    48,    49,    50,    51,    52,    53,    54,
      55,    56,    57,    58,    59,    60,    61
  };

  private static final byte yytranslate_ (int t)
  {
    if (t >= 0 && t <= yyuser_token_number_max_)
      return yytranslate_table_[t];
    else
      return yyundef_token_;
  }

  private static final int yylast_ = 382;
  private static final int yynnts_ = 47;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 17;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 62;

  private static final int yyuser_token_number_max_ = 316;
  private static final int yyundef_token_ = 2;

/* User implementation code.  */
/* Unqualified %code blocks.  */

/* Line 927 of lalr1.java  */
/* Line 26 of "phase3.y"  */

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



/* Line 927 of lalr1.java  */
/* Line 3172 of "phase3.java"  */

}


/* Line 931 of lalr1.java  */
/* Line 1356 of "phase3.y"  */

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


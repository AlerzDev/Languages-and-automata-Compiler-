package compiler;

import java_cup.runtime.*;
import java.io.Reader;
import java.awt.Color;
import helpers.ErrorHelper;

%%
%class AnalyzeLexicon
%line
%column
%cup
%{

    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }


    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }

%}


LineJump = \r|\n|\r\n
Spaces =  (\t|\f|\r|\n|\s)
Integer = 0 | [1-9][0-9]*

%%

<YYINITIAL> {
    "CodeDraw" 	        { return new Symbol( sym.CodeDraw,         yytext());                                     }
    "Canvas" 	        { return new Symbol( sym.Canvas,           yytext());                                     }
    "CanvasAddFigure"   { return new Symbol( sym.CanvasAddFigure,  yytext());                                     }
    "CanvasBackground" 	{ return new Symbol( sym.CanvasBackground, yytext());                                     }
    "Line" 	            { return new Symbol( sym.Line,             yytext());                                     }
    "Square" 	        { return new Symbol( sym.Square,           yytext());                                     }
    "Circle" 	        { return new Symbol( sym.Circle,           yytext());                                     }
    "RED" 	            { return symbol( sym.RED,                  Color.RED);                                    }
    "YELLOW" 	        { return symbol( sym.YELLOW,               Color.YELLOW);                                 }
    "BLUE" 	            { return symbol( sym.BLUE,                 Color.BLUE);                                   }
    "PINK" 	            { return symbol( sym.PINK,                 Color.PINK);                                   }
    "GREEN" 	        { return symbol( sym.GREEN,                Color.GREEN);                                  }
    "CYAN"   	        { return symbol( sym.CYAN,                 Color.CYAN);                                   }
    "ORANGE" 	        { return symbol( sym.ORANGE,               Color.ORANGE);                                 }
    ","                 { return new Symbol( sym.coma,             yytext());                                     }
    ";" 		        { return new Symbol( sym.pointComa,        yytext());                                     }
    "(" 		        { return new Symbol( sym.parentOpen,       yytext());                                     }
    ")" 		        { return new Symbol( sym.parentClose,      yytext());                                     }
    "{" 		        { return new Symbol( sym.keyOpen,          yytext());                                     }
    "}" 		        { return new Symbol( sym.keyClose,         yytext());                                     }
    {Spaces} 	        {      /* Ignore the space */                                                             }
    {Integer}           { return symbol(sym.num,                   new Integer(yytext()));                        }
}
[^]                     {
                            ErrorHelper helper = ErrorHelper.getInstance();
                            helper.setErrorSyntax("Illegal character ===> <"+yytext()+">");
                        }
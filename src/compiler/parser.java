
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package compiler;

import draw.CodeDraw;

import java.io.FileReader;
import java.awt.Color;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import helpers.ErrorHelper;
import java_cup.runtime.XMLElement;

/**
 * CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
 */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

    public final Class getSymbolContainer() {
        return sym.class;
    }

    /**
     * Default constructor.
     */
    @Deprecated
    public parser() {
        super();
    }

    /**
     * Constructor which sets the default scanner.
     */
    @Deprecated
    public parser(java_cup.runtime.Scanner s) {
        super(s);
    }

    /**
     * Constructor which sets the default scanner.
     */
    public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {
        super(s, sf);
    }

    /**
     * Production table.
     */
    protected static final short _production_table[][] =
            unpackFromStrings(new String[]{
                    "\000\022\000\002\002\007\000\002\002\004\000\002\003" +
                            "\004\000\002\003\003\000\002\004\011\000\002\005\007" +
                            "\000\002\005\007\000\002\006\016\000\002\006\016\000" +
                            "\002\006\016\000\002\007\003\000\002\010\003\000\002" +
                            "\010\003\000\002\010\003\000\002\010\003\000\002\010" +
                            "\003\000\002\010\003\000\002\010\003"});

    /**
     * Access to production table.
     */
    public short[][] production_table() {
        return _production_table;
    }

    /**
     * Parse-action table.
     */
    protected static final short[][] _action_table =
            unpackFromStrings(new String[]{
                    "\000\107\000\004\004\004\001\002\000\004\013\007\001" +
                            "\002\000\004\002\006\001\002\000\004\002\000\001\002" +
                            "\000\004\005\010\001\002\000\004\015\104\001\002\000" +
                            "\006\006\012\007\015\001\002\000\004\015\033\001\002" +
                            "\000\004\014\032\001\002\000\010\006\012\007\015\014" +
                            "\ufffe\001\002\000\004\015\016\001\002\000\020\022\021" +
                            "\023\022\024\024\025\023\026\020\027\017\030\026\001" +
                            "\002\000\006\016\ufff3\020\ufff3\001\002\000\006\016\ufff2" +
                            "\020\ufff2\001\002\000\006\016\ufff6\020\ufff6\001\002\000" +
                            "\006\016\ufff1\020\ufff1\001\002\000\006\016\ufff5\020\ufff5" +
                            "\001\002\000\006\016\ufff0\020\ufff0\001\002\000\004\016" +
                            "\027\001\002\000\006\016\ufff4\020\ufff4\001\002\000\004" +
                            "\017\030\001\002\000\010\006\ufffb\007\ufffb\014\ufffb\001" +
                            "\002\000\004\014\uffff\001\002\000\004\002\001\001\002" +
                            "\000\010\010\037\011\036\012\035\001\002\000\004\016" +
                            "\102\001\002\000\004\015\067\001\002\000\004\015\054" +
                            "\001\002\000\004\015\040\001\002\000\020\022\021\023" +
                            "\022\024\024\025\023\026\020\027\017\030\026\001\002" +
                            "\000\004\020\042\001\002\000\004\021\043\001\002\000" +
                            "\006\016\ufff7\020\ufff7\001\002\000\004\020\045\001\002" +
                            "\000\004\021\043\001\002\000\004\020\047\001\002\000" +
                            "\004\021\043\001\002\000\004\020\051\001\002\000\004" +
                            "\021\043\001\002\000\004\016\053\001\002\000\004\016" +
                            "\ufffa\001\002\000\020\022\021\023\022\024\024\025\023" +
                            "\026\020\027\017\030\026\001\002\000\004\020\056\001" +
                            "\002\000\020\022\021\023\022\024\024\025\023\026\020" +
                            "\027\017\030\026\001\002\000\004\020\060\001\002\000" +
                            "\004\021\043\001\002\000\004\020\062\001\002\000\004" +
                            "\021\043\001\002\000\004\020\064\001\002\000\004\021" +
                            "\043\001\002\000\004\016\066\001\002\000\004\016\ufff9" +
                            "\001\002\000\020\022\021\023\022\024\024\025\023\026" +
                            "\020\027\017\030\026\001\002\000\004\020\071\001\002" +
                            "\000\020\022\021\023\022\024\024\025\023\026\020\027" +
                            "\017\030\026\001\002\000\004\020\073\001\002\000\004" +
                            "\021\043\001\002\000\004\020\075\001\002\000\004\021" +
                            "\043\001\002\000\004\020\077\001\002\000\004\021\043" +
                            "\001\002\000\004\016\101\001\002\000\004\016\ufff8\001" +
                            "\002\000\004\017\103\001\002\000\010\006\ufffc\007\ufffc" +
                            "\014\ufffc\001\002\000\004\021\043\001\002\000\004\020" +
                            "\106\001\002\000\004\021\043\001\002\000\004\016\110" +
                            "\001\002\000\004\017\111\001\002\000\006\006\ufffd\007" +
                            "\ufffd\001\002"});

    /**
     * Access to parse-action table.
     */
    public short[][] action_table() {
        return _action_table;
    }

    /**
     * <code>reduce_goto</code> table.
     */
    protected static final short[][] _reduce_table =
            unpackFromStrings(new String[]{
                    "\000\107\000\004\002\004\001\001\000\002\001\001\000" +
                            "\002\001\001\000\002\001\001\000\004\004\010\001\001" +
                            "\000\002\001\001\000\006\003\012\005\013\001\001\000" +
                            "\002\001\001\000\002\001\001\000\006\003\030\005\013" +
                            "\001\001\000\002\001\001\000\004\010\024\001\001\000" +
                            "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
                            "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
                            "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
                            "\000\002\001\001\000\002\001\001\000\004\006\033\001" +
                            "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
                            "\000\002\001\001\000\004\010\040\001\001\000\002\001" +
                            "\001\000\004\007\043\001\001\000\002\001\001\000\002" +
                            "\001\001\000\004\007\045\001\001\000\002\001\001\000" +
                            "\004\007\047\001\001\000\002\001\001\000\004\007\051" +
                            "\001\001\000\002\001\001\000\002\001\001\000\004\010" +
                            "\054\001\001\000\002\001\001\000\004\010\056\001\001" +
                            "\000\002\001\001\000\004\007\060\001\001\000\002\001" +
                            "\001\000\004\007\062\001\001\000\002\001\001\000\004" +
                            "\007\064\001\001\000\002\001\001\000\002\001\001\000" +
                            "\004\010\067\001\001\000\002\001\001\000\004\010\071" +
                            "\001\001\000\002\001\001\000\004\007\073\001\001\000" +
                            "\002\001\001\000\004\007\075\001\001\000\002\001\001" +
                            "\000\004\007\077\001\001\000\002\001\001\000\002\001" +
                            "\001\000\002\001\001\000\002\001\001\000\004\007\104" +
                            "\001\001\000\002\001\001\000\004\007\106\001\001\000" +
                            "\002\001\001\000\002\001\001\000\002\001\001"});

    /**
     * Access to <code>reduce_goto</code> table.
     */
    public short[][] reduce_table() {
        return _reduce_table;
    }

    /**
     * Instance of action encapsulation class.
     */
    protected CUP$parser$actions action_obj;

    /**
     * Action encapsulation object initializer.
     */
    protected void init_actions() {
        action_obj = new CUP$parser$actions(this);
    }

    /**
     * Invoke a user supplied parse action.
     */
    public java_cup.runtime.Symbol do_action(
            int act_num,
            java_cup.runtime.lr_parser parser,
            java.util.Stack stack,
            int top)
            throws java.lang.Exception {
    /* call code in generated class */
        return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
    }

    /**
     * Indicates start state.
     */
    public int start_state() {
        return 0;
    }

    /**
     * Indicates start production.
     */
    public int start_production() {
        return 1;
    }

    /**
     * <code>EOF</code> Symbol index.
     */
    public int EOF_sym() {
        return 0;
    }

    /**
     * <code>error</code> Symbol index.
     */
    public int error_sym() {
        return 1;
    }


    ErrorHelper helper = ErrorHelper.getInstance();

    public void report_error(String message, Object info) {
        StringBuilder m = new StringBuilder("Error");
        if (info instanceof java_cup.runtime.Symbol) {
            java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);

            if (s.left >= 0) {
                m.append(" in line " + (s.left + 1));
                if (s.right >= 0)
                    m.append(", column " + (s.right + 1));
            }
        }
        m.append(" : " + message);
        String msg = helper.getErrorSyntax();
        msg += "";
        msg += m.toString() + "\n";
        helper.setErrorSyntax(msg);
    }

    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
    }

    protected void report_expected_token_ids() {
        List<Integer> ids = this.expected_token_ids();
        LinkedList<String> list = new LinkedList();
        Iterator var3 = ids.iterator();

        while (var3.hasNext()) {
            Integer expected = (Integer) var3.next();
            list.add(this.symbl_name_from_id(expected.intValue()));
        }
        String msg = helper.getErrorSyntax();
        msg = "";
        msg += "instead expected token classes ar " + list + "\n";
        helper.setErrorSyntax(msg);
    }

    public static void main(String[] args) {
        try {
            parser asin = new parser(
                    new AnalyzeLexicon(new FileReader(args[0])));
            Object result = asin.parse().value;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    /**
     * Cup generated class to encapsulate user supplied action code.
     */
    @SuppressWarnings({"rawtypes", "unchecked", "unused"})
    class CUP$parser$actions {


        private int mWidth = 0;
        private int mHeight = 0;
        private int figure = 0;
        CodeDraw codeDraw = new CodeDraw();

        private final parser parser;

        /**
         * Constructor
         */
        CUP$parser$actions(parser parser) {
            this.parser = parser;
        }

        /**
         * Method 0 with the actual generated action code for actions 0 to 300.
         */
        public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
                int CUP$parser$act_num,
                java_cup.runtime.lr_parser CUP$parser$parser,
                java.util.Stack CUP$parser$stack,
                int CUP$parser$top)
                throws java.lang.Exception {
      /* Symbol object for return from actions */
            java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
            switch (CUP$parser$act_num) {
          /*. . . . . . . . . . . . . . . . . . . .*/
                case 0: // program ::= CodeDraw keyOpen createCanvas nextLineCode keyClose
                {
                    Object RESULT = null;

                    CUP$parser$result = parser.getSymbolFactory().newSymbol("program", 0, ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 4)), ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
                case 1: // $START ::= program EOF
                {
                    Object RESULT = null;
                    int start_valleft = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)).left;
                    int start_valright = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)).right;
                    Object start_val = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)).value;
                    RESULT = start_val;
                    CUP$parser$result = parser.getSymbolFactory().newSymbol("$START", 0, ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)), ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
          /* ACCEPT */
                CUP$parser$parser.done_parsing();
                return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
                case 2: // nextLineCode ::= lineCode nextLineCode
                {
                    Object RESULT = null;

                    CUP$parser$result = parser.getSymbolFactory().newSymbol("nextLineCode", 1, ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)), ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
                case 3: // nextLineCode ::= lineCode
                {
                    Object RESULT = null;

                    CUP$parser$result = parser.getSymbolFactory().newSymbol("nextLineCode", 1, ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
                case 4: // createCanvas ::= Canvas parentOpen n coma n parentClose pointComa
                {
                    Object RESULT = null;
                    int widthleft = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 4)).left;
                    int widthright = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 4)).right;
                    Integer width = (Integer) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 4)).value;
                    int heightleft = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 2)).left;
                    int heightright = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 2)).right;
                    Integer height = (Integer) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 2)).value;

                    codeDraw.createCanvas(width, height);
                    codeDraw.setmWidth(width);
                    codeDraw.setmHeight(height);

                    CUP$parser$result = parser.getSymbolFactory().newSymbol("createCanvas", 2, ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 6)), ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
                case 5: // lineCode ::= CanvasAddFigure parentOpen figure parentClose pointComa
                {
                    Object RESULT = null;

                    CUP$parser$result = parser.getSymbolFactory().newSymbol("lineCode", 3, ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 4)), ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
                case 6: // lineCode ::= CanvasBackground parentOpen c parentClose pointComa
                {
                    Object RESULT = null;
                    int colorleft = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 2)).left;
                    int colorright = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 2)).right;
                    Color color = (Color) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 2)).value;

                    codeDraw.setJFrameBackGround(color);

                    CUP$parser$result = parser.getSymbolFactory().newSymbol("lineCode", 3, ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 4)), ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
                case 7: // figure ::= Line parentOpen c coma n coma n coma n coma n parentClose
                {
                    Object RESULT = null;
                    int borderleft = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 9)).left;
                    int borderright = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 9)).right;
                    Color border = (Color) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 9)).value;
                    int x1left = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 7)).left;
                    int x1right = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 7)).right;
                    Integer x1 = (Integer) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 7)).value;
                    int y1left = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 5)).left;
                    int y1right = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 5)).right;
                    Integer y1 = (Integer) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 5)).value;
                    int x2left = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 3)).left;
                    int x2right = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 3)).right;
                    Integer x2 = (Integer) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 3)).value;
                    int y2left = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)).left;
                    int y2right = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)).right;
                    Integer y2 = (Integer) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)).value;

                    figure++;
                    if (codeDraw.validityRangeCanvas(x1, y1)) {
                        codeDraw.drawLine(border, x1, y1, x2, y2);
                    } else {
                        codeDraw.setMsgError("CanvasAddFigure==>>" + figure + "<<Your primary coordinate is outside the canvas range (Line)...." + "\n");
                    }


                    CUP$parser$result = parser.getSymbolFactory().newSymbol("figure", 4, ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 11)), ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
                case 8: // figure ::= Square parentOpen c coma c coma n coma n coma n parentClose
                {
                    Object RESULT = null;
                    int borderleft = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 9)).left;
                    int borderright = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 9)).right;
                    Color border = (Color) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 9)).value;
                    int solidleft = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 7)).left;
                    int solidright = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 7)).right;
                    Color solid = (Color) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 7)).value;
                    int xleft = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 5)).left;
                    int xright = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 5)).right;
                    Integer x = (Integer) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 5)).value;
                    int yleft = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 3)).left;
                    int yright = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 3)).right;
                    Integer y = (Integer) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 3)).value;
                    int sizeleft = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)).left;
                    int sizeright = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)).right;
                    Integer size = (Integer) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)).value;

                    figure++;
                    if (codeDraw.validityRangeCanvas(x, y)) {
                        codeDraw.drawSquare(border, solid, x, y, size);
                    } else {
                        codeDraw.setMsgError("CanvasAddFigure==>>" + figure + "<<Your primary coordinate is outside the canvas range (Square)...." + "\n");
                    }

                    CUP$parser$result = parser.getSymbolFactory().newSymbol("figure", 4, ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 11)), ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
                case 9: // figure ::= Circle parentOpen c coma c coma n coma n coma n parentClose
                {
                    Object RESULT = null;
                    int borderleft = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 9)).left;
                    int borderright = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 9)).right;
                    Color border = (Color) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 9)).value;
                    int solidleft = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 7)).left;
                    int solidright = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 7)).right;
                    Color solid = (Color) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 7)).value;
                    int xleft = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 5)).left;
                    int xright = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 5)).right;
                    Integer x = (Integer) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 5)).value;
                    int yleft = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 3)).left;
                    int yright = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 3)).right;
                    Integer y = (Integer) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 3)).value;
                    int radiusleft = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)).left;
                    int radiusright = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)).right;
                    Integer radius = (Integer) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)).value;

                    figure++;
                    if (codeDraw.validityRangeCanvas(x, y)) {
                        codeDraw.drawCircle(border, solid, x, y, radius);
                    } else {
                        codeDraw.setMsgError("CanvasAddFigure==>>" + figure + "<<Your primary coordinate is outside the canvas range (Circle)...." + "\n");
                    }

                    CUP$parser$result = parser.getSymbolFactory().newSymbol("figure", 4, ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 11)), ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
                case 10: // n ::= num
                {
                    Integer RESULT = null;
                    int mleft = ((java_cup.runtime.Symbol) CUP$parser$stack.peek()).left;
                    int mright = ((java_cup.runtime.Symbol) CUP$parser$stack.peek()).right;
                    Integer m = (Integer) ((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
                    RESULT = new Integer(m);
                    CUP$parser$result = parser.getSymbolFactory().newSymbol("n", 5, ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
                case 11: // c ::= RED
                {
                    Color RESULT = null;
                    RESULT = Color.RED;
                    CUP$parser$result = parser.getSymbolFactory().newSymbol("c", 6, ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
                case 12: // c ::= GREEN
                {
                    Color RESULT = null;
                    RESULT = Color.GREEN;
                    CUP$parser$result = parser.getSymbolFactory().newSymbol("c", 6, ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
                case 13: // c ::= PINK
                {
                    Color RESULT = null;
                    RESULT = Color.PINK;
                    CUP$parser$result = parser.getSymbolFactory().newSymbol("c", 6, ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
                case 14: // c ::= CYAN
                {
                    Color RESULT = null;
                    RESULT = Color.CYAN;
                    CUP$parser$result = parser.getSymbolFactory().newSymbol("c", 6, ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
                case 15: // c ::= ORANGE
                {
                    Color RESULT = null;
                    RESULT = Color.ORANGE;
                    CUP$parser$result = parser.getSymbolFactory().newSymbol("c", 6, ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
                case 16: // c ::= BLUE
                {
                    Color RESULT = null;
                    RESULT = Color.BLUE;
                    CUP$parser$result = parser.getSymbolFactory().newSymbol("c", 6, ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
                case 17: // c ::= YELLOW
                {
                    Color RESULT = null;
                    RESULT = Color.YELLOW;
                    CUP$parser$result = parser.getSymbolFactory().newSymbol("c", 6, ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                return CUP$parser$result;

          /* . . . . . .*/
                default:
                    throw new Exception(
                            "Invalid action number " + CUP$parser$act_num + "found in internal parse table");

            }
        } /* end of method */

        /**
         * Method splitting the generated action code into several parts.
         */
        public final java_cup.runtime.Symbol CUP$parser$do_action(
                int CUP$parser$act_num,
                java_cup.runtime.lr_parser CUP$parser$parser,
                java.util.Stack CUP$parser$stack,
                int CUP$parser$top)
                throws java.lang.Exception {
            return CUP$parser$do_action_part00000000(
                    CUP$parser$act_num,
                    CUP$parser$parser,
                    CUP$parser$stack,
                    CUP$parser$top);
        }
    }

}

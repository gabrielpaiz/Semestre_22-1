/* The following code was generated by JFlex 1.4.3 on 22/06/2022 19:02 */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 22/06/2022 19:02 from the specification file
 * <tt>calc.flex</tt>
 */
class Yylex {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\40\1\14\2\0\1\15\22\0\1\40\1\23\1\0\1\34"+
    "\2\0\1\36\1\0\1\16\1\16\1\20\1\17\1\16\1\16\1\2"+
    "\1\16\12\1\1\0\1\16\1\21\1\24\1\22\2\0\32\3\3\0"+
    "\1\16\1\35\1\0\1\11\2\3\1\33\1\7\1\10\1\3\1\27"+
    "\1\25\2\3\1\12\1\3\1\31\1\32\1\30\1\3\1\5\1\13"+
    "\1\4\1\6\1\3\1\26\3\3\1\16\1\37\1\16\54\0\1\3"+
    "\12\0\1\3\4\0\1\3\5\0\27\3\1\0\37\3\1\0\u01ca\3"+
    "\4\0\14\3\16\0\5\3\7\0\1\3\1\0\1\3\201\0\5\3"+
    "\1\0\2\3\2\0\4\3\1\0\1\3\6\0\1\3\1\0\3\3"+
    "\1\0\1\3\1\0\24\3\1\0\123\3\1\0\213\3\10\0\246\3"+
    "\1\0\46\3\2\0\1\3\7\0\47\3\110\0\33\3\5\0\3\3"+
    "\55\0\53\3\25\0\12\1\4\0\2\3\1\0\143\3\1\0\1\3"+
    "\17\0\2\3\7\0\2\3\12\1\3\3\2\0\1\3\20\0\1\3"+
    "\1\0\36\3\35\0\131\3\13\0\1\3\16\0\12\1\41\3\11\0"+
    "\2\3\4\0\1\3\5\0\26\3\4\0\1\3\11\0\1\3\3\0"+
    "\1\3\27\0\31\3\7\0\13\3\65\0\25\3\1\0\10\3\106\0"+
    "\66\3\3\0\1\3\22\0\1\3\7\0\12\3\4\0\12\1\1\0"+
    "\20\3\4\0\10\3\2\0\2\3\2\0\26\3\1\0\7\3\1\0"+
    "\1\3\3\0\4\3\3\0\1\3\20\0\1\3\15\0\2\3\1\0"+
    "\3\3\4\0\12\1\2\3\12\0\1\3\10\0\6\3\4\0\2\3"+
    "\2\0\26\3\1\0\7\3\1\0\2\3\1\0\2\3\1\0\2\3"+
    "\37\0\4\3\1\0\1\3\7\0\12\1\2\0\3\3\20\0\11\3"+
    "\1\0\3\3\1\0\26\3\1\0\7\3\1\0\2\3\1\0\5\3"+
    "\3\0\1\3\22\0\1\3\17\0\2\3\4\0\12\1\11\0\1\3"+
    "\13\0\10\3\2\0\2\3\2\0\26\3\1\0\7\3\1\0\2\3"+
    "\1\0\5\3\3\0\1\3\36\0\2\3\1\0\3\3\4\0\12\1"+
    "\1\0\1\3\21\0\1\3\1\0\6\3\3\0\3\3\1\0\4\3"+
    "\3\0\2\3\1\0\1\3\1\0\2\3\3\0\2\3\3\0\3\3"+
    "\3\0\14\3\26\0\1\3\25\0\12\1\25\0\10\3\1\0\3\3"+
    "\1\0\27\3\1\0\20\3\3\0\1\3\32\0\3\3\5\0\2\3"+
    "\4\0\12\1\20\0\1\3\4\0\10\3\1\0\3\3\1\0\27\3"+
    "\1\0\12\3\1\0\5\3\3\0\1\3\40\0\1\3\1\0\2\3"+
    "\4\0\12\1\1\0\2\3\22\0\10\3\1\0\3\3\1\0\51\3"+
    "\2\0\1\3\20\0\1\3\5\0\3\3\10\0\3\3\4\0\12\1"+
    "\12\0\6\3\5\0\22\3\3\0\30\3\1\0\11\3\1\0\1\3"+
    "\2\0\7\3\37\0\12\1\21\0\60\3\1\0\2\3\14\0\7\3"+
    "\11\0\12\1\47\0\2\3\1\0\1\3\2\0\2\3\1\0\1\3"+
    "\2\0\1\3\6\0\4\3\1\0\7\3\1\0\3\3\1\0\1\3"+
    "\1\0\1\3\2\0\2\3\1\0\4\3\1\0\2\3\11\0\1\3"+
    "\2\0\5\3\1\0\1\3\11\0\12\1\2\0\4\3\40\0\1\3"+
    "\37\0\12\1\26\0\10\3\1\0\44\3\33\0\5\3\163\0\53\3"+
    "\24\0\1\3\12\1\6\0\6\3\4\0\4\3\3\0\1\3\3\0"+
    "\2\3\7\0\3\3\4\0\15\3\14\0\1\3\1\0\12\1\6\0"+
    "\46\3\1\0\1\3\5\0\1\3\2\0\53\3\1\0\u014d\3\1\0"+
    "\4\3\2\0\7\3\1\0\1\3\1\0\4\3\2\0\51\3\1\0"+
    "\4\3\2\0\41\3\1\0\4\3\2\0\7\3\1\0\1\3\1\0"+
    "\4\3\2\0\17\3\1\0\71\3\1\0\4\3\2\0\103\3\45\0"+
    "\20\3\20\0\126\3\2\0\6\3\3\0\u026c\3\2\0\21\3\1\0"+
    "\32\3\5\0\113\3\6\0\10\3\7\0\15\3\1\0\4\3\16\0"+
    "\22\3\16\0\22\3\16\0\15\3\1\0\3\3\17\0\64\3\43\0"+
    "\1\3\4\0\1\3\3\0\12\1\46\0\12\1\6\0\130\3\10\0"+
    "\5\3\2\0\42\3\1\0\1\3\5\0\106\3\12\0\37\3\47\0"+
    "\12\1\36\3\2\0\5\3\13\0\54\3\4\0\32\3\6\0\12\1"+
    "\46\0\27\3\11\0\65\3\53\0\12\1\6\0\12\1\15\0\1\3"+
    "\135\0\57\3\21\0\7\3\4\0\12\1\51\0\36\3\15\0\2\3"+
    "\12\1\54\3\32\0\44\3\34\0\12\1\3\0\3\3\12\1\44\3"+
    "\2\0\11\3\140\0\4\3\1\0\4\3\3\0\2\3\11\0\300\3"+
    "\100\0\u0116\3\2\0\6\3\2\0\46\3\2\0\6\3\2\0\10\3"+
    "\1\0\1\3\1\0\1\3\1\0\1\3\1\0\37\3\2\0\65\3"+
    "\1\0\7\3\1\0\1\3\3\0\3\3\1\0\7\3\3\0\4\3"+
    "\2\0\6\3\4\0\15\3\5\0\3\3\1\0\7\3\164\0\1\3"+
    "\15\0\1\3\20\0\15\3\145\0\1\3\4\0\1\3\2\0\12\3"+
    "\1\0\1\3\3\0\5\3\6\0\1\3\1\0\1\3\1\0\1\3"+
    "\1\0\4\3\1\0\13\3\2\0\4\3\5\0\5\3\4\0\1\3"+
    "\64\0\2\3\u0a7b\0\57\3\1\0\57\3\1\0\205\3\6\0\4\3"+
    "\3\0\2\3\14\0\46\3\1\0\1\3\5\0\1\3\2\0\70\3"+
    "\7\0\1\3\20\0\27\3\11\0\7\3\1\0\7\3\1\0\7\3"+
    "\1\0\7\3\1\0\7\3\1\0\7\3\1\0\7\3\1\0\7\3"+
    "\120\0\1\3\u01d5\0\2\3\52\0\5\3\5\0\2\3\4\0\126\3"+
    "\6\0\3\3\1\0\132\3\1\0\4\3\5\0\52\3\2\0\136\3"+
    "\21\0\33\3\65\0\20\3\u0200\0\u19b6\3\112\0\u51eb\3\25\0\u048d\3"+
    "\103\0\56\3\2\0\u010d\3\3\0\20\3\12\1\2\3\24\0\57\3"+
    "\20\0\37\3\2\0\106\3\61\0\11\3\2\0\147\3\2\0\44\3"+
    "\1\0\10\3\77\0\13\3\1\0\3\3\1\0\4\3\1\0\27\3"+
    "\35\0\64\3\16\0\62\3\34\0\12\1\30\0\6\3\3\0\1\3"+
    "\1\0\1\3\2\0\12\1\34\3\12\0\27\3\31\0\35\3\7\0"+
    "\57\3\34\0\1\3\12\1\6\0\5\3\1\0\12\3\12\1\5\3"+
    "\1\0\51\3\27\0\3\3\1\0\10\3\4\0\12\1\6\0\27\3"+
    "\3\0\1\3\3\0\62\3\1\0\1\3\3\0\2\3\2\0\5\3"+
    "\2\0\1\3\1\0\1\3\30\0\3\3\2\0\13\3\7\0\3\3"+
    "\14\0\6\3\2\0\6\3\2\0\6\3\11\0\7\3\1\0\7\3"+
    "\1\0\53\3\1\0\12\3\12\0\163\3\15\0\12\1\6\0\u2ba4\3"+
    "\14\0\27\3\4\0\61\3\u2104\0\u016e\3\2\0\152\3\46\0\7\3"+
    "\14\0\5\3\5\0\1\3\1\0\12\3\1\0\15\3\1\0\5\3"+
    "\1\0\1\3\1\0\2\3\1\0\2\3\1\0\154\3\41\0\u016b\3"+
    "\22\0\100\3\2\0\66\3\50\0\14\3\164\0\5\3\1\0\207\3"+
    "\23\0\12\1\7\0\32\3\6\0\32\3\13\0\131\3\3\0\6\3"+
    "\2\0\6\3\2\0\6\3\2\0\3\3\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\5\3\2\4\7\5\4\3\3\1"+
    "\1\6\1\0\5\3\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\3\3\2\0\1\16\1\17\1\2\4\3"+
    "\1\20\3\3\2\0\1\21\1\3\1\22\3\3\2\0"+
    "\1\3\1\23\1\24\1\3\1\25\1\26\1\27\1\30"+
    "\3\0\1\31";

  private static int [] zzUnpackAction() {
    int [] result = new int[76];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\41\0\102\0\143\0\204\0\245\0\306\0\347"+
    "\0\41\0\u0108\0\41\0\u0129\0\u014a\0\u016b\0\u018c\0\u01ad"+
    "\0\u01ce\0\u01ef\0\u0210\0\u0231\0\u0252\0\u0273\0\u0294\0\u02b5"+
    "\0\u02d6\0\u02f7\0\u0318\0\u0339\0\u035a\0\u037b\0\u039c\0\41"+
    "\0\41\0\41\0\41\0\41\0\41\0\143\0\u03bd\0\u03de"+
    "\0\u03ff\0\u0420\0\u0441\0\41\0\41\0\u02f7\0\u0462\0\u0483"+
    "\0\u04a4\0\u04c5\0\143\0\u04e6\0\u0507\0\u0528\0\u0549\0\u056a"+
    "\0\143\0\u058b\0\143\0\u05ac\0\u05cd\0\u05ee\0\u060f\0\u0630"+
    "\0\u0651\0\143\0\143\0\u0672\0\u0693\0\41\0\143\0\143"+
    "\0\u06b4\0\u06d5\0\u06f6\0\41";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[76];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\2\1\4\1\5\1\6\1\4\1\7"+
    "\1\10\3\4\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\4\1\24\2\4"+
    "\1\25\1\26\1\2\1\27\1\30\1\31\42\0\1\3"+
    "\1\32\37\0\1\4\1\0\11\4\11\0\7\4\6\0"+
    "\1\4\1\0\2\4\1\33\6\4\11\0\7\4\6\0"+
    "\1\4\1\0\4\4\1\34\4\4\11\0\7\4\6\0"+
    "\1\4\1\0\7\4\1\35\1\4\11\0\7\4\6\0"+
    "\1\4\1\0\6\4\1\36\2\4\11\0\5\4\1\37"+
    "\1\4\21\0\1\11\50\0\1\40\40\0\1\41\40\0"+
    "\1\42\40\0\1\43\40\0\1\44\40\0\1\45\15\0"+
    "\1\4\1\0\5\4\1\46\3\4\11\0\7\4\6\0"+
    "\1\4\1\0\11\4\11\0\2\4\1\47\4\4\6\0"+
    "\1\4\1\0\2\4\1\50\6\4\11\0\7\4\6\0"+
    "\1\4\1\0\4\4\1\51\4\4\11\0\7\4\20\0"+
    "\1\52\13\0\1\53\47\0\1\54\41\0\1\55\41\0"+
    "\1\31\1\0\1\56\40\0\1\4\1\0\3\4\1\57"+
    "\5\4\11\0\7\4\6\0\1\4\1\0\1\4\1\60"+
    "\7\4\11\0\7\4\6\0\1\4\1\0\10\4\1\61"+
    "\11\0\7\4\6\0\1\4\1\0\7\4\1\62\1\4"+
    "\11\0\7\4\6\0\1\4\1\0\2\4\1\63\6\4"+
    "\11\0\7\4\6\0\1\4\1\0\11\4\11\0\1\64"+
    "\6\4\6\0\1\4\1\0\11\4\11\0\1\65\6\4"+
    "\6\0\1\4\1\0\5\4\1\66\3\4\11\0\7\4"+
    "\34\0\1\67\20\0\1\70\32\0\1\4\1\0\4\4"+
    "\1\71\4\4\11\0\7\4\6\0\1\4\1\0\3\4"+
    "\1\72\5\4\11\0\7\4\6\0\1\4\1\0\4\4"+
    "\1\73\4\4\11\0\7\4\6\0\1\4\1\0\10\4"+
    "\1\57\11\0\7\4\6\0\1\4\1\0\7\4\1\74"+
    "\1\4\11\0\7\4\6\0\1\4\1\0\11\4\11\0"+
    "\4\4\1\75\2\4\6\0\1\4\1\0\11\4\11\0"+
    "\1\76\6\4\37\0\1\77\20\0\1\100\27\0\1\4"+
    "\1\0\2\4\1\101\6\4\11\0\7\4\6\0\1\4"+
    "\1\0\4\4\1\102\4\4\11\0\7\4\6\0\1\4"+
    "\1\0\1\4\1\103\7\4\11\0\7\4\6\0\1\4"+
    "\1\0\11\4\11\0\4\4\1\104\2\4\33\0\1\105"+
    "\42\0\1\106\11\0\1\4\1\0\11\4\11\0\4\4"+
    "\1\107\2\4\6\0\1\4\1\0\4\4\1\110\4\4"+
    "\11\0\7\4\42\0\1\111\14\0\1\112\41\0\1\113"+
    "\40\0\1\114\26\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1815];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\6\1\1\11\1\1\1\11\16\1\1\0"+
    "\5\1\6\11\4\1\2\0\2\11\11\1\2\0\6\1"+
    "\2\0\5\1\1\11\2\1\3\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[76];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private Parser yyparser;

  public Yylex(java.io.Reader r, Parser yyparser) {
    this(r);
    this.yyparser = yyparser;
  }

  public int GetLine() { return yyline + 1; }

  public String GetText(){ return yytext();}


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Yylex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1754) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 13: 
          { return Parser.IF;
          }
        case 26: break;
        case 3: 
          { yyparser.yylval = new ParserVal(yytext());
         return Parser.IDENT;
          }
        case 27: break;
        case 22: 
          { return Parser.HELP;
          }
        case 28: break;
        case 1: 
          { System.err.println("Error: unexpected character '"+yytext()+"'"); return -1;
          }
        case 29: break;
        case 14: 
          { return Parser.AND;
          }
        case 30: break;
        case 5: 
          { return (int) yycharat(0);
          }
        case 31: break;
        case 20: 
          { return Parser.PRINT;
          }
        case 32: break;
        case 8: 
          { return Parser.MULT_ATR;
          }
        case 33: break;
        case 16: 
          { return Parser.FOR;
          }
        case 34: break;
        case 23: 
          { return Parser.RETURN;
          }
        case 35: break;
        case 9: 
          { return Parser.MENOR_IGUAL;
          }
        case 36: break;
        case 21: 
          { return Parser.SHOW;
          }
        case 37: break;
        case 18: 
          { return Parser.ELSE;
          }
        case 38: break;
        case 15: 
          { return Parser.OR;
          }
        case 39: break;
        case 12: 
          { return Parser.IGUAL;
          }
        case 40: break;
        case 11: 
          { return Parser.DIFF;
          }
        case 41: break;
        case 24: 
          { return Parser.DEFINE;
          }
        case 42: break;
        case 10: 
          { return Parser.MAIOR_IGUAL;
          }
        case 43: break;
        case 17: 
          { yyparser.yylval = new ParserVal(Boolean.parseBoolean(yytext()));
         return Parser.BOOL;
          }
        case 44: break;
        case 7: 
          { return Parser.SOMA_ATR;
          }
        case 45: break;
        case 2: 
          { yyparser.yylval = new ParserVal(Double.parseDouble(yytext()));
         return Parser.NUM;
          }
        case 46: break;
        case 19: 
          { return Parser.WHILE;
          }
        case 47: break;
        case 4: 
          { return Parser.NL;
          }
        case 48: break;
        case 25: 
          { return Parser.SHOW_ALL;
          }
        case 49: break;
        case 6: 
          { 
          }
        case 50: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return 0; }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

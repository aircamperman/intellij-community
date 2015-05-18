/* The following code was generated by JFlex 1.4.3 on 5/15/15 11:22 AM */

  /* It's an automatically generated code. Do not modify it. */
package com.intellij.lang.java.lexer;

import com.intellij.lexer.DocCommentTokenTypes;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

@SuppressWarnings("ALL")

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 5/15/15 11:22 AM from the specification file
 * <tt>C:/ws/IDEA/tools/lexer/../../community/java/java-psi-impl/src/com/intellij/lang/java/lexer/_JavaDocLexer.flex</tt>
 */
class _JavaDocLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int CODE_TAG = 18;
  public static final int INLINE_TAG_NAME = 16;
  public static final int PARAM_TAG_SPACE = 8;
  public static final int COMMENT_DATA = 4;
  public static final int DOC_TAG_VALUE = 10;
  public static final int CODE_TAG_SPACE = 20;
  public static final int COMMENT_DATA_START = 2;
  public static final int TAG_DOC_SPACE = 6;
  public static final int YYINITIAL = 0;
  public static final int DOC_TAG_VALUE_IN_PAREN = 12;
  public static final int DOC_TAG_VALUE_IN_LTGT = 14;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\2\1\35\1\0\1\2\1\1\22\0\1\2\2\0\1\14"+
    "\1\4\3\0\1\12\1\13\1\10\1\0\1\15\1\5\1\3\1\7"+
    "\12\3\1\5\1\0\1\23\1\0\1\24\1\0\1\16\32\4\1\11"+
    "\1\0\1\11\1\0\1\4\1\0\1\20\1\4\1\26\1\30\1\31"+
    "\3\4\1\33\2\4\1\32\1\22\1\4\1\27\1\17\1\4\1\21"+
    "\1\4\1\34\6\4\1\25\1\0\1\6\44\0\4\4\4\0\1\4"+
    "\12\0\1\4\4\0\1\4\5\0\27\4\1\0\37\4\1\0\u01ca\4"+
    "\4\0\14\4\16\0\5\4\7\0\1\4\1\0\1\4\201\0\5\4"+
    "\1\0\2\4\2\0\4\4\10\0\1\4\1\0\3\4\1\0\1\4"+
    "\1\0\24\4\1\0\123\4\1\0\213\4\10\0\236\4\11\0\46\4"+
    "\2\0\1\4\7\0\47\4\7\0\1\4\100\0\33\4\5\0\3\4"+
    "\30\0\1\4\24\0\53\4\43\0\2\4\1\0\143\4\1\0\1\4"+
    "\17\0\2\4\7\0\2\4\12\0\3\4\2\0\1\4\20\0\1\4"+
    "\1\0\36\4\35\0\131\4\13\0\1\4\30\0\41\4\11\0\2\4"+
    "\4\0\1\4\5\0\26\4\4\0\1\4\11\0\1\4\3\0\1\4"+
    "\27\0\31\4\107\0\1\4\1\0\13\4\127\0\66\4\3\0\1\4"+
    "\22\0\1\4\7\0\12\4\17\0\7\4\1\0\7\4\5\0\10\4"+
    "\2\0\2\4\2\0\26\4\1\0\7\4\1\0\1\4\3\0\4\4"+
    "\3\0\1\4\20\0\1\4\15\0\2\4\1\0\3\4\16\0\4\4"+
    "\7\0\1\4\11\0\6\4\4\0\2\4\2\0\26\4\1\0\7\4"+
    "\1\0\2\4\1\0\2\4\1\0\2\4\37\0\4\4\1\0\1\4"+
    "\23\0\3\4\20\0\11\4\1\0\3\4\1\0\26\4\1\0\7\4"+
    "\1\0\2\4\1\0\5\4\3\0\1\4\22\0\1\4\17\0\2\4"+
    "\17\0\1\4\23\0\10\4\2\0\2\4\2\0\26\4\1\0\7\4"+
    "\1\0\2\4\1\0\5\4\3\0\1\4\36\0\2\4\1\0\3\4"+
    "\17\0\1\4\21\0\1\4\1\0\6\4\3\0\3\4\1\0\4\4"+
    "\3\0\2\4\1\0\1\4\1\0\2\4\3\0\2\4\3\0\3\4"+
    "\3\0\14\4\26\0\1\4\50\0\1\4\13\0\10\4\1\0\3\4"+
    "\1\0\27\4\1\0\12\4\1\0\5\4\3\0\1\4\32\0\2\4"+
    "\6\0\2\4\43\0\10\4\1\0\3\4\1\0\27\4\1\0\12\4"+
    "\1\0\5\4\3\0\1\4\40\0\1\4\1\0\2\4\17\0\2\4"+
    "\22\0\10\4\1\0\3\4\1\0\51\4\2\0\1\4\20\0\1\4"+
    "\21\0\2\4\30\0\6\4\5\0\22\4\3\0\30\4\1\0\11\4"+
    "\1\0\1\4\2\0\7\4\72\0\60\4\1\0\2\4\13\0\10\4"+
    "\72\0\2\4\1\0\1\4\2\0\2\4\1\0\1\4\2\0\1\4"+
    "\6\0\4\4\1\0\7\4\1\0\3\4\1\0\1\4\1\0\1\4"+
    "\2\0\2\4\1\0\4\4\1\0\2\4\11\0\1\4\2\0\5\4"+
    "\1\0\1\4\25\0\4\4\40\0\1\4\77\0\10\4\1\0\44\4"+
    "\33\0\5\4\163\0\53\4\24\0\1\4\20\0\6\4\4\0\4\4"+
    "\3\0\1\4\3\0\2\4\7\0\3\4\4\0\15\4\14\0\1\4"+
    "\21\0\46\4\1\0\1\4\5\0\1\4\2\0\53\4\1\0\u014d\4"+
    "\1\0\4\4\2\0\7\4\1\0\1\4\1\0\4\4\2\0\51\4"+
    "\1\0\4\4\2\0\41\4\1\0\4\4\2\0\7\4\1\0\1\4"+
    "\1\0\4\4\2\0\17\4\1\0\71\4\1\0\4\4\2\0\103\4"+
    "\45\0\20\4\20\0\125\4\14\0\u026c\4\2\0\21\4\1\0\32\4"+
    "\5\0\113\4\3\0\3\4\17\0\15\4\1\0\4\4\16\0\22\4"+
    "\16\0\22\4\16\0\15\4\1\0\3\4\17\0\64\4\43\0\1\4"+
    "\3\0\2\4\103\0\130\4\10\0\51\4\1\0\1\4\5\0\106\4"+
    "\12\0\35\4\63\0\36\4\2\0\5\4\13\0\54\4\25\0\7\4"+
    "\70\0\27\4\11\0\65\4\122\0\1\4\135\0\57\4\21\0\7\4"+
    "\67\0\36\4\15\0\2\4\12\0\54\4\32\0\44\4\51\0\3\4"+
    "\12\0\44\4\153\0\4\4\1\0\4\4\3\0\2\4\11\0\300\4"+
    "\100\0\u0116\4\2\0\6\4\2\0\46\4\2\0\6\4\2\0\10\4"+
    "\1\0\1\4\1\0\1\4\1\0\1\4\1\0\37\4\2\0\65\4"+
    "\1\0\7\4\1\0\1\4\3\0\3\4\1\0\7\4\3\0\4\4"+
    "\2\0\6\4\4\0\15\4\5\0\3\4\1\0\7\4\102\0\2\4"+
    "\23\0\1\4\34\0\1\4\15\0\1\4\20\0\15\4\3\0\33\4"+
    "\107\0\1\4\4\0\1\4\2\0\12\4\1\0\1\4\3\0\5\4"+
    "\6\0\1\4\1\0\1\4\1\0\1\4\1\0\4\4\1\0\13\4"+
    "\2\0\4\4\5\0\5\4\4\0\1\4\21\0\51\4\u0a77\0\57\4"+
    "\1\0\57\4\1\0\205\4\6\0\4\4\3\0\2\4\14\0\46\4"+
    "\1\0\1\4\5\0\1\4\2\0\70\4\7\0\1\4\20\0\27\4"+
    "\11\0\7\4\1\0\7\4\1\0\7\4\1\0\7\4\1\0\7\4"+
    "\1\0\7\4\1\0\7\4\1\0\7\4\120\0\1\4\u01d5\0\3\4"+
    "\31\0\11\4\7\0\5\4\2\0\5\4\4\0\126\4\6\0\3\4"+
    "\1\0\132\4\1\0\4\4\5\0\51\4\3\0\136\4\21\0\33\4"+
    "\65\0\20\4\u0200\0\u19b6\4\112\0\u51cd\4\63\0\u048d\4\103\0\56\4"+
    "\2\0\u010d\4\3\0\20\4\12\0\2\4\24\0\57\4\20\0\31\4"+
    "\10\0\120\4\47\0\11\4\2\0\147\4\2\0\4\4\1\0\4\4"+
    "\14\0\13\4\115\0\12\4\1\0\3\4\1\0\4\4\1\0\27\4"+
    "\25\0\1\4\7\0\64\4\16\0\62\4\76\0\6\4\3\0\1\4"+
    "\16\0\34\4\12\0\27\4\31\0\35\4\7\0\57\4\34\0\1\4"+
    "\60\0\51\4\27\0\3\4\1\0\10\4\24\0\27\4\3\0\1\4"+
    "\5\0\60\4\1\0\1\4\3\0\2\4\2\0\5\4\2\0\1\4"+
    "\1\0\1\4\30\0\3\4\2\0\13\4\7\0\3\4\14\0\6\4"+
    "\2\0\6\4\2\0\6\4\11\0\7\4\1\0\7\4\221\0\43\4"+
    "\35\0\u2ba4\4\14\0\27\4\4\0\61\4\u2104\0\u016e\4\2\0\152\4"+
    "\46\0\7\4\14\0\5\4\5\0\1\4\1\0\12\4\1\0\15\4"+
    "\1\0\5\4\1\0\1\4\1\0\2\4\1\0\2\4\1\0\154\4"+
    "\41\0\u016b\4\22\0\100\4\2\0\66\4\50\0\15\4\66\0\2\4"+
    "\30\0\3\4\31\0\1\4\6\0\5\4\1\0\207\4\7\0\1\4"+
    "\34\0\32\4\4\0\1\4\1\0\32\4\13\0\131\4\3\0\6\4"+
    "\2\0\6\4\2\0\6\4\2\0\3\4\3\0\2\4\3\0\2\4"+
    "\31\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\13\0\3\1\1\2\1\3\1\4\2\2\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\12\1\20\1\1\3\21\1\22\1\0\1\23"+
    "\1\0\6\24\1\25\12\24\1\26\1\24\2\27\2\24";

  private static int [] zzUnpackAction() {
    int [] result = new int[63];
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
    "\0\0\0\36\0\74\0\132\0\170\0\226\0\264\0\322"+
    "\0\360\0\u010e\0\u012c\0\u014a\0\u0168\0\u0186\0\u014a\0\u01a4"+
    "\0\u014a\0\u0186\0\u01c2\0\u014a\0\u01e0\0\u01fe\0\u021c\0\u023a"+
    "\0\u0258\0\u014a\0\u014a\0\u014a\0\u014a\0\u014a\0\u0276\0\u014a"+
    "\0\u0294\0\u014a\0\u02b2\0\u0186\0\u02b2\0\u02d0\0\u014a\0\u0186"+
    "\0\u02ee\0\u030c\0\u032a\0\u0348\0\u0366\0\u0384\0\u014a\0\u03a2"+
    "\0\u03c0\0\u03de\0\u03fc\0\u041a\0\u0438\0\u0456\0\u0474\0\u0492"+
    "\0\u04b0\0\u032a\0\u04ce\0\u02ee\0\u032a\0\u04ec\0\u050a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[63];
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
    "\7\14\1\15\1\16\25\14\1\17\2\20\3\17\1\21"+
    "\1\17\1\22\5\17\1\23\6\17\1\24\7\17\1\20"+
    "\1\17\1\20\1\25\3\17\1\21\1\17\1\22\14\17"+
    "\1\24\7\17\1\20\1\14\2\26\3\14\1\21\1\14"+
    "\1\16\24\14\1\26\1\14\2\27\5\14\1\16\24\14"+
    "\1\27\1\17\2\30\2\31\1\17\1\21\1\17\1\22"+
    "\1\31\1\32\1\17\1\33\1\34\1\17\4\31\1\35"+
    "\2\17\7\31\1\30\1\14\2\20\2\31\3\14\1\16"+
    "\1\31\1\14\1\36\1\14\1\34\1\14\4\31\3\14"+
    "\7\31\1\20\4\14\1\37\3\14\1\16\6\14\4\37"+
    "\1\14\1\40\1\14\7\37\11\14\1\16\5\14\1\41"+
    "\17\14\1\42\2\43\3\42\1\21\1\42\1\44\14\42"+
    "\1\24\7\42\1\45\1\42\2\43\3\42\1\21\1\42"+
    "\1\44\24\42\1\45\46\0\1\46\34\0\1\47\1\50"+
    "\26\0\2\20\32\0\1\20\1\51\2\0\14\51\1\52"+
    "\15\51\3\0\1\25\34\0\2\26\32\0\1\26\1\0"+
    "\2\27\32\0\1\27\1\0\2\30\32\0\1\30\3\0"+
    "\2\31\4\0\1\31\5\0\4\31\3\0\7\31\4\0"+
    "\3\37\11\0\4\37\3\0\7\37\1\0\1\53\2\0"+
    "\3\53\1\0\10\53\1\54\6\53\1\55\3\53\1\56"+
    "\2\53\2\0\2\45\32\0\1\45\10\0\1\57\25\0"+
    "\1\51\2\0\32\51\1\0\1\51\2\0\15\51\1\60"+
    "\14\51\1\0\1\53\2\0\3\53\1\0\26\53\1\0"+
    "\1\53\2\0\3\53\1\0\11\53\1\61\14\53\1\0"+
    "\1\53\2\0\3\53\1\0\20\53\1\62\5\53\1\0"+
    "\1\53\2\0\3\53\1\0\24\53\1\63\1\53\1\0"+
    "\1\51\2\0\16\51\1\64\13\51\1\0\1\53\2\0"+
    "\3\53\1\0\12\53\1\65\13\53\1\0\1\53\2\0"+
    "\3\53\1\0\21\53\1\66\4\53\1\0\1\53\2\0"+
    "\3\53\1\0\25\53\1\67\1\0\1\51\2\0\15\51"+
    "\1\70\14\51\1\0\1\53\2\0\3\53\1\0\11\53"+
    "\1\71\14\53\1\0\1\53\2\0\3\53\1\0\22\53"+
    "\1\72\3\53\1\0\1\53\2\0\3\53\1\0\22\53"+
    "\1\73\3\53\1\0\1\51\2\0\17\51\1\74\12\51"+
    "\1\0\1\53\2\0\3\53\1\0\13\53\1\75\12\53"+
    "\1\0\1\53\2\0\3\53\1\0\12\53\1\76\13\53"+
    "\1\0\1\53\2\0\3\53\1\0\11\53\1\77\14\53"+
    "\1\0\1\53\2\0\3\53\1\0\23\53\1\72\2\53"+
    "\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1320];
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
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

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
    "\13\0\1\11\2\1\1\11\1\1\1\11\2\1\1\11"+
    "\5\1\5\11\1\1\1\11\1\1\1\11\3\1\1\0"+
    "\1\11\1\0\6\1\1\11\20\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[63];
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

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private boolean myJdk15Enabled;
  private DocCommentTokenTypes myTokenTypes;

  public _JavaDocLexer(boolean isJdk15Enabled, DocCommentTokenTypes tokenTypes) {
    this((java.io.Reader)null);
    myJdk15Enabled = isJdk15Enabled;
    myTokenTypes = tokenTypes;
  }

  public boolean checkAhead(char c) {
     if (zzMarkedPos >= zzBuffer.length()) return false;
     return zzBuffer.charAt(zzMarkedPos) == c;
  }

  public void goTo(int offset) {
    zzCurrentPos = zzMarkedPos = zzStartRead = offset;
    zzPushbackPos = 0;
    zzAtEOF = offset < zzEndRead;
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  _JavaDocLexer(java.io.Reader in) {
    this.zzReader = in;
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
    while (i < 1662) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
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
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
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
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
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
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
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
        case 12: 
          { return myTokenTypes.tagValueSharp();
          }
        case 24: break;
        case 17: 
          { yybegin(CODE_TAG); return myTokenTypes.commentData();
          }
        case 25: break;
        case 16: 
          { yybegin(COMMENT_DATA); return myTokenTypes.tagValueGT();
          }
        case 26: break;
        case 3: 
          { return myTokenTypes.space();
          }
        case 27: break;
        case 6: 
          { return myTokenTypes.commentData();
          }
        case 28: break;
        case 4: 
          { yybegin(COMMENT_DATA); return myTokenTypes.inlineTagEnd();
          }
        case 29: break;
        case 21: 
          { yybegin(COMMENT_DATA_START); return myTokenTypes.commentStart();
          }
        case 30: break;
        case 7: 
          { if (checkAhead('<') || checkAhead('\"')) yybegin(COMMENT_DATA);
  else if (checkAhead('\u007b') ) yybegin(COMMENT_DATA);  // lbrace - there's a error in JLex when typing lbrace directly
  else yybegin(DOC_TAG_VALUE);
  return myTokenTypes.space();
          }
        case 31: break;
        case 8: 
          { yybegin(DOC_TAG_VALUE); return myTokenTypes.space();
          }
        case 32: break;
        case 10: 
          { return myTokenTypes.tagValueToken();
          }
        case 33: break;
        case 20: 
          { yybegin(TAG_DOC_SPACE); return myTokenTypes.tagName();
          }
        case 34: break;
        case 18: 
          { yybegin(CODE_TAG);
  return myTokenTypes.space();
          }
        case 35: break;
        case 9: 
          { yybegin(COMMENT_DATA); return myTokenTypes.space();
          }
        case 36: break;
        case 23: 
          { yybegin(PARAM_TAG_SPACE); return myTokenTypes.tagName();
          }
        case 37: break;
        case 22: 
          { yybegin(CODE_TAG_SPACE); return myTokenTypes.tagName();
          }
        case 38: break;
        case 1: 
          { return myTokenTypes.badCharacter();
          }
        case 39: break;
        case 15: 
          { yybegin(DOC_TAG_VALUE); return myTokenTypes.tagValueRParen();
          }
        case 40: break;
        case 11: 
          { yybegin(DOC_TAG_VALUE_IN_PAREN); return myTokenTypes.tagValueLParen();
          }
        case 41: break;
        case 13: 
          { return myTokenTypes.tagValueComma();
          }
        case 42: break;
        case 14: 
          { if (myJdk15Enabled) {
    yybegin(DOC_TAG_VALUE_IN_LTGT);
    return myTokenTypes.tagValueLT();
  }
  else {
    yybegin(COMMENT_DATA);
    return myTokenTypes.commentData();
  }
          }
        case 43: break;
        case 5: 
          { if (checkAhead('@')) {
    yybegin(INLINE_TAG_NAME);
    return myTokenTypes.inlineTagStart();
  }
  else{
    yybegin(COMMENT_DATA);
    return myTokenTypes.inlineTagStart();
  }
          }
        case 44: break;
        case 2: 
          { yybegin(COMMENT_DATA); return myTokenTypes.commentData();
          }
        case 45: break;
        case 19: 
          { return myTokenTypes.commentEnd();
          }
        case 46: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: Lexer.jflex

//Codigo Usuario
package com.example.pruebapractica2.analizadores;
import java_cup.runtime.*; 
import com.example.pruebapractica2.analizadores.sym.*;
import java.util.List;
import java.util.ArrayList;
import com.example.pruebapractica2.objetos.ErrorCom;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class Lexer implements Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
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
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\u10ff\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\10\0\3\1\1\0\2\1\22\0\1\1\7\0\1\2"+
    "\1\3\1\4\1\5\1\6\1\7\1\0\1\10\12\11"+
    "\7\0\32\12\6\0\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\12\1\22\1\23\1\12\1\24\1\25"+
    "\1\26\1\27\1\30\1\12\1\31\1\12\1\32\1\33"+
    "\1\34\3\12\1\35\u0185\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[512];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\60\13\1\14\17\13\1\15\1\13"+
    "\1\16\5\13\1\17\5\13\1\20\3\13\1\21\4\13"+
    "\1\22\1\23\1\24\1\25\2\13\1\26";

  private static int [] zzUnpackAction() {
    int [] result = new int[105];
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
    "\0\0\0\36\0\74\0\36\0\36\0\36\0\36\0\36"+
    "\0\36\0\36\0\132\0\170\0\226\0\264\0\322\0\360"+
    "\0\u010e\0\u012c\0\u014a\0\u0168\0\u0186\0\u01a4\0\u01c2\0\u01e0"+
    "\0\u01fe\0\u021c\0\u023a\0\u0258\0\u0276\0\u0294\0\u02b2\0\u02d0"+
    "\0\u02ee\0\u030c\0\u032a\0\u0348\0\u0366\0\u0384\0\u03a2\0\u03c0"+
    "\0\u03de\0\u03fc\0\u041a\0\u0438\0\u0456\0\u0474\0\u0492\0\u04b0"+
    "\0\u04ce\0\u04ec\0\u050a\0\u0528\0\u0546\0\u0564\0\u0582\0\u05a0"+
    "\0\u05be\0\u05dc\0\u05fa\0\170\0\u0618\0\u0636\0\u0654\0\u0672"+
    "\0\u0690\0\u06ae\0\u06cc\0\u06ea\0\u0708\0\u0726\0\u0744\0\u0762"+
    "\0\u0780\0\u079e\0\u07bc\0\170\0\u07da\0\170\0\u07f8\0\u0816"+
    "\0\u0834\0\u0852\0\u0870\0\170\0\u088e\0\u08ac\0\u08ca\0\u08e8"+
    "\0\u0906\0\170\0\u0924\0\u0942\0\u0960\0\170\0\u097e\0\u099c"+
    "\0\u09ba\0\u09d8\0\170\0\170\0\170\0\170\0\u09f6\0\u0a14"+
    "\0\170";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[105];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\14\1\16\3\14\1\17"+
    "\2\14\1\20\1\21\1\22\1\23\1\24\1\25\2\14"+
    "\1\26\1\14\37\0\1\3\45\0\1\13\24\14\11\0"+
    "\25\14\11\0\14\14\1\27\1\30\6\14\1\31\11\0"+
    "\2\14\1\32\6\14\1\33\10\14\1\34\2\14\11\0"+
    "\20\14\1\35\4\14\11\0\11\14\1\36\13\14\11\0"+
    "\16\14\1\37\6\14\11\0\2\14\1\40\3\14\1\41"+
    "\16\14\11\0\3\14\1\42\21\14\11\0\16\14\1\43"+
    "\6\14\11\0\6\14\1\44\7\14\1\45\6\14\11\0"+
    "\6\14\1\46\16\14\11\0\2\14\1\47\22\14\11\0"+
    "\11\14\1\50\7\14\1\51\3\14\11\0\22\14\1\52"+
    "\2\14\11\0\7\14\1\53\15\14\11\0\20\14\1\54"+
    "\4\14\11\0\2\14\1\55\15\14\1\56\4\14\11\0"+
    "\2\14\1\57\22\14\11\0\15\14\1\60\7\14\11\0"+
    "\20\14\1\61\4\14\11\0\20\14\1\62\4\14\11\0"+
    "\10\14\1\63\14\14\11\0\12\14\1\64\12\14\11\0"+
    "\13\14\1\65\11\14\11\0\4\14\1\66\20\14\11\0"+
    "\12\14\1\67\12\14\11\0\20\14\1\70\4\14\11\0"+
    "\20\14\1\71\4\14\11\0\14\14\1\72\10\14\11\0"+
    "\6\14\1\73\16\14\11\0\13\14\1\74\11\14\11\0"+
    "\6\14\1\74\16\14\11\0\4\14\1\75\20\14\11\0"+
    "\5\14\1\76\17\14\11\0\23\14\1\77\1\14\11\0"+
    "\7\14\1\100\15\14\11\0\6\14\1\101\16\14\11\0"+
    "\2\14\1\102\22\14\11\0\2\14\1\103\22\14\11\0"+
    "\20\14\1\67\4\14\11\0\6\14\1\104\16\14\11\0"+
    "\11\14\1\105\13\14\11\0\21\14\1\106\3\14\11\0"+
    "\16\14\1\74\6\14\11\0\5\14\1\53\17\14\11\0"+
    "\11\14\1\107\13\14\11\0\2\14\1\110\22\14\11\0"+
    "\20\14\1\111\4\14\11\0\22\14\1\112\2\14\11\0"+
    "\20\14\1\113\4\14\11\0\2\14\1\114\22\14\11\0"+
    "\11\14\1\115\13\14\11\0\2\14\1\116\22\14\11\0"+
    "\5\14\1\67\17\14\11\0\15\14\1\117\7\14\11\0"+
    "\21\14\1\120\3\14\11\0\10\14\1\121\14\14\11\0"+
    "\2\14\1\122\22\14\11\0\13\14\1\123\11\14\11\0"+
    "\20\14\1\124\4\14\11\0\11\14\1\125\13\14\11\0"+
    "\13\14\1\126\11\14\11\0\2\14\1\127\22\14\11\0"+
    "\4\14\1\130\20\14\11\0\12\14\1\131\12\14\11\0"+
    "\16\14\1\132\6\14\11\0\16\14\1\133\6\14\11\0"+
    "\15\14\1\134\7\14\11\0\13\14\1\67\11\14\11\0"+
    "\16\14\1\135\6\14\11\0\16\14\1\136\6\14\11\0"+
    "\5\14\1\137\17\14\11\0\2\14\1\140\22\14\11\0"+
    "\2\14\1\74\22\14\11\0\15\14\1\141\7\14\11\0"+
    "\10\14\1\142\14\14\11\0\20\14\1\143\4\14\11\0"+
    "\16\14\1\144\6\14\11\0\20\14\1\145\4\14\11\0"+
    "\16\14\1\146\6\14\11\0\22\14\1\147\2\14\11\0"+
    "\13\14\1\150\11\14\11\0\16\14\1\151\6\14";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2610];
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\7\11\137\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[105];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
    private List<String> errorsList;
    private List<ErrorCom> erroresCom;

    private void error(String lexeme) {
        //System.out.printf("Error Lexico en el Texto: %s  linea %d,  columna %d. \n", lexeme, yyline + 1, yycolumn + 1);
        //errorsList.add(String.format("Error Lexico en el Texto: %s  linea %d, columna %d. Corrige e intenta de nuevo.", lexeme, yyline + 1, yycolumn + 1));
        erroresCom.add(new ErrorCom("Lexico","Simbolo no existe en el lenguaje",String.valueOf(yyline),String.valueOf(yycolumn),lexeme));
    }    

    private void errorPalabra(String lexeme) {
        erroresCom.add(new ErrorCom("Lexico","Palabra no existe en el lenguaje",String.valueOf(yyline),String.valueOf(yycolumn),lexeme));
    }

    public List<String> getErrorsList() {
        return errorsList;
    }

    public List<ErrorCom> getErroresCom() {
        return erroresCom;
    }



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
      errorsList = new ArrayList<>();
    erroresCom = new ArrayList<>();
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
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
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
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

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { error(yytext()); new Symbol(sym.error,yyline,yycolumn, yytext());
            }
            // fall through
          case 23: break;
          case 2:
            { /*Vacio*/
            }
            // fall through
          case 24: break;
          case 3:
            { return new Symbol(sym.PARI,yyline,yycolumn, yytext());
            }
            // fall through
          case 25: break;
          case 4:
            { return new Symbol(sym.PARD,yyline,yycolumn, yytext());
            }
            // fall through
          case 26: break;
          case 5:
            { return new Symbol(sym.SMULT,yyline,yycolumn, yytext());
            }
            // fall through
          case 27: break;
          case 6:
            { return new Symbol(sym.SMAS,yyline,yycolumn, yytext());
            }
            // fall through
          case 28: break;
          case 7:
            { return new Symbol(sym.COMA,yyline,yycolumn, yytext());
            }
            // fall through
          case 29: break;
          case 8:
            { return new Symbol(sym.SMENOS,yyline,yycolumn, yytext());
            }
            // fall through
          case 30: break;
          case 9:
            { return new Symbol(sym.SDIVI,yyline,yycolumn, yytext());
            }
            // fall through
          case 31: break;
          case 10:
            { return new Symbol(sym.NUMERO,yyline,yycolumn, yytext());
            }
            // fall through
          case 32: break;
          case 11:
            { errorPalabra(yytext()); new Symbol(sym.error,yyline,yycolumn, yytext());
            }
            // fall through
          case 33: break;
          case 12:
            { return new Symbol(sym.COLOR,yyline,yycolumn, yytext());
            }
            // fall through
          case 34: break;
          case 13:
            { return new Symbol(sym.CURVA,yyline,yycolumn, yytext());
            }
            // fall through
          case 35: break;
          case 14:
            { return new Symbol(sym.LINEA,yyline,yycolumn, yytext());
            }
            // fall through
          case 36: break;
          case 15:
            { return new Symbol(sym.ANIM,yyline,yycolumn, yytext());
            }
            // fall through
          case 37: break;
          case 16:
            { return new Symbol(sym.OBJ,yyline,yycolumn, yytext());
            }
            // fall through
          case 38: break;
          case 17:
            { return new Symbol(sym.CIRC,yyline,yycolumn, yytext());
            }
            // fall through
          case 39: break;
          case 18:
            { return new Symbol(sym.ANT,yyline,yycolumn, yytext());
            }
            // fall through
          case 40: break;
          case 19:
            { return new Symbol(sym.CUAD,yyline,yycolumn, yytext());
            }
            // fall through
          case 41: break;
          case 20:
            { return new Symbol(sym.GRAFICAR,yyline,yycolumn, yytext());
            }
            // fall through
          case 42: break;
          case 21:
            { return new Symbol(sym.POLIG,yyline,yycolumn, yytext());
            }
            // fall through
          case 43: break;
          case 22:
            { return new Symbol(sym.RECT,yyline,yycolumn, yytext());
            }
            // fall through
          case 44: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String[] argv) {
    if (argv.length == 0) {
      System.out.println("Usage : java Lexer [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          // Side-effect: is encodingName valid?
          java.nio.charset.Charset.forName(encodingName);
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Lexer scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Lexer(reader);
          while ( !scanner.zzAtEOF ) scanner.next_token();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}

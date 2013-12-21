/* Generated By:JavaCC: Do not edit this line. TurtleParserConstants.java */
package uk.ac.manchester.cs.owl.owlapi.turtle.parser;

/** Token literal values and constants. Generated by
 * org.javacc.parser.OtherFilesGen#start() */
public interface TurtleParserConstants {
    /** End of File. */
    int EOF = 0;
    /** RegularExpression Id. */
    int COMMENT = 5;
    /** RegularExpression Id. */
    int STRING_START = 6;
    /** RegularExpression Id. */
    int ANY_ESCAPED_CHAR = 7;
    /** RegularExpression Id. */
    int ANY_CHAR = 8;
    /** RegularExpression Id. */
    int STRING = 9;
    /** RegularExpression Id. */
    int LONG_STRING = 12;
    /** RegularExpression Id. */
    int DIGIT = 13;
    /** RegularExpression Id. */
    int INTEGER = 14;
    /** RegularExpression Id. */
    int DOUBLE = 15;
    /** RegularExpression Id. */
    int DECIMAL = 16;
    /** RegularExpression Id. */
    int EXPONENT = 17;
    /** RegularExpression Id. */
    int OPENPAR = 18;
    /** RegularExpression Id. */
    int CLOSEPAR = 19;
    /** RegularExpression Id. */
    int OPEN_SQUARE_BRACKET = 20;
    /** RegularExpression Id. */
    int CLOSE_SQUARE_BRACKET = 21;
    /** RegularExpression Id. */
    int COMMA = 22;
    /** RegularExpression Id. */
    int DOT = 23;
    /** RegularExpression Id. */
    int SEMICOLON = 24;
    /** RegularExpression Id. */
    int PREFIX = 25;
    /** RegularExpression Id. */
    int DOUBLE_CARET = 26;
    /** RegularExpression Id. */
    int BASE = 27;
    /** RegularExpression Id. */
    int AT = 28;
    /** RegularExpression Id. */
    int A = 29;
    /** RegularExpression Id. */
    int EMPTY_BLANK_NODE = 30;
    /** RegularExpression Id. */
    int NODE_ID_START = 31;
    /** RegularExpression Id. */
    int TRUE = 32;
    /** RegularExpression Id. */
    int FALSE = 33;
    /** RegularExpression Id. */
    int SELECT = 34;
    /** RegularExpression Id. */
    int WHERE = 35;
    /** RegularExpression Id. */
    int FILTER = 36;
    /** RegularExpression Id. */
    int LETTER = 37;
    /** RegularExpression Id. */
    int FULLIRI = 38;
    /** RegularExpression Id. */
    int PNAME_NS = 39;
    /** RegularExpression Id. */
    int PN_LOCAL = 40;
    /** RegularExpression Id. */
    int PNAME_LN = 41;
    /** RegularExpression Id. */
    int PN_PREFIX = 42;
    /** RegularExpression Id. */
    int PN_CHARS_BASE = 43;
    /** RegularExpression Id. */
    int PN_CHARS = 44;
    /** RegularExpression Id. */
    int PN_CHARS_U = 45;
    /** RegularExpression Id. */
    int NODEID = 46;
    /** RegularExpression Id. */
    int ERROR = 47;
    /** Lexical state. */
    int DEFAULT = 0;
    /** Lexical state. */
    int IN_STRING = 1;
    /** Lexical state. */
    int IN_LONG_STRING = 2;
    /** Literal token values. */
    String[] tokenImage = { "<EOF>", "\" \"", "\"\\n\"", "\"\\t\"", "\"\\r\"",
            "<COMMENT>", "\"\\\"\"", "<ANY_ESCAPED_CHAR>", "<ANY_CHAR>", "\"\\\"\"",
            "\"\\\"\\\"\\\"\"", "<token of kind 11>", "\"\\\"\\\"\\\"\"", "<DIGIT>",
            "<INTEGER>", "<DOUBLE>", "<DECIMAL>", "<EXPONENT>", "\"(\"", "\")\"",
            "\"[\"", "\"]\"", "\",\"", "\".\"", "\";\"", "\"@prefix\"", "\"^^\"",
            "\"@base\"", "\"@\"", "\"a\"", "<EMPTY_BLANK_NODE>", "\"_:\"", "\"true\"",
            "\"false\"", "\"SELECT\"", "\"WHERE\"", "\"FILTER\"", "<LETTER>",
            "<FULLIRI>", "<PNAME_NS>", "<PN_LOCAL>", "<PNAME_LN>", "<PN_PREFIX>",
            "<PN_CHARS_BASE>", "<PN_CHARS>", "<PN_CHARS_U>", "<NODEID>", "<ERROR>", };
}

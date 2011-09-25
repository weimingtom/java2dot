import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public class GenDotJava {
    // TODO: Only for TEST
    private static boolean TEST_PRINT = false;
    private static boolean FILTER_NATIVE_TYPE = true;
    private static PrintStream outstr;
    private static HashMap map = new HashMap();
    
    private static String[] NATIVE_TYPES;
    static {
	NATIVE_TYPES = new String[] { "String", "int", "double", "int",
		"Object", "boolean", "float", "byte", 
		"char", "short", "long"};
	// TODO: MUST BE SORTED!
	Arrays.sort(NATIVE_TYPES);
	/*
	 * if(Arrays.binarySearch(NATIVE_TYPES, "uint") >= 0) {
	 * System.out.println("=========="); }
	 */
    }

    /**
     * Main Entry
     * 
     * @param args
     */
    public static void main(String[] args) {
	if (args.length < 1) {
	    System.out.println("Usage: GenDotJava [path]");
	    return;
	}
	ArrayList fileNames = new ArrayList();
	PrintStream out = openOutput("out.dot");
	outstr = out;
	printDotHead(out);
	ScanFile(args[0]);
	printDotFoot(out);
    }

    private static void ScanFile(String filename) {
	SimpleJavaCtagsLexer lex;
	try {
	    lex = new SimpleJavaCtagsLexer(
		    new ANTLRFileStream(filename, "UTF8"));
	    CommonTokenStream tokens = new CommonTokenStream(lex);
	    SimpleJavaCtagsParser g = new SimpleJavaCtagsParser(tokens);
	    try {
		g.program();
	    } catch (RecognitionException e) {
		e.printStackTrace();
	    }
	} catch (IOException e1) {
	    e1.printStackTrace();
	}
    }

    private static PrintStream openOutput(String fileName) {
	if (!TEST_PRINT) {
	    File dotFile = new File(fileName);
	    try {
		PrintStream out = new PrintStream(new FileOutputStream(dotFile));
		return out;
	    } catch (IOException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	    }
	}
	return System.out;
    }

    private static void printDotHead(PrintStream out) {
	out.println("digraph android_graphics {\n" + "rankdir=LR; //TB\n"
		+ "\n" + "node[fontname=\"PMingLiu\"]\n"
		+ "edge[fontname=\"PMingLiu\"]\n");
    }

    private static void printDotFoot(PrintStream out) {
	out.println("}");
    }

    public static void printInterface(String str, String className) {
	outstr.println("\"" + str + "\" -> \"" + className
		+ "\" [color=\"#00ff00\"]");
    }

    public static void printMethodClass(String className, String str) {
	if (FILTER_NATIVE_TYPE) {
	    if (Arrays.binarySearch(NATIVE_TYPES, str) >= 0) {
		return;
	    }
	}
	Object listObj = map.get(className);
	if (listObj == null) {
	    listObj = new ArrayList();
	    map.put(className, listObj);
	}
	ArrayList list = (ArrayList)listObj;
	if (list.indexOf(str) < 0) {
	    list.add(str);
	    outstr.println("\"" + className + "\" -> \"" + str + "\"");
	}
    }
}


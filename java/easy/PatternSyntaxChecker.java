import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
 * 
 * 
 * 
 * Pattern.compile returns pattern but 
 * if regex is not valid it throws PatternSyntacException
 * catch exception to print you message
 * add one line to check git setup
 * 
 * https://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html#compile%28java.lang.String%29
 * 
 * 
 */

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
              //Write your code
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
                testCases--;

            }catch(PatternSyntaxException patternSyntaxException) {
                System.out.println("Invalid");
                testCases--;
            }
        }
        
        in.close();
    }
}

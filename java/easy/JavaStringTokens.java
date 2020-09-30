import java.util.Scanner;

/**
 * JavaStringTokens
 * https://www.hackerrank.com/challenges/java-string-tokens/problem
 * 
 * This code is based upon user pmtatar https://www.hackerrank.com/pmtatar
 * Regex expression constructs https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#sum
 * 
 * method signature
 * String[] string.split(regex);
 * 
 * you write the regex pattern for split 
 * In this case !,?._'@\\s
 * 
 * here \\s denotes A whitespace character: [ \t\n\x0B\f\r]
 * the \ is for escape sequence, \s for Whitespace
 * 
 * [] represent a character class ie group of character to match
 * if any you can write range in this class eg [a-z0-9]
 * a to z 0 to 9
 * 
 * () explicit capture, capture entire, capture group
 * eg (a-z) it will be no range but only capture
 * "a-z" string.
 * 
 * \R Linebreak matcher 
 * 
 * greedy Quantifiers
 * x? x once or not at all
 * x* x zero or more times
 * x+ x one or more times
 * x{n} x exactly n times
 * x(n,) x at least n times
 * x(n,m) x at least n but not more than m times
 * 
 */
public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\\Z");
        String inputString = scan.nextLine().trim();

        if (inputString.length() > 0) {
            String[] wordsInInput = inputString.split("[!,?._'@\\s]+");
            System.out.println(wordsInInput.length);
            for (String word : wordsInInput) {
                System.out.println(word);
            }
        } else {
            System.out.println(0);
        }

        scan.close();
    }
}
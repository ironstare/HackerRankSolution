import java.util.Scanner;

/**
 * JavaStringTokens
 * https://www.hackerrank.com/challenges/java-string-tokens/problem
 * 
 * This code is based upon user pmtatar https://www.hackerrank.com/pmtatar
 * 
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
import java.util.Scanner;

/**
 * JavaStringTokens
 */
public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\\Z");
        String inputString = scan.nextLine().trim();
        
        String[] wordInInputs = inputString.split("[!,?._'@\\s]+");
        System.out.println(wordInInputs.length);
        for(String word : wordInInputs){
            System.out.println(word);
        }

        scan.close();
    }
}
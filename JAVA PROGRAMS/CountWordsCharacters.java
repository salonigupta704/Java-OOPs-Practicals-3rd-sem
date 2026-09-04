import java.util.Scanner;

public class CountWordsCharacters {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            
            int characters = str.length();
            
            String trimmedString = str.trim();
            
            int words;
            
            if (trimmedString.isEmpty()) {
                words = 0;
            } else {
                words = trimmedString.split("\\s+").length;
            }
            
            System.out.println("Number of characters: " + characters);
            System.out.println("Number of words: " + words);
        }
    }
}
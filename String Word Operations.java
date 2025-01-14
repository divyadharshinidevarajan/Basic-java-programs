import java.util.Scanner;

public class StringWordOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Count the number of words
        int wordCount = countWords(sentence);
        System.out.println("Number of words: " + wordCount);

        // Reverse each word in the sentence
        String reversedWords = reverseWords(sentence);
        System.out.println("Sentence with reversed words: " + reversedWords);

        // Find the longest word
        String longestWord = findLongestWord(sentence);
        System.out.println("Longest word: " + longestWord);

        scanner.close();
    }

    // Method to count words in a sentence
    public static int countWords(String sentence) {
        if (sentence.trim().isEmpty()) {
            return 0; // Empty or whitespace-only sentence
        }
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    // Method to reverse each word in a sentence
    public static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            result.append(reversed).append(" ");
        }

        return result.toString().trim();
    }

    // Method to find the longest word in a sentence
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}

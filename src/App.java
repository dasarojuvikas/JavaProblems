
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        String str = "liril";
//1,2 reverse a string, palindrome
        
        // String reversedStr = new StringBuilder(str).reverse().toString();
        // System.out.println("Original String: " + str);
        // System.out.println("Reversed String: " + reversedStr);
        // String rev = "";
        // for(int i = str.length() - 1; i >= 0; i--) {
        //     rev += str.charAt(i);
        // }
        // System.out.println("Reversed String: " + rev);

        // if(str.equals(rev)){
        //     System.out.println("The string is a palindrome.");
        // } else {
        //     System.out.println("The string is not a palindrome.");
        // }

//3 count vowels and consonants

        // int count = 0;
        // int consonantCount = 0;
        // for(char c: str.toLowerCase().toCharArray()){
        //     if("aeiou".indexOf(c) >=0){
        //         count++;
        //     }else
        //     {
        //         consonantCount++;
        //     }
        // }
        // System.out.println("Number of vowels: " + count);
        // System.out.println("Number of consonants: " + consonantCount);

//4,5 find the first non-repeating character, frequemcy

        // String text = "swiss";

        // Map<Character, Integer> charCountMap = new HashMap<>();

        // for(char c: text.toCharArray()){
        //     charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        // }

        // System.out.println("Character counts: " + charCountMap);

        // for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
        //     if(entry.getValue() ==1){
        //         System.out.println(entry.getKey());
        //         return;
        //     }
        // }


//6 find unique and duplicate charcaters
        // Set<Character> uniqueChars = new HashSet<>();
        // Set<Character> duplicateChars = new HashSet<>();

        // for(char c: str.toCharArray()){
        //     if(!uniqueChars.add(c)){
        //         duplicateChars.add(c);
        //     }
        // }

        // System.out.println("Unique characters: " + uniqueChars);
        // System.out.println("Duplicate characters: " + duplicateChars);


//7 remove duplicate characters from a string
        // String str1="banana";

        // Set<Character> uniqueChars = new HashSet<>();   
        // String result ="";

        // for(char c: str1.toCharArray()){
        //     if(uniqueChars.add(c)){
        //         result += c;
        //     }
        // }
        // System.out.println("Unique characters: " + uniqueChars);
        // System.out.println("Result: " + result);


//8 check if two strings are anagrams
        // String str2 = "earth";
        // String str3 = "heart";

        // char[] a = str2.toCharArray();
        // char[] b = str3.toCharArray();

        // Arrays.sort(a);
        // Arrays.sort(b);

        // if(Arrays.equals(a, b)){
        //     System.out.println("The strings are anagrams.");
        // } else {
        //     System.out.println("The strings are not anagrams.");
        // }

//9,10 count words, and longest word in sentence

        // String str4 = "java programming language";
        // String[] words = str4.split(" ");
        
        // String length = "";
        
        // for(String word : words){
        //     if(word.length() > length.length()){
        //         length = word;
        //     }
        // }
        // System.out.println("Longest word: " + length);


        String sentence = "This is a sample sentence with several words.";
        String[] wordList = sentence.split("\\s+");
        String[] reversedWordList = new String[wordList.length];

//11 reverse each word in the sentence and print the reversed sentence
        // String rev = "";
        // for(String word: wordList){
        //     for(int i = word.length()-1;i>=0;i--){
        //         rev += word.charAt(i);
        //     }
        //     rev += " ";
        // }
        // System.out.println("Reversed sentence: " + rev);
//12 reverse the order of words in the sentence and print the reversed sentence
        // for(int i = wordList.length -1 ; i>= 0; i--){
        //     reversedWordList[wordList.length - 1 - i] = wordList[i];
        // }
        // System.out.println("Reversed words: " + Arrays.toString(reversedWordList));


        String str5 ="bookkkeeper";
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        for(char c: str5.toCharArray()){
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        int max=0;
        char maxChar = ' ';
        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println(maxChar +" " + max);

    }
}

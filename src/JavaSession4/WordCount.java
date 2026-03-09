package JavaSession4;

public class WordCount {
    public static int countWords(String str){
        String words [] = str.split(" ");
        return words.length;
    }
    public static void main (String[] args){
        String input = "I love India";
        System.out.println(countWords(input));
    }
}

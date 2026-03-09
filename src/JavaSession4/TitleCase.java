package JavaSession4;

public class TitleCase {
    public static String toTitleCase(String str){
        String words [] = str.split(" ");
                String result = " ";
                for (String w: words) {
                    result+=Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
                }
                return result.trim();
    }
    public static void main (String[] args){
        String input = "hello world from java";
        System.out.println(toTitleCase(input));
    }

}

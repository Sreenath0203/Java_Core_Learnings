package JavaSession4;
class PalindomeCheck {
    public static boolean isPalindrome (String str){
        str = str.toLowerCase();
        String rev = "";
        for (int i = str.length()-1 ; i>=0 ; i--){
            rev = rev + str.charAt(i);
        }
        return str.equals(rev);
    }
    public static void main (String args []) {
        System.out.println (isPalindrome("Madam"));
        System.out.println (isPalindrome("Song"));
    }

}

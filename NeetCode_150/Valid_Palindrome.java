package NeetCode_150;

public class Valid_Palindrome {

    public static void main(String[] args) {

        String st = "Was it a car or a cat I saw?";
        System.out.println(checkPalindrome(st));
    }

    public static boolean checkPalindrome(String st) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);

            if (Character.isLetter(ch)) {
                result.append(Character.toLowerCase(ch));
            }
        }

        for (int i = 0; i < result.length() / 2; i++) {
            if (result.charAt(i) != result.charAt(result.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
            
         

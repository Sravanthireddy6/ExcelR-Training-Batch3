public class Demo083 {
    public static void main(String[] args) {
        String A = "Elephant";
        if (isFirstCharVowel(A)) {
            System.out.println("The first character is a vowel.");
        } else {
            System.out.println("The first character is not a vowel.");
        }
    }

    public static boolean isFirstCharVowel(String A) {
        if (A == null ) {
            return false;
        }else{
        char firstChar = A.toLowerCase().charAt(0);
        return firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u';
        }
    }
}
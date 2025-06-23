public class palindrome {
    public void isPalindrome() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        String str = sc.nextLine();
        String reversedStr = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(reversedStr)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        palindrome p = new palindrome();
        p.isPalindrome();
    }
}

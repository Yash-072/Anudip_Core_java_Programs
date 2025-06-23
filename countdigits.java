public class countdigits {
    public void countDigits() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = sc.nextLine();
        
        int digitCount = 0;
        for (char c : number.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        
        System.out.println("The number of digits in " + number + " is: " + digitCount);
    }

    public static void main(String[] args) {
        countdigits cd = new countdigits();
        cd.countDigits();
    }
}

public class evenodd {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
                int nums[] = new int[5];

        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        System.out.print("Even numbers: ");
        for (int i = 0; i < 5; i++) {
            if (nums[i] % 2 == 0) {
                System.out.print(nums[i] + "\t");
            }
        }
        System.out.println();

        System.out.print("Odd numbers: ");
        for (int i = 0; i < 5; i++) {
            if (nums[i] % 2 != 0) {
                System.out.print(nums[i] + "\t");
            }
        }

        sc.close();
    }
}

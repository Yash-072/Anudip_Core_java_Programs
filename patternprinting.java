public class patternprinting {
    public static void main(String[] args) {
        int n = 5,k=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
        System.out.println("Pattern of 1 and 0 in right angle triangle:");
        for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                     if ((i + j) % 2 == 0) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                }
             System.out.println();
        }
        System.out.println("printing pattern of 12345 as in first row and 1 in last row:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
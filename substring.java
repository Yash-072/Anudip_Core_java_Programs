public class substring {
    
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Extracting substring from index 7 to the end
        String subStr1 = str.substring(7);
        System.out.println("Substring from index 7: " + subStr1);
        
        // Extracting substring from index 0 to 5
        String subStr2 = str.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + subStr2);
        
        // Extracting substring from index 0 to 12
        String subStr3 = str.substring(0, 12);
        System.out.println("Substring from index 0 to 12: " + subStr3);
    }
    
}

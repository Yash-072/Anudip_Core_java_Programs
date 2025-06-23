public class stringconcatinate {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        // Concatenating strings using different methods
        // 1. Using + operator
        String result1 = str1 + " " + str2;
        System.out.println("Using + operator: " + result1);
        // 2. Using concat() method
        String result2 = str1.concat(" ").concat(str2);
        System.out.println("Using concat() method: " + result2);
        // 3. Using StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(str1).append(" ").append(str2);
        String result3 = sb.toString();
        System.out.println("Using StringBuilder: " + result3);
        
        String result4 = String.join(" ", str1, str2);
        System.out.println("Using String.join(): " + result4);
       
        //comparing using compareTo
        String str3 = "Hello World";
        
        int comparisonResult = (str1 + " " + str2).compareTo(str3);
        if (comparisonResult == 0) {
            System.out.println("The concatenated string is equal to '" + str3 + "'.");
        } else if (comparisonResult < 0) {
            System.out.println("The concatenated string is lexicographically less than '" + str3 + "'.");
        } else {
            System.out.println("The concatenated string is lexicographically greater than '" + str3 + "'.");
        }
    }
}

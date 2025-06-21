public class cal {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 3;

        float summary1 = (float) (num1 + num2); // Casting type
        float summary2 = (float) num1 / (float) num2; // Casting type
        String summary3 = "Result = " + summary1; // Convert
        num1 = num1 + 1;
        num2++;
        boolean isEqual     = num1 == num2;
        boolean isMorethan  = num1 > num2;
        boolean isBetween   = num1 >= 5 && num2 <= 10;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        System.out.println(summary1);
        System.out.println(summary2);
        System.out.println(summary3);
        System.out.println(isEqual);
        System.out.println(isMorethan);
        System.out.println(isBetween);
        System.out.println(!isBetween);
        
    }
}

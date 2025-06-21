public class cal {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 3;

        float summary1 = (float) (num1 + num2); // Casting type
        float summary2 = (float) num1 / (float) num2; // Casting type
        String summary3 = "Result = " + summary1; // Convert
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        System.out.println(summary1);
        System.out.println(summary2);
        System.out.println(summary3);
    }
}

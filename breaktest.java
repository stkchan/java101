public class breaktest {
    public static void main(String[] args) {
        int[] ages = new int[10];

        ages[0] = 15;
        ages[1] = 20;
        ages[2] = 25;

        int i; // Declare i outside so it's accessible later
        for (i = 0; i < ages.length; i++) {
            if (i > 5) {
                break;
            }
            System.out.println("index: " + i + ", " + ages[i]);
        }
    }
}

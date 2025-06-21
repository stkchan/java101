public class breakcontinue {
    public static void main(String[] args) {
        int[] ages = new int[10];

        ages[0] = 15;
        ages[1] = 20;
        ages[2] = 25;
        ages[3] = 27;
        ages[4] = 22;

        int i;
        for (i = 0; i < ages.length; i++) {
            if (ages[i] % 2 == 0) {
                continue;
            }
            System.out.println("index: " + i + ", " + ages[i]);
        }
    }
}

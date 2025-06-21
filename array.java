public class array {
    public static void main(String[] args) {
        int[] ages = {15, 18, 20, 22, 24, 25, 30, 41};
        ages[2] = ages[2] * 2;
        

        for (int i = 0; i < 8; i++) {
        System.out.println(ages[i]);
        }

        String[] names = {"John", "Jane", "Mary", "Bob", "Peter", "Alice"};
        for (int i = 0; i < 6; i++) {
        System.out.println(names[i]);
        }

        String[] movies = new String[5];
        movies[0] = "Breaking Bad";
        movies[1] = "Game of Throne";
        movies[2] = "The Avengers";
        movies[3] = "One Piece";
        movies[4] = "Naruto";
        
        for (int i = 0; i < movies.length; i++) {
        System.out.println(movies[i]);
        }

    }
}

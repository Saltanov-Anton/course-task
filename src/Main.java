public class Main {
    public static void main(String[] args) {

        String[] array = {"Book1", "Author1", "Book2", "Author2", "Book3", "Author3"};
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println("\"" + array[i] + "\"" + " " + array[++i]);
            }
        }
    }
}
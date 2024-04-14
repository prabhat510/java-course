public class Exceptions {
    public static void main(String[] args) {
        int i = 10, j = 20;
        try {
            int y = j / 0;
        } catch (Exception e) {
            System.out.println("error: " + e);
        }
    }
}

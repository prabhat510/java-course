public class ThrowError {
    public static void main(String[] args) {
        try {
            int i=10,j=20;
            int k = i/j;
            if(k==0) {
                throw new Exception("null error occurred!");
            }
        } catch (Exception e) {
            System.out.println("exception happened: " + e);
        }
    }
}

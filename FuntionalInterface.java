
// interface with just one method is called FunctionalInterface
@FunctionalInterface
interface A {
    void show();
}



public class FuntionalInterface {
    public static void main(String[] args) {
        A obj = new A() {
            @Override
            public void show() {
                System.out.println("in show");
            }
        };
        obj.show();
    }
}

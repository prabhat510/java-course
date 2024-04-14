

class anony {
    public void show() {
        System.err.println("in a show");
    }
}

interface A {
    int age=10;
    
}

public class Base  {
    public static void main(String[] args) {
        anony ob1 = new anony()
        {
            public void show() {
                System.err.println("in new show");
            } 
        };
        // System.err.println();
        ob1.show();
    }
}


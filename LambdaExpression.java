interface MyFunctionalInterface {
    int sum(int x, int y);
}

public class LambdaExpression {
    public static void main(String[] args) {
        MyFunctionalInterface obj = (x, y) -> x + y;
        int result = obj.sum(10, 20);
        System.out.println(result);
        
    }
}

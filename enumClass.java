enum Laptop {
    Macbook(2000), XPS(1800), Thinkpad(1500);
    private int price;
    Laptop(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
}

public class enumClass {
    public static void main(String[] args) {
        // Laptop mac = Laptop.Macbook;
        // System.out.println(mac + " " + mac.getPrice());
        for(Laptop lap: Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }    
}


interface A {

}
package Menu;

public class Milk extends Product {



    public Milk(String param) {
        super("Молоко");
        parametr = param;
        if( parametr == "1.5%")
            this.calories = 60;
        else if( parametr == "2.5%")
            this.calories = 90;
        else this.calories = 130;
    }
}

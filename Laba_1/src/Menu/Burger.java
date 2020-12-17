package Menu;

public class Burger extends Product {


    public Burger(String param) {
        super("Гамбургер");
        parametr = param;
        if(parametr == "малый")
            this.calories = 200;
        else if( parametr == "средний")
            this.calories = 300;
        else this.calories = 400;
    }
}

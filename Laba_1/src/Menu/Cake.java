package Menu;

public class Cake extends Product {


    public Cake(String param) {
        super("Пирожное");
        parametr = param;
        if(parametr.equals("шоколадная"))
            this.calories = 100;
        else if(parametr == "сливочная")
            this.calories = 90;
        else this.calories = 95;
    }
}

package Menu;

public class Eggs extends Product {


    public Eggs(String param) {
        super("Яйца");
        parametr = param;
        if(parametr == "одно")
            this.calories = 40;
        else if(parametr == "два")
            this.calories = 80;
        else this.calories = 120;
    }
}

package Menu;

public class Pie extends Product {


    public Pie(String param) {
        super("Пирог");
        parametr = param;
        if( parametr.equals("вишнёвая"))
            this.calories = 120;
        else if( parametr == "клубничная")
            this.calories = 130;
        else this.calories = 100;
    }
}

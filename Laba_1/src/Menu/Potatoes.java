package Menu;

public class Potatoes extends Product {



    public Potatoes(String param) {
        super("Картошка");
        parametr = param;
        if(param == "жареная")
            this.calories = 120;
        else if(param == "вареная")
            this.calories = 90;
        else this.calories = 150;
    }
}

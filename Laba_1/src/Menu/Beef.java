package Menu;

public class Beef extends Product {


    public Beef(String param) {
        super("Мясо");
        parametr = param;
        if( parametr == "с кровью")
            this.calories = 200;
        else if(parametr == "норма")
            this.calories = 240;
        else this.calories = 280;
    }
}

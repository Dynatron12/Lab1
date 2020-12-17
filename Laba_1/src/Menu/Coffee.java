package Menu;

public class Coffee extends Product {


    public Coffee(String param) {
        super("Кофе");
        parametr = param;
        if(parametr == "насыщенный")
            this.calories = 60;
        else if(parametr == "горький")
            this.calories = 40;
        else this.calories = 80;
    }
}

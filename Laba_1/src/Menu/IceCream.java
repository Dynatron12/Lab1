package Menu;

public class IceCream extends Product {


    public IceCream(String param) {
        super("Мороженное");
        parametr = param;
        if(parametr == "карамель")
            this.calories = 110;
        else this.calories = 100;
    }
}

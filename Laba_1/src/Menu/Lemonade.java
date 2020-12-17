package Menu;

public class Lemonade extends Product {



    public Lemonade(String param) {
        super("Лимонад");
        parametr = param;
        if(parametr == "лимон")
            this.calories = 20;
        else if(parametr == "апельсин")
            this.calories = 30;
        else this.calories = 35;
    }
}

package Menu;

public class ChewingGum extends Product {


    public ChewingGum(String param) {
        super("Жевательная резинка");
        parametr = param;
        if(parametr == "мята")
            this.calories = 10;
        else if(parametr == "арбуз")
            this.calories = 15;
        else this.calories = 18;
    }
}

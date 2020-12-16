package Menu;

public class Tea extends Product{


    public Tea(String param){
        super("Чай");
        parametr = param;
        if( parametr.equals("черный"))
            this.calories = 15;
        else this.calories = 100000;
    }

}

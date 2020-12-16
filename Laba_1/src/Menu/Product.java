package Menu;

public class Product {

    String name;
    Integer calories;
    String parametr;
    public Product(String param){
        this.name = param;
    }

    public Integer getCalories() {
        return this.calories;
    }

    public String getParametr() {
        return parametr;
    }

    public String getName() {
        return name;
    }
}

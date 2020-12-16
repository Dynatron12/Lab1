import Menu.Product;

public interface Nutriitious {

    static Integer calculateCalories(Product[] products)
    {
        Integer result = 0;
        for( Product product : products)
        {
            result += product.getCalories();
        }
        return result;
    }

}

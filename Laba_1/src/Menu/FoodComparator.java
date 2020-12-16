package Menu;
import java.util.Comparator;
public class FoodComparator implements Comparator<Product>
{
    public int compare(Product arg0, Product arg1)
    {
        if( arg0.getParametr()==null) return 1;
        if( arg1.getParametr()==null) return -1;
        return  arg0.getParametr().compareTo(arg1.getParametr());
    }

}

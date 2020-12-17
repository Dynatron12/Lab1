import Menu.*;

import java.util.Arrays;

public class Main implements Nutriitious  {
    public static void main(String[] args){
        Product[] breakfast = new Product[3];
        int counter = 0;
        for (String arg: args){

            String[] parts = arg.split("/");
            if(parts[0].equals("Tea")){
                breakfast[counter] = new Tea(parts[1]);
            }
            else if(parts[0].equals("Pie")) {
                breakfast[counter] = new Pie(parts[1]);
            }
            else if(parts[0].equals("Milk")){
                breakfast[counter] = new Milk(parts[1]);
            }
            else if(parts[0].equals("Potatoes")){
                breakfast[counter] = new Potatoes(parts[1]);
            }
            else if(parts[0].equals("Burger")){
                breakfast[counter] = new Burger(parts[1]);
            }
            else if(parts[0].equals("Coffee")){
                breakfast[counter] = new Coffee(parts[1]);
            }
            else if(parts[0].equals("IceCream")){
                breakfast[counter] = new IceCream(parts[1]);
            }
            else if(parts[0].equals("ChewingGum")){
                breakfast[counter] = new ChewingGum(parts[1]);
            }
            else if(parts[0].equals("Eggs")){
                breakfast[counter] = new Eggs(parts[1]);
            }
            else if(parts[0].equals("Lemonade")){
                breakfast[counter] = new Lemonade(parts[1]);
            }

            else if(parts[0].equals("-calories"))
                System.out.println("Калории: " + Nutriitious.calculateCalories(breakfast));
            counter++;
            if(parts[0].equals("-sort"))
                Arrays.sort(breakfast, new FoodComparator());
        }
        for(Product item: breakfast)
            System.out.println(item.getName()+" "+item.getParametr());
    }
}

import java.util.ArrayList;
import java.util.List;

public class Basket<T extends Fruit> {
    private List<T> fruits;

    public Basket() {
        fruits = new ArrayList<>();
    }

    public float getWeight(){
       float result = 0;
       for (T fruit : fruits){
           result += fruit.getWeight();
       }
       return result;
    }
    public void add(T fruit){
        fruits.add(fruit);
    }

    public int compare(Basket<?> another){
        if(getWeight() > another.getWeight()){
            return 1;
        }else if (getWeight() == another.getWeight()){
            return 0;
        }else
            return 0;
    }

    public static <U extends Fruit> void transfer(Basket <? extends U>src, Basket <? super U>dst){
        dst.fruits.addAll(src.fruits);
        src.fruits.clear();
    }

}

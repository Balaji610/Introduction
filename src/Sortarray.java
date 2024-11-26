import java.util.Arrays;

public class Sortarray {
    public static void main(String[] args) {
        String [] cars={"volvo","bmw","tesla","ford","fiat","mazda","audi"};
        Arrays.sort(cars);
        for(String i:cars){
            System.out.println(i);
        }
    }
}

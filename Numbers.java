
/**
 * @author (Herbert Wenisch)
 * @version (2-23-23)
 */
import java.util.Random;

public class Numbers {
    private int[] numbers;
    private Random generator = new Random();
    
    public Numbers(){
        numbers = new int[101]; // von 0 bis 100
        for(int i=1; i < numbers.length; i++) 
            numbers[i] = generator.nextInt(100) + 1;
    }
    
    // kleiner Gauss:
    public int getSum(){
        int sum = 0;
        for(int i = 1; i < numbers.length; i++)
           sum += numbers[i];   
        return sum;   
    }
    
    // kleiner Gaus mit for-each:
    public int getSum1(){
        int sum = 0;
        for(int value: numbers)
           sum += value;
        return sum;   
    }
}

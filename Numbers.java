
/**
 * @author (Herbert Wenisch)
 * @version (2-23-23)
 */
import java.util.Random;

// Umbau zur Lotterie:
public class Numbers {
    final int N = 6;
    private int[] numbers;
    private Random generator = new Random();
    
    public Numbers(){
        numbers = new int[N+1]; // von 0 bis N
        for(int i=1; i < numbers.length; i++) {
            int number = generator.nextInt(48) + 1;
            while(contains(number)) 
               number = generator.nextInt(48) + 1;
            numbers[i]= number;   
        }  
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
        for(int number: numbers)
           sum += number;
        return sum;   
    }
    
    public boolean contains(int aNumber){
        for(int number: numbers)
            if(number == aNumber) return true;
        return false;
    }
    
    public int howMuch(int aNumber){
        int count = 0;
        for(int number: numbers)
            if(number == aNumber) count++;
        return count;    
    }
    
    // zur Abwechslung eine index-orientiere Suche:
    public int max(){
        int max = 1;
        for(int i = 1; i < numbers.length; i++)
            if(numbers[i] > max) max = numbers[i];
        return max;    
    }
}

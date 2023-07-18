package pl.kurs.array.util;

import pl.kurs.array.util.exceptions.ArrayNullException;

public class ArrayUtil {

    // napisz metody które
    // sumuja tablice liczb
    // licza iloczyn tablicy liczb
    // obsluz przypadki gdy tablica jest nullem
    
    public int sumOfArray(int[] input){
        if (input == null){
            throw new ArrayNullException("Array is null!");
        }
        int sum = 0;
        for (int numb : input){
            sum += numb;
        }
        return sum;
    }
    
    public int productOfArray(int[] input){
        if (input == null){
            throw new ArrayNullException("Array is null!");
        }
        int product = 1;
        for (int numb : input){
            product *= numb;
        }
        return product;
    }
    
    

}

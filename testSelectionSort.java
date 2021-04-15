package lab10;

import static org.junit.Assert.*;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
        
    }public void testMixed(){
        
    	int[] arr = new int[8];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = 14;
        arr[4] = -10;
        arr[5] = -2;
        arr[6] = 0;
        arr[7] = 6;
        
        int[] Sortedarr = new int[8];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;
        Sortedarr[5] = 0;
        Sortedarr[6] = 6;
        Sortedarr[7] = 14;
        
        int [] finalArray = new int [8];
        SelectionSort sort = new SelectionSort();
        finalArray = sort.basicSelectionSort(arr);
        /** add tests to check for this unit test **/
        for (int i = 0; i < 8; ++i) {
        assertEquals("Wrong answer", finalArray[i], Sortedarr[i]);
        }
    }
    
    public void testDuplicates(){
        
    	int[] arr = new int[8];
        arr[0] = -7;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = 14;
        arr[4] = -10;
        arr[5] = 6;
        arr[6] = 0;
        arr[7] = 6;
        
        int[] Sortedarr = new int[8];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -7;
        Sortedarr[3] = -7;
        Sortedarr[4] = 0;
        Sortedarr[5] = 6;
        Sortedarr[6] = 6;
        Sortedarr[7] = 14;
        
        int [] finalArray = new int [8];
        SelectionSort sort = new SelectionSort();
        finalArray = sort.basicSelectionSort(arr);
        /** add tests to check for this unit test **/
        for (int i = 0; i < 8; ++i) {
        assertEquals("Wrong answer", finalArray[i], Sortedarr[i]);
        }
    }

    
    
    }



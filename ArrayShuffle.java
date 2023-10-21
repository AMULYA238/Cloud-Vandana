//Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

package codeVandana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ArrayShuffle {
	

		public static void main(String[] args) {
			int arr[]= {1,2,3,4,5,6,7};
	        ArrayList<Integer> shuffle_arr=new ArrayList<>();
	        for(int i:arr) {
	        	 shuffle_arr.add(i);
	        }
	        Collections.shuffle(shuffle_arr);
	        System.out.println("Before Shuffled "+ Arrays.toString(arr));
	        System.out.println("After Shuffled "+ shuffle_arr);
	    }
	}

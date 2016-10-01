package com.sort.bucket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class BucketMain {

	public static void main(String[] args) {
		int number = 0;
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] beforeSort = createRandom.getNum(10);
		
		// Generate and print out numbers before sorting
		System.out.print("Before Sort : ");
		for(int num : beforeSort){
			System.out.print(num+" ");
		}
		System.out.println("");
		
		// Put the numbers in the hashmap
		for(int num : beforeSort){
			int howMany = 0;
			
			if(!map.containsKey(num)){
				map.put(num, 1);
			}else{
				howMany = map.get(num);
				map.put(num, howMany+1);
			}
		}
		
		// Catch the keys of hashmap and put it into list 'mapKeys'
		ArrayList<Integer> mapKeys = new ArrayList<>();
		Iterator<Integer> iter = map.keySet().iterator();
		
		while (iter.hasNext()) {
			mapKeys.add((Integer)iter.next());
		}
		
		// Sort the keys in order
		int keySize = map.size();
		int sortingNums[] = new int[keySize];
		
			// Put keys in int list 'sortingNums'
		for(int i=0;j<keySize;i++){
			sortingNums[i] = ;
		}
		
		for(int i=0;i<keySize;i++){
			for(int j=0;j<keySize;j++){
				if(sortingNums[i]>sortingNums[j]){
					int 
				}
			}
		}
		
		
		
		
		
		
	}



}

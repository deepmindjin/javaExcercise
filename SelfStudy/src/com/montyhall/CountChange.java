package com.montyhall;

import com.sort.GetRandom;

public class CountChange {
	
	public static void gethow(int car, int choice){
		if(car != choice){
			choice = 6 - car -choice;
		}else{
			while(true){
				choice = GetRandom.getRandom();
				if(choice != car){
					break;
				}
			}
		}
		
	}
}

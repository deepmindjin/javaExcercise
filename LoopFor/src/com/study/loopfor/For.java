package com.study.loopfor;

public class For {
	public static void sum(long start, long end){
		double sum = 0;
		double firstSum = 0;
		double secondSum = 0;
		
		firstSum = start*(start-1)/2;
		secondSum = end*(end+1)/2;
		sum = secondSum - firstSum;
		System.out.println(sum);
				
	
		//for문의 구조
		//(시작값;종료값;증감값)
		/*
		 * for(long a=start;a<=end;a++){
			sum += a;
			System.out.println("sum="+sum);
		*}
		*/
		System.out.println("sum="+sum);
	}
	
	public static void multiply(int end){
		long multi = 1;
		for(int i=1;i<=end;i++){
			multi *= i;
		}
		System.out.println("multiply="+multi);
	}
	
	public static void forTest(){
		for(int i=0;i < 10;i++){
			for(int j=0;j<10;j++){
				System.out.print("■");
			}
			System.out.println("");
		}
	}
	
    //난이도 1        난이도 2         난이도 3        난이도 3.5         난이도 3.6
    //
    // A                   A               A                 A                 A
    // AA                 AA              AAA               A A               A A
    // AAA               AAA             AAAAA             A   A             A   A
    // AAAA             AAAA            AAAAAAA           A     A           A     A
    // AAAAA           AAAAA           AAAAAAAAA         A       A         AAAAAAAAA


	public static void forTest1(){
		char a = 'A';
		for(int i=0;i<10;i++){
			for(int j=0;j<=i;j++){
				System.out.print(a);
			}
			System.out.println("");
		}
	}
	
	public static void forTest2(){
		char a = 'A';
		
		for(int i=0;i<10;i++){
			
			for(int j=10-i;j>=1;j--){
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++){
			System.out.print(a);
			}
			
			System.out.println();
		}
	}
	
	
	public static void forTest3(){
		for(int k=1;k<=5;k++){
			
			for(int i=5-k;i>0;i--){
				System.out.print(" ");
			}
			
			for(int j=0;j<2*k-1;j++){
				System.out.print("A");
			}
			
			for(int i=5-k;i>=0;i--){
				System.out.print(" ");
			}
			System.out.println("");
		}
		
	}
	
	public static void forTest4(){
		System.out.println();
		for(int k=1;k<=5;k++){
			
			for(int i=5-k;i>0;i--){
				System.out.print(" ");
			}
			
			System.out.print("A");
			
			for(int q=0;q<2*k-3;q++){
				System.out.print(" ");
			}
			
			if(k>=2){
				System.out.print("A");
			}
			for(int i=5-k;i>=0;i--){
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	public static void forTest5(){
		for(int k=1;k<=5;k++){
			if(k==5){
				for(int p=0;p<9;p++){
					System.out.print("A");
				}
			}else{
				
				for(int i=5-k;i>0;i--){
					System.out.print(" ");
				}
				
				System.out.print("A");
				
				for(int q=0;q<2*k-3;q++){
					System.out.print(" ");
				}
				
				if(k>=2){
					System.out.print("A");
				}
				for(int i=5-k;i>=0;i--){
					System.out.print(" ");
				}
				System.out.println("");
			}
		}
	}
	
	
    // 난이도 3.8     난이도 4         난이도 5        난이도 5.5         난이도 5.7
    //
    //    A               A                A            X       X         AAAAAAAAA
    //   AAA             A A              A A            X     X          A       A
    //  AAAAA           A A A            A   A            X   X           A       A
    // AAAAAAA         A A A A          A     A            X X            A       A
    //AAAAAAAAA       A A A A A        A       A            X             A       A
    // AAAAAAA         AAAAAAA          A     A            X X            A       A
    //  AAAAA           AAAAA            A   A            X   X           A       A
    //   AAA             AAA              A A            X     X          A       A
    //    A               A                A            X       X         AAAAAAAAA
	
	
	public static void forTest6(){
		System.out.println();
		for(int k=1;k<=5;k++){
			
			for(int i=5-k;i>0;i--){
				System.out.print(" ");
			}
			
			for(int j=0;j<2*k-1;j++){
				System.out.print("A");
			}
			
			for(int i=5-k;i>=0;i--){
				System.out.print(" ");
			}
			System.out.println("");
		}
		
		for(int k=4;k>=1;k--){
			
			for(int i=5-k;i>0;i--){
				System.out.print(" ");
			}
			
			for(int j=0;j<2*k-1;j++){
				System.out.print("A");
			}
			
			for(int i=5-k;i>=0;i--){
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	public static void forTest7(){
		
		for(int k=1;k<=5;k++){
			
			for(int i=5-k;i>0;i--){
				System.out.print(" ");
			}
			
			for(int j=0;j<k;j++){
				System.out.print("A ");
			}
			

			System.out.println("");
		}
		
		for(int k=4;k>=1;k--){
			
			for(int i=5-k;i>0;i--){
				System.out.print(" ");
			}
			
			for(int j=0;j<2*k-1;j++){
				System.out.print("A");
			}
			
			System.out.println("");
		}		
	}
	
	public static void forTest8(){
		System.out.println();
		for(int k=1;k<=5;k++){
			
			for(int i=5-k;i>0;i--){
				System.out.print(" ");
			}
			
			System.out.print("A");
			
			for(int q=0;q<2*k-3;q++){
				System.out.print(" ");
			}
			
			if(k>=2){
				System.out.print("A");
			}
			for(int i=5-k;i>=0;i--){
				System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int k=4;k>0;k--){
			
			for(int i=5-k;i>0;i--){
				System.out.print(" ");
			}
			
			System.out.print("A");
			
			for(int q=0;q<2*k-3;q++){
				System.out.print(" ");
			}
			
			if(k>=2){
				System.out.print("A");
			}
			for(int i=5-k;i>=0;i--){
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	public static void forTest9(){
		System.out.println();
		for(int i=5;i>0;i--){
			
			for(int k=0;k<5-i;k++){
				System.out.print(" ");
			}
			
			System.out.print("X");
			
			for(int l=0;l<2*i-3;l++){
				System.out.print(" ");
			}
			
			if(i!=1){
				System.out.print("X");
			}
			
			for(int k=0;k<5-i;k++){
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=2;i<6;i++){
			
			for(int k=0;k<5-i;k++){
				System.out.print(" ");
			}
			
			System.out.print("X");
			
			for(int l=0;l<2*i-3;l++){
				System.out.print(" ");
			}
			
			if(i!=1){
				System.out.print("X");
			}
			
			for(int k=0;k<5-i;k++){
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void forTest10(){
		System.out.println();
		for(int i=0;i<9;i++){
			System.out.print("X");
		}
		System.out.println("");
		
		for(int k=0;k<7;k++){
			System.out.print("X");
			for(int space=0;space<7;space++){
				System.out.print(" ");
			}
			System.out.println("X");
			
		}
		
		
		
		for(int j=0;j<9;j++){
			System.out.print("X");
		}
		System.out.println("");
	}
	
	
    // 난이도 6
    //
    //A      A      A      A      A      A      A
    //      A     A     A     A     A     A
    //           A    A    A    A    A
    //               A   A   A   A
    //                  A  A  A
    //                    A A
    //                     A
    
	
	public static void forTest11(){
		System.out.println();
		int sum = 0;
		for(int i=7;i>0;i--){
			if(i!=7){
				sum = 0;
				for(int k=6;k>=i;k--){
					sum += k;
				}
				for(int q=0;q<sum;q++){
					System.out.print(" ");
				}
			}
			for(int j=0;j<i;j++){
				System.out.print("X");
				for(int p=0;p<i-1;p++){
					System.out.print(" ");
				}
			}
			System.out.println();
			
			
			
			
		}
	}
	
	

    // 난이도 7
    //                       A        A
    //              A                          A
    //         A                                    A
    //      A                                          A
    //    A                                              A
    //   A                                                A

	
	
	public static void forTest12(){
		System.out.println();
		int sum = 0;
		int sum_adv = 0;
		
		for(int i=6;i>0;i--){
			sum = 0;
			sum_adv =0;
			for(int j=0;j<i;j++){
				sum += j;
			}

			for(int k=0;k<sum;k++){
				System.out.print(" ");
			}
			System.out.print("A");
		
			
			if(i!=6){
				for(int m=5;m>=i;m--){
					sum_adv += m;
				}
				for(int z = 0;z<2;z++){
					for(int l=0;l<sum_adv+3;l++){
						System.out.print(" ");
					}
				}
			} else{
				for(int y=0;y<6;y++){
					System.out.print(" ");
				}
			}

			System.out.println("A");
		}
	}
}



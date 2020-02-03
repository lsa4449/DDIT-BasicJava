package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

	/*
	 * << 배열  >>
	 * - int[] number = new int[5]; 
	 * 							-->저장할 공간 지정
	 * - int[] number = new int[]{10, 20, 30, 40, 50}; 
	 * 							-->실제 저장할 값 지정
	 * - int[] number = {10, 20, 30, 40, 50};
	 * 					-->new int[]생략
	 * - 길이가 정해지면 바꿀 수 없다. 	
	 */
		
		//배열은 참조형 타입이다.
		int[] array; //배열의 주소를 저장할 공간
		array = new int[5];	//배열이 생성되고 그 주소가 저장된다.
		//new : 새로운 저장공간 생성 및 주소 변환
		//int[5] : int를 저장할 수 있는 5개의 공간
		//배열 초기화시 기본값 저장
		
		System.out.println(array);
		
		System.out.println(array[0]);	//실제 값에 접근하기 위해서는 index를 지정해줘야 한다.
		//index에서는 int만 사용할 수 있다.(리터럴, 변수, 상수, 연산 등)
		//배열의 최대 크기는 int 최대값(약 20억)이다
		
		String arrayStr = Arrays.toString(array); //배열의 모든 인덱스에 저장된 값을 문자열로 반환한다.
		System.out.println(arrayStr);
		
		int[] iArray1 = new int[]{1, 2, 3};	//값의 개수로 배열의 길이가 정해진다.
		int[] iArray2 = {1, 2, 3}; //선언과 초기화를 동시에 해야한다.
		int[] iArray3;
		//iArray3 = {1, 2, 3}; // 컴파일에러 발생
		
		array[0] = 10;	//인덱스는 0부터 시작한다. 
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		//array[5] = 50;	//ArrayIndexOutOfBoundException 발생
		
		//정수를 저장할 수 있는 길이가 10인 배열을 생성 및 초기화 해주세요.
		int [] arr = new int[10];		
			
		
		//모든 인덱스에 있는 값을 변경해주세요.
			
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 3;
			arr[3] = 4;
			arr[4] = 5;
			arr[5] = 6;
			arr[6] = 7;
			arr[7] = 8;
			arr[8] = 9;
			arr[9] = 10;
						
			int sum = 0; 
			for (int i = 1; i <=9; i++){												
				System.out.println(arr[i]);			
		
			}
				System.out.println(Arrays.toString(arr));
				
			//배열에 숫자를 저장하고 합계와 평균을 구해보자.	
			int[] numbers = new int[10];			
			
			for(int i = 0; i < numbers.length; i++){
				numbers[i] = (int)(Math.random() * 100) +1;
			
			}
			System.out.println(Arrays.toString(numbers));
			
			sum = 0; //합계
			double avg = 0; //평균
			
			for(int i = 0; i < numbers.length; i++){
					sum +=numbers[i];
					avg = (double)sum / numbers.length;
			}
		
					System.out.println("합계  :" + sum);
					System.out.println("평균  :" + avg);
	
					
			//향상된 for문
			//오른쪽(배열)에 있는 값을 왼쪽에 넣어 출력한다.
			//같은 타입이여야만 한다.
			for(int number : numbers){	//배열에 있는 값을 차례대로 변수에 넣는다.
				System.out.println(number);
				
			}
			
			for(int number : numbers){
			//for(int i = 0; i < numbers.length; i++)와 동일한 코드
				number = 0; //numbers의 값은 변경되지 않는다.
				System.out.println(number);
			}
				System.out.println(Arrays.toString(numbers));
				//읽을 때만 사용 가능
			
			//배열에 저장된 숫자들 중 최소값과 최대값을 찾아주세요.
			int max = numbers[0];
			int min = numbers[0];
				
				for(int number : numbers){									
					
					//최대값 저장
					if(max < number){
						max = number;
					
					//최소값 저장
					}else if(min > number){
						min = number;
				}
				
			}
					System.out.println("최대값 : "+ max + " / " + "최소값 : " + min);
			
			/* 	--위와 동일한 코드
			 *  int max = numbers[0];
				int min = numbers[0];
			
			for(int i = 0; i < numbers.length; i++){
				if(max < numbers[i]){
					max = numbers[i];
				
				}else if(min > numbers[i]){
					min = numbers[i];
				}
			}
					System.out.println("최대값 : "+ max + " / " + "최소값 : " + min);
			*/
					
			   System.out.println("-----------------------");	
			   
			   //첫 번째 인덱스와 무작위 인덱스의 자리 바꿈
			int[] shuffle = new int[30];
			for(int i = 0; i < shuffle.length; i++){
				shuffle[i] = i + 1;
				
			}		
				System.out.println(Arrays.toString(shuffle));			
					
			for(int i = 0; i < shuffle.length * 10; i++){
				int a = (int)(Math.random()* shuffle.length);			
				
				//첫 번째 값으로 저장
				int tmp = shuffle[0];
				shuffle[0] = shuffle[a];
				shuffle[a] = tmp;		
			}
			
			System.out.println(Arrays.toString(shuffle));
			
			
			System.out.println("------------------------------");
			//1~10 사이의 난수를 500번 생성하고. 각 숫자가 생성된 횟수를 출력			
			int[] random = new int[500];
			int[] count = new int[10];
			
			for(int i = 1; i < random.length; i++){
				random[i] = (int)(Math.random()* 10);		
				System.out.print(random[i] + ",  ");
		
			}	
				System.out.println();
				
				for(int i = 1; i < random.length; i++){
					count[random[i]]++;		
				}	 
				for(int i = 1; i < count.length; i++){
					System.out.println(i + "의 개수 : " + count[random[i]]);
				}
				System.out.println("------------------------------");
			
				
				//위 문제의 최소값, 최대값, 반복횟수를 입력받아 각 숫자가 생성된 횟수 출력
				Scanner s = new Scanner(System.in);
				int random1 = 0;
				int cnt = 0;
				
				System.out.print("최소값 : ");
				int minN = Integer.parseInt(s.nextLine());
				System.out.print("최대값 : ");
				int maxN = Integer.parseInt(s.nextLine());
				System.out.print("반복횟수 : ");
				int ranN = Integer.parseInt(s.nextLine());
				
				int[] a = new int[ranN];
				
				for(int i = 0; i < array.length; i++){
					
				random1 = (int)(Math.random() * max - min) + min;
				array[i] = random1;
	
				}
				
				System.out.println(Arrays.toString(array));
				
				for(int j = min; j <=max; j++){
					cnt = 0;
					
				for(int k = 0; k < array.length; k++){
					if(j == array[k]){
						cnt +=1;
					}
				}
					System.out.println(j + " 가 반복된 횟수 : " + cnt);
					
				}
				
	
	}
				
				
				
	}


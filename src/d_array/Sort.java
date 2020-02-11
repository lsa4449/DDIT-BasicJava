package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		
		/*
		 * << 정렬 >>
		 * - 선택정렬 : 첫 번째 숫자부터 그 뒤에 모든 숫자들과 비교해서 작은 수와 자리 바꾸기를 반복해
		 * 			  앞에서부터 작은수를 채워나가는 방식
		 * - 버블정렬 : 첫 번째 숫자부터 바로 뒷 숫자와 비교해서 작은 수와 자리 바꾸기를 반복해 
		 * 			  뒤에서부터 큰 수를 채워나가는 방식
		 * - 삽입정렬 : 두 번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰 수들을 뒤로 밀고 중간에 삽입하는 방식
		 * - 석차구하기 : 모든 점수가 1등으로 시작해서 다른 점수들과 비교해 자신의 점수가 작으면 1씩 증가시키는 방식
		 *  
		 */
		
		//10까지 배열 생성
		int[] numbers = new int[10];
		
		//1-10까지 배열에 저장
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = i + 1;
		}
		
		//배열 섞기
		shuffle(numbers);
		System.out.println("정렬 전 : " + Arrays.toString(numbers)); //정렬 전
		
		//printRank(numbers); //석차 배열
	    //selectSort(numbers); //선택 정렬
		//bubbleSort(numbers); //버블정렬
		insertSort(numbers); //삽입정렬
	      System.out.println("정렬 후 : " + Arrays.toString(numbers)); // 정렬 후
	}

		//삽입 정렬
		private static void insertSort(int[] numbers) {

			//배열 생성
			//정렬 크기를 하나씩 늘려나가야 하기 때문에 i는 1부터 시작한다
			for(int i = 1; i < numbers.length; i++){	
				//i번째의 원소를 key에 배치 시킨다
				int key = numbers[i];
				int j = i -1;
			//이전 위치의 있는 값과 비교를 해야 한다. index가 0보다 큰지 먼저 확인하고,
			//현재 위치의 바로 이전에 있는 key값보다 크면 다음 값으로 넘어가게 된다
			while(j >= 0 && numbers[j] > key){
					//값들을 비교해주고 배열은 증가하지만 비교받은 숫자는 
					//앞으로 줄어진다
					numbers[j + 1] = numbers[j];
					j--;
		
				}
			//비교가 끝나고 다음 값이 key값으로 배치된다
			numbers[j + 1] = key;
			System.out.println((i)+"번 째 회전 : "+ Arrays.toString(numbers)); // 정렬 후
			}
		}
		

		//버블 정렬
		private static void bubbleSort(int[] numbers) {
	
			//배열 
			for(int i = 0; i < numbers.length -1; i++){	
				//자리가 바뀌었는지 아닌지 확인 할 변수 생성
				boolean changed = false;
				
				//비교할 배열
				for(int j =0; j < numbers.length -i -1; j++){
					//j와 j+1순으로 값을 비교해 정렬한다
					if(numbers[j] > numbers[j+1]){
						
						int temp = numbers[j];
						numbers[j] = numbers[j + 1]; 
						numbers[j + 1] = temp;	
						changed = true;
					}									
				}
				//for문을 빠져나와야 자리 바뀜을 알 수 있다
				if(!changed){
					break;
				} 	
				System.out.println((i+1)+"번 째 회전 : "+ Arrays.toString(numbers));
				
			}		
		}
		

		//선택 정렬
		private static void selectSort(int[] numbers) {

			//배열
			for(int i = 0; i < numbers.length -1; i++){				
				//비교할 배열(i보다 1큰 옆의 수)
				for(int j = i + 1; j < numbers.length; j++){
					//i와 i+1순으로 값을 비교해 정렬한다
					if(numbers[i] > numbers[j]){
						
						int temp = numbers[i];
						numbers[i] = numbers[j]; 
						numbers[j] = temp;
						}	
				}				
				System.out.println((i+1)+"번 째 회전 : "+ Arrays.toString(numbers));
				
				}
	
			}		
	
		//석차 구하기 배열
		private static void printRank(int[] numbers) {

			int[] rank = new int[numbers.length];
				//등수 배열, 첫 번째는 무조건 1순위
				for(int i = 0; i < rank.length; i++){	
					rank[i] = 1;
				}	
				
				/*
				 * 0,0 0,1 0,2 0,3 0,4 0,5 0,6 0,7 0,8 0,9 비교 
				 * 
				 * 
				 */
				//나열된 수 들의 등수를 비교하여 등수를 출력
				for(int i = 0; i < numbers.length; i++){
					for(int j = 0; j < numbers.length; j++)	{					
						if(numbers[i] < numbers[j]){
							rank[i]++; 
						}
	
					}
				}
		
			//등수 출력
			for(int i = 0; i < numbers.length; i++){	
				System.out.println(numbers[i] + "번째 등수: " + rank[i]+ "등");
			}
		}

		//정렬 전 배열
		private static void shuffle(int[] numbers) {
		
			for(int i = 0; i < numbers.length * 10; i++){				
				int random = (int)(Math.random( ) *  numbers.length);
				
				//0번과 랜덤한 인덱스 자리 바꿈
				int temp = numbers[0];
				numbers[0] = numbers[random];
				numbers[random] = temp;
				
			}
			
			
			
			
		
	}

}

		
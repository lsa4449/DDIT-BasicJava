package i_collection;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {

		/*
		 * add() : 마지막 위치에 객체를 추가
		 * get() : 지정된 위치의 객체를 반환
		 * set() : 지정된 위치에 주어진 객체를 저장(수정)
		 * remove() : 지정된 위치의 객체를 제거
		 * size() : 지정된 객체의 수 반환
		 * 
		 */
		
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add(10);
		list.add("ABC");
		list.add(true);
		list.add(new ArrayListClass());
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("abc");
		list2.add("123");
		list2.add("가나다");
		list2.set(1, "456");
		
		for(int i = 0; i < list2.size(); i++){
			System.out.println(list2.get(i));
			
		}
		
		list2.remove(0);
		
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		
		//2차원 배열
		ArrayList<ArrayList<Integer>> list3 = new ArrayList<>(); 

		ArrayList<Integer> list4 = new ArrayList<>(); 
		list4.add(10);
		list4.add(20);
		
		list3.add(list4);
		
		list4 = new ArrayList<>();
//		list4.add(30);		
//		list4.add(40);
 
		list3.add(list4);
		
		System.out.println("=========================");
		
		//정수를 저장할 수 있는 ArrayList를 생성해 1~100까지 랜덤한 값을 5번 저장해주세요
		ArrayList<Integer> li = new ArrayList<>();
		
		for(int i = 0; i < 5; i++){
			li.add((int)(Math.random()*100)+1);
		}

			System.out.println(li);
		
		//합계와 평균 구하기
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < li.size(); i++){
			sum += li.get(i);
		}
			avg = (double)sum / li.size();
			
			System.out.println("합계 : " + sum +", " + "평균 : " + avg);
		
		//최소값과 최대값
		int max = li.get(0);
		int min = li.get(0);
		
		for(int i = 0; i < li.size(); i++){
			if(li.size() > max){
				max = li.get(i);
				
			}else if (li.size()  < min){
				min = li.get(i);
			}
		}
		
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
		
	}
}

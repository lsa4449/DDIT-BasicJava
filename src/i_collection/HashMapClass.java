package i_collection;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapClass {
	
	public static void main(String[] args) {

	/*
	 * put() : 지정된 키와 값을 저장
	 * get() : 지정된 키의 값을 반환 (없으면 null)
	 * remove() : 지정된 키로 저장된 값을 제거
	 * keySet() : 저장된 모든 키를 Set으로 변환
	 * 
	 */
	
	HashMap<String, String> map = new HashMap<>();
	
	map.put("title", "제목입니다.");
	map.put("content", "내용입니다.");
	map.put("user", "김승섭");
	map.put("date", "2020-02-20 14:48");
	
	System.out.println(map.get("title"));
	System.out.println(map.get("content"));
	System.out.println(map.get("user"));
	System.out.println(map.get("date"));
	
	map.put("user", "홍길동");
	System.out.println(map.get("user"));
	
	map.remove("user");
	System.out.println(map.get("user"));
	
	for(String key : map.keySet()){
		String value = map.get(key);
		System.out.println(key + " : " + value);
	}
	
	System.out.println("===============");
	
	//두 사람의 정보를 저장하고 있는 ArrayList<HashMap<String, String>>을 만들기
	//홍길동, 남자, 30세, 프로그래머
	//이순신, 남자, 40세, 장군
	
	HashMap<String, String> map1 = new HashMap<>();
	HashMap<String, String> map2 = new HashMap<>();
	
	map1.put("이름", "홍길동");
	map1.put("성별", "남자");
	map1.put("나이", "30세");
	map1.put("직업", "프로그래머");
	
	map2.put("이름", "이순신");
	map2.put("성별", "남자");
	map2.put("나이", "40세");
	map2.put("직업", "장군");
	
	
	for(String key : map1.keySet()){
		String value = map1.get(key);
		System.out.println(key + " : " + value);
	}
	System.out.println("===============");
	
	for(String key : map2.keySet()){
		String value = map2.get(key);
		System.out.println(key + " : " + value);
	}
	
	System.out.println("=======================================");
	
	ArrayList<HashMap<String, String>> map3 = new ArrayList<>();
	HashMap<String, String> map4 = new HashMap<>();
	HashMap<String, String> map5 = new HashMap<>();
	
	map4.put("이름", "홍길동");
	map4.put("성별", "남자");
	map4.put("나이", "30세");
	map4.put("직업", "프로그래머");
	
	map5.put("이름", "이순신");
	map5.put("성별", "남자");
	map5.put("나이", "40세");
	map5.put("직업", "장군");
	
	map3.add(map4);
	map3.add(map5);
	
	for(int i = 0; i < map3.size(); i++){
		System.out.println(map3.get(i));

		}
	}
	//hashmap 파라미터로 받아 저장된 모든 값을 출력하는 메소드
	static void map3(HashMap<String, String> info){
	
		for(String key : info.keySet()){
			String value = info.get(key);
			System.out.println(key + " : " + value);
		}
	}
}
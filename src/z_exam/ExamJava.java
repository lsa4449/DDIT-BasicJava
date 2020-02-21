package z_exam;

public class ExamJava {
	
	//String
	//주어진 문자열(s)을 갖는 String 인스턴스를 생성한다.
	String s = new String("HELLO");
	
	//주어진 문자열(value)을 갖는 String 인스턴스를 생성한다.
	char[] c = {'H', 'e', 'l', 'l', 'o'};
	String s1 = new String(c);
	
	//StringBuffer의 인스턴스가 갖고 있는 문자열과 같은 내용의 String 인스턴스를 생성한다.
	StringBuffer sb = new StringBuffer("Hello");
	String s2 = new String(sb);
	
	//지정된 위치(index)에 있는 문자를 알려준다.(index는 0부터 시작)
	String s3 = "Hello";
	String n = "0123456";
	char c1 = s3.charAt(1);
	char c2 = n.charAt(1);
	
	//문자열(str)과 사전순서로 비교한다. 같으면 0을, 사전순으로 이전이면 음수를, 이후면 양수를 반환한다.
	int i = "aaa".compareTo("aaa");
	int i2 = "aaa".compareTo("bbb");
	int i3= "bbb".compareTo("aaa");
	
	//문자열(str)을 뒤에 덧붙인다.
	String s4 = "Hello";
	String s5 = s4.concat(" World");
	
	//지정된 문자열(s)이 포함 되었는지 검사한다.
	String s6 = "abcdefg";
	boolean b = s6.contains("bc");
	
	//지정된 문자열(suffix)로 끝나는지 검사한다.
	String file = "Hello.txt";
	boolean b1 = file.endsWith("txt");
	
	//매개변수로 받은 문자열(obj)과 String인스턴스의 문자열을 비교한다. 
	//obj가 String이 아니거나 문자열이 다르면 false를 반환한다.
	String s7 = "Hello";
	boolean b2 = s7.equals("Hello");
	boolean b3 = s7.equals("hello");

	//문자열과 String인스턴스의 문자열을 대소문자 구분없이 비교한다.
	String s8 = "Hello";
	boolean b4 = s8.equalsIgnoreCase("HELLO");
	boolean b5 = s8.equalsIgnoreCase("heLLo");
	
	//주어진 문자(ch)가 문자열에 존재하는지 확인하여 위치(index)를 알려준다.
	//못 찾으면 -1을 반환한다.(index는 0부터 시작)
	String s9 = "HELLO";
	int idx1 = s9.indexOf('o');
	int idx2 = s9.indexOf('k');
	
	//주어진 문자(ch)가 문자열에 존재하는지 지정된 위치(pos)부터 확인하여 위치(index)를 알려준다.
	//못 찾으면 -1을 반환한다.(index는 0부터 시작)
	String s10 = "HELLO";
	int idx3 = s10.indexOf('e',0);
	int idx4 = s10.indexOf('e',2);
	
	//주어진 문자열이 존재하는지 확인하여 그 위치(index)를 알려준다. 
	//없으면 -1을 반환한다.
	String s11 = "ABCDEFG";
	int idx5 = s11.indexOf("CD");
	
	//문자열을 상수풀(constant pool)에 등록한다. 이미 상수풀에 같은 내용의 문자열이 있을 경우 그 문자열의 주소값을 반환한다.
	String s12 = new String("abc");
	String s13 = new String("abc");
	boolean b6 = (s12 == s13);
	boolean b7 = s12.equals(s13);
	boolean b8 = (s.intern() == s13.intern());
	
	//지정된 문자 또는 문자코드를 문자열의 오른쪽 끝에서부터 찾아서 위치를 알려준다.
	//못 찾으면 -1을 반환한다.
	String ss = "java.lang.Object";
	int idxx = ss.lastIndexOf('.');
	int idxx2 = ss.indexOf('.');
	
	//지정된 문자열을 인스턴스의 문자열 끝에서부터 찾아서 위치를 알려준다.
	//못 찾으면 -1을 반환한다.
	String ss2 = "java.lang.java";
	int idxx3 = ss2.lastIndexOf('.');
	int idxx4 = ss2.indexOf('.');
	
	//문자열의 길이를 알려준다.
	String sss = "Hello";
	int length = sss.length();
	
	//문자열 중의 문자(old)를 새로운 문자(nw)로 바꾼 문자열을 반환한다.
	String a = "Hello";
	String a1 = a.replace('H','C');
	
	//문자열 중의 문자열(old)를 새로운 문자열(nw)로 모두 바꾼 문자열을 반환한다. 
	String h = "Hello";
	String h1 = h.replace("ll", "LL");
	
	//문자열 중에서 지정된 문자열(regex)과 일치하는 것을 새로운 문자열(replacement)로 모두 변경한다.
	String ab = "AABBAABB";
	String r = ab.replaceAll("BB", "bb");
	
	//문자열 중에서 지정된 문자열과 일치하는 것 중, 첫 번째 것만 새로운 문자열로 변경한다.
	String ab1 = "AABBAABB";
	String r2 = ab1.replaceFirst("BB", "bb");
	
	//문자열을 지정된 분리자로 나누어 문자열 배열에 담아 반환한다.
	String animals = "dog, cat, bear";
	String[] arr = animals.split(",");
	
	//문자열을 지정된 분리자로 나누어 문자열배열에 담아 반환한다.
	//단, 문자열 전체를 지정된 수로 자른다.
	String animal = "dog, cat, bear";
	String[] arr1 = animal.split(",", 2);
	
	//주어진 문자열로 시작하는지 검사한다.
	String java = "java.lang.Object";
	boolean bb = java.startsWith("java");
	boolean bb2 = java.startsWith("lang");
	
	//주어진 시작위치부터 끝 위치 범위에 포함된 문자열을 얻는다. 
	//이 때, 시작위치의 문자는 범위에 포함되지만, 끝 위치의 문자는 포함되지 않는다.
	String j = "java.lang.Object";
	String sub = j.substring(10);
	String p = s.substring(5,9);
	
	//String 인스턴스에 저장되어있는 모든 문자열을 소문자로 변환하여 반환한다.
	String he = "Hello";
	String he1 = he.toLowerCase();
	
	//String인스턴스에 저장되어 있는 문자열을 반환한다.
	String hel = "Hello";
	String hel2 = hel.toString();
	
	//String 인스턴스에 저장되어있는 모든 문자열을 대문자로 변환하여 반환한다.
	String str = "Hello";
	String str2 = str.toUpperCase();
	
	//문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환한다. 이 때 문자열 중간에 있는 공백은 제거되지 않는다.
	String g = "   Hello World   ";
	String g2 = g.trim();
	
	//지정된 값을 문자열로 변환하여 반환한다.
	//참조변수의 경우, toString()을 호출한 결과를 변환한다.
	String z = String.valueOf(true);
	String m = String.valueOf('a');
	String l = String.valueOf(100);
	String q = String.valueOf(100L);
	String f = String.valueOf(10f);
	String d = String.valueOf(10.0);
	java.util.Date dd = new java.util.Date();
	String date = String.valueOf(dd);
	

}

package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {

		/*
		 * 우리반 모두의 Java, Oracle, HTML, JQuery, JSP 점수를 
		 * 50~100까지 랜덤 생성하고, 석차순으로 석차, 이름, 과목별 점수, 총점, 평균 출력 
		 * 
		 * 석차  이름   Java Oracle	HTML CSS JQuery	JSP	  총점      평균
		 * 1    홍길동   100    90    80    70   60    50  350  75.0 
		 * 1    홍길동   100    90    80    70   60    50  350  75.0 
		 * 1    홍길동   100    90    80    70   60    50  350  75.0 
		 * 1    홍길동   100    90    80    70   60    50  350  75.0 
		 * 		
		 */
		
		String[] name = 
						{"전영현",
						 "김다슬",
						 "김덕년",
						 "김재석",
						 "김태진",
						 "박희찬",
						 "서동미",
						 "서한별",
						 "신나라",
						 "심윤희",
						 "옥혜원",
						 "유웅",
						 "이명현",
						 "이수아",
						 "이승민",
						 "이용춘",
						 "이재호",
						 "이종우",
						 "임종원",
						 "차완호",
						 "홍성하"
						};
		double[][]scores = new double[name.length][6];
		int[] rank = new int[scores.length];
		int[] java = new int[scores.length];
		int[] oracle = new int[scores.length];
		int[] html = new int[scores.length];
		int[] css = new int[scores.length];
		int[] jquery = new int[scores.length];
		int[] jsp = new int[scores.length];
		int[] sum = new int[scores.length];
		double[] avg = new double[scores.length];

		System.out.println("석차\t 이름 \t Java\t Oracle\t Html\t Css\t JQuery\t Jsp\t 총점\t 평균 ");
		
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				scores[i][j] = (int)(Math.random() * 50) + 50;
			}	
				}
		
		//석차
		for(int i = 0; i < scores.length -1; i++){	
			for(int j = 0; j < scores.length -1; j++)	{					
				
				/*if(sum[j] < sum[j+1]){
					int tmp = sum[j];
					sum[j] = sum [j + 1];
					sum [j + 1] = tmp;
					
					double tmp2 = avg[j];
					avg[j] = avg[j + 1];
					avg[j + 1] = tmp2;
					
					String tmp3 = name[j];
					name[j] = name[j + 1];
					name[j + 1] = tmp3;*/
					
					double[] tmp4 = scores[j];
					scores[j] = scores[j + 1];
					scores[j + 1] = tmp4;
				if(scores[i][0] > scores[j][0]){
					double[] temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;
					
					String tempName = name[i];
					name[i] = name[j];
					name[j] = tempName;
					
					}
				}
			}
	
		//이름
		for(int i = 0; i < name.length; i++){		
		}
		
		//자바 점수
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				java[i] = (int)(Math.random() * 50) + 50;
			}	
						
		}	
		//오라클 점수
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				oracle[i] = (int)(Math.random() * 50) + 50;
			}	
		}
		
		//HTML 점수
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				html[i] = (int)(Math.random() * 50) + 50;
			}	
				}
		
		//CSS 점수
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				css[i] = (int)(Math.random() * 50) + 50;
			}	
				}
			
		//JQurey 점수
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				jquery[i] = (int)(Math.random() * 50) + 50;
			}	
				}
		
		//JSP 점수
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				jsp[i] = (int)(Math.random() * 50) + 50;
			}	
						
				}
		
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
			
			sum[i] += scores[i][j]; //합계			
		}
			avg[i] = sum[i] / (double)scores[i].length; //평균
			
			System.out.println(rank[i] +"\t"
							   + name[i] +"\t"
							   + java[i] +"\t"
							   + oracle[i] +"\t"
							   + html[i] +"\t"
							   + css[i] +"\t"
							   + jquery[i] +"\t"
							   + jsp[i] +"\t"
							   + sum[i] +"\t"
							   + (Math.round(avg[i])) +"\t"
							   );
			
		}

	}
}

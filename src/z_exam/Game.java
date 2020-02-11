package z_exam;

import java.util.Random;
import java.util.Scanner;

public class Game {

	void game1() {

		Scanner s = new Scanner(System.in);

		int count = 0;
		int win = 0;
		int lose = 0;
		int tie = 0;

		String name = s.next();
		System.out.println(name + "님과 컴퓨터가 게임을 시작합니다~~~~!!!!!");
		System.out.print("1가위, 2바위, 3보, 4종료 ▶▶ 숫자를 입력하여 주세요!  ");

		//컴퓨터가 설정받는 랜덤 값
		int com = (int) (Math.random() * 3) + 1;
		for (int i = 0; i < 3; i++) {
			int user = s.nextInt();
			count++;

			if (user < 0 || 4 < user) {
				System.out.println("잘못 선택하셨습니다. 다시 내세요!!\n");
				continue;

			}
			if (user == 4) {
				System.out.println("===== 종료 합니다. =====");
				break;
			}

			// com이 입력하는 값
			System.out.print("컴퓨터가 낸 것: ");

			if (com == 1) {

				System.out.print("가위");

			} else if (com == 2) {

				System.out.print("바위");

			} else {

				System.out.print("보");

			}

			// user가 입력하는 값
			System.out.print("\n내가 선택한 것 : ");

			if (user == 1) {

				System.out.print("가위");

			} else if (user == 2) {

				System.out.print("바위");

			} else {

				System.out.print("보");

			}

			//컴퓨터와 사용자의 값 비교
			if (com == user) {

				System.out.println("\n음..비겼습니다. 한 번더 도전하세요!");
				tie++;

			} else if ((com == 1 && user == 2) || (com == 2 && user == 3)
					|| (com == 3 && user == 1)) {

				System.out.println("\n오!! 이겼습니다!!");
				win++;

			} else {

				System.out.println("\n컴퓨터한테 졌습니다.. 아쉽지만 다음 기회에!");
				lose++;

			}

		}
		System.out.println("==================================");
		System.out.println(name + "님이 " + count + "회 중 이긴 횟수는 " + win + "입니다!");
		System.out.println(name + "님이 " + count + "회 중 비긴 횟수는 " + tie + "입니다!");
		System.out.println(name + "님이 " + count + "회 중 진 횟수는 " + lose + "입니다!");
		System.out.println("====== 가위 바위 보 게임을 종료 합니다. =====");

	}

	void game2() {

		Scanner sc = new Scanner(System.in);
		int count = 0;
		String name = sc.next();
		System.out.println("로또 번호 6자리를 입력해보세요~");

		//로또 번호 배열 생성
		int[] arr = new int[6];

		//번호 입력
		for (int i = 0; i < 6; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > 0 && arr[i] <= 45) {
			} else {
				System.out.println("45 이하의 숫자들로 입력해주세요!");
			}
			//중복 방지
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("숫자가 중복 되었습니다..");
					i--;
				}
				//번호 정렬해서 출력
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(name + "님이 입력한 숫자는 : ");
		for (int i = 0; i < 6; i++) {
			System.out.println(arr[i] + " ");
		}

		//컴퓨터가 랜덤으로 생성하는 값
		Random ran = new Random();
		int comArr[] = new int[6];
		//랜덤으로 번호 입력
		for (int i = 0; i < 6; i++) {
			comArr[i] = ran.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (comArr[i] == comArr[j]) {
					i--;
				}
			}
			//중복 방지
			for (int j = 0; j < 6; j++) {
				if (comArr[i] < comArr[j]) {
					i--;
				}
				//번호 정렬해서 출력
				if (comArr[i] < comArr[j]) {
					int temp = comArr[i];
					comArr[i] = comArr[j];
					comArr[j] = temp;
				}
			}
		}
		//당첨 번호 출력
		System.out.println("로또 당첨 번호는 ?! -> ");
		for (int i = 0; i < 6; i++) {
			System.out.println(comArr[i] + " ");
		}
		//입력한 값이랑 출력한 값이랑 맞는지 확인하고 등수 출력
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (arr[i] == comArr[j]){
					count++;
				}
			}
		}
		
		if(count == 0){
			System.out.println("꼴찌입니다!");
		}else if(count == 1){
			System.out.println("6등 입니다!");
		}else if(count == 2){
			System.out.println("5등 입니다!");
		}else if(count == 3){
			System.out.println("4등 입니다!");
		}else if(count == 4){
			System.out.println("3등 입니다!");
		}else if(count == 5){
			System.out.println("2등 입니다!");
		}else if(count == 6){
			System.out.println("축하합니다!!! 1등 입니다!!!");
		}else {
			System.out.println("잘못 입력");
		}


		System.out.println("~§★오늘의 운세 확인 놀이 끝~★§");
		
	}

	public static void main(String[] args) {

		System.out.println("~§★오늘의 운세 확인 놀이하기~★§");
		System.out.println("운세 확인을 위해서 묵찌빠랑 로또 번호 맞추기를 해봅시다~!");
		System.out.println("=====우선 가위 바위 보 게임을 시작 합니다=====\n총 3번의 기회가 주어집니다.");
		System.out.println("사용자 이름 입력 ▶▶▶");

		Game g = new Game();
		g.game1();
		
		System.out.println("다음으로 로또번호를 맞춰봅시다. 나온 숫자로 복권 구입해보기~");
		System.out.println("사용자 이름 입력 ▶▶▶");
		g.game2();

	}
}

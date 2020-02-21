package zzz.game;

import java.util.Scanner;

public class Play {
	Player player;
	Room[][] map = new Room[5][2];
	Scanner scan = new Scanner(System.in);

	public Play() {
		System.out.println("방탈출을 시작합니다!");
		initMap();
	}

	private void initMap() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				map[i][j] = new Room(true, true, true, true);
			}
		}
		player = new Player(2, 0); //사용사 스타트 위치

		for (int i = 0; i < map.length; i++) {
			map[i][0].setUp(false);
			map[i][1].setDown(false);
		} // 위아래 false
		map[0][0].setLeft(false);
		map[4][0].setRight(false);
		map[0][1].setLeft(false);
		map[4][1].setRight(false);
		// 옆에 막음
		map[1][0].setLeft(false); // 퀴즈용
		map[2][0].setDown(false); // 1key�ʿ�
		map[3][0].setDown(false); // 2key�ʿ�
	}

	public void start() {
		for (;;) {
			showPosition();
			System.out.println("Where are you going?");
			System.out.println("1. ← 2. → 3. ↑  4. ↓  5.EXIT");
			String input = scan.nextLine();
			if (map[player.getPosX()][player.getPosY()].getDown() == false&&input.equals("4")
					|| map[player.getPosX()][player.getPosY()].getUp() == false&&input.equals("3")
					|| map[player.getPosX()][player.getPosY()].getLeft() == false&&input.equals("2")
					|| map[player.getPosX()][player.getPosY()].getRight() == false&&input.equals("1")) {
				ifFalse(player.getPosX(),player.getPosY(),input);
			} else {
				setInput(input); // 입력값 셋팅
				keySetting(); // 특수한 구역의 이벤트 실행
			}
			// 게임종료
			if (input.equals("5") || (player.getPosX() == 4 && player.getPosY() == 1))
				break;
			input = "";
			
		}
	}
	
	public void ifFalse(int pX,int pY,String input){
		if(pX==1||pY==0&&input.equals("1")){
			quiz();
		}else if(pX==2||pY==0&&input.equals("4")){
			System.out.println("[PLEASE KEY[1]]");
		}else if(pX==3||pY==0&&input.equals("4")){
			System.out.println("[PLEASE KEY[2]]");
		}else System.out.println("[이 동 불 가]");
	}

	public void keySetting() {
		if (player.getPosX() == 0 && player.getPosY() == 1) {
			map[2][0].setDown(true);
			System.out.println("[KEY(1) GET]");
		} else if (player.getPosX() == 2 && player.getPosY() == 1) {
			map[3][0].setDown(true);
			System.out.println("[KEY(2) GET]");
		} else if (player.getPosX() == 4 && player.getPosY() == 1) {
			System.out.println("GAME CLEAR!!\nTHANK YOU");
		}
	}

	public void quiz() {
		System.out.println("아무거나 입력하세요");
		String answer = scan.nextLine();
		if (answer.equals("아무거나")) {
			map[1][0].setLeft(true);
			System.out.println("[문이 열렸습니다]");
		} else
			System.out.println("[오답]");
	}

	private void setInput(String input) {
		if (input.equals("1")) {
			player.moveLeft();
		} else if (input.equals("2")) {
			player.moveRight();
		} else if (input.equals("3")) {
			player.moveUp();
		} else if (input.equals("4")) {
			player.moveDown();
		} else if (input.equals("5")) {
			System.out.println("STOP GAME\n BYE");
		}
	}

	private void showPosition() {
		for (int i = 0; i < map[0].length; i++) {
			for (int j = 0; j < map.length; j++) {
				if(player.getPosX()==j&&player.getPosY() == i) System.out.print(" ■");
				else System.out.print(" □");
			}
			 System.out.println();
		}
	}
}

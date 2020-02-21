package zzz.game;

public class Player {
	private int posX;
	private int posY;

	public Player(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public void moveUp() {
		posY = posY - 1;
	}

	public void moveDown() {
		posY = posY + 1;
	}

	public void moveLeft() {
		if (posX > 0) {
			posX = posX - 1;
		} else {
			System.out.println("왼쪽으로 이동할 수 없습니다");
		}
	}

	public void moveRight() {
		if (posX < 4) {
			posX = posX + 1;
		} else {
			System.out.println("오른쪽으로 이동할 수 없습니다");
		}

	}
}

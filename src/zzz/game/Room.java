package zzz.game;

public class Room {
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	
	public Room(boolean left, boolean right, boolean up, boolean down){
		this.left = left;
		this.right = right;
		this.up = up;
		this.down = down;
	}
	
	public boolean getUp(){
		return up;
	}
	public boolean getDown(){
		return down;
	}
	public boolean getLeft(){
		return left;
	}
	public boolean getRight(){
		return right;
	}
	
	public void setRight(boolean right) {
		this.right = right;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public void setDown(boolean down) {
		this.down = down;
	}
	
}

// Renee Rosenheim
// 1/9/26
// Creates a ball for the game BrickBreak
package com.BrickBreak;
import java.awt.*;

public class Ball {
	//your code here!
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int radius;
	private int xVelocity;
	private int yVelocity;
	//constructor(s):
	public Ball9int x, int y, int radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.xVelocity = -1;
		this.yVelocity = -2;
	}
	//methods:
	public void draw(Graphics g) {
		g.setColor(Color.PINK);
		g.fillOval(x, y, radius, radius);
	}

	public void move(){
		x+= xVelocity;
		y+= yVelocity;
	}

	public void setX(int x){
		this.x = x;
	}

	public void setY(int y){
		this.y = y;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

	public void reverseX(){
		this.xVelocity = -this.xVelocity;
	}

	public int getXpos(){
		return x;
	}

	public int getYpos(){
		return y;
	}

	public void reverseY(){
		this.yVelocity = -this.yVelocity;
	}

	public void setXVelocity(int xVelocity){
		this.xVelocity = xVelocity;
	}

	public void setYVelocity(int yVelocity){
		this.yVelocity = yVelocity;
	}

	public int getXvelocity(){
		return xVelocity;
	}

	public void setYvelocity(int yVelocity){
		this.yVelocity = yVelocity;
	}

	public int getYvelocity(){
		return xVelocity;
	}

	public void setSize(int radius){
		this.radius = radius;
	}

	public in getSize(){
		return radius;
	}
}

// Renee Rosenheim
// 1/9/26
// Creates a paddle for the game BrickBreak
package com.BrickBreak;

import java.awt.Graphics;
import java.awt.*;

public class Paddle {
	//your code her	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int width;
	private int height;
	private int speed;
	private int location;
	
	//constructor(s):
	public Paddle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.speed = 1;
		this.location = x + width /2;
	}

	//methods:
	public void draw(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(x, y, width, height);
	}

	public void move(){
		x += speed;

		if (x < 0 || x > 700 - width){
			System.out.println("hit left wall");
			speed = -speed;
		}
	}

	public void setLocation(int loc){
		this.location = loc;
	}

	public int getLocation(){
		return location;
	}

	public int getVelocity(){
		return speed;
	}

	public void addVelocity(int input){
		this.speed += input;
	}

	public int setVelocity(int input){
		this.speed += input;
	}
	
	public void setX(int x){
		this.x = x;
	}

	public int getX(){
		return x;
	}

	public void sety(int y){
		this.y = y;
	}

	public int getY(){
		return y;
	}

	public int getHeight(){
		return height;
	}

	public int getWidth(){
		return width;
	}

	public int addVelocity(){
		return speed;
	}
}	

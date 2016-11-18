//package com.mygdx.game;
//
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.Input;
//import com.badlogic.gdx.graphics.Texture;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//import com.badlogic.gdx.graphics.g2d.TextureRegion;
//import com.badlogic.gdx.math.Vector2;
//
//
//public class Menu {
//	Texture startImg;
//	SpriteBatch batch;
//	FrogGame frogGame;
//	
//	
//	public void menu(FrogGame frogGame){
//		 this.frogGame = frogGame;
//	     batch = frogGame.batch;
//	     startImg = new Texture("start.png");
//	     
//	}
//	
//	public void render(){
//		batch.begin();
//		batch.draw(startImg, 0,0,startImg.getWidth(),startImg.getHeight());
//		batch.end();
//	}
//	
//	public void update(){
//		Vector2 position = getPositionMouse();
//	
//		/*if((position.x>400 && position.x<500) && (position.y>300 && position.y<400)){
//			;
//			}*/
//		}
//	public Vector2 getPositionMouse() {
//		Vector2 position = new Vector2(0,0);
//		position.x = Gdx.input.getX();
//		position.y = Gdx.input.getY();
//		return position;
//	}
//	
//	
//}

package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer{
	
	FrogGame frogGame;
	World world;
	static Texture frogImg;
	SpriteBatch batch;
	Texture roadImg;
	Vector2 pos;
	CarRenderer carRenderer;
	Texture carImg;
	Texture car2Img;
	Texture frosstheroadImg;
	Texture winImg;
	Texture gameoverImg;
	BitmapFont font;
	public WorldRenderer(FrogGame frogGame, World world) {
        this.frogGame = frogGame;
        
        batch = frogGame.batch;
 
        this.world = world;
        pos = new Vector2();
    	carRenderer = new CarRenderer (frogGame.batch, this.world.cars,this.world.car2s);        

    	frogImg = new Texture("frog.png");
    	frosstheroadImg = new Texture("fross.png");
        roadImg = new Texture("road.png");
        winImg = new Texture("congratulations.png");
        gameoverImg = new Texture("gameover.png");
        font = new BitmapFont();
    }
	
	public void render(float delta) {
        batch.begin();
        
        batch.draw(roadImg, 0,0,roadImg.getWidth()/2,roadImg.getHeight()/2);
        
        pos = world.getFrog().getPosition();
        batch.draw(frogImg, pos.x, pos.y);
        //font.draw(batch, "x" + pos.x + "   y" + pos.y , pos.x, pos.y);
		carRenderer.render(delta);
		
        
        batch.end();
        
//        if(carImg.overlaps(frogImg)) {
//            frogImg.dispose();
//        }
    }
	
	public void renderGameTitle(){
		batch.begin();
		batch.draw(frosstheroadImg,frogGame.WIDTH/2-frosstheroadImg.getWidth()/2,frogGame.HEIGHT/2-frosstheroadImg.getHeight()/2);
		batch.end();
	}
	
	public void renderGameEnd(){
		batch.begin();
		batch.draw(gameoverImg,frogGame.WIDTH/2-gameoverImg.getWidth()/2,frogGame.HEIGHT/2-gameoverImg.getHeight()/2);
		batch.end();
	}
	
	public void renderWinGame(){
		batch.begin();
		batch.draw(winImg,frogGame.WIDTH/2-winImg.getWidth()/2,frogGame.HEIGHT/2-winImg.getHeight()/2);
		batch.end();
	}
}

package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;

public class GameScreen extends ScreenAdapter {

	//private FrogGame frogGame;
	//private Texture frogImg;
	Frog frog;
	World world;
	WorldRenderer worldRenderer;
	CarRenderer carRenderer;
 
    public GameScreen(FrogGame frogGame) {
    	
    	world = new World(frogGame); 
    	worldRenderer = new WorldRenderer(frogGame, world);
    	frog = world.getFrog();
    	carRenderer = new CarRenderer(frogGame.batch , world);
    }
        
    @Override
    public void render(float delta) {
//    	System.out.println(delta);
    	update(delta); 
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        worldRenderer.render(delta);
        carRenderer.render(delta);
        
    	
    }
    
    public void update(float delta) {
        if(Gdx.input.isKeyPressed(Keys.UP)) {
            frog.move(Frog.DIRECTION_UP);
        }
        if(Gdx.input.isKeyPressed(Keys.DOWN)) {
            frog.move(Frog.DIRECTION_DOWN);
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
            frog.move(Frog.DIRECTION_RIGHT);
        }
        if(Gdx.input.isKeyPressed(Keys.LEFT)) {
        	frog.move(Frog.DIRECTION_LEFT);
        }
	}
    
    
        
}

package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;

public class GameScreen extends ScreenAdapter {

	//private FrogGame frogGame;
	//private Texture frogImg;
	Frog frog;
	World world;
	WorldRenderer worldRenderer;
 
    public GameScreen(FrogGame frogGame) {
    	world = new World(frogGame); 
    	worldRenderer = new WorldRenderer(frogGame, world);
    }
        
    @Override
    public void render(float delta) {
    	world.update(delta); 
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        worldRenderer.render(delta);
    	
    }
        
}

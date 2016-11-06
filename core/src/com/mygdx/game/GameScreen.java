package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter{
	private FrogGame frogGame;
	private int x;
    private int y;
    
	private Texture frogImg;
	
	public GameScreen(FrogGame frogGame) {
		this.frogGame = frogGame;
		frogImg = new Texture("frog.png");
		x = 100;
        y = 100;
	}


	@Override
    public void render(float delta) {
		update(delta);
		Gdx.gl.glClearColor(0, 0, 0, 1);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        SpriteBatch batch = frogGame.batch;
        batch.begin();
        batch.draw(frogImg, x, y);
        batch.end();
    }
	
	private void update(float delta){
		if(Gdx.input.isKeyPressed(Keys.LEFT)) {
            x -= 10;
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
            x += 10;
        }
        if(Gdx.input.isKeyPressed(Keys.DOWN)) {
            y -= 10;
        }
        if(Gdx.input.isKeyPressed(Keys.UP)) {
            y += 10;
        }
	}
	
	
	
	
	
	
	
	
	
	
	
}
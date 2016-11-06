package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class GameScreen extends ScreenAdapter{
	private FrogGame frogGame;
	
	private Texture frogImg;
	
	private Frog frog;
	
	public GameScreen(FrogGame frogGame) {
		this.frogGame = frogGame;
		
		frogImg = new Texture("frog.png");
		
		frog = new Frog(100,100);
	}


	@Override
    public void render(float delta) {
		update(delta);
		Gdx.gl.glClearColor(0, 0, 0, 1);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        SpriteBatch batch = frogGame.batch;
        batch.begin();
        Vector2 pos = frog.getPosition();
        batch.draw(frogImg, pos.x, pos.y);
        batch.end();
    }
	
	private void update(float delta){
		if(Gdx.input.isKeyPressed(Keys.LEFT)) {
			frog.move(Frog.DIRECTION_LEFT);
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
            frog.move(Frog.DIRECTION_RIGHT);        
        }
        if(Gdx.input.isKeyPressed(Keys.DOWN)) {
            frog.move(Frog.DIRECTION_DOWN);
        }
        if(Gdx.input.isKeyPressed(Keys.UP)) {
            frog.move(Frog.DIRECTION_UP);
        }
	}
	
	
	
	
	
	
	
	
	
	
	
}
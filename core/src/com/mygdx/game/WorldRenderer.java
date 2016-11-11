package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer {
	
	FrogGame frogGame;
	Frog frog;
	World world;
	Texture frogImg;
	SpriteBatch batch;
	
	public WorldRenderer(FrogGame frogGame, World world) {
        this.frogGame = frogGame;
        
        batch = frogGame.batch;
 
        this.world = world;
 
        frogImg = new Texture("frog.png");
    }
	
	public void render(float delta) {
		frog = new Frog(100,100);
        batch.begin();
        Vector2 pos = (frog.getPosition());
        batch.draw(frogImg, pos.x, pos.y);
        batch.end();
        
    }

}

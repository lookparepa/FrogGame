package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer{
	
	FrogGame frogGame;
	World world;
	Texture frogImg;
	SpriteBatch batch;
	Texture roadImg;
	Vector2 pos;
	public WorldRenderer(FrogGame frogGame, World world) {
        this.frogGame = frogGame;
        
        batch = frogGame.batch;
 
        this.world = world;
        pos = new Vector2 ();
 
        frogImg = new Texture("frog.png");
        roadImg = new Texture("road.png");
    }
	
	public void render(float delta) {
		
        batch.begin();
        batch.draw(roadImg, 0,0,roadImg.getWidth()/2,roadImg.getHeight()/2);
        pos = world.getFrog().getPosition();
        batch.draw(frogImg, pos.x, pos.y);
        batch.end();
        
    }

}

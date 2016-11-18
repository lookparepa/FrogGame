package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

public class GameScreen extends ScreenAdapter {

	//private FrogGame frogGame;
	//private Texture frogImg;
	Frog frog;
	World world;
	WorldRenderer worldRenderer;
	Rectangle frogRectangle = new Rectangle();
	Array<Rectangle> car1sRectangle = new Array<Rectangle>();
	Array<Rectangle> car2sRectangle = new Array<Rectangle>();
	int a = 0;
	Texture frogImg;
	Texture carImg;
	Texture car2Img;
	Texture froglifeImg;
	BitmapFont font;
	SpriteBatch batch;
	
	
 
    public GameScreen(FrogGame frogGame) {
    	frogImg = new Texture("frog.png");
    	carImg = new Texture("car.png");
    	car2Img = new Texture("car2.png");
    	froglifeImg = new Texture("froglife.png");
    	
    	world = new World(frogGame);
    	batch = frogGame.batch;
    	setCarsRectangleValue();
    	worldRenderer = new WorldRenderer(frogGame, world);
    	frog = world.getFrog();
    	setFrogRectangle();
    	frogRectangle.height = (float)0.8*frogImg.getHeight();
    	frogRectangle.width = (float)0.8*frogImg.getWidth();
    	
    	
    }
        
    @Override
    public void render(float delta) {
//    	System.out.println(delta);
    	update(delta); 
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        worldRenderer.render(delta);
       
        if(a==0){
        	worldRenderer.renderGameTitle();
        	if(Gdx.input.isKeyJustPressed(Keys.ENTER)){
        		a++;
        	}
        }
        
        System.out.println(world.life);
        life(world.life);
        checkLife();
        winGame();
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
        
        frogRectangle.x = frog.position.x;
    	frogRectangle.y = frog.position.y;
    	
    	
    	
        int i = 0;
        for (Car car : this.world.cars) {
        	car1sRectangle.get(i).x = car.move(i);
        	i++;
        } 
        
        i = 0;
        for (Car2 car2 : this.world.car2s) {
        	car2sRectangle.get(i).x = car2.move(i);
            i++;
        } 
        
        
        for (Rectangle car1Rectangle : this.car1sRectangle) {
        	if (car1Rectangle.overlaps(frogRectangle)) {
        		frog.position.x = (FrogGame.WIDTH/2-20);
        		frog.position.y = 0;
        		setFrogRectangle();
        		world.life--;	 
        		world.sound2();
//        		System.out.println("เป็นที่คาร์หนึ่งนะ");
			}
//        	setFrogRectangle();
        } 
        
    
        for (Rectangle car2Rectangle : this.car2sRectangle) {
        	if (car2Rectangle.overlaps(frogRectangle)) {
        		frog.position.x = (FrogGame.WIDTH/2-20);
        		frog.position.y = 0;
        		setFrogRectangle();
        		world.life--;
        		world.sound2();
//    		System.out.println("เป็นที่คาร์สองนะ");
			}
        } 
	}
    
    public void checkLife() {
    	if (world.life<=0){
    		worldRenderer.renderGameEnd();
    		if(Gdx.input.isKeyJustPressed(Keys.ENTER)){
    			world.life = 10;
    			a = 0;
    			
    		}
    	}
    		
   }
    public void winGame() {
    	if(frog.position.y >= (float)(17.0/18*FrogGame.HEIGHT)){
    		worldRenderer.renderWinGame();
    			if(Gdx.input.isKeyJustPressed(Keys.ENTER)){
    				frog.position.x = (FrogGame.WIDTH/2-20);
            		frog.position.y = 0;
            		a = 0;
        	}
    			
    	}
    }
    
    @SuppressWarnings("static-access")
	public void setFrogRectangle() {
		frogRectangle.x = frog.position.x;
		frogRectangle.y = frog.position.y;
	}
    
    public void setCarsRectangleValue() {
    	for (Car car: this.world.cars)	{
    		Rectangle car1Rectangle = new Rectangle();
    		car1Rectangle.x = car.getPosition().x;
    		car1Rectangle.y = car.getPosition().y;
    		car1Rectangle.width = (float) carImg.getWidth();
    		car1Rectangle.height = (float) carImg.getHeight();
    		car1sRectangle.add(car1Rectangle);
    		
    	for (Car2 car2: this.world.car2s)	{
        	Rectangle car2Rectangle = new Rectangle();
        	car2Rectangle.x = car2.getPosition().x;
       		car2Rectangle.y = car2.getPosition().y;
       		car2Rectangle.width = (float) car2Img.getWidth();
       		car2Rectangle.height = (float) car2Img.getHeight();
       		car2sRectangle.add(car2Rectangle);	
    		}
    	}
    }
    
    public void life(int life){
    		worldRenderer.renderLife(life);
    }
    
}

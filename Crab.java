import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    
    /*
     * Create a Crab and initialize the two image variables
     */
    public Crab() 
    {
        image1 = new GreenfootImage( "crab.png" );
        image2 = new GreenfootImage( "crab2.png" );
        setImage( image1 );
    }
    
    public void act()
    {
        
        checkKeyPress();
        move();
        lookForWorm();
        
    }
    
    public void move( )
    {
        move(5);
    }
    
    /*
     * Check whether we have stumbled upon a worm
     * If we have, eat it. If not do nothing.
     */
    public void lookForWorm()
    {
        if( isTouching(Worm.class))
        {
            removeTouching( Worm.class );
            Greenfoot.playSound("slurp.wav");
        }
    }
    
    /*
     * Check whether a key is pressed. If so, turn the Crab
     */
    public void checkKeyPress()
    {
        if( Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
        if( Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }
    }
}



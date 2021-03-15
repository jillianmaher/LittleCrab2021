import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        if( isAtEdge() )
        {
            turn(17);
        }
        
        if(Greenfoot.getRandomNumber(100) < 10 )
        {
            turn( Greenfoot.getRandomNumber(91) - 45 );
        }
        
        move();
        
        if( isTouching(Worm.class))
        {
            removeTouching( Worm.class );
        }
    }
    
    public void move( )
    {
        move(5);
    }
}



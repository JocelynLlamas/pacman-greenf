import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PacmanMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacmanMenu extends Actor
{
    /**
     * Act - do whatever the PacmanMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if(Greenfoot.mouseClicked(this))
       {
           MapLoader mapLoader = new PacmanGoogleMapLoader();
           
           Greenfoot.setWorld(mapLoader.loadMap());
       }
    }    
}

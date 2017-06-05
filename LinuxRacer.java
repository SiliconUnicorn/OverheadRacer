import greenfoot.*;

/**
 * LinuxRacer is the player's racer. It is a subclass of class Racer,
 * so it is able to simulate its own physics.
 * 
 * @author Micah Hansonbrook & Zachary Siegel 
 * @version 0.2
 */
public class LinuxRacer extends Racer
{
    private double minimumSpeed = 1.2;
    /**
     * act - Move around and simulate physics.
     */
    public void act() {
        super.act();
        movement();
    }
    /**
     * movement - This method accepts keyboard input to drive the
     * LinuxPlayer object.
     */
    public void movement(){
        if(Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("W")){
            deltaSpeed += 0.75;
        }
        if(Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("S")){
            deltaSpeed -= 0.75;
        }
        if((Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("D"))&& 
        (deltaSpeed > minimumSpeed || deltaSpeed < -1 * minimumSpeed)){
            deltaRotation -= 0.375 - deltaSpeed/20;
        }
        if((Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("A"))&&
        (deltaSpeed > minimumSpeed || deltaSpeed < -1 * minimumSpeed)){
            deltaRotation += 0.375 - deltaSpeed/20;
        }
    }
}

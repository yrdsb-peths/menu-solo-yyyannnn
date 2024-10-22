import greenfoot.*;

public class LeftButton extends Button {
    private Runnable action;

    public LeftButton (Runnable action) {
        super(action);

        GreenfootImage image = new GreenfootImage("images/leftButton.png");
        setImage(image);
    }

}
import greenfoot.*;

public class leftButton extends Button {
    private Runnable action;

    public leftButton (Runnable action) {
        super(action);

        GreenfootImage image = new GreenfootImage("images/leftButton.png");
        setImage(image);
    }

}
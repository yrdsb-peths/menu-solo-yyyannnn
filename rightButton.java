import greenfoot.*;

public class rightButton extends Button {
    private Runnable action;

    public rightButton (Runnable action) {
        super(action);

        GreenfootImage image = new GreenfootImage("images/rightButton.png");
        setImage(image);
    }

}
import greenfoot.*;

public class RightButton extends Button {
    private Runnable action;

    public RightButton (Runnable action) {
        super(action);

        GreenfootImage image = new GreenfootImage("images/rightButton.png");
        setImage(image);
    }

}

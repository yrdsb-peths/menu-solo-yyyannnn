import greenfoot.*;

public class startButton extends Button {
    private Runnable action;

    public startButton (Runnable action) {
        super(action);

        GreenfootImage image = new GreenfootImage("images/startButton.png");
        setImage(image);
    }

}
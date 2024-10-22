import greenfoot.*;

public class StarButton extends Button {
    private Runnable action;

    public StarButton (Runnable action) {
        super(action);

        GreenfootImage image = new GreenfootImage("images/starButton.png");
        setImage(image);
    }

}
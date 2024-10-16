import greenfoot.*;

public class selectButton extends Button {
    private Runnable action;

    public selectButton (Runnable action) {
        super(action);

        GreenfootImage image = new GreenfootImage("images/selectButton.png");
        setImage(image);
    }

}
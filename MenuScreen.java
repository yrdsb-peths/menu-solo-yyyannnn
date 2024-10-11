import greenfoot.*;

public class MenuScreen extends World {
    public MenuScreen() {
        super(600, 400, 1);

        //Button button = new Button(this::goInstructions);
        Button button = new Button(this::goInstructions);
        addObject(button, 300, 340);
    }

    public void goInstructions() {
        //Greenfoot.setWorld(new IntructionScreen(this));
    }
}
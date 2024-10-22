import greenfoot.*;

public class MenuScreen extends World {
    
    Face face;

    public MenuScreen() {
        super(600, 400, 1);

        Button selectButton = new SelectButton(this::changeFace);
        addObject(selectButton, 300, 150);

        Button startButton = new StartButton(this::goInstructions);
        addObject(startButton, 300, 340);

        Button starButton = new StarButton(this::goHighScore);
        addObject(starButton, 50, 50);

        face = new Face();
        addObject(face, 300, 100);
    }

    public void goHighScore() {
        Greenfoot.setWorld(new HighScoreScreen());
    }

    public void goInstructions() {
        Greenfoot.setWorld(new InstructionScreen());
    }

    public void changeFace() {
        face.changeImage();
    }
}
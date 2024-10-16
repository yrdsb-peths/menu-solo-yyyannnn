import greenfoot.*;

public class MenuScreen extends World {
    
    Face face;

    public MenuScreen() {
        super(600, 400, 1);

        Button selectbutton = new selectButton(this::changeFace);
        addObject(selectbutton, 300, 150);

        Button startbutton = new startButton(this::goInstructions);
        addObject(startbutton, 300, 340);

        face = new Face();
        addObject(face, 300, 100);
    }

    public void goInstructions() {
        Greenfoot.setWorld(new InstructionScreen());
    }

    public void changeFace() {
        face.changeImage();
    }
}
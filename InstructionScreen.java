import greenfoot.*;

public class InstructionScreen extends World {
    public InstructionScreen() {
        super(600, 400, 1);

        Label intruction1 = new Label("Screen 1", 50);
        addObject(intruction1, 300, 200);

        Button leftbutton = new leftButton(this::setScreen);
        addObject(leftbutton, 50, 300);

        Button rightbutton = new rightButton(this::setScreen);
        addObject(rightbutton, 550, 300);

    }

    public void setScreen() {

    }

    


}
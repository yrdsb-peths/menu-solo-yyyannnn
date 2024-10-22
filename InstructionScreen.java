import greenfoot.*;

public class InstructionScreen extends World {
    
    int numScreen = 0;
    Label instruction;
    String[] screen;

    public InstructionScreen() {
        super(600, 400, 1);

        createScreens();

        instruction = new Label(screen[numScreen], 50);
        addObject(instruction, 300, 200);

        Button leftbutton = new LeftButton(this::leftScreen);
        addObject(leftbutton, 50, 300);

        Button rightbutton = new RightButton(this::rightScreen);
        addObject(rightbutton, 550, 300);

    }

    public void act() {
        setScreen();
    }

    public void leftScreen() {
        numScreen--;
    }

    public void rightScreen() {
        numScreen++;
    }

    public void createScreens() {
        screen = new String[4];

        for (int i = 0 ; i < screen.length ; i ++) {
            screen[i] = "Screen " + (i+1);
        }
    }

    public void setScreen() {
        if(numScreen < 0) {
            Greenfoot.setWorld(new MenuScreen());
        } else if(numScreen <= 3) {
            instruction.setValue(screen[numScreen]);
        } else if(numScreen > 3) {
            instruction.setValue(screen[0]);
            numScreen = 0;
        }
    }

    


}
import java.util.HashMap;
import greenfoot.*;

public class HighScoreScreen extends World {
    
    HashMap<String, Integer> map = new HashMap<>();

    public HighScoreScreen(){
        super(600, 400, 1);

        Label highScorelabel = new Label("High Scores", 100);
        addObject(highScorelabel, 300, 100); 

        Button leftbutton = new LeftButton(this::goBack);
        addObject(leftbutton, 50, 300);

        map.put("Jesus", 100);
        map.put("Paul", 90);
        map.put("Moses", 80);

        displayScore();
    }

    public void goBack() {
        Greenfoot.setWorld(new MenuScreen());
    }

    public void displayScore() {
        int y = 200;

        for (String key : map.keySet()) { 
            int value = map.get(key); 

            Label score = new Label(key + ": " + value, 30);
            addObject(score, 300, y); 

            y += 50;
        }
            
    }
}

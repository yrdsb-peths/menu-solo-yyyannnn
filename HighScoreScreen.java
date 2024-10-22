import java.util.HashMap;
import greenfoot.*;

public class HighScoreScreen extends World {
    
    HashMap<String, Integer> map = new HashMap<>();

    public HighScoreScreen(){
        super(600, 400, 1);

        Label highScorelabel = new Label("High Scores", 100);
            addObject(highScorelabel, 300, 100); 

        map.put("Jesus", 100);
        map.put("Paul", 90);
        map.put("Moses", 80);

        displayScore();
    }

    public void displayScore() {
        int y = 200;

        for (String key : map.keySet()) { 
            int value = map.get(key); 

            Label label = new Label(key + ": " + value, 30);
            addObject(label, 300, y); 

            y += 50;
        }
            
    }
}

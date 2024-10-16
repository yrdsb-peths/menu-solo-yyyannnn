import greenfoot.*;

public class Face extends Actor {

    GreenfootImage[] image = new GreenfootImage[4];
    int imageIndex = 0;

    public Face() {
        for(int i = 0;  i < image.length; i++)
        {
            image[i] = new GreenfootImage("images/face" + i + ".png");
        }

        setImage(image[0]);
    }

    public void changeImage(){
        if(imageIndex < 0) {
            imageIndex = 3;
            setImage(image[imageIndex]);

        } else if(imageIndex > 3) {
            imageIndex = 0;
            setImage(image[imageIndex]);
        } else {
            setImage(image[imageIndex]);
            imageIndex = (imageIndex + 1) % image.length;
        }
    }
}
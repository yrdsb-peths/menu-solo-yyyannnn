import greenfoot.*;

public class Face extends Actor {

    GreenfootImage[] image = new GreenfootImage[4];
    int imageIndex = 0;
    Queue<GreenfootImage> queue = new Queue<>();

    public Face() {
        for(int i = 0;  i < image.length; i++)
        {
            image[i] = new GreenfootImage("images/face" + i + ".png");
            queue.enqueue(image[i]);
        }

        setImage(image[0]);

    }

    public void changeImage() {
        if(!queue.isEmpty()) {
           setImage(queue.dequeue());
           queue.enqueue(image[imageIndex]);
           imageIndex = (imageIndex + 1) % image.length;
        }
    }

    // public void changeImage(){
    //     if(imageIndex < 0) {
    //         imageIndex = 3;
    //         setImage(image[imageIndex]);

    //     } else if(imageIndex > 3) {
    //         imageIndex = 0;
    //         setImage(image[imageIndex]);
    //     } else {
    //         setImage(image[imageIndex]);
    //         imageIndex = (imageIndex + 1) % image.length;
    //     }
    // }
}
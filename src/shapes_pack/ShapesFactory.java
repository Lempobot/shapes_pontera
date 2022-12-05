package shapes_pack;

import java.util.Random;

public class ShapesFactory {
    private Random random = new Random();
    public Shape nextShape(){
        switch (random.nextInt(3)){
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Rectangle();
        }
    }
}

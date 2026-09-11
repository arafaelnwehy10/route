package Day6;

import Day4.Rectangle;

public class Square extends Rectangle {

    @Override
    public double calculatePerimeter() {
        return length*4;
    }

}

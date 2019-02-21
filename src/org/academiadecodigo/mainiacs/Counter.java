package org.academiadecodigo.mainiacs;

import org.academiadecodigo.simplegraphics.graphics.Text;

public class Counter extends Text {
    private int pointsNumber = 0;

    public Counter(){
        super(700,50,"0");
    }

    public int getPoints() {
        return pointsNumber;
    }

    public void increase() {
        pointsNumber += 50;
        setText();
    }

    public void decrease() {
        if (pointsNumber == 0) {
            return;
        } else {
            pointsNumber -= 10;
            setText();
        }
    }

    public void setText() {
        super.setText((((Integer)pointsNumber).toString()));
    }



}

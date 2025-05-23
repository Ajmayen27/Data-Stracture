package Facade_Design_pattern;

public class shapeMaker {

    private circle drawCircle;
    private square drawSquare;
    private rectangle drawRectangle;

    public shapeMaker(circle drawCircle, square drawSquare, rectangle drawRectangle) {
        this.drawCircle = drawCircle;
        this.drawSquare = drawSquare;
        this.drawRectangle = drawRectangle;
    }

    public shapeMaker(){
        drawCircle.draw();
        drawSquare.draw();
        drawRectangle.draw();
    }

}

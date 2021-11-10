package Bai6.PointAndMoveablePoint;

public class MoveablePoint extends Point{
    private float xSpeed ;
    private float ySpeed ;

    public MoveablePoint(){};

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        return new float[]{this.getxSpeed(),this.getySpeed()};
    }

    @Override
    public String toString(){
        return "X :"+this.getX()+" Y "+this.getY()+
                "X speed :"+this.getxSpeed()+" Y speed :"+this.getySpeed();
    }
}

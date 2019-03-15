package homework2;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x1, int y1, int width, int height) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x1+width;
        this.y2 = y1+height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth(){
        return (x2-x1);
    }

    public int getHeight(){
        return (y2-y1);
    }

    public boolean collides(Ball ball) {
        boolean check = true;
        if (((ball.getX()-ball.getRadius())<this.x1)||((ball.getX()+ball.getRadius())>this.x2)
                ||((ball.getY()-ball.getRadius())<this.y1)||((ball.getY()+ball.getRadius())<this.x1)){
            check=false;}

        return check;
    }

    @Override
    public String toString() {
        return "Container[(" + x1 +"," + y1 + "),(" + x2 +"," + y2 +")]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Container)){return false;}

        Container container = (Container) o;

        return container.x1 == this.x1 && container.x2 == this.x2 && container.y1 == this.y1 && container.y2 == this.y2;
    }

    @Override
    public int hashCode() {
        int hashcode = 17;
        hashcode = 31*hashcode +this.x1;
        hashcode = 31 * hashcode + this.y1;
        hashcode = 31 * hashcode + this.x2;
        hashcode = 31 * hashcode + this.y2;
        return hashcode;
    }
}

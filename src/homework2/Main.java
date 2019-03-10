package homework2;

public class Main {

    public static void main(String[] args){

       /* MyComplex comp1 = new MyComplex(-10,-4);
        MyComplex comp2 = new MyComplex(8,1);
        comp1.multiply(comp2);
        MyComplex comp3 = comp1.subtractNew(comp2);
        System.out.println(comp1.toString());*/
        /*
       Ball ball1 = new Ball((float)0.5,(float)8,1,10,0);
       System.out.println(ball1.toString());
       Container box=new Container(0,0,20,10);
       System.out.println("Is Ball in the container?: "+box.collides(ball1));

       ball1.move();
       System.out.println(ball1.toString());
       System.out.println("Is Ball in the container?: "+box.collides(ball1));

       ball1.setxDelta(5);
       ball1.move();
       System.out.println(ball1.toString());
       System.out.println("Is Ball in the container?: "+box.collides(ball1));

       ball1.setyDelta(3);
       ball1.move();
       System.out.println(ball1.toString());
       System.out.println("Is Ball in the container?: "+box.collides(ball1));

       ball1.reflectHorizontal();
       ball1.reflectVertical();
       ball1.move();
       System.out.println(ball1.toString());
       System.out.println("Is Ball in the container?: "+box.collides(ball1));
        */

        double[] ex1 = {3,2,1};


        MyPolynomial mp1 = new MyPolynomial(ex1);
        MyPolynomial mp2 = new MyPolynomial(ex1);
        MyPolynomial mp3 = mp1.multiply(mp2);

        System.out.println(mp1.evaluate(0));
        System.out.println(mp3.toString());
        System.out.println(mp1.evaluate(-1));

    }
}

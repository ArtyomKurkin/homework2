package homework2;

public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double real,double imag){
        this.real=real;
        this.imag=imag;
    }

    @Override
    public String toString() {
        return "(" +real +"+(" + imag +
                "i))";
    }

    public boolean isReal(){
        boolean check = true;
        if (this.real==0){
            check = false;
        }
        return check;
    }

    public boolean isImaginary(){
        boolean check = true;
        if (this.imag==0){
            check = false;
        }
        return check;
    }

    public boolean equals(double real, double imag){
        boolean check = false;
            if ((this.real==real)&&(this.imag==imag)) {
                check = true;
            }
        return check;
    }

    public boolean equals(MyComplex another){
        boolean check = false;
        if ((this.real==another.real)&&(this.imag==another.imag)) {
            check = true;
        }
        return check;
    }

    public double magnitude(){
        return Math.sqrt(Math.pow(this.real,2)+Math.pow(this.imag,2));
    }

    public double argument(){
        return Math.atan2(this.imag,this.real);
    }

    public MyComplex add(MyComplex right){
        this.real+=right.real;
        this.imag+=right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right){
        MyComplex complex = new MyComplex();
        complex.real=this.real+right.real;
        complex.imag=this.imag+right.imag;
        return complex;
    }

    public MyComplex subtract(MyComplex right){
        this.real-=right.real;
        this.imag-=right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right){
        MyComplex complex = new MyComplex();
        complex.real=this.real-right.real;
        complex.imag=this.imag-right.imag;
        return complex;
    }

    public MyComplex multiply(MyComplex right){
        double a=this.real;
        double b=this.imag;
        this.real = a*right.real-b*right.imag;
        this.imag = a*right.imag+b*right.real;
        return this;
    }

    public MyComplex divide(MyComplex right){
        double a=this.real;
        double b=this.imag;
        this.real = (a*right.real+b*right.imag)/(Math.pow(right.real,2)+Math.pow(right.imag,2));
        this.imag = (b*right.real-a*right.imag)/(Math.pow(right.real,2)+Math.pow(right.imag,2));
        return this;
    }

    public MyComplex conjugate(){
        MyComplex complex=new MyComplex(this.real,(-1)*this.imag);
        return complex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyComplex)){return false;}

        MyComplex myComplex = (MyComplex) o;

        return (myComplex.real == this.real)&&(myComplex.imag==this.imag);
    }

    @Override
    public int hashCode() {
        int result=17;

        result = 31*result + (int)this.real;
        result = 31*result + (int)this.imag;
        return result;
    }
}

package homework2;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree(){
        return (this.coeffs.length-1);
    }
    public String toString(){
        String result="";
        for (int i=(this.coeffs.length-1);i>=0;i--){
            if (i!=0) {
                result += this.coeffs[i]+"*x^"+i+"+";
            }
            else result += this.coeffs[i];
        }
        return result;
    }

    public double evaluate(double x){
        int result = 0;
        for (int i=0;i<(this.coeffs.length);i++){
            result += this.coeffs[i]*Math.pow(x,i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right){
        int m = this.coeffs.length;
        int n = right.coeffs.length;
        if (m>=n){
            double[] newCoeffs=new double[m];

            for (int i=0;i<n;i++){
                newCoeffs[i]=this.coeffs[i]+right.coeffs[i];
            }
            MyPolynomial newPol = new MyPolynomial(newCoeffs);
            return newPol;
        }
        else{
            double[] newCoeffs=new double[n];

            for (int i=0;i<m;i++){
                newCoeffs[i]=this.coeffs[i]+right.coeffs[i];
            }
            for (int j=(m+1);j<n;j++){
                newCoeffs[j]=right.coeffs[j];
            }
            MyPolynomial newPol = new MyPolynomial(newCoeffs);
            return newPol;
        }
    }

    public MyPolynomial multiply(MyPolynomial right){
        int m = this.coeffs.length;
        int n = right.coeffs.length;
        double[] newCoeffs = new double[m+n-1];
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                newCoeffs[i+j]+=this.coeffs[i]*right.coeffs[j];
            }
        }
        MyPolynomial newPol = new MyPolynomial(newCoeffs);
        return newPol;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyPolynomial)){return false;}

        MyPolynomial mp1 = (MyPolynomial) o;

        return Arrays.equals(this.coeffs,mp1.coeffs);
    }

    @Override
    public int hashCode() {
        int hashcode = 17;
        hashcode = 31*hashcode+Arrays.hashCode(coeffs);
        return hashcode;

    }
}

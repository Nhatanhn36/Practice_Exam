package Practice_Exam;

import java.util.Scanner;

public class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex(){
        realPart = 0;
        imaginaryPart = 0;
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter real part: ");
        realPart = sc.nextDouble();
        System.out.println("Please enter imaginary part: ");
        imaginaryPart = sc.nextDouble();
    }
    public void hienthi(){
        if(imaginaryPart<0){
            System.out.println(realPart + " - " + Math.abs(imaginaryPart) + "i");
        }else {
            System.out.println(realPart + " + " + imaginaryPart + "i");
        }
    }

    public Complex Add(Complex otherNumber){
        double real = realPart + otherNumber.realPart;
        double imaginary = imaginaryPart + otherNumber.imaginaryPart;
        return new Complex(real, imaginary);
    }
    public Complex Subtract(Complex otherNumber){
        double real = realPart - otherNumber.realPart;
        double imaginary = imaginaryPart - otherNumber.imaginaryPart;
        return new Complex(real, imaginary);
    }
    public Complex Multiply(Complex otherNumber){
        double real = realPart * otherNumber.realPart - imaginaryPart * otherNumber.imaginaryPart;
        double imaginary = realPart * otherNumber.realPart + imaginaryPart * otherNumber.imaginaryPart;
        return new Complex(real, imaginary);
    }
    public Complex Divide(Complex otherNumber){
        double real = (realPart * otherNumber.realPart + imaginaryPart * otherNumber.imaginaryPart) / (otherNumber.realPart * otherNumber.realPart + otherNumber.imaginaryPart * otherNumber.imaginaryPart);
        double imaginary = (otherNumber.realPart * imaginaryPart - realPart * otherNumber.imaginaryPart) / (otherNumber.realPart * otherNumber.realPart + otherNumber.imaginaryPart * otherNumber.imaginaryPart);
        return new Complex(real, imaginary);
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double realPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public String toString() {
        String re = this.realPart+"";
        String im = "";
        if(this.imaginaryPart<0){
            im = this.imaginaryPart+"i";
        }else {
            im = "+" + this.imaginaryPart+"i";
        }
        return re+im;
    }
}

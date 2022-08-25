package day18;

public class Kare {
    private double kenar;

    public double getKenar() {
        return kenar;
    }

    public void setKenar(double kenar) {
        this.kenar = kenar;
    }

    public double alanHesapla(){
       return kenar*kenar;
    }
    double cevreHesapla(){
        return 4*kenar;
    }
}

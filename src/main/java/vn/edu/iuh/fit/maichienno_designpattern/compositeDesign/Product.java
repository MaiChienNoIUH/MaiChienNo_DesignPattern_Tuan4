package vn.edu.iuh.fit.maichienno_designpattern.compositeDesign;

public class Product implements MenuComponent{
    private String ten;
    private double gia;

    public Product(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    @Override
    public double getPrice() {
        return gia;
    }

    @Override
    public String toString() {
        return ten + " - " + gia + " VND";
    }
}

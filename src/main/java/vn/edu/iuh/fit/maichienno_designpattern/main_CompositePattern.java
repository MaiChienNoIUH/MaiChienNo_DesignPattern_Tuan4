package vn.edu.iuh.fit.maichienno_designpattern;

import vn.edu.iuh.fit.maichienno_designpattern.compositeDesign.Product;
import vn.edu.iuh.fit.maichienno_designpattern.compositeDesign.Table;

public class main_CompositePattern {
    public static void main(String[] args) {
        Product caPheDen = new Product("Cà phê đen", 25000);
        Product suaTuoi = new Product("Sữa tươi", 20000);
        Product banhMi = new Product("Bánh mì", 30000);

        Table ban1 = new Table("1");
        ban1.themSanPham(caPheDen);
        ban1.themSanPham(suaTuoi);

        Table ban2 = new Table("2");
        ban2.themSanPham(banhMi);
        ban2.themSanPham(suaTuoi);

        System.out.println(ban1);
        System.out.println(ban2);
    }
}

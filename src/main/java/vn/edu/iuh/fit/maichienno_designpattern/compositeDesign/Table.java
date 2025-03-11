package vn.edu.iuh.fit.maichienno_designpattern.compositeDesign;

import java.util.ArrayList;
import java.util.List;

public class Table implements MenuComponent{
    private List<MenuComponent> danhSachSanPham = new ArrayList<>();
    private String tenBan;

    public Table(String tenBan) {
        this.tenBan = tenBan;
    }

    public void themSanPham(MenuComponent sanPham) {
        danhSachSanPham.add(sanPham);
    }

    public void xoaSanPham(MenuComponent sanPham) {
        danhSachSanPham.remove(sanPham);
    }

    @Override
    public double getPrice() {
        double tongGia = 0;
        for (MenuComponent sanPham : danhSachSanPham) {
            tongGia += sanPham.getPrice();
        }
        return tongGia;
    }

    @Override
    public String toString() {
        return "Bàn " + tenBan + " có tổng tiền: " + getPrice() + " VND";
    }
}

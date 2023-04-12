
package cau1;

import java.util.Scanner;

public class SanPham {
    private String tensp;
    private double donGia;
    private double giamGia;
    public SanPham(){
        
    }

    public SanPham(String tensp, double donGia, double giamGia) {
        this.tensp = tensp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    
    public String getTensp() {
        return tensp;
    }
    public void setTensp(String tensp) {
        this.tensp = tensp;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getGiamGia() {
        return giamGia;
    }
    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    
    public void nhap(){
    }

    @Override
    public String toString() {
        return "SanPham{" + "tensp=" + tensp + ", donGia=" + donGia + ", giamGia=" + giamGia + '}';
    }
   
     
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai03;

/**
 *
 * @author ASUS
 */
public abstract class SinhVien {
    public String hoTen;
    
    public String nganh;

    public SinhVien(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    public abstract double getDiem();
    
    public String getHocLuc(){
        String dtb ="";
        if(getDiem()<5)
            dtb="Yeu";
        else if(getDiem()<6.5)
            dtb="Trung binh";
        else if(getDiem()<7.5)
            dtb="Kha";
        else if(getDiem()<9)
            dtb="Gioi";
        else
            dtb="Xuat sac";
        return dtb;
    }
    public void xuat(){
        System.out.println("Ho ten: "+hoTen+" - Nganh: "+nganh+" - Diem: "+getDiem()+" - Hoc Luc: "+getHocLuc());
    }
}


///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
//package Bai03;
//
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
///**
// *
// * @author ASUS
// */
//public class Program {
//    SinhVien sv = null;
//    ArrayList ds = new ArrayList<>();
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        
//        menu();
//    }
//
//    public static void menu() {
//        
//        int chon=0;
//        do {            
//            System.out.println("1.Nhap ds SV: ");
//            System.out.println("2.Xuat thong tin ds SV: ");
//            System.out.println("3.Xuat ds SV co hoc luc Gioi: ");
//            System.out.println("4.Sap xep ds SV theo diem: ");
//            System.out.println("5.Thoat ");
//            switch (chon) {
//                case 1:
//                    nhapSV();
//                    break;
//                case 2:
//                    xuatDS();
//                    break;
//                case 3:
//                    xuatSVGioi();
//                    break;
//                case 4:
//                    sapXep();
//                    break;
//                default:
//                    System.out.println("Nhap lai");
//                    break;
//            }
//        } while (chon!=5);
//    }
//
//    public static void nhapSV() {
//        System.out.println("Thuc hien nhap: ");
//        
//       // String chon ;
//        String tiepTuc = "y";
//        Scanner sc = new Scanner(System.in);
//        do {            
//            System.out.println("Cho biet loai SV (IT - Biz): ");
//            String chon=sc.nextLine();
//            if(chon.equalsIgnoreCase("y")){
//                //Nhap thong tin cho SV IT
//                System.out.println("Ho ten SV: ");
//                String hoTen = sc.nextLine();
//                System.out.println("Diem JAVA: ");
//                double java = sc.nextDouble();
//                System.out.println("Diem CSS: ");
//                double css = sc.nextDouble();
//                System.out.println("Diem HTML: ");
//                double html = sc.nextDouble();
//                //Tao doi tuong SV IT
//                sv = new SinhVienIT(hoTen, java, css, html, hoTen);   
//                tiepTuc =sc.nextLine();
//            }else if(chon.equalsIgnoreCase("y")){
//                //Nhap thong tin cho SV Biz
//                System.out.println("Ho ten SV: ");
//                String hoTen = sc.nextLine();
//                System.out.println("Diem Marketing: ");
//                double marketing = sc.nextDouble();
//                System.out.println("Diem Sales: ");
//                double sales =sc.nextDouble();
//                //Tao doi tuong SV Biz
//                sv = new SinhVienIT(hoTen, marketing, sales, hoTen);
//            }
//            //Them SV vao DS
//            if(sv!= null)
//                ds.add(sv);
//            System.out.println("Thuc hien tiep khong: ");
//        } while (tiepTuc.equalsIgnoreCase("y"));
//    }
//    public static void xuatDS() {
//
//        System.out.println("Thuc hien hien xuat toan bo danh sach sinh vien: ");
//        for (SinhVien sv : ds) {
//            sv.xuat();
//        }
//    }
//
//    public static void xuatSVGioi() {
//        System.out.println("thuc hien xuat sinh vien hoc luc gioi: ");
//        for (SinhVien sv : ds) {
//            if (sv.getDiem() >= 7.5 && sv.getDiem() < 9) {
//                sv.xuat();
//            }
//        }
//    }
//
//    public static void sapXep() {
//        System.out.println("thuc hien sap xep: ");
//
//        Comparator<SinhVien> cmp = new Comparator<SinhVien>() {
//            @Override
//            public int compare(SinhVien sv1, SinhVien sv2) {
//                return Double.compare(sv1.getDiem(), sv2.getDiem());
//            }
//        };
//
//        Collections.sort(ds, cmp);
//        sv.xuat();
//    }
//    
//}

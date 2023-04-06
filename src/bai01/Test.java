package bai01;

import java.util.List;

public class Test {
	public static void main(String[] args) {
		QuanLyDSNhanVien dsNhanVien = new QuanLyDSNhanVien();
		
		dsNhanVien.addNV(new NhanVien("Truong Dai Loc", "Ban Chai")); // 0
		dsNhanVien.addNV(new NhanVien("Truong Tan Nghia", "Nuoc rua chen")); // 1
		dsNhanVien.addNV(new NhanVien("Truong Tan Nghia", " Chan Men"));
		dsNhanVien.addNV(new NhanVien("Luu Cong Nhat Hoa", "Asus tram cu"));
		dsNhanVien.addNV(new NhanVien("Truong Dai Loc", "rtx 3090"));
		System.out.println(dsNhanVien);
		
		
		NhanVien nvDcTangQua = dsNhanVien.ramdomGift();
		System.out.println("Nguoi may man la:\n" + nvDcTangQua);
		
		System.out.println("\nTen duoc dung nhieu nhat la : \n" + dsNhanVien.findMostUsedName());
	}
}

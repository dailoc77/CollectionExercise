package bai01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class QuanLyDSNhanVien {
	private Set<NhanVien> ds;

	public QuanLyDSNhanVien() {
		ds = new HashSet<>();
	}

	public Set<NhanVien> getDs() {
		return ds;
	}

	public boolean addNV(NhanVien nhanVien) {
		return ds.add(nhanVien);
	}

	public NhanVien ramdomGift() {
		NhanVien[] nvCanThe = ds.toArray(new NhanVien[ds.size()]);

		Random random = new Random();

		int giftedIndex = random.nextInt(ds.size());

		return nvCanThe[giftedIndex];
	}

	public String findMostUsedName() {
		List<NhanVien> list = new ArrayList<>();
		for (NhanVien nhanVien : ds) {
			list.add(nhanVien);
		}
		// {Nguyen Nhat Tung , Luu Cong Nhat Hoa , Truong Tan Nghia , Truong Dai Loc ,Truong Tan Nghia}
		int maxcount = 0;
		String most_frequent_name = null;
		for (int i = 0; i < list.size(); i++) {
	        int count = 0;
	        for (int j = 0; j < list.size(); j++) {
	            if (list.get(i).getName().equals(list.get(j).getName()))
	                count++;
	        }
	  
	        if (count > maxcount) {
	            maxcount = count;
	            most_frequent_name = list.get(i).getName();
	        }
	    }

		return most_frequent_name;
	}

	@Override
	public String toString() {
		String s = "";
		for (NhanVien nhanVien : ds) {
			s += nhanVien + "\n";
		}
		return s;
	}

}

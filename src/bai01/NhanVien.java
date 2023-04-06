package bai01;

import java.util.Objects;

public class NhanVien {
	private String name;
	private String productName;

	public NhanVien(String name , String productName) {
		this.name = name;
		this.productName = productName;
	}

	public String getName() {
		return name;
	}
	
	public String getProductName() {
		return productName;
	}

	@Override
	public String toString() {
		return String.format("Ten nhan vien : %s \n Ten san pham : %s", name,productName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, productName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanVien other = (NhanVien) obj;
		return Objects.equals(name, other.name) && Objects.equals(productName, other.productName);
	}
	
	

}

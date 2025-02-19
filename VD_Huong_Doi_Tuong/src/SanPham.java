
public class SanPham {
	// Định nghĩa các thuộc tính
	int maSp;
	String tenSP;
	String loaiSP;
	String anhSP;
	
	public SanPham() {
		super();
	}

	public SanPham(int maSp, String tenSP, String loaiSP, String anhSP) {
		super();
		this.maSp = maSp;
		this.tenSP = tenSP;
		this.loaiSP = loaiSP;
		this.anhSP = anhSP;
	}

	public int getMaSp() {
		return maSp;
	}

	public void setMaSp(int maSp) {
		this.maSp = maSp;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public String getLoaiSP() {
		return loaiSP;
	}

	public void setLoaiSP(String loaiSP) {
		this.loaiSP = loaiSP;
	}

	public String getAnhSP() {
		return anhSP;
	}

	public void setAnhSP(String anhSP) {
		this.anhSP = anhSP;
	}

	@Override
	public String toString() {
		return " [Mã Sp=" + maSp + ", Tên SP=" + tenSP + ", Loại SP=" + loaiSP + "]";
	}
	
}

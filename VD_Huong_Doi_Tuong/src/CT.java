
public class CT {

	public static void main(String[] args) {
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham(2, "Ga ran", "Đồ ăn nhanh", "gr.jpg");
		sp1.setMaSp(1);
		sp1.setTenSP("Pessi");
		sp1.setLoaiSP("Nước giải khác");
		sp1.setAnhSP("ps.jpg");
		
		// In ra thông tin 2sp
		String thongtinSP1 = sp1.toString();
		String thongtinSP2 = "Mã SP2 là " + sp2.getMaSp();
			   thongtinSP2 += "Tên SP2 là " + sp2.getTenSP();
			   
		System.out.println(thongtinSP1);
		System.out.println(thongtinSP2);
	}

}

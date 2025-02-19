import java.util.ArrayList;

public class CT1 {

	public static void main(String[] args) {

		// Khai báo danh sách sản phẩm
		ArrayList<SanPham> dsSanPham;
		
		// Xin mới
		dsSanPham = new ArrayList<SanPham>();
		
		// Nhặp 3 Sp
//		SanPham sp1 = new SanPham(0, "Cơm", "Đồ ăn", null );
		SanPham sp2 = new SanPham(1, "Phở", "Đồ ăn", null);
		SanPham sp3 = new SanPham(2, "Nước lọc", "Đồ uống", null);
		
		// Thêm vào ArrayList
		dsSanPham.add( new SanPham(0, "Cơm", "Đồ ăn", null));
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		
//		for (SanPham x: dsSanPham)
//			System.out.println(x.toString());
		
		for (int i = 0 ; i < dsSanPham.size() ; i++) {
			SanPham sp = dsSanPham.get(i);
			System.out.println(sp.toString());
		}
			
	} 

}

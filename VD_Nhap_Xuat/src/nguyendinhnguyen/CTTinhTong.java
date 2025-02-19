package nguyendinhnguyen;

import java.util.Scanner;

public class CTTinhTong {

	public static void main(String[] args) {
		
		// In ra 1 dòng tiêu đề App
		System.out.print("CT Tính tổng \n");
		
		// Chuẩn bị việc nhập
		Scanner banphim = new Scanner(System.in);
		
		// In dòng hướng dẫn nhập A
        System.out.println("Nhập a: ");
        double a = banphim.nextDouble();
        
		// In dòng hướng dẫn nhập b
        System.out.println("Nhập b: ");
        double b = banphim.nextDouble();
        
        // Tính tổng
        double t = a + b;
        
        System.out.println("Tổng là: " + t);
	}

}

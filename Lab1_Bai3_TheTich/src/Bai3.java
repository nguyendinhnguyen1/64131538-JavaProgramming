/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Scanner scanner = new Scanner(System.in);
	        
	        // Nhập cạnh của khối lập phương
	        System.out.print("Nhập cạnh của khối lập phương: ");
	        double canh = scanner.nextDouble();
	        
	        // Tính thể tích của khối lập phương
	        double V = canh * canh * canh;
	        
	        // Xuất kết quả
	        System.out.println("Thể tích của khối lập phương là: " + V);
	        
	        scanner.close();

	}

}

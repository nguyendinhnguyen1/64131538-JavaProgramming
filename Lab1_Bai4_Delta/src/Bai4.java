/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        
	        // Nhập các hệ số của phương trình bậc 2
	        System.out.print("Nhập các hệ số a b c: ");
	        double a = scanner.nextDouble();	        
	        double b = scanner.nextDouble();	        
	        double c = scanner.nextDouble();
	        
	        // Tính delta
	        double delta = (b * b) - (4 * a * c);
	        
	     // Xuất căn delta
	        if (delta > 0) {
	            System.out.println("Căn delta: " + Math.sqrt(delta));
	        } else if (delta == 0) {
	            System.out.println("Căn delta: 0");
	        } else {
	            System.out.println("Căn delta là số phức: " + Math.sqrt(-delta) + "i");
	        }
       
	        scanner.close();

	}

}

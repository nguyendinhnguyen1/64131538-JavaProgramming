/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hai cạnh của hình chữ nhật
        System.out.print("Nhập cạnh thứ nhất của hình chữ nhật: ");
        double canh1 = scanner.nextDouble();
        
        System.out.print("Nhập cạnh thứ hai của hình chữ nhật: ");
        double canh2 = scanner.nextDouble();
        
        // Tính chu vi và diện tích
        double chuVi = 2 * (canh1 + canh2);
        double dienTich = canh1 * canh2;
        double canhNho = Math.min(canh1, canh2);
        
        // Xuất kết quả ra màn hình
        System.out.println("\nThông tin hình chữ nhật:");
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Diện tích: " + dienTich);
        System.out.println("Cạnh nhỏ hơn: " + canhNho);
        
        scanner.close();

	}

}

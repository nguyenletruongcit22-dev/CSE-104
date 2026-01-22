package Lab2;

import java.util.Scanner;

public class eiu_cubes2 {

	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        // Đọc số lượng phần tử k
	        int k = sc.nextInt();

	        for (int i = 0; i < k; i++) {
	            long n = sc.nextLong(); // Input n lên tới 10^18 nên dùng long

	            // Binary Search tìm chiều cao h
	            long left = 0;
	            long right = 2000000; // Giới hạn an toàn để không bị tràn số long
	            long ans = 0;

	            while (left <= right) {
	                long mid = left + (right - left) / 2;
	                
	                // Công thức tính số gạch: mid * (mid + 1) * (mid + 2) / 6
	                long needed = mid * (mid + 1) * (mid + 2) / 6;

	                if (needed <= n) {
	                    ans = mid;      // Thỏa mãn, lưu kết quả
	                    left = mid + 1; // Thử tìm số lớn hơn
	                } else {
	                    right = mid - 1; // Cần quá nhiều gạch, giảm xuống
	                }
	            }

	            // In kết quả trực tiếp ra màn hình
	            System.out.print(ans);

	            // Nếu không phải là số cuối cùng thì in thêm dấu cách
	            if (i < k - 1) {
	                System.out.print(" ");
	            }
	        }
	        
	        // Xuống dòng khi kết thúc (để đẹp output)
	        System.out.println();
	    }
	}


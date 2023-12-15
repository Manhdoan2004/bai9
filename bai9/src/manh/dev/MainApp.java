package manh.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 9.1
	 Scanner sc = new Scanner(System.in);
	 System.out.print("a"); 
	    int a = sc.nextInt();
		if (a < 0) { 
			System.out.println("so nay la so nguyen am");
		}else if( a > 0){
			System.out.println(" so nay la so nguyen duong");
		}else {
			System.out.println("so nay khong la nguyen duong cung khong la nguyen am");
		}
		*/
		/**
		 * 9.2		
	Scanner sc = new Scanner(System.in);
	System.out.print("a"); 
	    int a = sc.nextInt();
		if(a % 3 == 0 && a % 5 == 0) {
			System.out.println("So nay chia het cho ca 3 va 5");
		}
		else if(a % 3 == 0) {
			System.out.println("So nay chia het cho 3");
		}else if(a % 5 == 0) {
			System.out.println("So nay chia het cho ca 5");
		}else {
			System.out.println("So nay khong chia het cho ca 3 va 5");
		}
		*/
		/**
		 * 9.3
		
		if(a == 1 ||a == 3||a == 5||a == 7||a == 8||a == 10||a == 12 ) {
			System.out.println("Thang nay co 31 ngay");
		}else if(a == 4||a == 6||a == 9||a == 11) {
			System.out.println("Thang nay co 30 ngay");
		}else if(a == 2) {
			System.out.println("Thang nay co 28 hoac 29 ngay");
		}else {
			System.out.println("Khong co thang nay");
		}
		*/
		/**
		 * 9.4
		 	
	        Scanner sc = new Scanner(System.in);
		 System.out.println("Nhập hệ số bậc 2, a = ");
	        float a ;
	        a = sc.nextFloat();
	        System.out.println("Nhập hệ số bậc 1, b = ");
	        float b ;
	        b = sc.nextFloat();
	        System.out.println("Nhập hằng số tự do, c = ");
	        float c ; 
	        c = sc.nextFloat();
	        if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phương trình vô nghiệm!");
	            } else {
	                System.out.println("Phương trình có một nghiệm: "
	                        + "x = " + (-c / b));
	            }
	            return;
	        }
	        // tính delta
	        float delta = b*b - 4*a*c;
	        float x1;
	        float x2;
	        // tính nghiệm
	        if (delta > 0) {
	            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
	            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
	            System.out.println("Phương trình có 2 nghiệm là: "
	                    + "x1 = " + x1 + " và x2 = " + x2);
	        } else if (delta == 0) {
	            x1 = (-b / (2 * a));
	            System.out.println("Phương trình có nghiệm kép: "
	                    + "x1 = x2 = " + x1);
	        } else {
	            System.out.println("Phương trình vô nghiệm!");
	        }
	        */
		/**
	        Scanner sc = new Scanner(System.in);
	        System.out.print("a"); 
	        int a = sc.nextInt();
	         System.out.print("b"); 
	         int b = sc.nextInt(); 
	        System.out.print("c"); 
	        int c = sc.nextInt(); 
	        if (a + b > c || a + c > b || b+ c > a) { 
	        System.out.println(" a b c la 3 canh tam giac "); 
	        } else {
	        System.out.println("a b c khong la 3 canh tam giac"); }
	         */
	}

}

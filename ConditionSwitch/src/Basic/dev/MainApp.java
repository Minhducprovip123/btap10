package Basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		btap1
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Nhap mot so nguyen: ");
//		int n = sc.nextInt();
//
//		switch (kiemTraSoNguyen(n)) {
//		case 1:
//			System.out.println(n + " la so nguyen duong");
//			break;
//		case -1:
//			System.out.println(n + " la so nguyen am");
//			break;
//		default:
//			System.out.println(n + " khong phai la so nguyen duong hay am");
//			break;
//		}
//		sc.close();
//	}
//
//	static int kiemTraSoNguyen(int n) {
//		if (n > 0) {
//			return 1;
//		} else if (n < 0) {
//			return -1;
//		} else {
//			return 0;
//		}
//	}
//
//
//
//	}
//		bt2
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Nhap mot so nguyen: ");
//		int n = sc.nextInt();
//
//		int layDu = n % 3;
//		switch (layDu) {
//		case 0:
//			System.out.println(n + " chia het cho 3");
//			break;
//		default:
//			layDu = n % 5;
//			switch (layDu) {
//			case 0:
//				System.out.println(n + " chia het cho 5");
//				break;
//			default:
//				System.out.println(n + " khong chia het cho 3 va 5");
//				break;
//			}
//			break;
//		}
//
//		sc.close();
//
//	}
//btap3
//		
//btap4
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Nhap cac he so cua phuong trinh bac 2");
//		System.out.print("Nhap a: ");
//		double a = sc.nextDouble();
//		System.out.print("Nhap b: ");
//		double b = sc.nextDouble();
//		System.out.print("Nhap c: ");
//		double c = sc.nextDouble();
//
//		double delta = b * b - 4 * a * c;
//		switch (kiemTraDelta(delta)) {
//		case 1:
//			System.out.println("Phuong trinh co 2 nghiem phan biet");
//			break;
//		case 0:
//			System.out.println("Phuong trinh co nghiem kep");
//			break;
//		default:
//			System.out.println("Phuong trinh vo nghiem");
//			break;
//		}
//
//		sc.close();
//	}
//
//	static int kiemTraDelta(double delta) {
//		if (delta > 0) {
//			return 1;
//		} else if (delta == 0) {
//			return 0;
//		} else {
//			return -1;
//		}
//
//	}
//
//}
//btap5
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Nhập cạnh a: ");
//		int a = sc.nextInt();
//
//		System.out.print("Nhập cạnh b: ");
//		int b = sc.nextInt();
//
//		System.out.print("Nhập cạnh c: ");
//		int c = sc.nextInt();
//
//		if (a <= 0 || b <= 0 || c <= 0) {
//			System.out.println("Cạnh của tam giác phải là số dương");
//		} else if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
//			System.out.println("3 cạnh không lập thành tam giác");
//		} else {
//			System.out.println("3 cạnh lập thành tam giác");
//		}
//
//	}
//
//}

package Managerment;

import java.util.Scanner;

public class EmployeeFulltime extends Employee {
	private int numberWorkday;

	public EmployeeFulltime(int id, String name, String numberPhone, String address, int numberWorkday) {
		super(id, name, numberPhone, address);
		this.numberWorkday = numberWorkday;
	}

	public int getNumberWorkday() {
		return numberWorkday;
	}

	public void setNumberWorkday(int numberWorkday) {
		this.numberWorkday = numberWorkday;
	}

	public double getSalary() {
		return numberWorkday * 1500000;
	}

	public EmployeeFulltime() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EmployeeFulltime [getId()=" + getId() + ", getName()=" + getName() + ", getNumberPhone()="
				+ getNumberPhone() + ", getAddress()=" + getAddress() + ", getNumberWorkday()=" + getNumberWorkday()
				+ ", getSalary()=" + getSalary() + "]";
	}

	public void addEFT() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Nhap id: ");
				setId(Integer.parseInt(sc.nextLine()));
				System.out.println("Nhap ten: ");
				setName(sc.nextLine());
				System.out.println("Nhap so dien thoai: ");
				setNumberPhone(sc.nextLine());
				System.out.println("Nhap dia chi: ");
				setAddress(sc.nextLine());
				System.out.println("Nhap so ngay lam: ");
				setNumberWorkday(Integer.parseInt(sc.nextLine()));
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("OOPs !! Vui lòng nhập lại!!");
				continue;
			}
		}

	}

}

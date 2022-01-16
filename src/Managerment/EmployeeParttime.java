package Managerment;

import java.util.Scanner;

public class EmployeeParttime extends Employee {
	private int timeHours;

	public EmployeeParttime(int id, String name, String numberPhone, String address, int timeHours) {
		super(id, name, numberPhone, address);
		this.timeHours = timeHours;
	}

	public int getTimeHours() {
		return timeHours;
	}

	public void setTimeHours(int timeHours) {
		this.timeHours = timeHours;
	}

	public EmployeeParttime() {
		// TODO Auto-generated constructor stub
	}

	public double getSalary() {
		return timeHours * 120000;
	}

	@Override
	public String toString() {
		return "EmployeeParttime [getId()=" + getId() + ", getName()=" + getName() + ", getNumberPhone()="
				+ getNumberPhone() + ", getAddress()=" + getAddress() + ", getTimeHours()=" + getTimeHours()
				+ ", getSalary()=" + getSalary() + "]";
	}

	public void addEPT() {
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
				System.out.println("Nhap so gio lam: ");
				setTimeHours(Integer.parseInt(sc.nextLine()));
				break;
			} catch (NumberFormatException ex) {
				System.err.println("Dữ liệu không hợp lệ!!");
				continue;
			}
		}

	}

}

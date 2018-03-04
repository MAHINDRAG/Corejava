package com.app.object;

public class StudentCloning implements Cloneable{
	int rno;
	String name;
	public StudentCloning(int rno, String name) {
		super();
		this.rno = rno;
		this.name = name;
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		/**
		 * shallow Cloning
		 */
		
		StudentCloning sc1 = new StudentCloning(111, "Mahi");
		System.out.println(sc1.rno +" , "+sc1.name);
		StudentCloning sc2 = sc1;
		System.out.println(sc2.rno+","+sc2.name);
		sc2.rno=112;
		sc2.name="Girish";
		System.out.println(sc1.rno +" , "+sc1.name);
		System.out.println(sc2.rno+","+sc2.name);
		System.out.println("HashCode of S1 :"+sc1.hashCode());
		System.out.println("HashCode of S2 :"+sc2.hashCode());		
		System.out.println("********************");
				
		/**
		 * Deep Cloning
		 */
		StudentCloning sc3 = new StudentCloning(111, "Mahi");
		System.out.println(sc3.rno +" , "+sc3.name);
		StudentCloning sc4 = (StudentCloning) sc3.clone();
		System.out.println(sc4.rno+","+sc4.name);
		sc3.rno=112;
		sc3.name="Girish";
		System.out.println(sc3.rno +" , "+sc3.name);
		System.out.println(sc4.rno+","+sc4.name);
		System.out.println("HashCode of S3 :"+sc3.hashCode());
		System.out.println("HashCode of S4 :"+sc4.hashCode());
		
	}

}

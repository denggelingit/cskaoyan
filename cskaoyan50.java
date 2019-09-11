package cskaoyan;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Student {
	private String id;
	private String name;
	private double math;
	private double english;
	private double c;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getEnglish() {
		return english;
	}

	public void setEnglish(double english) {
		this.english = english;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getAverage() {
		return (this.math + this.english + this.c) / 3;
	}
}

public class cskaoyan50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner in = new java.util.Scanner(System.in);
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student student4 = new Student();
		Student student5 = new Student();

		System.out.println("请输入5个同学的信息：学生号，姓名，3门成绩:");

		System.out.print("学号:");
		student1.setId(in.next());
		System.out.print("姓名:");
		student1.setName(in.next());
		System.out.print("第" + 1 + "门课成绩:");
		student1.setMath(in.nextDouble());
		System.out.print("第" + 2 + "门课成绩:");
		student1.setEnglish(in.nextDouble());
		System.out.print("第" + 3 + "门课成绩:");
		student1.setC(in.nextDouble());

		System.out.print("学号:");
		student2.setId(in.next());
		System.out.print("姓名:");
		student2.setName(in.next());
		System.out.print("第" + 1 + "门课成绩:");
		student2.setMath(in.nextDouble());
		System.out.print("第" + 2 + "门课成绩:");
		student2.setEnglish(in.nextDouble());
		System.out.print("第" + 3 + "门课成绩:");
		student2.setC(in.nextDouble());

		System.out.print("学号:");
		student3.setId(in.next());
		System.out.print("姓名:");
		student3.setName(in.next());
		System.out.print("第" + 1 + "门课成绩:");
		student3.setMath(in.nextDouble());
		System.out.print("第" + 2 + "门课成绩:");
		student3.setEnglish(in.nextDouble());
		System.out.print("第" + 3 + "门课成绩:");
		student3.setC(in.nextDouble());

		System.out.print("学号:");
		student4.setId(in.next());
		System.out.print("姓名:");
		student4.setName(in.next());
		System.out.print("第" + 1 + "门课成绩:");
		student4.setMath(in.nextDouble());
		System.out.print("第" + 2 + "门课成绩:");
		student4.setEnglish(in.nextDouble());
		System.out.print("第" + 3 + "门课成绩:");
		student4.setC(in.nextDouble());

		System.out.print("学号:");
		student5.setId(in.next());
		System.out.print("姓名:");
		student5.setName(in.next());
		System.out.print("第" + 1 + "门课成绩:");
		student5.setMath(in.nextDouble());
		System.out.print("第" + 2 + "门课成绩:");
		student5.setEnglish(in.nextDouble());
		System.out.print("第" + 3 + "门课成绩:");
		student5.setC(in.nextDouble());

		BufferedWriter bw = null;
		try {
			FileWriter fw = new FileWriter(new File("d://student.txt"));
			bw = new BufferedWriter(fw);

			bw.write("学号:" + student1.getId() + "  ");
			bw.write("姓名:" + student1.getName() + "  ");
			bw.write("成绩:{  ");
			bw.write(student1.getMath() + "  " + student1.getEnglish() + "  " + student1.getC() + "  ");
			bw.write("} ");
			bw.write("平均成绩: " + student1.getAverage());
			bw.newLine();

			bw.write("学号:" + student2.getId() + "  ");
			bw.write("姓名:" + student2.getName() + "  ");
			bw.write("成绩:{  ");
			bw.write(student2.getMath() + "  " + student2.getEnglish() + "  " + student2.getC() + "  ");
			bw.write("} ");
			bw.write("平均成绩: " + student2.getAverage());
			bw.newLine();

			bw.write("学号:" + student3.getId() + "  ");
			bw.write("姓名:" + student3.getName() + "  ");
			bw.write("成绩:{  ");
			bw.write(student3.getMath() + "  " + student3.getEnglish() + "  " + student3.getC() + "  ");
			bw.write("} ");
			bw.write("平均成绩: " + student3.getAverage());
			bw.newLine();

			bw.write("学号:" + student4.getId() + "  ");
			bw.write("姓名:" + student4.getName() + "  ");
			bw.write("成绩:{  ");
			bw.write(student4.getMath() + "  " + student4.getEnglish() + "  " + student4.getC() + "  ");
			bw.write("} ");
			bw.write("平均成绩: " + student4.getAverage());
			bw.newLine();

			bw.write("学号:" + student1.getId() + "  ");
			bw.write("姓名:" + student1.getName() + "  ");
			bw.write("成绩:{  ");
			bw.write(student1.getMath() + "  " + student1.getEnglish() + "  " + student1.getC() + "  ");
			bw.write("} ");
			bw.write("平均成绩: " + student1.getAverage());
			bw.newLine();

			bw.write("学号:" + student5.getId() + "  ");
			bw.write("姓名:" + student5.getName() + "  ");
			bw.write("成绩:{  ");
			bw.write(student5.getMath() + "  " + student5.getEnglish() + "  " + student5.getC() + "  ");
			bw.write("} ");
			bw.write("平均成绩: " + student5.getAverage());
			bw.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		in.close();
	}
}
package day11;

public class Student {

	
	String name;
	int kar;
	int math;
	int eng;
	
	public Student()
	{
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKar() {
		return kar;
	}
	public void setKar(int kar) {
		this.kar = kar;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", kar=" + kar + ", math=" + math + ", eng=" + eng + "]";
	}
	
	
	
}

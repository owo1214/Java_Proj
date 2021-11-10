package basic_class_11.object;

import java.util.Objects;
class Student5 {
	int sno;
	String name;
	Student5 (int sno, String name){
		this.sno =sno;
		this.name=name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student5) {
			Student5 sd = (Student5)obj;
			if (sno == sd.sno && name == sd.name) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(sno,name);
	}
	
	
}

public class HashCodeExample {
	public static void main(String[] args) {
		Student5 s1 =new Student5(1, "홍길동");
		Student5 s2 =new Student5 (1, "홍길동");
		
		System.out.println(s1.hashCode());
		System.out.println(Objects.hash(s2));
		System.out.println(s1.equals(s2));
	}
}

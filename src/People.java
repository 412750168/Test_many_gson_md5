import java.util.Arrays;
import java.util.List;

public class People {

	private String name;
	private String add[];
	private int age;
	
	
	public People() {
		super();
		// TODO Auto-generated constructor stub
	}


	public People(String name, String[] add, int age) {
		super();
		this.name = name;
		this.add = add;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String[] getAdd() {
		return add;
	}


	public void setAdd(String[] add) {
		this.add = add;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "People [name=" + name + ", add=" + Arrays.toString(add) + ", age=" + age + "]";
	}


	
	
	
}

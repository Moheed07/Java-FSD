
public class Student {
	private int id;
	private String name;
	private int marks;
	
	//setter for id
	public void setid(int a) {
		if(a>0) {
			id = a;
		}
		else {
			id = 0;
			System.out.println("Id is Invalid.");
		}
	}
	
	//getter for id
	public int getid() {
		return id;
	}
	
	//setter for name
	public void setname(String x) {
		if(x == name) {
			name = x;
		}
		else {
			name = "Invalid";
			System.out.println("Name is Invalid.");
		}
	}
	
	//getter for name
	public String getname() {
		return name;
	}
	
	//setter for marks
	public void setmarks(int i) {
			if(i > marks) {
				marks = i;
			}
			else {
				marks = 10;
				System.out.println("Marks are 10.");
			}
		}
		
		//getter for marks
		public int getmarks() {
			return marks;
		}
		
		public static void main(String[] args) {
			Student ID = new Student();
			ID.getid(10);
			System.out.println("ID with this " + getid + " is Wrong");
			
		
		}

}

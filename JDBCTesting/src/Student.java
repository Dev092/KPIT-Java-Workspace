
public class Student {
	
	int Id;
	String name;
	String branch;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", branch=" + branch + "]";
	}
	
	

}

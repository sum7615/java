package co.suman.entity;

public class User {

	private int id;
	private String name;
	private long mobileNumber;
	public User() {

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + "]";
	}

}

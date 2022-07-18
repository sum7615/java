package co.suman.people;

import java.util.Objects;

public class Person {
	private String first_name, last_name;
	public Person() {
		}
	public Person(String first_name, String last_name) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	@Override
	public String toString() {
		return "Person [first_name=" + first_name + ", last_name=" + last_name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(first_name, last_name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(first_name, other.first_name) && Objects.equals(last_name, other.last_name);
	}
	

}

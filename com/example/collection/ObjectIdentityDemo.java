package com.example.collection;

public class ObjectIdentityDemo {

	public static void main(String[] args) {
		
		Course course1 = new Course(100, "Servlets");
		
		Course course2 = new Course(101, "JSP");
		Course course3 = new Course(101, "JSP");
		

		System.out.println(course1.hashCode());
		System.out.println(course2.hashCode());
		
		System.out.println(course1.equals(course2)); //content based comparasion
		System.out.println(course1 == course2); //memory reference based comparasion
		
		System.out.println(course1.toString());
		System.out.println(course2.toString());
	
		System.out.println("============================="); 
		
		System.out.println(course2.equals(course3)); 
		System.out.println(course2 == course3); 
		
		
	}

}

class Course {

	int id;
	String title;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (id != other.id)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Course(int id, String title) {
		this.id = id;
		this.title = title;
	}

}

package com.virtue.ui;

class Course implements Cloneable {
	private String course;
	private int fee;

	public Course(String course, int fee) {
		this.course = course;
		this.fee = fee;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return String.format("Test [course=%s, fee=%s]", course, fee);
	}
	
	@Override
	public Object clone(){  
	    try{  
	        return super.clone();  
	    }catch(CloneNotSupportedException excep){ 
	        return null; 
	    }
	}
}
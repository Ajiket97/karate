package com.Test;

public class CreateUser {

	private String name;
	private String job;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "CreateUser [name=" + name + ", job=" + job + "]";
	}

}

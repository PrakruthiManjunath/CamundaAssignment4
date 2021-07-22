package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seniorEmployee")
public class SeniorEmployee {
	
	@Id
	@Column(name = "seniorName")
	private String name;
	
	@Column(name = "seniorAge")
	private Integer age;
	
	@Column(name = "pensionAmount")
	private Integer pensionAmount;
	
	@Column(name = "voterId")
	private Integer voterId;
	
	@Column(name = "rationCard")
	private Integer rationCard;
	
	public SeniorEmployee()
	{
		
	}

	public SeniorEmployee(String name, Integer age, Integer pensionAmount, Integer voterId, Integer rationCard) {
		super();
		this.name = name;
		this.age = age;
		this.pensionAmount = pensionAmount;
		this.voterId = voterId;
		this.rationCard = rationCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getPensionAmount() {
		return pensionAmount;
	}

	public void setPensionAmount(Integer pensionAmount) {
		this.pensionAmount = pensionAmount;
	}

	public Integer getVoterId() {
		return voterId;
	}

	public void setVoterId(Integer voterId) {
		this.voterId = voterId;
	}

	public Integer getRationCard() {
		return rationCard;
	}

	public void setRationCard(Integer rationCard) {
		this.rationCard = rationCard;
	}

	@Override
	public String toString() {
		return "SeniorEmployee [name=" + name + ", age=" + age + ", pensionAmount=" + pensionAmount + ", voterId="
				+ voterId + ", rationCard=" + rationCard + "]";
	}

}

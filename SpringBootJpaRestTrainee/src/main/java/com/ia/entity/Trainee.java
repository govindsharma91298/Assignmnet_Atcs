package com.ia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="springbootjparesttrainee ")
public class Trainee {
	
	@Id
	@Column(name = "Tid", length = 10)
	private int tid;
	private String tname;
	private int troll;
	private int tsal;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getTroll() {
		return troll;
	}
	public void setTroll(int troll) {
		this.troll = troll;
	}
	public int getTsal() {
		return tsal;
	}
	public void setTsal(int tsal) {
		this.tsal = tsal;
	}
	public Trainee(int tid, String tname, int troll, int tsal) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.troll = troll;
		this.tsal = tsal;
	}
	
	
public Trainee() {
	
}
@Override
public String toString() {
	return "Trainee [tid=" + tid + ", tname=" + tname + ", troll=" + troll + ", tsal=" + tsal + "]";
}
}

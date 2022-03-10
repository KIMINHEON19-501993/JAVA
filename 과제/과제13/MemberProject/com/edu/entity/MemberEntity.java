package com.edu.entity;

public class MemberEntity {
	private int idx;    
    private String name;    
    private String phone;
    
    public MemberEntity() {
		// TODO 자동 생성된 생성자 스텁
	}

	public MemberEntity(int idx, String name, String phone) {
		super();
		this.idx = idx;
		this.name = name;
		this.phone = phone;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
    
    
}

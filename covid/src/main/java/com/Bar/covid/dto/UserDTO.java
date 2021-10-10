package com.Bar.covid.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
	
	private int userId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	

}

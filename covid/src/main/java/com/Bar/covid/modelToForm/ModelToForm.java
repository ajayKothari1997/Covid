package com.Bar.covid.modelToForm;

import org.springframework.stereotype.Component;

import com.Bar.covid.dto.UserDTO;
import com.Bar.covid.model.User;
@Component
public class ModelToForm {
	
	public UserDTO getUSerId(User user) {
		UserDTO u1 = new UserDTO();
		u1.setUserId(user.getUserId());
		return u1;
	}
}

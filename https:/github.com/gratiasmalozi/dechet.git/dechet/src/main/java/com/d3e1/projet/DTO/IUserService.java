package com.d3e1.projet.DTO;

import com.d3e1.projet.Model.UserEntity;

public interface IUserService {
	
	public UserEntity getUserByUsername(String username);
	
	public void deleteUser(long idUser);
	
	public UserEntity updateUser(UserEntity user);
}

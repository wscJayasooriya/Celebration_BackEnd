package com.cbl.celebration_holdings.Service;

import com.cbl.celebration_holdings.DTO.UserDTO;

import java.util.List;

public interface UserService {

    boolean saveUser(UserDTO userDTO) throws  Exception;

    boolean updateUser(UserDTO userDTO) throws  Exception;

    UserDTO searchUser(int user_Id) throws  Exception;

    List<UserDTO> getAllUsers() throws Exception;
}

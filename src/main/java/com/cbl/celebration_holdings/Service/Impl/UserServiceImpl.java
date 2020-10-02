package com.cbl.celebration_holdings.Service.Impl;

import com.cbl.celebration_holdings.DTO.UserDTO;
import com.cbl.celebration_holdings.Entity.User;
import com.cbl.celebration_holdings.Repository.UserRepository;
import com.cbl.celebration_holdings.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean saveUser(UserDTO userDTO) throws Exception {

        User user =new User(
                userDTO.getUser_name(),
                userDTO.getAddress(),
                userDTO.getTele(),
                userDTO.getNic(),
                userDTO.getCreated_date(),
                userDTO.getPassword(),
                userDTO.getCof_password(),
                userDTO.getUser_type(),
                userDTO.getStatus()
        );
        userRepository.save(user);
        return true;
    }

    @Override
    public boolean updateUser(UserDTO userDTO) throws Exception {
        Optional<User> byId = userRepository.findById(userDTO.getUser_Id());
        if (byId.isPresent()){
            User user = byId.get();
            user.setUser_Id(userDTO.getUser_Id());
            user.setUser_name(userDTO.getUser_name());
            user.setAddress(userDTO.getAddress());
            user.setTele(userDTO.getTele());
            user.setNic(userDTO.getNic());
            user.setCreated_date(userDTO.getCreated_date());
            user.setPassword(userDTO.getPassword());
            user.setCof_password(userDTO.getCof_password());
            user.setUser_type(userDTO.getUser_type());
            user.setStatus(userDTO.getStatus());

            userRepository.save(user);
        }

        return true;
    }

    @Override
    public UserDTO searchUser(int user_Id) throws Exception {

        Optional<User> byId = userRepository.findById(user_Id);
        if (byId.isPresent()){
            User user = byId.get();
            UserDTO userDTO = new UserDTO();

            userDTO.setUser_Id(user.getUser_Id());
            userDTO.setUser_name(user.getUser_name());
            userDTO.setAddress(user.getAddress());
            userDTO.setTele(user.getTele());
            userDTO.setNic(user.getNic());
            userDTO.setCreated_date(user.getCreated_date());
            userDTO.setPassword(user.getPassword());
            userDTO.setCof_password(user.getCof_password());
            userDTO.setUser_type(user.getUser_type());
            userDTO.setStatus(user.getStatus());

            return userDTO;
        }
        return null;
    }

    @Override
    public List<UserDTO> getAllUsers() throws Exception {

        List<User> all = userRepository.findAll();
        List<UserDTO> userDTOS = new ArrayList<>();

        for(User user : all){
            UserDTO userDTO = new UserDTO();

            userDTO.setUser_Id(user.getUser_Id());
            userDTO.setUser_name(user.getUser_name());
            userDTO.setAddress(user.getAddress());
            userDTO.setTele(user.getTele());
            userDTO.setNic(user.getNic());
            userDTO.setCreated_date(user.getCreated_date());
            userDTO.setPassword(user.getPassword());
            userDTO.setCof_password(user.getCof_password());
            userDTO.setUser_type(user.getUser_type());
            userDTO.setStatus(user.getStatus());

            userDTOS.add(userDTO);

        }
        return userDTOS;
    }
}

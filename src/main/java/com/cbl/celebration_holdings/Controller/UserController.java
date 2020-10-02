package com.cbl.celebration_holdings.Controller;

import com.cbl.celebration_holdings.DTO.UserDTO;
import com.cbl.celebration_holdings.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/user")
public class UserController  {

    @Autowired
    private UserService userService;

    @PostMapping(value = "save")
    public  boolean saveUser(@RequestBody UserDTO userDTO) throws Exception{
        return userService.saveUser(userDTO);
    }

    @PutMapping(value = "update")
    public boolean updateUser(@RequestBody UserDTO userDTO) throws Exception{
        return userService.updateUser(userDTO);
    }

    @GetMapping(value = "search")
    public UserDTO searchBook(@RequestParam("user_Id") int id) throws Exception{
        return  userService.searchUser(id);
    }

    @GetMapping(value = "getAll")
    public List<UserDTO> getAllUsers() throws Exception{
        return userService.getAllUsers();
    }


}

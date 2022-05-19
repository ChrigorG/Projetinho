package br.com.projetinho.controllers;

import br.com.projetinho.model.User;
import br.com.projetinho.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/read")
    public List<User> read(){
        //User user = new User();
        //user.getId();
        //user.getName();
        //user.getVoto();
        return userRepository.findAll();
    }

    @PostMapping("/createUser")
    public User user (@RequestBody User user){
        return this.userRepository.save(user);
    }




}

package br.com.projetinho.controllers;

import br.com.projetinho.model.User;
import br.com.projetinho.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/online")
    public String online(){
        return "Server Online";
    }

    @GetMapping("/readUser")
    public List<User> read(){
        //User user = new User();
        //user.getId();
        //user.getName();
        //user.getVoto();
        return userRepository.findAll();
    }

    @PostMapping("/createUser")
    public User user (@RequestBody @Valid User user){
        return userRepository.save(user);
    }


    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationException(MethodArgumentNotValidException ex){
        Map<String, String> errors = new HashMap<>();

        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fielName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fielName, errorMessage);
        });
        return errors;
    }

}

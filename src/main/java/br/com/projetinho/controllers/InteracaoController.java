package br.com.projetinho.controllers;

import br.com.projetinho.model.InteracaoVoto;
import br.com.projetinho.model.Pauta;
import br.com.projetinho.repository.InteracaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/interacao")
public class InteracaoController {

    @Autowired
    private InteracaoRepository interacaoRepository;
    private Pauta pauta;

    @PostMapping("/createInteraco")
    public InteracaoVoto interacao(@RequestBody @Valid InteracaoVoto interacao){
        return interacaoRepository.save(interacao);
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

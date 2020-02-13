package com.wolf.queston.service;

import com.wolf.queston.domain.Resposta;
import com.wolf.queston.repository.RespostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RespostaService {

    @Autowired
    private RespostaRepository respostaRepository;

    public Resposta findById(Long id){
        Optional<Resposta> respostaOptional = respostaRepository.findById(id);
        return respostaOptional.get();
    }
}

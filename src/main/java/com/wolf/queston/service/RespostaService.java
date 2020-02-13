package com.wolf.queston.service;

import com.wolf.queston.domain.Resposta;
import com.wolf.queston.repository.RespostaRepository;
import com.wolf.queston.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RespostaService {

    @Autowired
    private RespostaRepository respostaRepository;

    public Resposta findById(Long id){
        Optional<Resposta> respostaOptional = respostaRepository.findById(id);
        if (!respostaOptional.isPresent()){
            throw new ObjectNotFoundException("O objeto com id: " + id + " não foi encontrado.");
        }
        return respostaOptional.get();
    }

    public List<Resposta> findAll(){
        return respostaRepository.findAll();
    }

    public Resposta save(Resposta resposta){
        return respostaRepository.save(resposta);
    }

    public void delete(Long id){
        respostaRepository.deleteById(id);
    }

    public Resposta update(Resposta obj) {
        Resposta newObj = findById(obj.getId());
        updateData(newObj, obj);
        return respostaRepository.save(newObj);
    }


    private void updateData(Resposta newObj, Resposta obj){
        newObj.setDescricao(obj.getDescricao());
        newObj.setSelecionada(obj.isSelecionada());
        newObj.setValor(obj.getValor());
    }
}

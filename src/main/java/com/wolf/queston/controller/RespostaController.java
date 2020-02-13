package com.wolf.queston.controller;

import com.wolf.queston.domain.Resposta;
import com.wolf.queston.domain.dto.RespostaDTO;
import com.wolf.queston.mapper.RespostaMapper;
import com.wolf.queston.service.RespostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/respostas")
public class RespostaController {

    @Autowired
    private RespostaService respostaService;

    @Autowired
    private RespostaMapper respostaMapper;

    @GetMapping("/{id}")
    public ResponseEntity<Resposta> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(respostaService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<RespostaDTO>> listAll() {
        List<RespostaDTO> dtos = respostaMapper.toDto(respostaService.findAll());
        return ResponseEntity.ok().body(dtos);
    }

    @PostMapping
    public ResponseEntity<Resposta> save(@RequestBody RespostaDTO dto) {
        Resposta resposta = respostaService.save(respostaMapper.toEntity(dto));
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(resposta.getId()).toUri();
        return ResponseEntity.created(uri).body(respostaService.save(resposta));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody RespostaDTO dto) {
        Resposta resposta = respostaService.save(respostaMapper.toEntity(dto));
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        respostaService.findById(id);
        return ResponseEntity.noContent().build();
    }
}

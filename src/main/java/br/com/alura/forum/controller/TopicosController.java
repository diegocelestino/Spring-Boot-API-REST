package br.com.alura.forum.controller;

import br.com.alura.forum.controller.dto.TopicoDTO;
import br.com.alura.forum.model.Curso;
import br.com.alura.forum.model.Topico;
import br.com.alura.forum.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @Autowired
    TopicoRepository topicoRepository;

    @RequestMapping("/topicos")
     public List<TopicoDTO> lista(String nomeCurso){
        if (nomeCurso == null) {
            List<Topico> topicos = this.topicoRepository.findAll();
            return TopicoDTO.converter(topicos);
        } else {
            List<Topico> topicos = this.topicoRepository.findByCursoNome(nomeCurso);
            return TopicoDTO.converter(topicos);
        }
    }
}
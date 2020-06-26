package br.com.dbsdev.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.dbsdev.model.Documentacao;
import br.com.dbsdev.services.DocumentacaoService;

@RestController
@RequestMapping(value = "/documentacao")
public class DocumentacaoController {

  DocumentacaoService documentacaoService;
  
  @Autowired
  public DocumentacaoController(DocumentacaoService documentacaoService) {
    this.documentacaoService = documentacaoService;
  }
  
  @GetMapping
  public ResponseEntity<List<Documentacao>> consultarDocumentacao(){
    List<Documentacao> listaDocumentacao = documentacaoService.getDocumentacao();
    return ResponseEntity.ok().body(listaDocumentacao);
  }
  
  @PostMapping
  public ResponseEntity<Documentacao> insertDocumentacao(Documentacao documentacao) {
    Documentacao id = documentacaoService.insertDocumentacao(documentacao);
    return ResponseEntity.ok().body(id);
  }
  
  @DeleteMapping
  public ResponseEntity<Documentacao> deleteDocumentacao(Documentacao documentacao) {
    Documentacao response = documentacaoService.deleteDocumentacao(documentacao);
    return  ResponseEntity.ok().body(response);
  }
}

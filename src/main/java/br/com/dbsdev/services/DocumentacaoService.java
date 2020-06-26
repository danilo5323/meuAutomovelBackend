package br.com.dbsdev.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dbsdev.model.Documentacao;
import br.com.dbsdev.repositories.DocumentacaoRepository;

@Service
public class DocumentacaoService {
  DocumentacaoRepository documentacaoRepository;

  @Autowired
  public DocumentacaoService(DocumentacaoRepository documentacaoRepository) {
    this.documentacaoRepository = documentacaoRepository;
  }

  public List<Documentacao> getDocumentacao() { 
    return documentacaoRepository.findAll();
  }

  public Documentacao insertDocumentacao(Documentacao documentacao) { 
    return documentacaoRepository.save(documentacao);
  }

  public Documentacao deleteDocumentacao(Documentacao documentacao) { 
    return null;
  }
}

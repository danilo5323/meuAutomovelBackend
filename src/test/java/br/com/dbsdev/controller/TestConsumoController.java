package br.com.dbsdev.controller;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.dbsdev.model.Consumo;
import br.com.dbsdev.services.ConsumoService;

public class TestConsumoController {
    
   
    private ConsumoService consumoServiceMock = Mockito.mock(ConsumoService.class);
    
    
    private ConsumoController consumoController;
    
    @Before
    public void setup() {
      consumoController = new ConsumoController(consumoServiceMock);
    }
    
    @Test
    public void testProcurarConsumo() {
      Consumo[] consumo = consumoController.serviceConsumo.getConsumoTotal(); 
      System.out.println("test");
    }
}

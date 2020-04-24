package br.com.dbsdev.descontinuar.externo.fipe;
 
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.com.dbsdev.descontinuar.externo.fipe.model.DetalhesVeiculo;
import br.com.dbsdev.descontinuar.externo.fipe.model.Marcas;
import br.com.dbsdev.descontinuar.externo.fipe.model.Veiculo;
import br.com.dbsdev.descontinuar.externo.fipe.model.VeiculoSimplificado;

public class APIExternaFipe {

	private final static String URL = "http://fipeapi.appspot.com/api/1/[tipo]/[acao]/[parametros].json";
	// tipo = carros, motos ou caminhoes
	// 
	
	private final static String URL_GET_MARCAS           = "http://fipeapi.appspot.com/api/1/carros/marcas.json";
	
	private final static String URL_GET_VEICULOS         = "http://fipeapi.appspot.com/api/1/carros/veiculos/21.json";
	
	private final static String URL_GET_VEICULO          = "http://fipeapi.appspot.com/api/1/carros/veiculo/21/4828.json";
	
	private final static String URL_GET_VEICULO_DETALHES = "http://fipeapi.appspot.com/api/1/carros/veiculo/21/4828/2013-1.json";
	
	enum TipoVeiculo{
		MOTOS, CARROS, CAMINHOES;
	}
	
	public static void main(String[] teste) {
		List<Marcas> marcas = getMarcas();
		System.out.println(marcas);
	}
	
	public static List<Marcas> getMarcas(){ 
		Marcas[] listaMarcas = Service.getMarcas(URL_GET_MARCAS);
		return Arrays.asList( listaMarcas );
	}
	
}

class Service{

	public static Marcas[] getMarcas(String url) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Marcas[]> response
			= restTemplate.getForEntity(url, Marcas[].class   ); 
		return response.getBody();
	}
	
	public static Veiculo getVeiculo(String url) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Veiculo> response
			= restTemplate.getForEntity(url, Veiculo.class   ); 
		return response.getBody();
	}
	
	public static VeiculoSimplificado getVeiculoSimplificado(String url) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<VeiculoSimplificado> response
			= restTemplate.getForEntity(url, VeiculoSimplificado.class   ); 
		return response.getBody();
	}
	
	public static DetalhesVeiculo getDetalhesVeiculo(String url) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<DetalhesVeiculo> response
			= restTemplate.getForEntity(url, DetalhesVeiculo.class   ); 
		return response.getBody();
	}
	
	
}

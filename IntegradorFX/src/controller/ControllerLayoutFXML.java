package controller;

import java.util.List;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import model.Produto;
import servico.ProdutoController;
import servico.Recebe;

public class ControllerLayoutFXML {
	@FXML 
	private TableView<Produto> tableProd;

	@FXML
	private void initialize() {
		importa();
		carregaDoBanco();
		
	}

	@FXML 
	public void onExit() {
		Platform.exit();
	}
	
	
	private void carregaDoBanco() {
		ProdutoController pc= new ProdutoController();
		List<Produto> lista= pc.listar();
		tableProd.setItems(FXCollections.observableArrayList(lista));
		
		
	}
	
	private void importa() {
		Recebe.importaTxtSalvaBanco();
		
	}
	
	
	

}

package controller;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.ProdutoBDTBL;
import servico.ProdutoController;
import servico.RecebeDoArquivo;

public class ControllerLayoutFXML {
	@FXML 
	private TableView<ProdutoBDTBL> tableProd;
	@FXML private Button btnConfirm;

	@FXML
	private void initialize() {
		carregaDoBanco();
				
	}

	@FXML 
	public void onExit() {
		Platform.exit();
	}
	
	
	
	private void carregaDoBanco() {
		ProdutoController pc= new ProdutoController();
		List<ProdutoBDTBL> listaBD = new ArrayList<ProdutoBDTBL>();
		if(listaBD.isEmpty()) {
			listaBD.clear();
		}
		listaBD= pc.listarBD();
		tableProd.setItems(FXCollections.observableArrayList(listaBD));
		
	}
	
	private void importa() {
		RecebeDoArquivo.importaTxtSalvaBanco();
		
	}

	@FXML public void onConfirm() {
		importa();
		carregaDoBanco();
		tableProd.refresh();
		
		
	}

	
	
	

}

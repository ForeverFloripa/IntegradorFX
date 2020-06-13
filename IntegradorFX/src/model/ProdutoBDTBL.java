package model;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ProdutoBDTBL {

	private final SimpleIntegerProperty id;
	private final SimpleStringProperty codigo;
	private final SimpleStringProperty descricao;
	private final SimpleStringProperty grupo;
	private final SimpleFloatProperty preco;

	public ProdutoBDTBL(int  id, String codigo, String descricao, String grupo, float preco) {
		super();
		this.id= new SimpleIntegerProperty(id);
		this.codigo= new SimpleStringProperty(codigo);
		this.descricao= new SimpleStringProperty(descricao);
		this.grupo= new SimpleStringProperty(grupo);
		this.preco= new SimpleFloatProperty(preco);
	}
	
	public int getId() {
		return id.get();
	}
	
	public String getCodigo() {
		return codigo.get();
	}
	
	public String getDescricao() {
		return descricao.get();
	}
	
	public String getGrupo() {
		return grupo.get();
	}
	
	public Float getPreco() {
		return preco.get();
	}
	
	public StringProperty descricaoProperty() {
		return descricao;
	}
	

}

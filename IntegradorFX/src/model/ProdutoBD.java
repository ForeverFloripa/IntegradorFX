package model;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ProdutoBD {

	private IntegerProperty id = new SimpleIntegerProperty();
	private StringProperty codigo = new SimpleStringProperty();
	private StringProperty descricao = new SimpleStringProperty();
	private StringProperty grupo = new SimpleStringProperty();
	private FloatProperty preco = new SimpleFloatProperty();

	public ProdutoBD(Integer id, String codigo, String descricao, String grupo, Float preco) {
		this.id.set(id);
		this.codigo.set(codigo);
		this.descricao.set(descricao);
		this.grupo.set(grupo);
		this.preco.set(preco);
	}

}

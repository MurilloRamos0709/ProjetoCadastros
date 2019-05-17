package com.cadproduto.dominio;

public class produto {
	
	private int id;
	private String NomeDoProduto;
	private String DescricaoDoProduto;
	private String FabricanteDoProduto;
	private String Quantidade;
	private double Preco;
	
	public produto(int id, String NomeDoProduto, String DescricaoDoProduto, String FabricanteDoProduto, String Quantidade, double Preco) {
		this.id = id;
		this.NomeDoProduto = NomeDoProduto;
		this.DescricaoDoProduto = DescricaoDoProduto;
		this.FabricanteDoProduto = FabricanteDoProduto;
		this.Quantidade = Quantidade;
		this.Preco = Preco;
		
	}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNomeDoProduto() {
	return NomeDoProduto;
}
public void setNomeDoProduto(String NomeDoProduto) {
	this.NomeDoProduto = NomeDoProduto;
}
public String DescricaoDoProduto() {
	return DescricaoDoProduto;
}
public void setDescricaoDoProduto(String DescricaoDoProduto) {
	this.DescricaoDoProduto = DescricaoDoProduto;
}
public String FabricanteDoProduto() {
	return FabricanteDoProduto;
}
public void setFabricanteDoProduto(String FabricanteDoProduto) {
	this.FabricanteDoProduto = FabricanteDoProduto;
}
public String Quantidade() {
	return Quantidade;
}
public void setQuantidade(String Quantidade) {
	this.Quantidade = Quantidade;
	}
}
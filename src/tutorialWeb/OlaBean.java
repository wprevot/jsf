package tutorialWeb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

@ManagedBean
@SessionScoped
public class OlaBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	
	private String email;
	
	private String bairro;
	
	private Date dataNascimento;
	
	private ArrayList<SelectItem> listaBairros;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public ArrayList<SelectItem> getListaBairros() {
		listaBairros = new ArrayList<SelectItem>();
		SelectItem item1 = new SelectItem();
		item1.setValue("Botafogo");
		item1.setLabel("Botafogo");
		SelectItem item2 = new SelectItem();
		item2.setValue("Copacabana");
		item2.setLabel("Copacabana");
		SelectItem item3 = new SelectItem();
		item3.setValue("Centro");
		item3.setLabel("Centro");
		listaBairros.add(item1);
		listaBairros.add(item2);
		listaBairros.add(item3);
		return listaBairros;
	}

	public void setListaBairros(ArrayList<SelectItem> listaBairros) {
		this.listaBairros = listaBairros;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	

}

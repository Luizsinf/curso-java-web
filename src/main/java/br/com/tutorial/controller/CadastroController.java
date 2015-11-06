package br.com.tutorial.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.tutorial.modelo.Anuncio;



@ManagedBean(name="cadastro")
@ViewScoped
public class CadastroController {
	
	 private Anuncio anuncio = new Anuncio();
	 
	 
	 public void cadastrar(){
		 
		 System.out.println("Nome:"+anuncio.getNome());
		 System.out.println("E-mail:"+anuncio.getEmail());
		 System.out.println("telefone:"+anuncio.getTelefone());
		 System.out.println("titulo:"+anuncio.getTitulo());
		 System.out.println("descrição:"+anuncio.getDescricao());
		 System.out.println("CEP:"+anuncio.getCep());
		 System.out.println("Senha:"+anuncio.getSenha());
		 
		 
	 }
	 
	 




	public Anuncio getAnuncio() {
		return anuncio;
	}



	public void setAnuncio(Anuncio anuncio) {
		this.anuncio = anuncio;
	}
	
	
}










	





































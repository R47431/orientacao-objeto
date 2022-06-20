package br.com.poo.myorientacao;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeFucionarioDAO {
        List <Gerente> gerentes;
        
        public  GerenciadorDeFucionarioDAO(Integer a){
            this.gerentes = new ArrayList<>();
        }
       
    public  Gerente salvaGerente(Gerente gerente){
        this.gerentes.add(gerente);
        return gerente;
    }

    public void altera(Gerente gerente){  
        this.gerentes.remove(gerente);
        this.gerentes.add(gerente);
    }    

    public void deletagerente(Gerente gerente){
         this.gerentes.remove(gerente);
    }

    public void buscarGerente(){
    this.gerentes.forEach(gerentes ->{
        System.out.println("==================================");
        System.out.println("id "+gerentes.getId());
        System.out.println("nome"+gerentes.getNome());
        System.out.println("idade "+gerentes.getIdade());
    });
   }
}
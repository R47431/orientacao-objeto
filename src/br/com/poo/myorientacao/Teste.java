package br.com.poo.myorientacao;

public class Teste {
    public static void main(String[] args) {
    Gerente g1 = new Gerente();
        g1.setId(1); 
        g1.setNome("adad");
        g1.setIdade(15);

        Gerente g2 = new Gerente();
        g2.setId(4); 
        g2.setNome("ana");
        g2.setIdade(20);
    
    GerenciadorDeFucionarioDAO dao = new GerenciadorDeFucionarioDAO(null);
        dao.salvaGerente(g1);
        dao.salvaGerente(g2);

        g2.setId(1);
        g2.setNome("tubarao");
        g2.setIdade(300);
        dao.altera(g2);    
        
        //dao.deletagerente(g2);

        dao.buscarGerente();
    }
}

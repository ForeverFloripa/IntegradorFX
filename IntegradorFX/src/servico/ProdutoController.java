package servico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Produto;

public class ProdutoController {

	EntityManagerFactory emf;
	EntityManager em;

	public ProdutoController() {
		emf=Persistence.createEntityManagerFactory("almPu");
		em= emf.createEntityManager();
		
	}

	public void salvar(Produto produto) {
		em.getTransaction().begin();
		em.merge(produto);
		em.getTransaction().commit();
		emf.close();
	}

	public void remover(Produto produto) {
		em.getTransaction().begin();
		Query q = em.createNativeQuery("delete produto from produto where matricula = " + produto.getCodigo());
		q.executeUpdate();
		em.getTransaction().commit();
		emf.close();
	}

	public List<Produto> listar() {
		em.getTransaction().begin();
		Query consulta = em.createQuery("SELECT Produto FROM Produto produto");
		List<Produto> lista = consulta.getResultList();
		em.getTransaction().commit();
		emf.close();
		return lista;

	}

}

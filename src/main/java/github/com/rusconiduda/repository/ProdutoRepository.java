package github.com.EduardaRusconi.repository;

import github.com.EduardaRusconi.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findByProdPrecoGreaterThan(Double valor);
    List<Produto> findProdutoByProdPrecoLessThanEqual(Double valor);
    List<Produto> findProdutoByProdNomeStartingWith (String nome);

}

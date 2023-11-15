package github.com.EduardaRusconi.service;

import github.com.EduardaRusconi.entity.Produto;

import java.util.List;

public interface ProdutoService {

    List<Produto> listarProdutos();
    Produto obterProdutoPorId(Long id);
    Produto criarProduto(Produto produto);
    Produto atualizarProduto(Long id, Produto produto);
    void excluirProduto(Long id);

}

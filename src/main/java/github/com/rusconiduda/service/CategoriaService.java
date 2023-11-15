package github.com.EduardaRusconi.service;

import github.com.EduardaRusconi.entity.Categoria;

import java.util.List;

public interface CategoriaService {

    List<Categoria> listarCategorias();
    Categoria obterCategoriaPorId(Long id);
    Categoria criarCategoria(Categoria categoria);
    Categoria atualizarCategoria(Long id, Categoria categoria);
    void excluirCategoria(Long id);

}

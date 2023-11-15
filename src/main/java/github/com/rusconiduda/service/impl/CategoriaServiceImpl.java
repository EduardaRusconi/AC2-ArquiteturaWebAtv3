package github.com.EduardaRusconi.service.impl;

import github.com.EduardaRusconi.entity.Categoria;
import github.com.EduardaRusconi.repository.CategoriaRepository;
import github.com.EduardaRusconi.service.CategoriaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria obterCategoriaPorId(Long id) {
        return categoriaRepository.findById(id).orElseThrow(null);
    }

    @Override
    public Categoria criarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Categoria atualizarCategoria(Long id, Categoria categoria) {
        categoria.setIdCategoria(id);
        return categoriaRepository.save(categoria);
    }

    @Override
    public void excluirCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }
}

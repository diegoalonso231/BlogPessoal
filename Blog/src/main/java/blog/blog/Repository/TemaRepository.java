package blog.blog.Repository;
import java.util.List;
import  blog.blog.model.TemaModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TemaRepository extends JpaRepository<TemaModel, Long> { 
	public List<TemaModel> findAllByDescricaoContainingIgnoreCase(String descricao);
}
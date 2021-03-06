package blog.blog.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import blog.blog.model.PostagemModel;

@Repository
public interface PostagemRepository extends JpaRepository<PostagemModel, Long> {
	
	public List<PostagemModel> findAllByTituloContainingIgnoreCase(String titulo);	
}

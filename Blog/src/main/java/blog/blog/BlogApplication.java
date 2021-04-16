package blog.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

	
	
	
}
/*
 Camada de model  com o nome de Tema com os atributos apresentados na video-aula:


 Uma camada de repository com o nome TemaRepository (com a capacidade de se comunicar com o banco de dados mysql).

Uma camada de Controller com o nome de TemaController Com 5 endpoints:

findAllTema = um endPoint com a capacidade de trazer todas os temas.

 findByIDTema = um endPoint com a função de trazer uma unico tema por id.

findByDescricaoPostagem = um endPoint com a função de trazer um unico tema por Descricao.

postTema = um endPoint com a função de gravar um novo tema no banco de dados.

 putTema = um endPoint com a função de atualizar dados de um tema.

deleteTema = um endPoint com a função de apagar um tema do banco de dados).

 Parte 2 relacionamento com a tabela Postagem.

Camada de model  com o nome de Postagem com os atributos apresentados na video-aula:

     5. Crie um relacionamento de um para muitos/muitos para um, para essas models   (um tema para muitas postagem e muitas postagem para um tema) 

IMPORTANTE: Não esqueça de colocar as anotações corretamente para o relacionamento e inibir recursividade através da anotação @JsonIgnoreProperties.

 Uma camada de repository com o nome PostagemRepository (com a capacidade de se comunicar com o banco de dados mysql).

Uma camada de Controller com o nome de PostagemController Com 5 endpoints:

findAllPostagem = um endPoint com a capacidade de trazer todas as turmas.

 findByIDPostagem = um endPoint com a função de trazer uma unica turma por id.

findByDescricaoTitulo = um endPoint com a função de trazer uma unica postagem por Titulo.

postPostagem = um endPoint com a função de gravar uma nova turma no banco de dados.

 putPostagem = um endPoint com a função de atualizar dados de uma turma.

deletePostagem = um endPoint com a função de apagar uma turma do banco de dados).



 * 
 * 
 * */

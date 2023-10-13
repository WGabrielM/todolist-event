package br.com.wellingtonmonteiro.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


// <> a classe recebe generator que são atributos dinâmicos
public interface IUserRepository extends JpaRepository<UserModel, UUID>{
    // O springData cria um método para fazer um select username
    UserModel findByUserName(String userName);
    
}

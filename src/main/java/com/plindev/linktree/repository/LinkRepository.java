package com.plindev.linktree.repository;

import com.plindev.linktree.model.Link;
import org.springframework.data.jpa.repository.JpaRepository;

// A Mágica do Spring Data:
// Ao estender JpaRepository, você ganha GRATIS métodos como:
// .save() (Salvar)
// .findAll() (Listar tudo)
// .delete() (Apagar)
// Sem escrever NENHUMA linha de SQL!
public interface LinkRepository extends JpaRepository<Link, Long> {
}
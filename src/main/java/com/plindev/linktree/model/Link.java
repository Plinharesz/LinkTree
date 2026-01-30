package com.plindev.linktree.model;

import jakarta.persistence.*;

@Entity // 1. Diz ao Spring: "Crie uma tabela 'Link' no banco baseada nesta classe"
public class Link {

    @Id // 2. Diz: "Esta é a Chave Primária (PK)"
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 3. Diz: "O Banco gera o ID sozinho (1, 2, 3...)"
    private Long id;

    private String titulo; // Ex: "Meu LinkedIn"
    private String url;    // Ex: "https://linkedin.com/..."

    // Construtor vazio (Obrigatório para o JPA funcionar)
    public Link() {}

    // Construtor para facilitar a criação
    public Link(String titulo, String url) {
        this.titulo = titulo;
        this.url = url;
    }

    // Getters e Setters (Necessários para o Spring ler/gravar os dados)
    // Se você instalou o Lombok, poderia usar @Data aqui, mas vamos explícito pra aprender.
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
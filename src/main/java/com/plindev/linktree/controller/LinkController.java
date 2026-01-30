package com.plindev.linktree.controller;

import com.plindev.linktree.model.Link;
import com.plindev.linktree.repository.LinkRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LinkController {

    // Injeção de Dependência: O Spring vai nos dar um Repository pronto para usar.
    private final LinkRepository repository;

    public LinkController(LinkRepository repository) {
        this.repository = repository;
    }

    // 1. LISTAR LINKS (GET)
    @GetMapping("/")
    public String index(Model model) {
        // Busca todos os links do banco e manda para o HTML
        model.addAttribute("links", repository.findAll());
        return "index";
    }

    // 2. ADICIONAR LINK (POST)
    @PostMapping("/add")
    public String addLink(Link novoLink) {
        // O Spring já monta o objeto 'Link' com os dados do formulário automaticamente!
        repository.save(novoLink);

        // Redireciona para a página inicial para atualizar a lista
        return "redirect:/";
    }
}
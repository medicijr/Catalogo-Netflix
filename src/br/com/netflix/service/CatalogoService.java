package br.com.netflix.service;

import br.com.netflix.model.Catalogo;

public class CatalogoService {
    private Catalogo catalogo;

    public CatalogoService(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public void buscarNota(String nome) {
        catalogo.getSeries().forEach((serie, nota) -> {
            if (serie.toLowerCase().contains(nome.toLowerCase())) {
                System.out.println("Nota da Série: " + serie + " = " + nota);
            }
        });
    }

    public void existeSerie(String nome) {
        if (catalogo.getSeries().containsKey(nome)) {
            System.out.println(nome + " esta no catalogo!!");
        } else {
            System.out.println(nome + " não esta no catalogo!!");
        }
    }

    public void listarTodos() {
        System.out.println("===================================Todas as Series===================================");
        if (catalogo.getSeries().isEmpty()) {
            System.out.println("O catálogo está vazio.");
            return;
        }

        catalogo.getSeries().forEach((nome, nota) -> {
            System.out.println("Série: " + nome + " | Nota: " + nota);
        });
        System.out.println("=====================================================================================");
    }

    public void totalSeries() {
        System.out.println("Total de séries: " + catalogo.getSeries().size());
    }
}

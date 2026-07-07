package br.com.netflix;

import br.com.netflix.model.Catalogo;
import br.com.netflix.service.CatalogoService;

public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        catalogo.adicionarSerie("Breaking Bad", 10);
        catalogo.adicionarSerie("Vikings", 9.5);
        catalogo.adicionarSerie("Dexter", 10);
        catalogo.adicionarSerie("The Vampire Diares", 8);
        catalogo.adicionarSerie("Sadman", 7.5);
        catalogo.adicionarSerie("TWD", 10);
        catalogo.adicionarSerie("GOT", 8.5);

        CatalogoService service = new CatalogoService(catalogo);

        service.listarTodos();
        service.buscarNota("got");
        service.existeSerie("La Casa de Papel");
        service.existeSerie("Dexter");
        service.totalSeries();

    }
}

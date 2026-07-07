package br.com.netflix.model;

import java.util.HashMap;
import java.util.Map;

public class Catalogo {
    private Map < String, Double > series;

    public Catalogo (){
        this.series = new HashMap<>();
    }
    public void adicionarSerie (String nome, double nota){
        series.put(nome, nota);
    }
    public Map<String, Double>getSeries(){
        return series;
    }
}

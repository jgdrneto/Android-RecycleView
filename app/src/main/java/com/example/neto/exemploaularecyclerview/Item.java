package com.example.neto.exemploaularecyclerview;

public class Item {
    private int id;
    private String nome;

    public Item(int nId, String nNome){
        this.id = nId;
        this.nome = nNome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}

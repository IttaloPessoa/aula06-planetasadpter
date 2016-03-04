package br.com.ufpb.ittalopessoa.aula06;

public class Planeta {

    private int idImage;
    private String nome;

    public Planeta(int idImage, String nome) {
        this.idImage = idImage;
        this.nome = nome;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

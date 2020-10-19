package com.example.mascotass3;

public class Mascota {
    private String nombreMascota;
    private String rating;
    private int fotoMascota;

    public Mascota(String nombre, String rating, int foto) {
        this.nombreMascota = nombre;
        this.rating = rating;
        this.fotoMascota = foto;
    }

    public String getNombre() {
        return nombreMascota;
    }

    public void setNombre(String nombre) {
        this.nombreMascota = nombre;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getFoto() {
        return fotoMascota;
    }

    public void setFoto(int foto) {
        this.fotoMascota = foto;
    }
}

package grafos;

import java.util.ArrayList;
import java.util.List;

public class Vertice {

    private int id;
    private int grau;
    private List<Vertice> vizinhanca;

    public Vertice(int id) {
       
        this.id = id;
        this.grau=0;
        vizinhanca = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }

}
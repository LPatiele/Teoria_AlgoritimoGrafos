package grafos;

import java.util.ArrayList;
import java.util.List;

public class GrupoV {

    private List<Vertice> lista;
    private int id;
    private GrupoE referencia;

    public GrupoV() {
        lista = new ArrayList<>();
        id = 1;
        referencia = null;
    }

    public void setReferencia(GrupoE arestas) {
        this.referencia = arestas;
    }

    public void adicionaV(Vertice v) {

        if (confereV(v.getId())) {
            System.out.println("O vertice " + v.getId() + " já existe na lista!");
        } else {
            lista.add(v);
        }
    }

    public boolean confereV(int v) {
        int i;
        for (i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId()==v) {
                return true;
            }
        }
        return false; 
    }

    public void printLista() {
        String s = "V = {";
        int quant = lista.size();
        for (int i = 0; i < (quant - 1); i++) {
            s += lista.get(i).getId() + ";";
        }
        s += lista.get((quant - 1)).getId() + "}";
        System.out.println(s);
    }

    public String printVizinhos(int vertice) {
        Vertice v = null;
        for (Vertice vert : lista) { 
            if (vert.getId()==vertice) {
                v = vert;
            }
        }
        if (v == null) {
            return "Vértice inexistente.";
        } else {
            String vizinhos = "";
            int quant = referencia.getListaArestas().size();
            for (int i = 0; i < (quant); i++) {
                if (referencia.getListaArestas().get(i).getV1() == v.getId()) {
                    vizinhos += (referencia.getListaArestas().get(i).getV2() + ";");

                } else if (referencia.getListaArestas().get(i).getV2() == v.getId()) {
                    vizinhos += (referencia.getListaArestas().get(i).getV1() + ";");
                }
            }
            String vizinhosFinal = "Vizinhança de " + vertice + " ={";
            for (int i = 0; i < (vizinhos.length() - 1); i++) {
                vizinhosFinal += vizinhos.charAt(i);
            }
            vizinhosFinal += "}";
            return vizinhosFinal;
        }
    }

    public void printGraus() {
        System.out.println("Grau dos vértices:");
        for (Vertice v : lista) {
            System.out.println("Vertice " + v.getId() + "= " + v.getGrau());
        }
    }

    public int getN() {
        return lista.size();
    }

    public void setGraus() {
        int quant = referencia.getListaArestas().size();
        lista.stream().forEach((v) -> {
            v.setGrau(0);
            for (int i = 0; i < (quant); i++) {
                if (referencia.getListaArestas().get(i).getV1() == v.getId()) {
                    v.setGrau(v.getGrau() + 1);

                } else if (referencia.getListaArestas().get(i).getV2() == v.getId()) {
                    v.setGrau(v.getGrau() + 1);
                }
            }
        });
    }
    
    public int getGrau(int vertice){
        for(Vertice v:lista){
            if(v.getId()==vertice)
                return v.getGrau();
        }
        return -1;
    }
}

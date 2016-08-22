package grafos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GrupoE {

    private List<Aresta> lista;

    public GrupoE() {
        lista = new ArrayList<>();
    }

    public List<Aresta> getListaArestas() {
        return lista;
    }

    public void adicionaE(int v1, int v2) { 
        int i;    
        for (i = 0; i < lista.size(); i++) {
            if ((v1 == lista.get(i).getV1() && v2 == lista.get(i).getV2()) || (v2 == lista.get(i).getV1() && v1 == lista.get(i).getV2())) //                throw new InvalidParameterException("A aresta já foi adicionada");
            {
                break;
            }
        }
        if (i == lista.size()) {
            if (v1 < v2) {
                lista.add(new Aresta(v1, v2));
            } else {
                lista.add(new Aresta(v2, v1));
            }
        }
    }

    public String printLista() {
        String s = "E = {";
        int tam = lista.size();
        for (int i = 0; i < tam; i++) {
            s += lista.get(i).toString();
            if (i < (tam - 1)) {
                s += ";";
            } else {
                s += "}";
            }

        }
        return s;
    }

    public int getM() {
        return lista.size();
    }

    public boolean eAdjacentes(int v1, int v2) {
        for (Aresta a : lista) {
            if (((a.getV1() == v1) && (a.getV2() == v2)) || ((a.getV1() == v2) && (a.getV2() == v1))) {
                return true;
            }
        }
        return false;
    }
}

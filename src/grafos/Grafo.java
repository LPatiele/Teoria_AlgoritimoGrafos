package grafos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Grafo {

    private GrupoV V;
    private GrupoE E;
    private int n;
    private int m;

    public Grafo() {
        V = new GrupoV();
        E = new GrupoE();
        V.setReferencia(E);
        n = 0;
        m = 0;
    }
    
    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public boolean lerArquivo(File arquivo) {
        
        try {
            BufferedReader a = new BufferedReader(new FileReader(arquivo));
            int i = 0, j = 1;
            int c;
            while ((c = a.read()) != -1) { 
                switch (c) {
                    case 91:
                        j = 1; 
                        i++;
                        break;
                    case 45:
                        E.adicionaE(i, j);
                        a.read();
                        j++;
                        break;
                    default:
                        if (c > 47 && c < 58) { 
                            char cTemp = (char) c;
                            String temp = "" + cTemp;
                            while ((c = a.read()) != 32 && c != 93 && c != 45) { 
                                cTemp = (char) c;
                                temp += cTemp;
                            }
                            if (j == i) {
                                Vertice vTemp = new Vertice(i);
                                vTemp.setGrau(Integer.parseInt(temp));
                                V.adicionaV(vTemp);
                            }
                            j++;
                        }
                } 
            }
            n = V.getN();
            m = E.getM();            
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado");
            return false;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    public void printV() {
        V.printLista();
    }
    
    public String printE() {
        return E.printLista();
    }

    public String printAdjacenciaV(int v) {
        return V.printVizinhos(v);
    }

    public String printGrauV(int v) {
        if (v==-1)
            return "Vértice inexistente.";
        return "Grau do vértice " + v + " = " + V.getGrau(v);
    }

    public void printGrauDosVertices() {
        V.printGraus();
    }

    public String printAdijacencia() {
        String text=null;
        for (int i = 1; i <= n; i++) {
            text+="\n|";
            for (int j = 1; j <= n; j++) {
                if (E.eAdjacentes(i, j)) {
                    text+=" 1 ";
                } else {
                    text+=" 0 ";
                }
            }
            text+="|";
        }
        text+="\n\n\n";
        return text;
    }

    public String printDiagonal() {
        String text=null;
        for (int i = 1; i <= n; i++) {
            text+="\n|";
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    text+=" " + V.getGrau(i) + " ";
                } else {
                    text+=" 0 ";
                }
            }
            text+="|";
        }
        text+="\n\n\n";
        return text;
    }

    public String printLaplaciana() {
        String text=null;
        for (int i = 1; i <= n; i++) {
            text+="\n|";
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    text+=" " + V.getGrau(i) + " ";
                } else if (E.eAdjacentes(i, j)) {
                    text+="-1 ";
                } else {
                    text+=" 0 ";
                }
            }
            text+="|";
        }
        text+="\n\n\n";
        return text;
    }

    public String printIncidencia() {
        String text = null;
        for (int i = 1; i <= n; i++) { 
            text+="\n Vértice: " + i + "\t|";
            for (int j = 1; j <= m; j++) { 
                if (i == E.getListaArestas().get(j - 1).getV1() || i == E.getListaArestas().get(j - 1).getV2()) 
                    text+=" 1 ";
                else                
                    text+=" 0 ";                
            }
            text+="|";
        }
        text+="\n\n Ordem das arestas.";
        text+= printE();
        text+="\n\n\n";
        return text;
    }
    
    public String euleriano(){
        int cont=0;
        for(int i=0; i<n ;i++){
            if((V.getGrau(i)%2)!=0)
                cont++;
        }
        if(cont==0){
            return "O grafo possui circuito e caminho euleriano.";
        }else if(cont==2){
            return "O grafo possui apenas caminho euleriano.";
        }
        return "Não há caminhos ou circuitos eulerianos no grafo.";
    }

}

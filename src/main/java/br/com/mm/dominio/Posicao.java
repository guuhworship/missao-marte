package br.com.mm.dominio;

import br.com.mm.dominio.enumeradores.Direcao;

import java.beans.ConstructorProperties;

public class Posicao {

    private long x;
    private long y;
    private Direcao direcao;

    @ConstructorProperties({"x", "y", "direcao"})
    public Posicao(long x, long y, Direcao direcao) {
        this.x = x;
        this.y = y;
        this.direcao = direcao;
    }

    public void andarUmaMalha() {
        switch (direcao) {
            case E:
                x++;
                break;
            case W:
                x--;
                break;
            case N:
                y++;
                break;
            case S:
                y--;
                break;
        }
    }

    public void moverParaEsquerda() {
        direcao = direcao.moverParaEsquerda();
    }

    public void moverParaDireita() {
        direcao = direcao.moverParaDireita();
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public Direcao getDirecao() {
        return direcao;
    }
}

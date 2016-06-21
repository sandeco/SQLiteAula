package sandeco.sqlite;

import java.io.Serializable;

/**
 * Created by sandeco on 21/06/16.
 */
public class Pessoa implements Serializable {

    private int id;
    private String nome;

    public Pessoa(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

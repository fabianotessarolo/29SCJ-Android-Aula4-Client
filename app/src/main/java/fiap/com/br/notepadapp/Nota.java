package fiap.com.br.notepadapp;

import com.google.gson.annotations.SerializedName;

/**
 * Created by logonrm on 27/11/2017.
 */

public class Nota {

    private String id;
    private String titulo;

    @SerializedName(value = "descricao") //caso nao dê match nos campos do JSON.
    private String texto;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }



}

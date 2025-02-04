package src.classi; //va messo in ogni classe

import java.time.LocalDate;
import java.util.Date;

public abstract class User {

    public enum TipoProfilo {
        Studente, Docente
    }
    protected String Nome;
    protected String Cognome;
    protected String Genere;
    protected Date Data_nascita;
    protected String Codice_fiscale;
    protected String Residenza;
    protected String Telefono;
    private TipoProfilo tipoProfilo;

    public User(String nome, String cognome, String genere, Date data_nascita, String codice_fiscale, String residenza, String telefono, src.classi.User.TipoProfilo tipoProfilo) {
        Nome = nome;
        Cognome = cognome;
        Genere = genere;
        Data_nascita = data_nascita;
        Codice_fiscale = codice_fiscale;
        Residenza = residenza;
        Telefono = telefono;
        this.tipoProfilo = tipoProfilo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public void setCognome(String cognome) {
        Cognome = cognome;
    }

    public String getGenere() {
        return Genere;
    }

    public void setGenere(String genere) {
        Genere = genere;
    }

    public Date getData_nascita() {
        return Data_nascita;
    }

    public void setData_nascita(Date data_nascita) {
        Data_nascita = data_nascita;
    }

    public String getCodice_fiscale() {
        return Codice_fiscale;
    }

    public void setCodice_fiscale(String codice_fiscale) {
        Codice_fiscale = codice_fiscale;
    }

    public String getResidenza() {
        return Residenza;
    }

    public void setResidenza(String residenza) {
        Residenza = residenza;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public TipoProfilo getTipoProfilo() {
        return tipoProfilo;
    }

    public void setTipoProfilo(TipoProfilo tipoProfilo) {
        this.tipoProfilo = tipoProfilo;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "User{" +
                "Nome='" + Nome + '\'' +
                ", Cognome='" + Cognome + '\'' +
                ", Genere='" + Genere + '\'' +
                ", Data_nascita=" + Data_nascita +
                ", Codice_fiscale='" + Codice_fiscale + '\'' +
                ", Residenza='" + Residenza + '\'' +
                ", Telefono='" + Telefono + '\'' +
                ", tipoProfilo=" + tipoProfilo +
                '}';
    }
}
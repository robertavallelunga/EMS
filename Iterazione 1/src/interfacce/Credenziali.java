package interfacce;

import org.apache.commons.lang3.RandomStringUtils;
import java.util.UUID;

public interface GeneratoreCredenziali {
    Credenziali generaCredenzialiStudente();
    Credenziali generaCredenzialiDocente();

    // Metodi privati per la generazione di matricola e password
    default String generaMatricola() {
        // Logica per la generazione della matricola
        return String.valueOf(System.currentTimeMillis()).substring(8, 14);
    }

    default String generaPassword() {
        // Logica per la generazione della password
        return RandomStringUtils.randomAlphanumeric(10);
    }

    // Metodo privato per la generazione di codiceDocente
    default String generaCodiceDocente() {
        // Logica per la generazione del codice docente
        return UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }
}
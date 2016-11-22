package de.hdm_stuttgart.softwarewerkzeuge.uebung01;

import java.util.Date;

/**
 *
 *
 * Created by elcpt on 15.10.2016.
 */
public class Blogeintrag extends Textbeitrag {

    // Einziges Attribut
    String titel;

    // innere Klasse: Kommentar
    class Kommentar extends Textbeitrag {

        Blogeintrag blogeintrag;

        // Getter und Setter
        public Blogeintrag getBlogeintrag() {
            return blogeintrag;
        }

        public void setBlogeintrag(Blogeintrag blogeintrag) {
            this.blogeintrag = blogeintrag;
        }
    }

    // Konstruktor
    public Blogeintrag(Person autor, Date datum, String text, String titel) {
        super(autor, datum, text);
        this.titel = titel;
    }

    // Getter und Setter
    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
}

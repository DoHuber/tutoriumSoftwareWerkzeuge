package de.hdm_stuttgart.softwarewerkzeuge.uebung01;

import java.util.Date;

/**
 * Uebung 01 - Verschachtelte Klassen
 *
 */
public class Textbeitrag {

    // Deklaration der Attribute
    Person autor;
    Date datum;
    String text;

    // Konstruktor mit allen Attributen
    public Textbeitrag(Person autor, Date datum, String text) {
        this.autor = autor;
        this.datum = datum;
        this.text = text;
    }

    // Default-Konstruktor
    public Textbeitrag() {
    }

    // Getter und Setter
    public Person getAutor() {
        return autor;
    }

    public void setAutor(Person autor) {
        this.autor = autor;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

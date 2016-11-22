package de.hdm_stuttgart.softwarewerkzeuge.uebung01;

import java.util.Date;

public class Start {

    public static void main(String[] args) {

        Person autor = new Person("dh072, Dominik Huber");
        Blogeintrag blogeintrag = new Blogeintrag(autor, new Date(), "Lorem ipsum sit dolor amet", "Lorem ipsum - fact or fiction?");

        // Instanzen einer inneren Klasse können nur mit einer Instanz der äußeren Klasse existieren, daher Zugriff auf Konstruktor über Blogeintrag-Objekt
        Blogeintrag.Kommentar comment = blogeintrag.new Kommentar();

        // Diverse Werte setzen
        comment.setBlogeintrag(blogeintrag);
        comment.setAutor(autor);
        comment.setDatum(new Date());
        comment.setText("Dieser Beitrag ist allerhand!");

        // Ausgabe zu Testzwecken
        System.out.println("Kommentar");
        System.out.println("Autor: " + comment.getAutor().getName());
        System.out.println("Erstellungsdatum: " + comment.getDatum().toString());
        System.out.println("Dazugehöriger Blogeintrag: " + comment.getBlogeintrag().getTitel());
        System.out.println("Inhalt: " + comment.getText());







    }
}

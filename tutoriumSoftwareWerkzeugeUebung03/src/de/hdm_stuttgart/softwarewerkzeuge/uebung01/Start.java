package de.hdm_stuttgart.softwarewerkzeuge.uebung01;

import java.io.IOException;

public class Start {

    public static void main(String[] args) {
    	
        NewsFeed feed = new NewsFeed();

        try {

            String loremIpsum = feed.getLatestNews(NewsFeed.GET_EXAMPLE_LOREM_IPSUM);
            String rfcBeispiel = feed.getLatestNews(NewsFeed.GET_EXAMPLE_RFC_FTP);

            System.out.println(loremIpsum);
            System.out.println(rfcBeispiel);

            System.out.println("\nZeichen im zweiten Ergebnis: \n");
            System.out.println(Integer.toString(rfcBeispiel.length()));

        } catch (IOException e) {
        	
        	e.printStackTrace();
        	System.out.println("Fehler beim Abrufen der News");
        	
        } catch (ResultTooLongException e) {
        	
        	e.printStackTrace();
        	System.out.println("Das war eine too-long-Exception");
        	
        }


    }
}

package de.hdm_stuttgart.softwarewerkzeuge.uebung01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by elcpt on 07.11.2016.
 *
 *
 */
public class NewsFeed {

    // Beispielservice aus dem Internet, gibt Beispieltext zurück (plain text)
    public static final String GET_EXAMPLE_LOREM_IPSUM = "http://loripsum.net/api/2/plaintext";

    // Request for Comments - einer der Standards des Internet, hier zum File Transfer Protocol
    public static final String GET_EXAMPLE_RFC_FTP = "http://www.ietf.org/rfc/rfc959.txt";
    

    // holt Beispieldaten via HTTP GET
    public String getLatestNews(String urlToRead) throws IOException, ResultTooLongException {

            // Notwendige Variablen deklarieren und initialisieren
            StringBuilder result = new StringBuilder();
            URL targetUrl = new URL(urlToRead);

            // Alles für den Request vorbereiten
            HttpURLConnection connection = (HttpURLConnection) targetUrl.openConnection();
            connection.setRequestMethod("GET");

            // Request tätigen und Ergebnis einbehalten, hier mit try-with-resources
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            	
            	String line;
            	while ((line = reader.readLine()) != null) {
            		result.append(line);
            	}
            	
            }
            
            // Alle 100 Zeichen einen Zeilenumbruch einschließen
            String parsedStr = result.toString().replaceAll("(.{100})", "$1\n");
            
            
            // Exception werfen, wenn mehr als 10 000 Zeichen
            if (parsedStr.length() > 10000) {
            	
            	throw new ResultTooLongException("Dieses Ergebnis war zu lang.");
            	
            }


            return parsedStr;

    }


}

/*
* File: Store.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Refactored: Nagy János, 2024-11-28
* Group: oktat
* Date: 2024-11-27
* Github: https://github.com/oktat/
* Licenc: MIT
*/

import java.io.FileWriter;
import java.io.IOException;

public class Store {
  public static void writeIncedentToFile(Incident incident) {
    try {
      tryWriteIncidentToFile(incident);
    } catch(IOException e) {
      System.err.println("Hiba! A fájl leírás sikertelen!");
      System.err.println(e.getMessage());
    }
  }

  public static void tryWriteIncidentToFile(Incident incident) throws IOException {
    FileWriter fw = new FileWriter("incidents.txt");
    fw.write(incident.name + ":" + incident.message + "\n");
    fw.close();
  }
}

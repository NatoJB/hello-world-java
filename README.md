# hello-world-java
Ein einfaches Java Hello-World-Projekt. Verwaltet von Junie.

Voraussetzungen
- Java JDK 17 oder höher
- Optional: IntelliJ IDEA (Community oder Ultimate)

Schnellstart (Terminal)
Unix/macOS:
- mkdir -p out
- javac -d out src/Main.java
- java -cp out Main

Windows (PowerShell oder Eingabeaufforderung):
- mkdir out
- javac -d out src/Main.java
- java -cp out Main

Mit IntelliJ IDEA
- Datei > Öffnen … und dieses Verzeichnis auswählen
- JDK konfigurieren (17+)
- Main ausführen (grüner Pfeil in der Editor-Gutter)

Projektstruktur
- src/Main.java — Einstiegspunkt (Klasse Main mit main-Methode)
- README.md — Dieses Dokument

Ausgabe anpassen
- Öffne src/Main.java und ändere die Zeichenkette in System.out.print(...)
- Kompiliere und führe das Programm erneut aus

Troubleshooting
- Fehler "Main konnte nicht gefunden oder geladen werden": Stelle sicher, dass du mit -d out kompiliert und mit -cp out gestartet hast.
- Falsche Java-Version: java -version prüfen und ggf. JDK 17+ installieren/auswählen.

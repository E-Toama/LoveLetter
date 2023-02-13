# Anwendung starten

Die ausführbare JAR-Datei **vpNeidischeNarwale.jar** findet sich im Projekt unter `otherStuff/vpNeidischeNarwale.jar`.
Laden Sie sich diese Datei herunter und navigieren Sie im Terminal zum Verzeichnis, in dem Sie die Datei abgelegt haben.
## 1. Server starten
Mit dem Befehl

`java -cp vpNeidischeNarwale.jar model.network.ChatServer`

starten Sie den ChatServer. War der Start erfolgreich, wird folgende Nachricht angezeigt:
"Server is running on port: 9090"

## 2. Client-Anwendung starten
Öffnen Sie ein **neues Terminal** im selben Verzeichnis wie zuvor. Um den Client zu starten, benötigen Sie den Pfad zum Verzeichnis der javafx-Bibliotheken auf Ihrem Rechner. Fügen Sie diesen an der markierten Stelle (ohne eckige Klammern) in den folgenden Befehl ein:

`java --module-path [JAVAFX-PFAD] --add-modules javafx.controls,javafx.fxml -cp vpNeidischeNarwale.jar viewModel.ChatApp`

Beispiel:

`java --module-path /home/user/javaFx/javafx-sdk-15.0.1/lib --add-modules javafx.controls,javafx.fxml -cp vpNeidischeNarwale.jar viewModel.ChatApp`

Anschließend öffnet sich eine Eingabemaske, bei der Sie Ihren Nutzernamen festlegen können. 
Weiterführende Informationen zum Ablauf finden Sie in der Dokumentation unter [Spielverlauf](https://gitlab2.cip.ifi.lmu.de/dbs_sep/dbs_sep2020-21/vp-neidische-narwale/-/wikis/Home/Anwender/Spielverlauf). 
Ebenfalls in der Dokumentation befindet sich ein Überblick über alle verfügbaren [Chat- und Spielbefehle](https://gitlab2.cip.ifi.lmu.de/dbs_sep/dbs_sep2020-21/vp-neidische-narwale/-/wikis/Home/Anwender/Spielbefehle).

## Weitere Clients starten
Öffnen Sie für jeden neuen Client ein neues Terminalfenster und gehen analog zu Schritt 2 vor.

## Anwendungen schließen
Um den Server zu beenden, schließen sie das Terminalfenster, in dem Sie den Server gestartet haben.

Um die Chat-Applikation zu beenden, bieten sich mehrere Möglichkeiten:
- Schließen des entsprechenden Terminalfensters
- Schließen-Button des Chat-Fensters betätigen
- Eingabe von !BYE in das Textfeld des Chat-Fensters

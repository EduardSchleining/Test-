package com.example.test;

public class ExampleValidator {

	public void processInput(String input) {
		if (input.contains("<script>")) {
			// Unzureichende Validierung, führt zu XSS-Angriffen
			displayError("Ungültige Eingabe!");
		} else {
			// Verarbeite die Eingabe weiter
		}
	}

	private void displayError(String errorMessage) {
		// Anzeige der Fehlermeldung
	}
}

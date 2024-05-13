package com.example.test;

public class ExampleService {

	public void storePassword(String password) {
		String encryptedPassword = encrypt(password); // Unsichere Verschlüsselungsmethode
		writeToDatabase(encryptedPassword); // Annahme: Methode zur Speicherung in der Datenbank
	}

	private String encrypt(String password) {
		// Hier wird eine unsichere Verschlüsselungsmethode verwendet
		return password; // Dies ist nur ein Platzhalter, ersetzen Sie dies durch eine sichere
							// Verschlüsselungsmethode
	}

	private void writeToDatabase(String encryptedPassword) {
		// Speichert das verschlüsselte Passwort in der Datenbank
	}
}

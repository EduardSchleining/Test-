package com.example.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TestController {

	private List<Icon> anwendungen;
	private List<Angebot> angebote;

	public TestController() {

		anwendungen = new ArrayList<>();
		anwendungen.add(new Icon("Schwarzes Brett", "clipboard-question-solid.svg"));
		anwendungen.add(new Icon("Mitarbeiterdatenbank", "users-solid.svg"));
		anwendungen.add(new Icon("Vorstandsvorlagen", "file-lines-solid.svg"));
		anwendungen.add(new Icon("Test", "head-side-cough-solid.svg"));
		anwendungen.add(new Icon("Schwarzes Brett", "clipboard-question-solid.svg"));
		anwendungen.add(new Icon("Mitarbeiterdatenbank", "users-solid.svg"));
		anwendungen.add(new Icon("Vorstandsvorlagen", "file-lines-solid.svg"));
		anwendungen.add(new Icon("Test", "head-side-cough-solid.svg"));

		angebote = new ArrayList<>();
		angebote.add(new Angebot("Mercedes Benz S500", "Heinz Peter" ));
		angebote.add(new Angebot("Mercedes Benz E200", "Peinz Heter" ));
		angebote.add(new Angebot("Genesis G80", "Teins Schmeter" ));

		for (Icon icon : anwendungen) {
			System.out.println(icon.toString());
		}

	}

	@GetMapping({ "board", "/" })
	public String board(Model model) {

		model.addAttribute("anwendungen", anwendungen);

		return "board";
	}

	@GetMapping({ "liste" })
	public String liste(Model model) {

		model.addAttribute("anwendungen", anwendungen);

		return "liste";
	}

	@GetMapping({ "/anwendung/{anwendungsName}" })
	public String showAnwendung(Model model, @PathVariable String anwendungsName) {

		model.addAttribute("anwendungsName", anwendungsName);
		model.addAttribute("angebote", angebote);

		return anwendungsName;
	}


}

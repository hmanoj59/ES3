package escube.edu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({ "name", "user" })
public class SampleCtrl {

	// Checks if there's a model attribute 'mycounter', if not create a new one.
	// Since 'mycounter' is labelled as session attribute it will be persisted
	// to
	// HttpSession
	@RequestMapping("one")
	public String get(Model model) {
		if (!model.containsAttribute("name")) {
			model.addAttribute("name", "Dabeeth nagam");
		}
		return "sample";
	}

	// Obtain 'mycounter' object for this user's session and increment it
	@RequestMapping("two")
	public String post() {
		return "sample2";
	}
}

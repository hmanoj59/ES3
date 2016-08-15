package escube.edu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactusCtrl {

	@RequestMapping("contactus")
	public ModelAndView getContactUsPage(Model model) {
		model.addAttribute("page", "contactuspage");

		return new ModelAndView("index");
	}

	@RequestMapping("contactuspage")
	public ModelAndView gotoContactUsPage() {
		return new ModelAndView("contactusview");
	}
}

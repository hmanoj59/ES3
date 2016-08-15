package escube.edu.controllers.regular;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourseCtrl {
	@RequestMapping("courses")
	public ModelAndView goToLandingPage(Model model) {
		model.addAttribute("page", "coursespage");
		return new ModelAndView("index");
	}

	// @RequestMapping(value = { "index", "/" })
	// public ModelAndView goToLandingPageLoggedin(@ModelAttribute("data")
	// Map<String, Object> data) {
	// return new ModelAndView("index", "data", data); }

	@RequestMapping(value = { "coursespage" })
	public ModelAndView goToHomepage() {
		return new ModelAndView("coursesview");
	}
}

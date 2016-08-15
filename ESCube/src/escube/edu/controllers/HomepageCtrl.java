package escube.edu.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import utils.CourseUtils;
import escube.edu.models.NavBarLink;

@Controller
@SessionAttributes("page")
public class HomepageCtrl {

	@RequestMapping(value = { "index", "/" })
	public ModelAndView goToLandingPage(Model model) {
		model.addAttribute("page", "homepage");
		return new ModelAndView("index");
	}

	// @RequestMapping(value = { "index", "/" })
	// public ModelAndView goToLandingPageLoggedin(@ModelAttribute("data")
	// Map<String, Object> data) {
	// return new ModelAndView("index", "data", data); }

	@RequestMapping(value = { "homepage" })
	public ModelAndView goToHomepage() {
		return new ModelAndView("homepage");
	}

	@RequestMapping("navbar")
	public ModelAndView getNavbar() {
		HashMap<String, Object> data = new HashMap<String, Object>();

		List<NavBarLink> navLinks = new ArrayList<NavBarLink>();
		NavBarLink home = new NavBarLink("Home");

		NavBarLink courses = new NavBarLink("Courses");
		courses.setDropDown(true);
		NavBarLink register = new NavBarLink("Register");
		register.setLinkPage("registration");
		// List<String> registerDropDownLinks = new ArrayList<String>();
		// registerDropDownLinks.add("Student");
		// registerDropDownLinks.add("Teacher");
		// registerDropDownLinks.add("Admin");
		// register.setDropDownLinks(registerDropDownLinks);
		// register.setDropDown(true);

		NavBarLink contactUs = new NavBarLink("Contact Us");
		contactUs.setLinkPage("contactus");
		NavBarLink login = new NavBarLink("Login");
		login.setLinkPage("login");
		login.setCssID("login");

		navLinks.add(home);
		navLinks.add(courses);

		navLinks.add(contactUs);
		navLinks.add(register);
		navLinks.add(login);

		data.put("navLinks", navLinks);
		data.put("navBarId", "navbarH");
		data.put("brand", "ES3");

		return new ModelAndView("navbar", "data", data);

	}

	@RequestMapping("content")
	public ModelAndView getContent() {
		return new ModelAndView("content");
	}

	@RequestMapping("leftPane")
	public ModelAndView getLeftPane() {

		HashMap<String, Object> data = new HashMap<String, Object>();

		data.put("courses", CourseUtils.getCourses());

		return new ModelAndView("leftpane", "data", data);
	}

	@RequestMapping("courseFlow")
	public ModelAndView getCourseFlow() {
		HashMap<String, Object> data = new HashMap<String, Object>();

		data.put("courses", CourseUtils.getCourses());
		return new ModelAndView("courseFlow", "data", data);
	}

}

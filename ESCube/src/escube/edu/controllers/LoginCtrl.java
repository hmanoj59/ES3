package escube.edu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import escube.edu.DAO.UserDAO;
import escube.edu.DTO.UserDTO;
import escube.edu.models.LoginDetails;

@Controller
@SessionAttributes({ "user", "error", "page", "type" })
public class LoginCtrl {
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public ModelAndView getLogin(Model model) {
		model.addAttribute("page", "loginpage");
		return new ModelAndView("index");
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView doLogin(
			@ModelAttribute("logindetails") LoginDetails logindetails,
			Model model) {

		System.out.println(logindetails.getLoginType());
		UserDTO userDTO = UserDAO.loginUser(logindetails);;

		if (userDTO != null) {
			if (!model.containsAttribute("user")) {
				model.addAttribute("user",
						userDTO.getFname() + " " + userDTO.getLname());
			}
			model.asMap().remove("loginmessage");
			model.addAttribute("page", "homepage");
			model.addAttribute("type", logindetails.getLoginType());

			return new ModelAndView("index");
		}

		model.addAttribute("loginmessage", "Could not login. Please try again.");
		model.addAttribute("page", "loginpage");
		return new ModelAndView("index");
	}

	@RequestMapping("loginpage")
	public ModelAndView getLoginPage() {
		return new ModelAndView("loginpage", "logindetails", new LoginDetails());
	}

}

package escube.edu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import escube.edu.DAO.UserDAO;
import escube.edu.DTO.AdminDTO;
import escube.edu.DTO.LearnerDTO;
import escube.edu.DTO.TeacherDTO;
import escube.edu.DTO.UserDTO;
import escube.edu.models.NewUser;

@Controller
@SessionAttributes("page")
public class RegistrationCtrl {
	@RequestMapping("registration")
	public ModelAndView getRegisterPage(Model model) {
		model.addAttribute("page", "registerpage");
		return new ModelAndView("index");
	}

	@RequestMapping("registerpage")
	public ModelAndView getRegistrationPage() {
		return new ModelAndView("register", "newuser", new NewUser());
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public ModelAndView doRegistration(
			@ModelAttribute("newuser") NewUser newuser, Model model) {
		boolean success = false;
		UserDTO userDTO = null;
		switch (newuser.getLoginType()) {
		case 0:
			userDTO = new LearnerDTO(newuser.getFname(), newuser.getLname(),
					newuser.getAddress(), newuser.getCity(),
					newuser.getState(), newuser.getZip(),
					newuser.getPhonenumber(), newuser.getEmail(),
					newuser.getComments(), newuser.getPassword());
			break;
		case 1:
			userDTO = new TeacherDTO(newuser.getFname(), newuser.getLname(),
					newuser.getAddress(), newuser.getCity(),
					newuser.getState(), newuser.getZip(),
					newuser.getPhonenumber(), newuser.getEmail(),
					newuser.getComments(), newuser.getPassword());
			break;

		case 2:
			userDTO = new AdminDTO(newuser.getFname(), newuser.getLname(),
					newuser.getAddress(), newuser.getCity(),
					newuser.getState(), newuser.getZip(),
					newuser.getPhonenumber(), newuser.getEmail(),
					newuser.getComments(), newuser.getPassword());
			break;

		default:
			break;
		}

		if (userDTO != null) {
			success = UserDAO.persistNewUser(userDTO);
		} else {
			model.addAttribute("page", "registration");
			return new ModelAndView("index");
		}

		System.out.println("Registration: " + success);
		if (success) {
			return new ModelAndView("redirect:/login");
		} else {
			model.addAttribute("page", "registration");
			return new ModelAndView("redirect:/index");
		}
	}
}

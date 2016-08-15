package escube.edu.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import escube.edu.DAO.CourseDAO;
import escube.edu.DAO.UserDAO;
import escube.edu.DTO.CourseDTO;
import escube.edu.DTO.TeacherDTO;
import escube.edu.DTO.UserDTO;

@Controller
@SessionAttributes({ "type", "managepage" })
public class ManageCtrl {
	@RequestMapping("manage")
	public ModelAndView routeManagePage(Model model) {
		if (model.asMap().containsKey("type")) {
			int type = (int) model.asMap().get("type");
			if (type == 2) {
				model.addAttribute("page", "managepage");
			} else {
				model.addAttribute("page", "homepage");
			}
		} else {
			model.addAttribute("page", "homepage");
		}

		// remove
		model.addAttribute("page", "managepage");
		return new ModelAndView("index");
	}

	@RequestMapping("managepage")
	public ModelAndView getManagePage(Model model) {
		// remove
		if (model.asMap().containsKey("type")) {

			int type = (int) model.asMap().get("type");
			if (type == 2) {
				return new ModelAndView("manageview");
			} else {
				return new ModelAndView("homepage");
			}
		} else {
			return new ModelAndView("homepage");
		}

	}

	@RequestMapping("addcourse")
	public ModelAndView getAddCourse(Model model) {
		model.addAttribute("page", "managepage");
		model.addAttribute("managepage", "addcourseview");
		return new ModelAndView("index");
	}

	@RequestMapping("addcourseview")
	public ModelAndView getAddCourseView(Model model) {

		model.addAttribute("course", new CourseDTO());
		model.addAttribute("instructorList", UserDAO.getAllUsers(1));
		return new ModelAndView("addcourseview");
	}

	@RequestMapping("teachingrequests")
	public ModelAndView getTeachingrequests(Model model) {
		model.addAttribute("page", "managepage");
		model.addAttribute("managepage", "teachingrequestsview");
		return new ModelAndView("index");
	}

	@RequestMapping("teachingrequestsview")
	public ModelAndView getTeachingrequestsView(Model model) {
		List<UserDTO> teachers = new ArrayList<UserDTO>();
		
		teachers = UserDAO.getAllUsers(1);
		model.addAttribute("teachers", teachers);
		return new ModelAndView("teachingrequestsview");
	}

	@RequestMapping(value = "finishAddingCourse", method = RequestMethod.POST)
	public ModelAndView finishAddingCourse(
			@ModelAttribute("course") CourseDTO courseDTO) {
		CourseDAO.persistCourse(courseDTO);
		return new ModelAndView("redirect:/index");
	}
}

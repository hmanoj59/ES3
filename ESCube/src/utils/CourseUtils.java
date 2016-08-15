package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import escube.edu.DAO.CourseDAO;
import escube.edu.DTO.CourseDTO;
import escube.edu.DTO.TeacherDTO;

public class CourseUtils {
	private static List<CourseDTO> courses = null;

	static {
		courses = new ArrayList<CourseDTO>();

		CourseDTO course1 = new CourseDTO();
		course1.setCourseName("Oracle");
		TeacherDTO teacherDTO1 = new TeacherDTO();
		teacherDTO1.setFname("Vijay");
		course1.setInstructor("Vijay");
		course1.setDescription("Oracle Database 12c introduces a new multitenant architecture that makes it easy to consolidate many databases quickly "
				+ "and manage them as a cloud service. Oracle Database 12c also includes in-memory data processing capabilities delivering "
				+ "breakthrough analytical performance. Additional database innovations deliver new levels of efficiency, performance, "
				+ "security, and availability. Oracle Database 12c comes in three editions to fit your business needs and budget: Enterprise "
				+ "Edition, Standard Edition, and Standard Edition One.");
		course1.setCourseNum("Oracle 513");
		course1.setStartDate(new Date());
		course1.setEndDate(new Date());
		course1.setLocation("San Jose");
		course1.setCapacity(15);
		course1.setNumRegistered(10);
		course1.setIconUrl("cloud_computing_specialization_logo.jpg");

		CourseDTO course2 = new CourseDTO();
		course2.setCourseName("Essentials of Corporate Financial Analysis");
		TeacherDTO teacherDTO2 = new TeacherDTO();
		teacherDTO2.setFname("Vijay");
		course2.setInstructor("Vijay");
		course2.setDescription("Oracle Database 22c introduces a new multitenant architecture that makes it easy to consolidate many databases quickly "
				+ "and manage them as a cloud service. Oracle Database 22c also includes in-memory data processing capabilities delivering "
				+ "breakthrough analytical performance. Additional database innovations deliver new levels of efficiency, performance, "
				+ "security, and availability. Oracle Database 22c comes in three editions to fit your business needs and budget: Enterprise "
				+ "Edition, Standard Edition, and Standard Edition One.");
		course2.setCourseNum("Oracle 523");
		course2.setStartDate(new Date());
		course2.setEndDate(new Date());
		course2.setLocation("San Jose");
		course2.setCapacity(25);
		course2.setNumRegistered(20);
		course2.setIconUrl("cloud_computing_specialization_logo.jpg");

		CourseDTO course3 = new CourseDTO();
		course3.setCourseName("Learning How to Learn: Powerful mental tools to ");
		TeacherDTO teacherDTO3 = new TeacherDTO();
		teacherDTO3.setFname("Vijay");
		course3.setInstructor("Vijay");
		course3.setDescription("Oracle Database 32c introduces a new multitenant architecture that makes it easy to consolidate many databases quickly "
				+ "and manage them as a cloud service. Oracle Database 32c also includes in-memory data processing capabilities delivering "
				+ "breakthrough analytical performance. Additional database innovations deliver new levels of efficiency, performance, "
				+ "security, and availability. Oracle Database 32c comes in three editions to fit your business needs and budget: Enterprise "
				+ "Edition, Standard Edition, and Standard Edition One.");
		course3.setCourseNum("Oracle 533");
		course3.setStartDate(new Date());
		course3.setEndDate(new Date());
		course3.setLocation("San Jose");
		course3.setCapacity(35);
		course3.setNumRegistered(30);
		course3.setIconUrl("UCSD_BigData_PartnerProvided.jpg");

		CourseDTO course4 = new CourseDTO();
		course4.setCourseName("Oracle");
		TeacherDTO teacherDTO4 = new TeacherDTO();
		teacherDTO4.setFname("Vijay");
		course4.setInstructor("Vijay");
		course4.setDescription("Oracle Database 42c introduces a new multitenant architecture that makes it easy to consolidate many databases quickly "
				+ "and manage them as a cloud service. Oracle Database 42c also includes in-memory data processing capabilities delivering "
				+ "breakthrough analytical performance. Additional database innovations deliver new levels of efficiency, performance, "
				+ "security, and availability. Oracle Database 42c comes in three editions to fit your business needs and budget: Enterprise "
				+ "Edition, Standard Edition, and Standard Edition One.");
		course4.setCourseNum("Oracle 543");
		course4.setStartDate(new Date());
		course4.setEndDate(new Date());
		course4.setLocation("San Jose");
		course4.setCapacity(45);
		course4.setNumRegistered(40);
		course4.setIconUrl("data_mining_specialization_logo.jpg");

		CourseDTO course5 = new CourseDTO();
		course5.setCourseName("Oracle");
		TeacherDTO teacherDTO5 = new TeacherDTO();
		teacherDTO5.setFname("Vijay");
		course5.setInstructor("Vijay");
		course5.setDescription("Oracle Database 52c introduces a new multitenant architecture that makes it easy to consolidate many databases quickly "
				+ "and manage them as a cloud service. Oracle Database 52c also includes in-memory data processing capabilities delivering "
				+ "breakthrough analytical performance. Additional database innovations deliver new levels of efficiency, performance, "
				+ "security, and availability. Oracle Database 52c comes in three editions to fit your business needs and budget: Enterprise "
				+ "Edition, Standard Edition, and Standard Edition One.");
		course5.setCourseNum("Oracle 553");
		course5.setStartDate(new Date());
		course5.setEndDate(new Date());
		course5.setLocation("San Jose");
		course5.setCapacity(55);
		course5.setNumRegistered(50);
		course5.setIconUrl("cloud_computing_specialization_logo.jpg");

		CourseDTO course6 = new CourseDTO();
		course6.setCourseName("Oracle");
		TeacherDTO teacherDTO6 = new TeacherDTO();
		teacherDTO6.setFname("Vijay");
		course6.setInstructor("Vijay");
		course6.setDescription("Oracle Database 62c introduces a new multitenant architecture that makes it easy to consolidate many databases quickly "
				+ "and manage them as a cloud service. Oracle Database 62c also includes in-memory data processing capabilities delivering "
				+ "breakthrough analytical performance. Additional database innovations deliver new levels of efficiency, performance, "
				+ "security, and availability. Oracle Database 62c comes in three editions to fit your business needs and budget: Enterprise "
				+ "Edition, Standard Edition, and Standard Edition One.");
		course6.setCourseNum("Oracle 563");
		course6.setStartDate(new Date());
		course6.setEndDate(new Date());
		course6.setLocation("San Jose");
		course6.setCapacity(65);
		course6.setNumRegistered(60);
		course6.setIconUrl("BNY_hero2R3_1_.png");
		
		
		List<CourseDTO> dbCourses = CourseDAO.getCourses();
		Collections.reverse(dbCourses);
		System.out.println(dbCourses.size());
		
		
		
		courses.clear();
		courses.addAll(dbCourses);

		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		courses.add(course4);
		courses.add(course5);
		courses.add(course6);

	}

	public static List<CourseDTO> getCourses() {

		return courses;
	}

}

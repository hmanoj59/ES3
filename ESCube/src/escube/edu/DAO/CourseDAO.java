package escube.edu.DAO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.CacheMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import utils.HibernateUtils;
import escube.edu.DTO.CourseDTO;

public class CourseDAO {

	public static void persistCourse(CourseDTO course) {
		course.setStartDate(new Date());
		course.setEndDate(new Date());

		Session session = null;
		try {
			session = HibernateUtils.getSessionFactory().openSession();
			Transaction tr = session.getTransaction();
			tr.begin();
			session.save(course);
			tr.commit();
		} catch (Exception e) {
			if (session != null && session.getTransaction().isActive())
				session.getTransaction().rollback();
			e.printStackTrace();
		}
	}

	public static List<CourseDTO> getCourses() {
		Session session = null;
		List<CourseDTO> list = new ArrayList<CourseDTO>();
		try {
			session = HibernateUtils.getSessionFactory().openSession();
			Query query = session.createQuery("from CourseDTO"); 
			session.setCacheMode(CacheMode.IGNORE);
			list = query.list();
			return list;

		} catch (Exception e) {
			if (session != null && session.getTransaction().isActive())
				session.getTransaction().rollback();
			e.printStackTrace();
		}
		return list;
	}
}

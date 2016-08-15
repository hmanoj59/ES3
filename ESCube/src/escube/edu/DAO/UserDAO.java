package escube.edu.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import utils.HibernateUtils;
import escube.edu.DTO.UserDTO;
import escube.edu.models.LoginDetails;

public class UserDAO {

	public static UserDTO loginUser(LoginDetails loginDetails) {
		System.out.println(loginDetails.getUsername());
		Session session = null;
		try {
			session = HibernateUtils.getSessionFactory().openSession();

			String sql = "";
			switch (loginDetails.getLoginType()) {
			case 0:
				sql = "from LearnerDTO where EMAIL = :email";
				break;
			case 1:
				sql = "from TeacherDTO where EMAIL = :email";
				break;
			case 2:
				sql = "from AdminDTO where EMAIL = :email";
			default:
				break;
			}
			Query query = session.createQuery(sql);
			query.setParameter("email", loginDetails.getUsername());

			UserDTO userDTO = (UserDTO) query.uniqueResult();
			if (userDTO.getPassword().equals(loginDetails.getPassword())) {
				return userDTO;
			}
			return null;

		} catch (Exception e) {
			if (session != null && session.getTransaction().isActive())
				session.getTransaction().rollback();
			e.printStackTrace();
		}
		return null;
	}

	public static boolean persistNewUser(UserDTO newUser) {
		Session session = null;
		try {
			session = HibernateUtils.getSessionFactory().openSession();
			Transaction tr = session.getTransaction();
			tr.begin();
			session.save(newUser);
			tr.commit();
		} catch (HibernateException he) {
			if (session != null && session.getTransaction().isActive())
				session.getTransaction().rollback();
			he.printStackTrace();
			return false;
		}
		return true;
	}
	
	public static List<UserDTO> getAllUsers(int type){
		List<UserDTO> userDTO;
		Session session = null;
		try {
			session = HibernateUtils.getSessionFactory().openSession();

			String sql = "";
			switch (type) {
			case 0:
				sql = "from LearnerDTO";
				break;
			case 1:
				sql = "from TeacherDTO";
				break;
			case 2:
				sql = "from AdminDTO";
			default:
				break;
			}
			Query query = session.createQuery(sql);
			

			userDTO = query.list();
			return userDTO;

		} catch (Exception e) {
			if (session != null && session.getTransaction().isActive())
				session.getTransaction().rollback();
			e.printStackTrace();
		}
		return null;
	
	}
}

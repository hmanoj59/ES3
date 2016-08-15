package escube.edu.DTO;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "teacher", catalog = "escube")
public class TeacherDTO extends UserDTO {
	public TeacherDTO() {
		// TODO Auto-generated constructor stub
	}

	public TeacherDTO(String fname, String lname, String address, String city,
			String state, String zip, String phonenumber, String email,
			String comments, String password) {
		super(fname, lname, address, city, state, zip, phonenumber, email,
				comments, password);
	}
}

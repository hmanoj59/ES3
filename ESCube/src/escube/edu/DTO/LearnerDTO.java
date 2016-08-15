package escube.edu.DTO;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "learner", catalog = "escube")
public class LearnerDTO extends UserDTO {
	public LearnerDTO() {
		// TODO Auto-generated constructor stub
	}

	public LearnerDTO(String fname, String lname, String address, String city,
			String state, String zip, String phonenumber, String email,
			String comments, String password) {
		super(fname, lname, address, city, state, zip, phonenumber, email,
				comments, password);
	}
}

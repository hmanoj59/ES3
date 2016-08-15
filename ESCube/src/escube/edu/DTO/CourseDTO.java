package escube.edu.DTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import escube.edu.models.Instructor;

@Entity
@Table(name = "course", catalog = "escube")
public class CourseDTO {
	private int id;
	private String courseName;
	private String instructor;
	private String description;
	private String courseNum;
	private Date startDate;
	private Date endDate;
	private String scheduledDates;
	private String location;
	private int capacity;
	private int numRegistered;
	private String iconUrl;

	public CourseDTO() {
		// TODO Auto-generated constructor stub
	}

	public CourseDTO(String name, String instructor, String description,
			String courseNum, Date startDate, Date endDate,
			String scheduledDates, String location, int capacity,
			int numRegistered) {
		super();
		this.courseName = name;
		this.instructor = instructor;
		this.description = description;
		this.courseNum = courseNum;
		this.startDate = startDate;
		this.endDate = endDate;
		this.scheduledDates = scheduledDates;
		this.location = location;
		this.capacity = capacity;
		this.numRegistered = numRegistered;
	}


	@Id
	@GenericGenerator(name = "kaugen", strategy = "increment")
	@GeneratedValue(generator = "kaugen")
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "coursename", unique = false, nullable = true)
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String name) {
		this.courseName = name;
	}

	@Column(name = "instructorid", unique = false, nullable = true)
	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	@Column(name = "description", unique = false, nullable = true)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "coursenum", unique = false, nullable = true)
	public String getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}

	@Column(name = "startdate", unique = false, nullable = true)
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Column(name = "enddate", unique = false, nullable = true)
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Column(name = "schedules", unique = false, nullable = true)
	public String getScheduledDates() {
		return scheduledDates;
	}

	public void setScheduledDates(String scheduledDates) {
		this.scheduledDates = scheduledDates;
	}

	@Column(name = "location", unique = false, nullable = true)
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name = "capacity", unique = false, nullable = true)
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Column(name = "numregistered", unique = false, nullable = true)
	public int getNumRegistered() {
		return numRegistered;
	}

	public void setNumRegistered(int numRegistered) {
		this.numRegistered = numRegistered;
	}

	@Column(name = "icon", unique = false, nullable = true)
	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

}

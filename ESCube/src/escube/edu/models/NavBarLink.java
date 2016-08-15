package escube.edu.models;

import java.util.ArrayList;
import java.util.List;

public class NavBarLink {
	private String name;
	private boolean isDropDown;
	private String linkPage;
	private String cssID;
	List<String> dropDownLinks = new ArrayList<String>();
	
	public List<String> getDropDownLinks() {
		return dropDownLinks;
	}

	public void setDropDownLinks(List<String> dropDownLinks) {
		this.dropDownLinks = dropDownLinks;
	}

	public NavBarLink(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isDropDown() {
		return isDropDown;
	}

	public void setDropDown(boolean isDropDown) {
		this.isDropDown = isDropDown;
	}

	public String getLinkPage() {
		return linkPage;
	}

	public void setLinkPage(String linkPage) {
		this.linkPage = linkPage;
	}

	public String getCssID() {
		return cssID;
	}

	public void setCssID(String cssID) {
		this.cssID = cssID;
	}

}

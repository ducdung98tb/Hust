package object;
import java.util.Date;
public class HustPerson {
	protected String fullName;
	protected String personId;
	protected String lastName;
	protected String middleName;
	protected String firstName;
	protected Date dateBirth;
	
	
	public HustPerson(String fullName, String personId) {
		super();
		this.fullName = fullName;
		this.personId = personId;
		this.setFullName(fullName);
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		String[] names = fullName.split(" ");
		this.firstName = names[0];
		this.lastName = names[names.length - 1];
		this.middleName = "";
		for(int i=1; i < names.length-1 ; i++)
			this.middleName += names[i] + " ";
		this.fullName = fullName;
	}
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public Date getDateBirth() {
		return dateBirth;
	}
	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}
	public String getLastName() {
		return lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public String getFirstName() {
		return firstName;
	}
}

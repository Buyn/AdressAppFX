/**
 * 
 */
package freeman.buyn.adressappfx.model;

import java.time.LocalDate;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import freeman.buyn.adressappfx.util.DateUtil.LocalDateAdapter;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


/**
 * Model class for a Person.
 *
 * @author BuYn
 *
 */
public class Person {
    private StringProperty firstName;
    private StringProperty lastName;
    private StringProperty street;
    private IntegerProperty postalCode;
    private StringProperty city;
    private ObjectProperty<LocalDate> birthday;

    /**
     * Constructor with some initial data.
     * 
	 * @param firstName
	 * @param lastName
	 */
	public Person(String firstName, String lastName) {
		this.firstName = new SimpleStringProperty(firstName);
		this.lastName = new SimpleStringProperty(lastName);
		this.street = new SimpleStringProperty("street");
		this.postalCode = new SimpleIntegerProperty(1119);
		this.city = new SimpleStringProperty("city");
		this.birthday = new SimpleObjectProperty<LocalDate>(LocalDate.of(1999, 1, 1));
		//System.out.println("person add from constrakt");
	}

	/**
     * Default constructor.
	 */
	public Person() {
		this(null, null);
	}
	
	public String getFirstName() {
        return firstName.get();
    }
    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }
    public StringProperty firstNameProperty() {
        return firstName;
    }
    public String getLastName() {
        return lastName.get();
    }
    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }
    public StringProperty lastNameProperty() {
        return lastName;
    }
    public String getStreet() {
        return street.get();
    }
    public void setStreet(String street) {
        this.street.set(street);
    }
    public StringProperty streetProperty() {
        return street;
    }
    public int getPostalCode() {
        return postalCode.get();
    }
    public void setPostalCode(int postalCode) {
        this.postalCode.set(postalCode);
    }
    public void setPostalCode(String text) {
    	this.postalCode.set(Integer.parseInt(text));
    }
    public IntegerProperty postalCodeProperty() {
        return postalCode;
    }
    public String getCity() {
        return city.get();
    }
    public void setCity(String city) {
        this.city.set(city);
    }
    public StringProperty cityProperty() {
        return city;
    }
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public LocalDate getBirthday() {
        return birthday.get();
    }
    public void setBirthday(LocalDate birthday) {
        this.birthday.set(birthday);
    }
    public ObjectProperty<LocalDate> birthdayProperty() {
        return birthday;
    }

}

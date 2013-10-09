package p6changeModifiers;

/**
 * @author nik
 */
public class DisorderedOffice {
  private String country;

  public DisorderedOffice(String country, String city, String address, String phoneNumber, int numberOfFloors, int numberOfRooms) {
    this.country = country;
    this.city = city;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.numberOfFloors = numberOfFloors;
    this.numberOfRooms = numberOfRooms;
  }

  private String city;

  private String address;

  public void printInfo() {
    printLocation();
    printPhone();
  }

  private String phoneNumber;

  private int numberOfFloors;

  private void printPhone() {
    System.out.println(phoneNumber);
  }

  private int numberOfRooms;

  private void printLocation() {
    System.out.println(address + ", " + city + ", " + country);
  }
}

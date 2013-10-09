package p6changeModifiers;

/**
 * @author nik
 */
public class Office {
  private String country;
  private String city;
  private String address;
  private String phoneNumber;
  private int numberOfFloors;
  private int numberOfRooms;

  public Office(String country, String city, String address, String phoneNumber, int numberOfFloors, int numberOfRooms) {
    this.country = country;
    this.city = city;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.numberOfFloors = numberOfFloors;
    this.numberOfRooms = numberOfRooms;
  }

  public void printInfo() {
    printLocation();
    printPhone();
  }

  private void printPhone() {
    System.out.println(phoneNumber);
  }

  private void printLocation() {
    System.out.println(address + ", " + city + ", " + country);
  }
}

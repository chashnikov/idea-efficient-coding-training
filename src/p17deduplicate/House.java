package p17deduplicate;

import java.util.List;

/**
 * @author nik
 */
public class House {
  private final List<Pet> dogs;
  private final List<Pet> cats;

  public House(List<Pet> dogs, List<Pet> cats) {
    this.dogs = dogs;
    this.cats = cats;
  }

  public void printOldPets() {
    //extract common code
    for (Pet dog : dogs) {
      if (dog.getAge() > 5) {
        System.out.println(dog.getName());
      }
    }
    for (Pet cat : cats) {
      if (cat.getAge() > 3) {
        System.out.println(cat.getName());
      }
    }
  }

}

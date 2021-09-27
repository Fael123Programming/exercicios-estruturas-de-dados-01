package _testing_java_lang.collections_framework.ordenation;

/***
 * This very class was created only for the purpose to demonstrate how the method
 * compareTo() implemented in java.lang.Comparable interface functions!
 * This method of Comparable is used in the method sort of the class Collections
 * to sort a list of elements depending on the implementation of compareTo.
 * Talking about its way, it sorts in an increasing ordering: if this method
 * returns -1 it means that the current object which is calling the method is
 * less than the other being compared with; if returns 1 it means the opposite;
 * if returns 0 it means both these objects are equal.
 * It is obliged to obey the method signature: the same type you wrote when implementing
 * the interface Comparable has to be a parameter of compareTo(), that is, we are
 * comparing same-type objects!
 * Finally, it is strongly recommended that the natural ordering of a class (and then,
 * the implementation of compareTo method) be consistent with the idea of equality and
 * inequality between objects of this very class: if compareTo() returns 0 is that because
 * equals() would return true.
 */

public class Car implements Comparable<Car> {

    private String brand, model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object anotherObject) {
        if (!(anotherObject instanceof Car casted)) return false;
        return (this.brand.equals(casted.getBrand()) && this.model.equals(casted.getModel()) && this.year == casted.getYear());
    }

    @Override
    public String toString() {
        return String.format("Brand: %s - Model: %s - Year (manufacture): %d", this.brand, this.model, this.year);
    }

    /*
     * This implementation does not follow what is recommended to do in Java core: the natural ordering of a class would
     * be better if it is consistent with the method equals.
     */
    @Override
    public int compareTo(Car anotherCar) {
        return Integer.compare(this.year,anotherCar.getYear());
        //Calling the method above is the same as to write the following code!
        /*
          if (this.year < anotherCar.year) return -1; //'this' goes downward.
          if (this.year > anotherCar.year) return 1; //'this' goes upward.
          return 0; //this.equals(anotherCar) would be true if we are doing what is recommended!.
        */
    }
}

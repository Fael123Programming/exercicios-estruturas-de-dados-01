package exercise_car_wash;
public class Car implements Comparable<Car>{
    private String brand;
    private String model;
    private String color;
    private String owner;
    private int identification;
    
    public Car(String brand,String model,String color,int identification,String owner){
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.identification=identification;
        this.owner=owner;
    }
    
    public Car(int ident){
        this.identification=ident;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    public int getIdentification(){
        return this.identification;
    }
    
    public void setIdentification(int newIdent){
        this.identification=newIdent;
    }
    
    @Override
    public String toString(){
        return String.format("##### Marca: %s     Modelo: %s     Cor: %s     "
                + "Identificacao: %d     Dono(a): %s ########",
        this.brand,this.model,this.color,this.identification,this.owner);
    }
    
    @Override
    public int compareTo(Car anotherCar){//It sorts from less identification codes to greater ones.
        if(this.identification<anotherCar.getIdentification()) return -1;
        else if(this.identification>anotherCar.getIdentification()) return 1;
        return 0;
    }
}

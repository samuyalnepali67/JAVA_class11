//Create a class 'Car' with a parameterized constructor (model, year). print the values.
public class CarModel {

    String model;
    int year;
  

   CarModel( String model, int year){

    
     this.model = model;
     this.year = year;

   }


    void displayInfo(){
     System.out.println("Car Model: " + model);
     System.out.println(" Year: " + year);
    }

    public static void main(String[] args) {
        CarModel car = new CarModel("Toyota", 2020);
        car.displayInfo();
    }

    
    
        

   
}

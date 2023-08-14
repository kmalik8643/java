public class car extends vehicle{
    String modelName="Ford";
    public void model(){
        System.out.println(super.modelName);
    }

    public static void main(String[] args) {

        car myFastCar = new car();
        myFastCar.horn();
        System.out.println(myFastCar.vehicle + " " + myFastCar.modelName);
    }
}

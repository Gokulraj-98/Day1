// class Newclass{
// public int newMeth(int a,int b){
// return a+b;
// }
// }


// public class practice{
// public static void main(String[] args) {
//     System.out.println("hi");
//     methodOne();
//  Newclass newClass = new Newclass();
//  System.out.println(newClass.newMeth(3, 4));
// }
// public static void methodOne(){
//     System.out.println("method 1");
// }
// }

// class Try implements practice{

//    public static void methodOne(){
// System.err.println("from try");
//    }
   
//    public static void main(String[] args) {
//     practice.methodOne();
//     methodOne();
//    }


// }

class Car{
    int speed;
    String colour;

     Car(int speed,String colour){
        this.speed=speed;
        this.colour=colour;

    }

    public void run(){
        System.err.println("running");
    }


}
public class practice{
   

    
public static void main(String[] args) {
    int [][] multiArray ={{1,2,3},{4,5,6}};
    Car audi = new Car(100,"Black");
    Car BMW = new Car(200,"white");
    audi.run();
    System.out.println(audi.colour +" " +audi.speed);
    System.out.println(BMW.colour);
    System.out.println(multiArray[0][2]);


}
}
package hello.com;
// Problem #1:
//class Employee5{
//    String name;
//    int id;
//    int salary;
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void printdetails(){
//        System.out.println("Name: " + getName());
//        System.out.println("Salary:  " + getSalary());
//        System.out.println("Id :" + getId());
//    }
//
//}
               //  Problem #2:
//class cellphone{
//    public void ring(){
//        System.out.println("ringing....");
//    }
//    public void vibrate(){
//        System.out.println("vibrating....");
//    }
//    public void callfriend(){
//        System.out.println("call friend....");
//    }
//}
//                 Problem#3:
//class square{
//    int side;
//    public int area(){
//        return side * side;
//    }
//    public int perimeter(){
//        return 4 * side;
//    }
//}
//           Problem # 4:
//class  rectangle{
//    int length;
//    int width;
//    public int area(){
//        return length * width;
//    }
//    public int perimeter(){
//        return 2 * (width + length);
//    }
//}
//            Problem # 5:
//class TommyVecetti_for_Rockstar {
//    public void hitting(){
//        System.out.println("hitting....");
//    }
//    public void running(){
//        System.out.println("running....");
//    }
//    public void firing(){
//        System.out.println("firing...");
//    }
//        }
//        Problem #6:
class circle{
    double pi;
    double radius;
    public double area(){
        return pi*(radius * radius);
    }
    public double perimeter(){
        return 2*pi*radius;
    }
}

public class Practice_test_Lec_39 {
    public static void main(String[] args) {
        // Problem #1:

//Employee5 a = new Employee5();
//a.getName();
//a.setName("Raja");
//a.salary = 10000;
//a.getSalary();
//a.setId(1);
//a.printdetails();
//    }
//}
// Problem#2;
// cellphone iphone = new cellphone();
// iphone.ring();
// iphone.vibrate();
// iphone.callfriend();
//    }
//}
        //                     Problem # 3;
//        square sq = new square();
//        sq.side = 3;
//        sq.area();
//        sq.perimeter();
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());
//    }
//}
        //           Proble # 4:
//rectangle rec = new rectangle();
//rec.width= 122;
//rec.length = 113;
//rec.area();
//rec.perimeter();
//        System.out.println("The area of reectangle is : " + rec.area() );
//        System.out.println("The perimeter of reectangle is : " + rec.perimeter() );
//        System.out.println("Here I'm going to be an oop developer InshaAllah Soon");
//    }
//}
        // Problem # 5:
//    TommyVecetti_for_Rockstar tv = new TommyVecetti_for_Rockstar();
//    tv.hitting();
//    tv.running();
//    tv.firing();
//    }
// }
        circle ci = new circle();
        ci.pi = 3.14;
        ci.radius = 7;
        ci.area();
        ci.perimeter();
        System.out.println("The area of circle is: " + ci.area());
        System.out.println("The perimeter of circle is: " + ci.perimeter());
    }
}
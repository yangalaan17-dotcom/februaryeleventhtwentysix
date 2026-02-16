public class CatEats implements InterfaceRestaurant, InterfaceTax {
public void eat() {
System.out.println("Cat food processing");
}
public void pay(){
System.out.println("Credit card issued by cat union.");
}
public void catName(){
System.out.println("Hi, I am Tom");
}
public double taxRate(){
return 0.06625;
}
}

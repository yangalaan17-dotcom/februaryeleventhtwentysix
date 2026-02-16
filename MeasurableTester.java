public class MeasurableTester {
    Measurable[] accounts = new Measurable [3];
    accounts [0]= new BankAccount (0); // Use the • interface as the container for its implementation.
    accounts [1] = new BankAccount (10000); accounts [2] = new BankAccount ( 2000);
    double averageBalance = average(accounts);
    System.out.println("Average balance:"+ averageBalance);
    System.out.println("Expected: 4000");
}

public class PolyTester {
    public static double average(Measurable[] objects){
        double sum = 0.0;
        for(Measurable obj: objects){
            sum += obj.getMeasure();
        }
        if(objects.length > 0) {return sum/objects.length;}
        else {return 0;}  
        }
    }

    public static void main(String[] args){
        Measurable[] accounts = new Measurable[3];
        accounts[0] = new BankAccount(0);
        accounts[1] = new BankAccount(10000);
        accounts[2] = new BankAccount(2000);

        System.out.println("The average is " + average(accounts));
    }
}

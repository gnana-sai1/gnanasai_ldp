package com.core.java.assignment7;

class Cycle{
    public void ride(){
        System.out.println("Riding a cycle...");
    }
}

class Unicycle extends Cycle{
    public void balance(){
        System.out.println("Balancing a unicycle...");
    }
}

class Bicycle extends Cycle{
    public void balance(){
        System.out.println("Balancing a bicycle...");
    }
}

class Tricycle extends Cycle{

}

public class Task2 {
    public static void main(String[] args) {

        Cycle[] cycles= new Cycle[3];

        Unicycle unicycle = new Unicycle();
        Bicycle bicycle =new Bicycle();
        Tricycle tricycle = new Tricycle();

        cycles[0]=unicycle;
        cycles[1]=bicycle;
        cycles[2]=tricycle;

        for(int i=0;i<3;i++){
            cycles[i].ride();
            //cycles[i].balance();
        }

        for (int i=0;i<3;i++){
            if(cycles[i] instanceof Unicycle){
                Unicycle unicycle1 = (Unicycle) cycles[i];
                unicycle1.balance();
            }
            else if (cycles[i] instanceof Bicycle) {
                Bicycle bicycle1 = (Bicycle) cycles[i];
                bicycle1.balance();

            }
        }


    }
}

package priorityQueue;

import java.util.PriorityQueue;

public class Main {

    public static void main(String [] args){
        PriorityQueue<Ticket> myPriorityList = new PriorityQueue<>();

        Ticket ticket1 = new Ticket("Winsted", "Orrzo, Bobby");
        Ticket ticket2 = new Ticket("Manchester", "Windmill, Sandy");
        Ticket ticket3 = new Ticket("Honolulu", "Pine, Rhona");
        Ticket ticket4 = new Ticket("Nashville", "Orbitz, Nate");

        myPriorityList.add(ticket1);
        myPriorityList.add(ticket2);
        myPriorityList.add(ticket3);
        myPriorityList.add(ticket4);

        while(!myPriorityList.isEmpty()){
            System.out.println(myPriorityList.poll().getCity());
        }
    }
}

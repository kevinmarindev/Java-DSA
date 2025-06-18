package priorityQueue;

// the priority queue will hold tickets and determine which ticket has the highest priority
public class Ticket implements Comparable<Ticket>{
    private String city;
    private String holder;

    public Ticket(String city, String holder){
        this.city = city;
        this.holder = holder;
    }

    public String getCity(){
        return this.city;
    }

    public String getHolder(){
        return this.holder;
    }


    @Override
    public String toString(){
        return "Next on the list" + this.holder + " from " + this.city;
    }


//    The compareTo method should define a natural ordering for objects of your class. In general, it should:
//    Return a negative integer if this object is less than the other.
//    Return zero if they are equal.
//    Return a positive integer if this object is greater than the other.
    @Override
    public int compareTo(Ticket otherTicket){
        int theResult = this.city.compareTo(otherTicket.city);
        // if the result is 0 they are the same and we use another property to compare
        if (theResult == 0) {
            theResult = this.holder.compareTo(otherTicket.holder);
        }
        return theResult;
    }
}

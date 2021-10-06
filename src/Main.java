import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    LinkedList<String> placesToVisit = new LinkedList<String>();

    addInOrder(placesToVisit, "Sydney");
    addInOrder(placesToVisit, "Perth");
    addInOrder(placesToVisit, "Brisbane");
    addInOrder(placesToVisit, "Alice Springs");
    addInOrder(placesToVisit, "Brisbane");

    visit(placesToVisit);
    }

    public static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("----------------");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
//        ListIterator gives you the capability to access previous iterated data values
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){
//            to access the first entry it is necessary to first do .hasNext() method
            int comparison = stringListIterator.next().compareTo(newCity);
//            0 it means equal, do not add
            if(comparison == 0){
                System.out.println(newCity+ " is already a destination.");
                return false;
//                new city should appear before this one
            }else if(comparison > 0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
//                move on to next city
            }else if(comparison < 0){
                stringListIterator.hasNext();
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> linkedList){
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        boolean goingForward = true;

        ListIterator<String> listIterator = linkedList.listIterator();

        if(linkedList.isEmpty()){
            System.out.println("No cities in the itinerary");

        }else{
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday is over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println(("Now visiting " + listIterator.next()));
                    }else{
                        System.out.println("Reached the end of the list");
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                        listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now going back to previous city " + listIterator.previous());
                    }else{
                        System.out.println("You are in the beginning of the list");
                    }
                    break;
            }
        }

    }
    public static void printMenu(){
        System.out.println("Select An option: \n press" +
                "0 - to quit" +
                "1 - to visit next" +
                "2 - to visit previous");

    }

}

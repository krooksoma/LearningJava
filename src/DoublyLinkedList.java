import javax.swing.*;

public class DoublyLinkedList {
    private Link first;
    private Link last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public Boolean isEmpty()
    { return first == null; }

    public void insertFirst( long dd){
        Link newLink = new Link(dd);

        if( isEmpty())
        last = newLink;
//        if the list is empty the first item will be the last item of the list
        else
//        otherwise, it will change the old first to point to the new link
            first.previous = newLink;
//        changes the next field in the new link to point to the old first
        newLink.next = first;
//        sets the first to point to the new Link
        first = newLink;
    }

    public void insertLast(long dd){
        Link newLink = new Link(dd);
        if(isEmpty())
            first = newLink;
        else{
//            old last points to the new link
            last.next = newLink;
//            new link points to the old last
            newLink.previous = last;
        }
//        new Link points to the next
        last = newLink;
    }

    public Link deleteFirst(){
        Link temp = first;
        if(first.next == null){
//            if only one item on the list it sets the last as null
            last = null;
        }else
//            old next points to null
            first.next.previous = null;
//        first points to old next
        first = first.next;
        return temp;
    }

    public Link deleteLast(){
        Link temp = last;
        if(first.next == null)
//            if only one item on the list first is set to null
            first = null;
        else
//           the old previous will point to null(end of list)
            last.previous.next = null;
//        the new last item will be the previous item
        last = last.previous;
        return temp;
    }

    public Boolean insertAfter(long key, long dd){
        Link current = first;

        while(current.dData != key){
//            until match is not found while loop evaluates the next key
            current = current.next;
            if(current == null)
//                if not matches are found return false
                return false;
        }
        Link newLink = new Link(dd);
        if (current == last){
//            if last link new link's next will point to the end of the list
            newLink.next = null;
//            and the new link will be set as the last item
            last = newLink;
        }else{
//           if not last newLink points to the old next
            newLink.next = current.next;
//            old next point to the newLink
            current.next.previous = newLink;
        }
//        newLink points to the old current
        newLink.previous = current;
//        old current point to the newLink
        current.next = newLink;
        return true;

    }

    public Link deleteKey(long key){
        Link current = first;

        while(current.dData !=key ){
//            while the current data key is not the correct key, keep searching
            current = current.next;
//            not found, return null
            if(current == null){
                return null;
            }
        }
        if(current == first){
//          found it on the first item on the list?
            first = current.next;
        }else{
            current.previous.next = current.next;
        }
        if(current == last)
            last = current.previous;
        else{
            current.next.previous = current.previous;
        }
        return current;
    }

    public void displayForward(){
        System.out.println("List ( first ==> last ): ");
        Link current = first;
//        start at the beginning until the last item on the list
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }

    public void displayBackwards(){
        System.out.println(" List (last --> first): ");
        Link current = last;

        while(current != null){
            current.displayLink();
            current = current.previous;
        }
        System.out.println(" ");
    }
}
/*
*     DoublyLinkedList theList = new DoublyLinkedList();

    theList.insertFirst(25);
    theList.insertFirst(33);
    theList.insertFirst(107);
    theList.displayForward();

    theList.insertLast(56);
    theList.insertLast(88);
    theList.insertLast(59);
    theList.displayBackwards();

    theList.deleteFirst();
    theList.deleteKey(107);

    theList.insertAfter(33,666);

    theList.displayForward();* */

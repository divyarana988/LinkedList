public class Main {
    public static class Node {
        int data; 
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;
    }

    public int size(){
        return this.size;
    }

    public void display(){
        Node temp = head;
        if(size!=0){
            while(temp!=null){
                System.out.print(temp.data + "");
                temp = temp.next;
            }
            System.out.println();
        }
    }

}
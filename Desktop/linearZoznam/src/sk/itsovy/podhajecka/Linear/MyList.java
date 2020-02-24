package sk.itsovy.podhajecka.Linear;

public class MyList {
    private Node head;

    public MyList(Node head) {
        this.head = null;
    }
    public void addToFront(Node node) {
        if (node == null)
            return;
        if (head == null) {
            head = node;
        } else {
            node.setNext(head);
            head = node;
        }
    }
    public void addToEnd(Node node){
        if (node == null)
            return;
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(node);
    }
    public void add(int position,Node node){
        if (node == null)
            return;
        if(position <= 0){
            addToFront(node);
        }else if(getSize() <= position){
            addToEnd(node);
        }else{
            Node temp = head;
            for(int i = 1; i < position; i++){
                    temp = temp.getNext();
            }
            node.setNext(temp.getNext());
            temp.setNext(node);
        }
    }
    public int getSize(){
        int size = 0;
        Node temp = head;
        while (temp.getNext() != null) {
            size ++;
            temp = temp.getNext();
        }
        return size;
    }
    public void print() {
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.getName() + " ");
                temp = temp.getNext();
            }
        }
    }
    public boolean remove(Node node){
        if (head == null || node == null)
            return false;
        if(head == node) {
            head = node.getNext();
            return true;
        }
        Node temp = head;
        while (temp.getNext() != node) {
            temp = temp.getNext();
            if(temp == null){
                return false;
            }
        }
        temp.setNext(temp.getNext().getNext());
        return true;
    }
    public void removeAll(){
        head = null;
    }
    public Node findByValue(String name) {
        if (name == null || head == null) {
            System.out.println("Linear list is empty");
            return null;
        }

        Node temp = head;
        if (!(temp.getName() instanceof String ))
            return null;

            while (temp != null) {
                if (temp.getName().equals(name)) {
                    return temp;
                }
                temp = temp.getNext();
            }
            return null;
    }
}

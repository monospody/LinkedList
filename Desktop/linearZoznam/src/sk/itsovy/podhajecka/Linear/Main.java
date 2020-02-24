package sk.itsovy.podhajecka.Linear;

public class Main {

    public static void main(String[] args){
        MyList m = new MyList(new Node<String>("aaa"));
        m.addToFront(new Node<String>("A"));
        m.addToFront(new Node<String>("b"));
        m.addToFront(new Node<String>("c"));
        m.addToFront(new Node<String>("d"));
        m.addToFront(new Node<String>("e"));

        m.add(10,new Node<String>("x"));
        m.add(-1,new Node<String>("y"));
        Node n = new Node<String>("FF");

        m.add(5,n);
        m.print();
        System.out.println(m.getSize());
        m.findByValue("FF");
        m.remove(n);
        m.findByValue("c");
        m.remove(m.findByValue("A"));

        m.print();
    }
}

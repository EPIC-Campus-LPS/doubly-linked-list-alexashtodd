public class Node<E> {
    private E name;
    private Node<E> next;
    private Node<E> prev;

    public Node(E name) {
        this.name = name;
        this.next = null;
        this.prev = null;
    }

    public Node(E name, Node<E> prev) {
        this.name = name;
        this.next = null;
        this.prev = prev;
    }

    // You can add accessor (getter) and mutator (setter) methods here if needed
    public E getValue() {
        return name;
    }

    public void setValue(E name) {
        this.name = name;
    }

    public Node<E> getNextNode() {
        return next;
    }

    public void setNextNode(Node<E> next) {
        this.next = next;
    }

    public Node<E> getPrevNode() {
        return prev;
    }

    public void setPrevNode(Node<E> prev) {
        this.prev = prev;
    }

    public String toString(){
        return "Node(" + getValue().toString() + ")";
    }

    public boolean equals(Node<E> node) {
        if (node.getValue().equals(this.getValue())) {
            return true;
        }
        else {
            return false;
        }
    }
}
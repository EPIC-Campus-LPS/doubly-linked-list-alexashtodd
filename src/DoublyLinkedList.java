public class DoublyLinkedList<E> implements List {

    Node<E> head;

    public DoublyLinkedList(){
        head = null;
    }

    @Override
    public void add(Object element) {
        if(head == null){
            head = new Node<>((E) element);
            return;
        } else {
            Node<E> temp = end_of_list();
            Node<E> newNode = new Node<>((E) element);//at where(end_of_list) idk how to implment
            temp.setNextNode(newNode);
            newNode.setPrevNode(temp);
        }
        // Find end of list and add onto it
    }

    @Override
    public void add(int i, Object element) throws IndexOutOfBoundsException {
        if(head == null){
            head = new Node<>((E) element);
        } else {
            Node<E> temp = xOfList(i);
            Node<E> newNode = new Node<>((E) element);//at where(end_of_list) idk how to implment
            temp.setNextNode(newNode);
            newNode.setPrevNode(temp);
        }
    }

    @Override
    public Object remove() {
        Node<E> temp = end_of_list();
        Node<E> tempn = temp.getNextNode();
        Node<E> tempp = temp.getPrevNode();
        if (temp.getNextNode() != null){
            temp.setPrevNode(tempn);
        }
        if (temp.getPrevNode() != null){
            temp.setNextNode(tempp);
        }
        return null;
    }

    @Override
    public Object remove(int i) throws IndexOutOfBoundsException {
        Node<E> temp = xOfList(i);
        Node<E> tempn = temp.getNextNode();
        Node<E> tempp = temp.getPrevNode();
        if (temp.getNextNode() != null){
            temp.setPrevNode(tempn);
        }
        if (temp.getPrevNode() != null){
            temp.setNextNode(tempp);
        }
        return null;
    }

    @Override
    public Node get(int i) throws IndexOutOfBoundsException {
        Node<E> temp = xOfList(i);
        return temp;
    }

    @Override
    public void set(int i, Object element) throws IndexOutOfBoundsException {
        Node<E> temp = xOfList(i);
        temp.setValue((E) element);
    }

    @Override
    public int size() {
        Node<E> temp = head;
        int count = 0;
        while(temp.getNextNode() != null){
            temp = temp.getNextNode();
            count++;
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    public Node<E> end_of_list(){
        Node<E> temp = head;
        while(temp.getNextNode() != null){
            temp = temp.getNextNode();
        }
        return(temp);
    }

    public Node<E> xOfList(int x){
        Node<E> temp = head;
        int count = 0;
        while(temp.getNextNode() != null && count < x){
            temp = temp.getNextNode();
            count++;
        }
        return(temp);
    }

    public String toString(){
        String result = "";
        Node<E> temp = head;
        if(temp == null){
            result += "{}";
            return result;
        }
        result += temp;
        while(temp.getNextNode() != null){
            temp = temp.getNextNode();
            result += temp;
        }
        return result;
    }
}



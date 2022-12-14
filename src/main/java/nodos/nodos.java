package nodos;

public class nodos {
    public class LinkedListStack implements Stack  {
        private static class Node {
            Object o;
            Node next;
        }

        private Node top = null;

        public boolean isEmpty () {
            return top == null;
        }

        public Object peek () {
            if (top == null)
                throw new java.util.EmptyStackException ();
            return top.o;
        }

        public void push (Object o) {
            Node temp = new Node ();
            temp.o = o;
            temp.next = top;
            top = temp;
        }

        public Object pop () {
            if (top == null)
                throw new java.util.EmptyStackException ();
            Object o = top.o;
            top = top.next;
            return o;
        }
    }
}

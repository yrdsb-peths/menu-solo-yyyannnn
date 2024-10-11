class Stack<Type>
{
    private Node first;

    private class Node {
        private Type item;
        private Node next;
    }

    /**
    * Returns if first is null 
    */
    public boolean isEmpty()
    {
        return first == null;
    }

    /**
    * Adds a String to the front of the stack
    */
    public void push(Type item)
    {
        Node second = first; 
        first = new Node();
        first.item = item;
        first.next = second;
    }

    /**
    * Removes and returns the first element on the stack.
    */
    public Type pop()
    {
        Type ref = first.item;
        first = first.next;
        return ref; 
    }

     /**
    * Returns the first element on the stack
    */
    public Type peek()
    {
        return first.item;
    }
}
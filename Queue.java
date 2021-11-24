public class Queue<T>
{
    //fields
    Node<T> head;
    int size;



    /**
     * constructor, initializes stuff
     */
    public Queue()
    {
        //list starts out empty
        head = null;
        size = 0;

    }




    /**
     * helper method to print all the nodes in the list
     */
    public void printAllNodes()
    {
        Node<T> current = head;

        //make sure there is a queue to print
        if(head != null)
        {
            String toPrint = "Current stack: ";

            //loop through list and print each node
            while(current != null)
            {
                toPrint += (current.data + " ");

                current = current.next;
            }

            System.out.println(toPrint);
        }

    }


    /**
     * getter method for size
     * @return size of linked list
     */
    public int size()
    {
        return size;
    }





    /**
     * method to add a node to the end of the list
     */
    public void enQueue(T d)
    {
        //create the new node
        Node<T> newNode = new Node<T>(d);

        //check to see if the list is empty or not
        if(head == null)
        {
            //set the head to be the new node
            head = newNode;
        }
        else
        {
            //helper variable to keep track of where we are in the list
            Node<T> current = head;

            //go through the list until you get to the end
            while(current.next != null)
            {
                current = current.next;
            }

            //now current is the last node in the list, so add the new node to the end
            current.next = newNode;

        }

        //increase the size of the list
        size++;

    }





    /**
     * get method that returns the data at a specified index
     * @param index
     * @return string of data in the node at specified index
     */
    public T get(int index)
    {
        Node<T> current = head;

        //loop through the list until it gets to the right index
        for(int i = 0; i < index; i++)
        {
            current = current.next;
        }

        //return the data at the node at the index
        return current.data;
    }





    /**
     * method to remove whatever is on top of the stack and print it
     */
    public void deQueue()
    {

        //make sure the list isn't empty
        if(head != null)
        {
            //the string to return at the end
            T toPrint = null;

            //use the head for the data
            toPrint = head.data;

            //set head to be the node after the one that is getting taken away
            head = head.next;


            //linked list size is now 1 less
            size--;

            //print the data that was taken off the stack
            System.out.println("you just removed: " + toPrint);
        }
        else
        {
            //the list is empty
            System.out.println("empty");
        }



    }






    /**
     * method to clear the linked list
     */
    public void clear()
    {
        //set the head to null (garbage collector will take care of the rest)
        head = null;

    }

}


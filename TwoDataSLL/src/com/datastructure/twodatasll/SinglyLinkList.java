package com.datastructure.twodatasll;


public class SinglyLinkList {


	

    protected Node start;
    protected Node end ;
    public int size ;
 
    /*  Constructor  */
    public SinglyLinkList()
    {
        start = null;
        end = null;
        size = 0;
    }
    /*  Function to check if list is empty  */
    public boolean isEmpty()
    {
        return start == null;
    }
    /*  Function to get size of list  */
    public int getSize()
    {
        return size;
    }    
    /*  Function to insert an element at begining  */
    public void insertAtStart(int val1, int val2)
    {
        Node nptr = new Node(val1, val2, null);    
        size++ ;    
        if(start == null) 
        {
            start = nptr;
            end = start;
        }
        else 
        {
            nptr.setLink(start);
            start = nptr;
        }
    }
    /*  Function to insert an element at end  */
    public void insertAtEnd(int val1, int val2)
    {
        Node nptr = new Node(val1, val2, null);    
        size++ ;    
        if(start == null) 
        {
            start = nptr;
            end = start;
        }
        else 
        {
            end.setLink(nptr);
            end = nptr;
        }
    }
    /*  Function to insert an element at position  */
    public void insertAtPos(int val1, int val2 , int pos)
    {
        Node nptr = new Node(val1, val2, null);                
        Node ptr = start;
        pos = pos - 1 ;
        for (int i = 1; i < size; i++) 
        {
            if (i == pos) 
            {
                Node tmp = ptr.getLink() ;
                ptr.setLink(nptr);
                nptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size++ ;
    }
    /*  Function to delete an element at position  */
    public void deleteAtPos(int pos)
    {        
        if (pos == 1) 
        {
            start = start.getLink();
            size--; 
            return ;
        }
        if (pos == size) 
        {
            Node s = start;
            Node t = start;
            while (s != end)
            {
                t = s;
                s = s.getLink();
            }
            end = t;
            end.setLink(null);
            size --;
            return;
        }
        Node ptr = start;
        pos = pos - 1 ;
        for (int i = 1; i < size - 1; i++) 
        {
            if (i == pos) 
            {
                Node tmp = ptr.getLink();
                tmp = tmp.getLink();
                ptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size-- ;
    }    
    /*  Function to display elements  */
    public void display()
    {
        System.out.print("\nSingly Linked List = ");
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }    
        if (start.getLink() == null) 
        {
            System.out.println(start.getData1() + " " );
            System.out.println(start.getData2() );
            return;
        }
        Node ptr = start;
        System.out.print(start.getData1()+ " ");
        System.out.print(start.getData2()+ "->");
        ptr = start.getLink();
        while (ptr.getLink() != null)
        {
            System.out.print(ptr.getData1()+ " ");
            System.out.print(ptr.getData2()+ "->");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData1()+ " ");
        System.out.print(ptr.getData2()+ "\n");
    }


}

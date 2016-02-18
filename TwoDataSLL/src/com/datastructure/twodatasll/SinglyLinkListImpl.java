package com.datastructure.twodatasll;

import java.util.Scanner;

public class SinglyLinkListImpl {
	   
    public static void main(String[] args)
    {             
        Scanner scan = new Scanner(System.in);
        int value1;
        int value2;
        /* Creating object of class linkedList */
        SinglyLinkList list = new SinglyLinkList(); 
        System.out.println("Singly Linked List Test\n");          
        char ch;
        /*  Perform list operations  */
        do
        {
            System.out.println("\nSingly Linked List Operations\n");
            System.out.println("1. insert at begining");
            System.out.println("2. insert at end");
            System.out.println("3. insert at position");
            System.out.println("4. delete at position");
            System.out.println("5. check empty");
            System.out.println("6. get size");            
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter two integer element to insert");
                value1=scan.nextInt() ;
                value2=scan.nextInt() ;
                list.insertAtStart( value1, value2 );                     
                break;                          
            case 2 : 
                System.out.println("Enter two integer element to insert");
                value1=scan.nextInt() ;
                value2=scan.nextInt() ;
                list.insertAtEnd( value1, value2 );                     
                break;                         
            case 3 : 
                System.out.println("Enter two integer element to insert");
                value1=scan.nextInt() ;
                value2=scan.nextInt() ;
                System.out.println("Enter position");
                int pos = scan.nextInt() ;
                if (pos <= 1 || pos > list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.insertAtPos(value1, value2, pos);
                break;                                          
            case 4 : 
                System.out.println("Enter position");
                int p = scan.nextInt() ;
                if (p < 1 || p > list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.deleteAtPos(p);
                break;
            case 5 : 
                System.out.println("Empty status = "+ list.isEmpty());
                break;                   
            case 6 : 
                System.out.println("Size = "+ list.getSize() +" \n");
                break;                         
             default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            /*  Display List  */ 
            list.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');               
    }
	
	
	


}

package com.datastructure.twodatasll;

public class Node {
	

    protected int data1;
    protected int data2;
    protected Node link;
 
    /*  Constructor  */
    public Node()
    {
        link = null;
        data1 = 0;
        data2 = 0;
    }    
    /*  Constructor  */
    public Node(int d1, int d2,Node n)
    {
        data1 = d1;
        data2 = d2;
        link = n;
    }    
    /*  Function to set link to next Node  */
    public void setLink(Node n)
    {
        link = n;
    }    
    /*  Function to set data to current Node  */
    public void setData1(int d1)
    {
        data1 = d1;
    }    
    /*  Function to get link to next node  */
    public Node getLink()
    {
        return link;
    }    
    /*  Function to get data from current Node  */
    public int getData1()
    {
        return data1;
    }
    public void setData2(int d2)
    {
        data2 = d2;
    }   
    public int getData2()
    {
        return data2;
    }

}

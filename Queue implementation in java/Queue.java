import java.util.*;
import java.io.*;


class Queue{
    static int[] queue;
    static int size;
    int head=-1;
    int tail=0;
    
    void put(int v) 
    {
        {
            queue[tail] = v;
            tail = tail + 1; 
            
        }
    }
    
     int pop() 
    {
            int value = queue[head+1]; 
            head = head + 1;
            return value;
    }
    
     
    int peek() 
    {       int h=queue[head+1];
            return h;
    }
           
    
    public static void main(String []str)
    {
        Scanner s = new Scanner(System.in);
        size=s.nextInt();
        queue=new int[size+5];
        Queue q=new Queue();
        
        for(int i=0;i<size;i++)
        {
            int number=s.nextInt();
            int v;
            
              switch(number)
                {
                  case 1:    v=s.nextInt();
                             q.put(v);
                             break;
                  case 2:    int x=q.pop();
                             break;
                  case 3:    System.out.println(q.peek()); 
                             break;
                  
               }
        } 
    }
}

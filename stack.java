import java.util.*;
class stack1
 {int top;
  int size;
  int a[]=new int[50];
  stack1()
   {top=-1;
   }
  void push(int ITEM,int n)
   {int size=n;
    
    if (top>=n-1) 
     {System.out.println("Overflow");
    
     }
    else
     {
      top=top+1;
      a[top]=ITEM;
     }
    }
   void pop()
   {
    if (top==-1)
     {
      System.out.println("underflow");
      
      }
     else
      {
       System.out.println("Deleted item"+a[top]);
       top=top-1;
      }
     }
    void display(int n)
     { if(top==-1)
     {
      System.out.println("stack empty");
      }
      else
      {
      for(int i=0;i<n;i++)
        {
         System.out.println(""+a[i]);
         }
      }
     }
  }
 class stack
  {
   public static void main(String args[])
    {Scanner obj=new Scanner(System.in);
    stack1 a= new stack1();
    System.out.println("enter the size of stack:");
    int n=obj.nextInt();
    while(true)
    {
     System.out.println("1.)PUSH\n2.)POP\n3.)DISPLAY\n4.)EXIT");
     int choice=obj.nextInt();
      switch(choice)
      {
       case 1: { System.out.println("enter the element to be pushed:");
                int ITEM=obj.nextInt();
                a.push(ITEM,n);
                break;
                }
       case 2: { a.pop();
                break;
                }
       case 3: { a.display(n);
                break;}
       case 4: { System.out.println("Exiting.....");
                System.exit(0);}
      
       }
       }
      
    }
  }
     
             
                
                              
     
  

// "static void main" must be defined in a public class.
class Stack1 { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top==0)return true;
        return false;
    } 

    Stack1() 
    { 
        top=0;
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top<MAX-1){
            a[top+1]=x;
            top++;
            return true;
        }
        return false;
        //Write your code here
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        int temp=a[top];
        top--;
        return temp;
        //Write your code here
    } 
  
    int peek() 
    { 
        //Write your code here
        return a[top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack1 s = new Stack1(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack");
        s.push(50);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
    } 
}

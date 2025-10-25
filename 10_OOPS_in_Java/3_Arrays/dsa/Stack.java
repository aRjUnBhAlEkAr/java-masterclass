package dsa;

public class Stack{
    int top = -1;
    int size = 5;

    public void push(int num, int stack[]){
        if(top < size-1){
            stack[++top] = num;
        }
        else{
            System.out.println("Stack overflow");
        }
    }

    public void pop(int num, int stack[]){
        if(isEmpty()){
            System.out.println("Stack Underflow");
        }
        else{
            stack[top--] = 0; 
        }
    }

    public boolean isEmpty(){
        if(top == -1)
            return true;
        return false;
    }

    public boolean isFull(){
        if(top == size-1)
            return true;
        return false;
    }

    public void interacteStack(int stack[]){
        for(int i: stack){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        Stack stack = new Stack();
        int object[] = new int[stack.size];
        System.out.println("Is Stack Full: " + stack.isFull());
        System.out.println("Is Stack Empty: " + stack.isEmpty());
        stack.push(10, object);
        stack.interacteStack(object);
        System.out.println("Is Stack Full: " + stack.isFull());
        stack.push(10, object);
        stack.interacteStack(object);
        System.out.println("Is Stack Full: " + stack.isFull());
        stack.push(10, object);
        stack.interacteStack(object);
        System.out.println("Is Stack Full: " + stack.isFull());
        stack.push(10, object);
        stack.interacteStack(object);
        System.out.println("Is Stack Full: " + stack.isFull());
        stack.push(10, object);
        stack.interacteStack(object);
        System.out.println("Is Stack Full: " + stack.isFull());
        stack.push(10, object);
        stack.interacteStack(object);
        System.out.println("Is Stack Empty: " + stack.isEmpty());
        System.out.println("Is Stack Full: " + stack.isFull());
    }
};
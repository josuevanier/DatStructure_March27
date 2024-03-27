package org.example;

public class TestStack{
    int size; // Helps you to assign the size of the container-junk of memory;
    int[] array;
    int top; // it is the only variable that all operations are being implimented


    public TestStack(int size){
        this.size = size;
        this.array = new int[size];
        this.top = -1; // it's minus one because th array -1+ 1 Become 0  when att element we want to start to zeo
    }

    // Impliment the push method (adding an element)

    public void push (int pushedElement){
        if(!isFull()){
            top++; // becomes a 0;
            array[top] = pushedElement;

            System.out.println("Pushed element was pushed");
        }else System.out.println("stack is full");
    }
    public int pop(){
        if(!isEmpty()){
            int returnedElement = top;
            top--; // we must decrement the container
            System.out.println("removed element " + array[returnedElement]);
        }else{
            System.out.println("Stack  is empty");
        }
        return -1;
    }
    public boolean isFull(){
        return (size - 1 == top);
    }
    public boolean isEmpty(){
        return (top == -1); // if top is minus one the container is empty
    }
    // impliment a method display the container
    public  void disPlay(){
        if(!isEmpty()) {
            System.out.print("Element of the array are ");
            for (int i = top; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        }else System.out.println("It is void");
    }

    public int peek(){
        if(!isEmpty()){
            return array[top];
        }
        else return -1;
    }

    public static void main(String[] args) {
        TestStack t1 = new TestStack(5);

        t1.push(2); /// it actually pushed the value to the right until the size is full

        t1.push(4); // the last thing first out   the top of the container

        t1.pop(); // removed  an element

        t1.disPlay();

        System.out.println(t1.peek());
    }
}

package stackassignment;

class Tester2 {
    
    public static void main(String args[]) {
            
        Stack2 stack = new Stack2(10);
        stack.push("Hello");
        stack.push("World");
        stack.peek();
        stack.display();
        stack.pop();
        stack.display();
    }
}

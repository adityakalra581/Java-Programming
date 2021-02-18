package stackassignment;

class Tester {
    
    public static void main(String args[]) {
            
        Stack stack = new Stack(10);
        stack.push(15);
        stack.push(25);
        stack.push(30);
        stack.push(40);
            
        stack.display();
            
        if (checkTop(stack)) {
            System.out.println("The top most element of the stack is an even number");
        } else {
            System.out.println("The top most element of the stack is an odd number");
        }
    }

    public static boolean checkTop(Stack stack) {
        //Implement your code here and change the return value accordingly
        int b = stack.peek();
    	
    	if (b%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}

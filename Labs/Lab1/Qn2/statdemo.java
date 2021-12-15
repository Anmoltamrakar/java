class Stack{
	static final int MAN=6;
	int top;
	int[] stack = new int[MAN];

	Stack(){
		top= -1;
	}
	boolean isEmpty(){
		if(top==-1){
			return true;
		}
		return false;
	}
	boolean push(int stem){
		if(isFull()){
			System.out.println("Stack Overflow");
			return false;
		}
		stack[++top]=stem;
		return true;
	}
	boolean pop(){
		if(isEmpty()){
			System.out.println("Stack Underflow");
			return false;
		}
		stack[top]=0;
		top--;
		return true;
	}
	int topVal(){
		return stack[top];
	}
	public static void main(String[]args){
		Stack s= new Stack();
		s.push(12);
		System.out.println(s.topVal()+"is in the top.");
		s.push(19);
		System.out.println(s.topVal()+"is in the top.");
		s.push();
		System.out.println(s.topVal()+"is in the top.");
		}
	}

// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}// } Driver Code Ends


/*Complete the function below*/
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
	solve(s);
	return s;
		
	}
	
	void solve(Stack<Integer>st){
	    if(st.size() == 1 ) return;
	    
	    int top = st.peek();
	    st.pop();
	    
	    solve(st);
	    
	    insert(st, top);
	}
	
	void insert(Stack<Integer>st, int a){
	    
	    if(st.size() == 0 || st.peek() <= a){
	        st.push(a);
	        return;
	    }
	    
	    int top = st.peek();
	    
	    st.pop();
	    
	    insert(st,a);
	    st.push(top);
	}
}
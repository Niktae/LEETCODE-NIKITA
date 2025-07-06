class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        /*int arr[]=new int[2*n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        int m=arr.length;
        for(int i=n;i<arr.length;i++){
            arr[i]=arr[i-n];
        }
        int greater[]=new int[2*n];
        Stack<Integer> st=new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                greater[i]=-1;
            }
            else{
                greater[i]=st.peek();
            }
            st.push(arr[i]);
        }
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=greater[i];
        }
        return a;*/
        int a[]=new int[2*n];
        int b[]=new int[2*n];
        int g[]=new int[n];
        //ArrayList<Integer>g=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            a[i]=nums[i%n];
        }
        Stack<Integer> st=new Stack<>();
        for(int i=a.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <=a[i]){
                st.pop();
            }
            if(st.isEmpty()){
                b[i]=-1;
            }
            else{
                b[i]=st.peek();
            }
            st.push(a[i]);
        }
        for(int i=0;i<n;i++){
            g[i]=b[i];
        }
        return g;
    }
}
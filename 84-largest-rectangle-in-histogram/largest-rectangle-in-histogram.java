class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nse = NSE(heights);
        int[] pse = PSE(heights);
        int max = 0;
        
        for (int i = 0; i < n; i++) {
            int width = nse[i] - pse[i] - 1;
            int area = heights[i] * width;
            max = Math.max(max, area);
        }
        return max;
    }
    public int[] NSE(int[] heights) {
        int n = heights.length;
        int[] next = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                next[i] = n;
            } else {
                next[i] = st.peek();
            }
            st.push(i);
        }
        return next;
    }
    public int[] PSE(int[] heights) {
        int n = heights.length;
        int[] prev = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                prev[i] = -1;
            } else {
                prev[i] = st.peek();
            }
            st.push(i);
        }
        return prev;
    }
}

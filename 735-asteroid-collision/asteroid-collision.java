class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int curr : asteroids) {
            while (!st.isEmpty() && curr < 0 && st.peek() > 0) {
                if (st.peek() < -curr) {
                    st.pop();
                    continue;
                } else if (st.peek() == -curr) {
                    st.pop(); 
                }
                curr = 0; 
                break;
            }
            if (curr != 0) {
                st.push(curr);
            }
        }
        int[] result = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result;
    }
}

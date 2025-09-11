public class Solution {
    public IList<string> FizzBuzz(int n) {
        List<string> mixed=new List<string>();
        for(int i=1;i<=n;i++){
            if (i%3==0 && i%5==0){
                mixed.Add("FizzBuzz");
            }
            else if(i%5==0){
                mixed.Add("Buzz");
            }
            else if(i%3==0){
                mixed.Add("Fizz");
            }
            else{
                mixed.Add(i.ToString());
            }
        }
        return mixed;
    }
}
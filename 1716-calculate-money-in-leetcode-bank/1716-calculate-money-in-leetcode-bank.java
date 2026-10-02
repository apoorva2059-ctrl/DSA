class Solution {
    public int totalMoney(int n) {
        int i=0; 
        int money =0;
        while(n >=7)
        {
            money += 28 + i*7;
            i++;
            n = n-7;
        }
        money += (n*(n+1))/2 + i*n;
        return money;
    }
}
class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
     ArrayList<Integer> pos = new ArrayList<>();
     ArrayList<Integer> neg = new ArrayList<>();
     
     for(int i=0; i<arr.size(); i++)
     {
        if(arr.get(i) >= 0)
        {
            pos.add(arr.get(i));
        }
        else
        {
           neg.add(arr.get(i));
        }
     }
     int i=0, j=0;
     int k = 0;
     while(i < pos.size() || j < neg.size())
     {
        if(i<pos.size())
        {
            arr.set(k, pos.get(i));
            i++;
            k++;
        }
        if(j<neg.size())
        {
            arr.set(k, neg.get(j));
            j++;
            k++;
        }
     }
    }
}
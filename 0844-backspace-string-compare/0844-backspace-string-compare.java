class Solution {
    public boolean backspaceCompare(String s, String t) {
        ArrayList<Character> List1 = new ArrayList<>();
        ArrayList<Character> List2 = new ArrayList<>();
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == '#')
            {
                if(!List1.isEmpty())
                {
                    List1.remove(List1.size()-1);
                }
            }
            else
            {
                List1.add(s.charAt(i));
            }
        }
        for(int j=0; j<t.length(); j++)
        {
            if(t.charAt(j) == '#')
            {
               if(!List2.isEmpty())
               {
                List2.remove(List2.size()-1);
               } 
            }
            else
            {
                List2.add(t.charAt(j));
            }
        }
        return List1.equals(List2);
    }
}
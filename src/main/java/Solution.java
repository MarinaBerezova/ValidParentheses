import java.util.ArrayList;

public class Solution {

    public boolean isValid(String s) {
        ArrayList<String> brackets = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if (String.valueOf(s.charAt(i)).equals(")") && brackets.size() > 0 && brackets.get(brackets.size()-1).equals("(")){
                int index = brackets.lastIndexOf("(");
                brackets.remove(index);
            } else if (String.valueOf(s.charAt(i)).equals("]") && brackets.size() > 0 && brackets.get(brackets.size()-1).equals("[")){
                int index = brackets.lastIndexOf("[");
                brackets.remove(index);
            } else if (String.valueOf(s.charAt(i)).equals("}") && brackets.size() > 0 && brackets.get(brackets.size()-1).equals("{")){
                int index = brackets.lastIndexOf("{");
                brackets.remove(index);
            } else {
                brackets.add(String.valueOf(s.charAt(i)));
            }
        }
        return brackets.isEmpty();
    }
}
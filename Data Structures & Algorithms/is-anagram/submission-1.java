class Solution {
    public boolean isAnagram(String s, String t) {
        String lowerS = s.toLowerCase(), lowerT = t.toLowerCase();
        if(lowerS.length() == lowerT.length()) {
            Map<Character, Integer> frequencyMapS = new HashMap<>(),frequencyMapT = new HashMap<>();
            for (char c : lowerS.toCharArray()) {
                frequencyMapS.put(c, frequencyMapS.getOrDefault(c, 0) + 1);
            } 
            for (char c1 : lowerT.toCharArray()) {
                    frequencyMapT.put(c1, frequencyMapT.getOrDefault(c1, 0) + 1);
                    
            }
            if (frequencyMapS.equals(frequencyMapT)) return true;  
        }
    return false;
    }
}

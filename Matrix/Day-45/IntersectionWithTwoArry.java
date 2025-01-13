class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : a){
            set.add(num);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int num : b){
            if(set.contains(num)){
                res.add(num);
                set.remove(num);
            }
        }
        return res;
    }
}
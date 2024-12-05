/**
 * BRUTE FORCE
 * TC - O(n)
 * SC - O(n)
 */
class Solution {
    public List<Integer> findMajority(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums) map.put(num, map.getOrDefault(num, 0)+1);
        
        for(int key : map.keySet()){
            if(map.get(key) > n/3) ans.add(key);
        }
        
        return ans;
    }
}

/**
 * OPTIMAL
 * TC - O(n)
 * SC - O(n)
 */
class Solution {
    public int countFreq(int element, int[] arr){
        int count = 0;
        for(int i : arr){
            if(i == element) count++;
        }
        return count;
    }
    
    public List<Integer> findMajority(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        int count1 = 0;
        int count2 = 0;
        int ele1 = -1;
        int ele2 = -1;
        
        for(int i = 0; i < n; i++){
            if(nums[i] == ele1){
                count1++;
            }
            else if(nums[i] == ele2){
                count2++;
            }
            else if(count1 == 0){
                ele1 = nums[i];
                count1++;
            }
            else if(count2 == 0){
                ele2 = nums[i];
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        
        
        if(countFreq(ele1, nums) > n/3) res.add(ele1);
        if(countFreq(ele2, nums) > n/3 && ele2 != ele1) res.add(ele2);
        
        Collections.sort(res);
        return res;
        
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer>numsHash=new HashMap<>();
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int value=target-nums[i];
            if(numsHash.containsKey(value))
            {
                arr[0]=numsHash.get(value);
                    arr[1]=i;
            }
            numsHash.put(nums[i],i);
        }
        return arr;
    }
}
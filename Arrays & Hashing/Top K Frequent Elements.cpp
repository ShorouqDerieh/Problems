class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        map<int,int>m;
        for(int n:nums)
        {
            m[n]++;
        }
    vector<int>result;
  vector<vector<int>> bucket(nums.size() + 1);
for(auto& it:m)
{
    bucket[it.second].push_back(it.first);
}
for(int i=nums.size();i>=0;i--){
if(k!=0){
    for (int num : bucket[i]) {
    result.push_back(num);
    k--;
    }
}
}
    
    return result;
    }
};

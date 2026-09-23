class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int minimum = prices[0];
        // int maximum=prices[1];
        int profit = 0;
        for (int i = 1; i < prices.size(); i++)
        {
            if (prices[i] < minimum)
            {
                minimum = prices[i];
            }
            else if (profit < (prices[i] - minimum)) {
                profit = prices[i] - minimum;
            }
        }
        return profit;
    }
};

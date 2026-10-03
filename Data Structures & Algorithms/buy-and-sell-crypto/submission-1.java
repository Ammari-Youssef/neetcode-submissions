class Solution {
    public int maxProfit(int[] prices) {
        List<Integer> p = Arrays.stream(prices).boxed().toList();
        List<Integer> profits = new ArrayList<>();

        int max = Collections.max(p);
        int min = Collections.min(p);
        int profit = 0;

        for (int day = 0; day < prices.length; day++) {
            for (int j = day + 1; j<prices.length & j> day; j++) {
                profit = prices[j] - prices[day];

                if(profit < 0) profits.add(0);

                profits.add(profit);
            }
        }
        if (profits.isEmpty())
            return 0;
            
        return Collections.max(profits);
    }
}

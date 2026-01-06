class Solution{
public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for (int j : piles) {
            if (j > max) {
                max = j;
            }
        }

        int l=1,r=max;
        while(l<=r) {
            int mid=(l+r)/2;
            long hours=0;
            for(int pile:piles){
                hours+=(long)Math.ceil((double)pile/mid);
            }
            if(hours>h){
                l=mid+1;
            }
            else if(hours<=h){
                r=mid-1;
            }

        }
        return l;
    }
}

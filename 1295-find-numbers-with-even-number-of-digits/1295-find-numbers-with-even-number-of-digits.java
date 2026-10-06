class Solution {
    public int findNumbers(int[] nums) {
        int digits=0;
        int count=0;
        for(int i=0; i<nums.length; i++){
            digits=0;
            int num=nums[i];
            if(num==0){
                digits=1;
            }else{
                while(num>0){
                    int rem=num%10;
                    digits++;
                    num=num/10;
                }
            }
            if(digits%2==0){
                count++;
            }
        }
        return count;
    }
}
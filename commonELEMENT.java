public class commonELEMENT {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int answer[]=new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums1[i]==nums2[j]){
                    answer[0]++;
                    break;
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(nums2[i]==nums1[j]){
                    answer[1]++;
                    break;
                }
            }
        }
        return answer;
    }
}

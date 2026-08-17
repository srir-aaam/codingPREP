class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        ArrayList<Integer> inter = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                i++;
            }
            else if (nums1[i] > nums2[j]) {
                j++;
            }
            else {
                if (inter.size() == 0 ||
                    inter.get(inter.size() - 1) != nums1[i]) {
                    inter.add(nums1[i]);
                }

                // These MUST be outside the duplicate check
                i++;
                j++;
            }
        }

        int[] result = new int[inter.size()];

        for (int k = 0; k < inter.size(); k++) {
            result[k] = inter.get(k);
        }

        return result;
    }
}
package arreglos;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int nums[] = new int[4];
        nums[0] =  28;
        nums[1] =  14;
        nums[2] =  17;
        nums[3] =  30;

        int nums2[] = new int[8];

        for (int i = 0; i < nums.length; i++) {
            nums2[i] = nums[i];
        }

        nums2[4] = 16;
        nums2[5] = 41;


        nums2[6] = nums2[5];
        nums2[5] = nums2[4];
        nums2[4] = nums2[3];
        nums2[3] = nums2[2];
        nums2[2] = nums2[1];

        nums2[1] =  22;

        for (int i = 0; i < nums2.length; i++) {
            if(nums2[i] == 15 ){
                System.out.println("Encontré el número " + i);
                break;
            }
        }

    }
}
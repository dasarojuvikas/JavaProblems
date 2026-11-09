public class Arrays {

    public static void main(String[] args){

        int[] nums = {1,20,15,11,17,19,9};

        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i : nums){
            if(i > highest){
                second = highest;
                highest = i;
            }else if(i > second && i != highest){
                second = i;
            }

        }

        System.out.println("The second highest number is: " + second);
        System.out.println("The highest number is: " + highest);

    }

}

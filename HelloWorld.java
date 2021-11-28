public class HelloWorld {
    public static void main(String[] args) {
        //ageArray = new int[5];
        int [] numberArray = {1, 2, 3, 3, 6, 3, 9};
        //timeArray = new int[1, 5, 4, 4,3];
        numberArray[3]=4;

        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("numberArray"+i+"="+numberArray[i]);

        }
        int max =0;
        int min =9999;
        
        for (int i = 0; i < numberArray.length; i++) {
            if(numberArray[i]<min){
                min=numberArray[i];
            }
        }
        for (int i = 0; i < numberArray.length; i++) {
            if(numberArray[i]>max){
                max=numberArray[i];
            }
        }


        System.out.println("min"+min);
        System.out.println("max"+max);

    }
}

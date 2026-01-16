public class BasicProgram1 {
    public static void main(String[] args) {
//  1. Access all even index elements from array.

//        int arr [] ={15,20,3,40,50};
//        for (int i=0; i<arr.length; i++){
//            if(i%2==0)
//                System.out.print(arr[i] + " ");
//        }
//------------------------------------------------------------------


//  2. Access all even elements from array.
//        int arr [] ={15,20,3,40,50};
//        for (int i=0; i<arr.length; i++){
//            if(arr[i]%2==0)
//                System.out.print(arr[i] + " ");
//        }

//----------------------------------------------------------------


//  3. count all even elements from array.
//        int arr [] ={15,20,30,40,50};
//        int count=0;
//        for (int i=0; i<arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                System.out.print(arr[i] + " ");
//                count++;
//            }
//        }
//        System.out.println("\nAll even elements from array is : "+count);


//--------------------------------------------------------------------------------------


//  4. Access all elements of array from end.

//        int arr [] ={15,20,30,40,50};
//      for (int j=arr.length-1; j>=0; j--){
//          System.out.print(arr[j]+" ");
//      }


//---------------------------------------------------------------------------------

//  5. print and count all three-digit numbers from array.

//        int count=0;
//        int arr [] ={150,26,305,40676,570};
//        for (int i=0; i<arr.length; i++){
//         if (arr[i]>=100 && arr[i]<=999) {
//             System.out.print(arr[i] + " ");
//             count++;
//         }
//        }
//        System.out.println("\ncount is : "+count);
//    }


//    -------------------------------------------------------------------


//   6.Print sum of all elements from array.

//        int arr[] = {10, 20, 30, 40, 50};
//        int sum =0;
//        for (int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//            sum=sum+arr[i];
//        }
//        System.out.println("\nSum is : " +sum);


//---------------------------------------------------------------------------------


//  7.Print Average of all elements from array.

//        int arr[] = {10, 20, 30, 40, 50};
//
//        int sum=0;
//        for (int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//            sum=sum+arr[i];
//        }
//        double avg = (double)sum/arr.length;
//
//        System.out.println("\nAverage is : "+avg);


//        -------------------------------------------------------------------------------


//  8. WAJP to print and count all the elements of array which are bigger than average value.

                int count = 0, sum = 0;
                int arr[] = {10, 20, 30, 40, 50};

                // Step 1: Calculate sum
                for (int i = 0; i < arr.length; i++) {
                    sum = sum + arr[i];
                }

                // Step 2: Calculate average
                double avg = (double) sum / arr.length;
                System.out.println("Average: " + avg);

                // Step 3: Print and count elements greater than average
                System.out.println("Elements greater than average:");
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > avg) {
                        System.out.print(arr[i] + " ");
                        count++;
                    }
                }

                System.out.println("\nCount is : " + count);
            }
        }




//  ---------------------------------------------------------------------------------------




//   9. Print sum of all even elements from array.
//        int sum=0;
//        int arr[] = {10, 27, 33, 40, 50};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//              sum = sum + arr[i];
//            }
//        }
//        System.out.println("Sum : " + sum);




// ----------------------------------------------------------------------------




//  10. Print sum of all odd elements from array.
//        int sum=0;
//        int arr[] = {10, 27, 33, 40, 50};
//        for (int i = 0; i<arr.length; i++) {
//            if (arr[i] % 2 !=0 ) {
//                sum = sum + arr[i];
//            }
//        }
//        System.out.println("Sum : " + sum);



//--------------------------------------------------------------------------------------




//  11. Print sum of all elements divisible by 3.
//        int sum=0;
//        int arr[] = {10, 27, 33, 40, 50};
//        for (int i = 0; i<arr.length; i++) {
//            if (arr[i]%3==0 ) {
//                sum = sum + arr[i];
//            }
//        }
//        System.out.println("Sum : " + sum);


//-----------------------------------------------------------------------------------------



//  12. Print Biggest and Smallest Element of Array.


//        int arr[] = {10, 27, 33, 40, 50};
//        int biggest=arr[0], smallest=arr[0];
//        for (int i = 0; i<arr.length; i++) {
//            if (arr[i]>biggest) {
//                biggest=arr[i];
//            }
//            if (arr[i]<smallest){
//                smallest=arr[i];
//            }
//        }
//        System.out.println("Biggest is : " + biggest);
//        System.out.println("Smallest is : "+smallest);

//    }
//}










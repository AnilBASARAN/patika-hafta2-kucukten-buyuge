import java.util.Arrays;
import java.util.Scanner;

public class BuyuktenKucuge {
    public static boolean isDuplicate(int[] array, int value ){
            for(int i= 0; i<array.length;i++){
                if(array[i]== value){
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int arrayLength;

            System.out.print("Array uzunluğunu girin:  ");
            arrayLength = input.nextInt();

            int [] myArray = new int[arrayLength];

            // myArray i kullanıcıdan aldığımız değerlerle oluşturuyoruz.

            for(int i = 0; i < arrayLength;i++){
                System.out.print("Arrayın "+ (i+1) +". elemanını girin:  ");
                myArray[i] = input.nextInt();
            }

            Arrays.sort(myArray);
            System.out.println("Arrayın sıralı hali:  ");
           System.out.println(Arrays.toString(myArray));
           input.close();
        }
    }


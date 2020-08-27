import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.security.RunAs;
import java.util.Arrays;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author Taoqy
 * @version 1.0, 2020/8/19
 * @see [相关类/方法]
 * @since bapfopm-pfpsmas-cbfsms-service 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
public class SortMethod {

    @Test
    public void bubblingMethod(){

        int[] a = {2,6,3,4,12,56,42,32,4,16};
        int num;
        for (int i = a.length-1 ; i > 0 ;i--){

            for (int j = 0;j < i;j++){
//                int x =a[j];
//                int y =a[j+1];
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for (int i = 0 ;i<a.length-1;i++){
            System.out.print(a[i]+"  ");
        }


    }

    @Test
    public void selectSort(){
        int a[] ={3,4,0,12,34,84,54,2,18,8,24,12,83};

        for (int i = 0; i < a.length-1; i++){
            int minNum = i ;
            for (int j = i+1; j<a.length-1;j++){
                if (a[minNum] > a[j]){
                    minNum = j;
                }
            }
            int temp = a[i];
            a[i] = a[minNum];
            a[minNum] = temp;
        }

        for (int i = 0 ;i<a.length-1;i++){
            System.out.print(a[i]+"  ");
        }
    }

    @Test
    public void insertionSort(){
        int a[] ={3,4,0,12,34,84,24,54,2,18,8,24,12,83};

        for (int i = 0; i < a.length ; i++){
            int temp = a[i];
            for (int j = i-1; j >= 0;j--){
                if (a[j] < temp){
                    a[j+1] = temp;

                    break;
                }else{
                    a[j+1] = a[j];

                        a[j]=temp;

                }


            }
        }
        for (int i = 0 ;i<a.length;i++){
            System.out.print(a[i]+"  ");
        }

    }


    @Test
    public void shellSort(){
        int a[] ={3,4,0,12,34,84,24,54,2,18,8,24,12,83,55};
        int groupNum = a.length/2;
        int temp;
        for (int i = groupNum ;i > 0 ; i /= 2){

            for (int j = 0; j+i < a.length ;j++){
                temp = a[j+i];
                for (int k = j+i ; k >= i;k -= i ){
                    if (temp >= a[k-i]){
                        a[k] = temp;
                        break;
                    }else {
                        a[k] = a[k-i];

                        a[k-i] = temp;


                    }

                }

            }




        }

        for (int i = 0 ;i<a.length;i++){
            System.out.print(a[i]+"  ");
        }



    }



    @Test
    public void shellSort2(){
        int a[] ={3,4,0,12,34,84,24,54,2,18,8,24,12,83,55};
        int len = a.length;
        int temp;
        int groupNum = len/2;
        while (groupNum > 0){

            for (int i = groupNum ; i < len; i++ ){
                int preIndex = i-groupNum;
                temp = a[i];
                while (preIndex >= 0 && temp < a[preIndex] ){
                    a[preIndex+groupNum] = a[preIndex];
                    a[preIndex] = temp;
                    preIndex -= groupNum;
                }


            }


            groupNum /= 2;
        }
        for (int i = 0 ;i<a.length;i++){
            System.out.print(a[i]+"  ");
        }
    }


    @Test
    public void mergeSort(){
        int a[] ={3,4,0,12,34,84,24,54,2,18,8,24,12,83,55};

        int[] ints = mergeSort(a);

        for (int i = 0 ;i<ints.length;i++){
            System.out.print(ints[i]+"  ");
        }

    }

    public int[] mergeSort(int a[]){
        if (a.length < 2){
            return a;
        }
        int mid = a.length/2;
        int[] leftArrays = Arrays.copyOfRange(a, 0, mid);
        int[] rightArrays = Arrays.copyOfRange(a, mid, a.length);



        return merge(mergeSort(leftArrays),mergeSort(rightArrays));
    }

    public int[] merge(int[] leftArrays,int[] rightArrays){
        int[] result = new int[leftArrays.length+rightArrays.length];
        for (int index = 0,i = 0,j = 0;index < result.length;index++){
            if (i>= leftArrays.length){
                result[index] = rightArrays[j];
                j++;
            }else if(j >= rightArrays.length){
                result[index] = leftArrays[i];
                i++;
            }else if (leftArrays[i] > rightArrays[j]){
                result[index] = rightArrays[j];
                j++;
            }else{
                result[index] = leftArrays[i];
                i++;
            }
        }

        return result;
    }


}

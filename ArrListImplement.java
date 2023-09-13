package Java;

import java.util.Random;
import java.util.Scanner;

class ArrList{
   private int [] arr;
   private int size;
   private int index;
   public  int length;
    ArrList(){
        size=5;
        index=0;
        length=0;
        arr = new int[size];
    }

    ArrList(int size){
        this.size=size;
        length=0;
        index=0;
        arr = new int[size];
    }

    void add (int a){
        System.out.println(length+" "+size);
        if(length<size){
          //  System.out.println("Enter ");
            arr[index]=a;
            index+=1;
            length+=1;
        } else if(length==size) {
            //System.out.println("Enter 2");
            size = size*2;
            int[] temp = new int [size];
            for (int i=0;i<length;i++){
                temp[i]=arr[i];
              //  System.out.println(arr[i]);
            }
            temp[index++]=a;
            length+=1;
            arr= temp;
            
        }
    }

    public void remove(int index){
        if(index<0 || index>length-1){
            System.out.println("Invalid Index Entered !!!");
            return;
        }  else {
            int i;
            int [] tempArr = new int[size-1];
            for (i=0;i<index;i++){
                tempArr[i]=arr[i];
            }
            i+=1;
            while(i<length){
                tempArr[i-1]=arr[i];
                i+=1;
            }
            arr=tempArr;
            length-=1;
        }
    }

    public int getElement(int ind){
        if(ind<0 || ind>length-1){
            System.out.println("Invalid Index !!!!!");
            return -1;
        } else 
            return arr[ind];
    }

    public int findIndex(int ele){
        for (int i=0;i<length;i++){
            if(arr[i]==ele){
                return i;
            } 
        }
        return -1;
    }

    void show (){
        for (int i=0;i<length;i++){
            
            System.out.println(arr[i]);
        }
    }


}

public class ArrListImplement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();

        ArrList arr = new ArrList();
        for (int i=0;i<7;i++){
            System.out.println("Enter ELe : ");
            int ele=sc.nextInt();
            arr.add(ele);
        }
        arr.show();
       // System.out.println(arr.length);
        // System.out.println("Enter index To Remove ele : ");
        // int eleRemove =  sc.nextInt();
        // arr.remove(eleRemove);
        // arr.show();
        // System.out.println();
        // System.out.println(arr.length);

        System.out.println("Enter ele to find index : ");
        int ele = sc.nextInt();
        System.out.println(arr.findIndex(ele));

        System.out.println("Enter Index To Find Element ");
        int index = sc.nextInt();
        System.out.println(arr.getElement(index));


      
    
    }
}
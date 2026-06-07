package org.example;

import java.util.Scanner;

import static java.util.Collections.min;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TONG_GAN_0_NHAT {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int t = scanner.nextInt();
      while(t-- >0){
         int n=scanner.nextInt();
         int[] arr=new int[n];
         for(int i=0;i<n;i++){
            arr[i] =scanner.nextInt();
         }

         for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                   int tmp=arr[i];
                   arr[i] = arr[j];
                   arr[j] = tmp;
                }
            }
         }
       int l=0, r=n-1;
         int ans=arr[0]+arr[1];
         while (l<r){
            int sum=arr[l]+arr[r];
            if(Math.abs(sum)<Math.abs(ans)){
               ans=sum;
            }
            else if(Math.abs(sum)==Math.abs(ans)){
               ans=Math.min(ans,sum);
            }
            if(sum<0){
               l++;
            }else {
               r--;
            }
         }
         System.out.println(ans);
      }
   }
}

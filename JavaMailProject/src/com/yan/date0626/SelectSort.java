package com.yan.date0626;
/**
* @author ycy
* @version 1.0
* @createDate 创建时间：2020/06/26 15:06:06
* @explain(类说明):...
*/
public class SelectSort {
   public static void main(String[] args) {
	int[]array={3,2,5,1,4};
	 for(int i=0;i<array.length-1;i++){
		 for(int j=i+1;j<array.length;j++){
			 if(array[i]>array[j]){
				 int w=array[i];
				 array[i]=array[j];
				 array[j]=w;
			 }
		 }
	 }
	 
	 for(int i=0;i<array.length;i++){
		 System.out.println(array[i]);
	 }
}
}

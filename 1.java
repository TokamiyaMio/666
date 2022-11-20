public class A1_1 {
    public static void main(String []args){
        int []a=new int[]{1,5,1,1,3,2,4};
        int j=0;
        int b=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<=a[j]){
                j=i;
            }
        }
        System.out.println("最后一个值最小的元素序号为"+j);
    }
}
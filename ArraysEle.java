public class ArraysEle{
    public static void main(String[] args) {
        
        int rev[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int mid1[] = {10, 20, 30, 40, 50, 60, 70, 80};
        int mid2[] = {10, 11, 12, 13, 14, 15, 16, 17};
        int evenodd[] = {5, 10, 15, 20, 25, 30,35, 40};
        int sum[] = {11, 22, 33, 44, 55, 66, 77, 88};
        
        for(int i=0; i<rev.length; i++)
                System.out.println(rev[i]);                 //looping 
                System.out.println("---------------");
        for(int i=0; i<mid1.length; i++)
                System.out.println(mid1[i]);
                System.out.println("---------------");
        for(int i=0; i<mid2.length; i++)
                System.out.println(mid2[i]);
                System.out.println("---------------");
        for(int i=0; i<evenodd.length; i++)
                System.out.println(evenodd[i]);
                System.out.println("---------------");
        for(int i=0; i<sum.length; i++)
                System.out.println(sum[i]);
                System.out.println("---------------");

    for(int i=rev.length-1; i>=0; i--)                         //reverse
                System.out.println(rev[i]);
                System.out.println("---------------");
    for(int i=mid1.length/2; i<mid1.length; i++)               //middletolast
                System.out.println(mid1[i]);
                System.out.println("---------------");
    for(int i=mid2.length/2; i>0; i--)                         //middletobeginning                
                System.out.println(mid2[i]);
                System.out.println("---------------");
    for(int i=0; i<evenodd.length; i++){                       //numberofoddoreven
                if(evenodd[i] % 2 == 0)
                   System.out.println(evenodd[i] + " is even number"); 
                else
                   System.out.println(evenodd[i] + " is odd number"); 
    }System.out.println("---------------");
    int add = 0;
    for(int i=0; i<sum.length; i++){
        add += sum[i];
    }
                System.out.println(add);    
    }
}
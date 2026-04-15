//we have n no. of ladder. we take take 1step or 3 step forward at a time. count how many ways apn usme chadh skte h

// public class ladder2 {

//     static int ways(String str,int n){
//         //base case..
//         if(n == 0)
//             System.out.println(str);
//             return 1;

//         //recursion case...
//         if(n>=1){
//             ways(str + "1" , n-1);
//         }
//         if(n>=2){
//             ways(str + "2" , n-2);
//         }

//         return 0;
//     }

//     public static void main(String[] args){

//         int n = 8;
//         System.out.println(ways("",n));
//     }
// }

//print the sequence of how we climb the stairs
public class ladder2 {
    static void climb(String p, int n){
     if(n == 0){
        System.out.println(p);
            return;
        }
        if(n >= 1){
            climb(p + "1", n - 1);
        }
        if(n >= 2){
            climb(p + "2", n - 2);
        }
    }

    public static void main(String[] args){
        int n = 3;
        climb("", n);
    }
}
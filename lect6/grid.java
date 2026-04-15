//a grid is given of n*n type matrix. find possible path. only allow right or down
// 2*2
// choice -> R our D
//output-  RD
    //     DR

    public class grid {

    static void path(String str, int r, int c){   //r= row & c= column

        if(r==1 && c==1){
            System.out.println(str);
            return;
        }

        if(r>1){
            path(str+"D", r-1, c);
        }

        if(c>1){
            path(str+"R", r, c-1);
        }
    }

    public static void main(String[] args){
        path("",3,3);
    }
}
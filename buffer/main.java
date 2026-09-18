




class arr {
    int[] arr;
    int accd = 0;
    int accf = -1;
    public void print(){
        for ( int i = 0 ; i<arr.length; i++){
            System.out.print("|"+ arr[i]);
        }
        System.out.print("|\n");
        for ( int i = 0; i < (accd)%(arr.length); i ++){
            System.out.print("  ");
        }
        System.out.print(" ^\n");
        for ( int i = 0; i < (accd)%(arr.length); i ++){
            System.out.print("  ");
        }
        System.out.print(" | start\n");
        for ( int i = 0; i < (accf-1)%(arr.length-1); i ++){
            System.out.print("  ");
        }
        System.out.print(" ^\n");
        for ( int i = 0; i < (accf-1)%(arr.length-1); i ++){
            System.out.print("  ");
        }
        System.out.print(" | end\n");

    }
    public void add(int elem){
        if (accf==-1){
            arr[0]=elem;
            accf=1;
        }else if ((accf)%(arr.length)!=accd){
            if (arr.length-1 != accf-1){
                arr[accf]=elem;
                accf+=1;
            }else{
                arr[0]=elem;
                accf=0;
            }
        }else{
            System.out.println("It's not possible to add a number : arr is full");
        }
        
        
    }

    public void del(){
        if (accd!=0){
            accd-=1;
        }else{
            accd = arr.length -1;
        }
    }

}

public class main {
    
    public static void main (String[] args){
        arr a = new arr();
        a.arr = new int[10];

        
        for (int i = 0 ; i<a.arr.length; i++){
            a.add(i);
            a.print();
            System.out.println(a.accf);
            System.out.println(i);
        }
        a.print();
        System.out.println(a.accd);
        a.del();
        a.print();
        System.out.println(a.accd);

    }
}





class arr {
    int[] arr;
    int accd = 0;
    int accf = 1;
    public void print(){
        for ( int i = 0 ; i<arr.length -1; i++){
            System.out.print("|"+ arr[i]);
        }
        System.out.print("|\n");
        for ( int i = 0; i < (accd)%(arr.length-1); i ++){
            System.out.print("  ");
        }
        System.out.print(" ^\n");
        for ( int i = 0; i < (accd)%(arr.length-1); i ++){
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
        if ((accf)%(arr.length)!=accd){
            if (arr.length-1 != accf-1){
                arr[accf-1]=elem;
                accf+=1;
            }else{
                arr[0]=elem;
                accf=0;
            }
        }else{
            System.out.println("It's not possible to add a number : arr is full");
        }
        
        
    }

}

public class main {
    
    public static void main (String[] args){
        arr a = new arr();
        a.arr = new int[10];

        
        for (int i = 0 ; i<a.arr.length-2; i++){
            a.add(i);
        }
        a.print();

    }
}

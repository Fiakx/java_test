




class arr {
    /*
    
    In this class accf represent the next "case", not the actuall end case
     */
    int[] arr;
    int accd = 0;
    int accf = -1;
    public void print(){
        for ( int i = 0 ; i<this.arr.length; i++){
            System.out.print("|"+ this.arr[i]);
        }
        System.out.print("|\n");
        for ( int i = 0; i < (this.accd)%(arr.length); i ++){
            System.out.print("  ");
        }
        System.out.print(" ^\n");
        for ( int i = 0; i < (this.accd)%(arr.length); i ++){
            System.out.print("  ");
        }
        System.out.print(" | start\n");
        for ( int i = 0; i < (this.accf-1)%(arr.length-1); i ++){
            System.out.print("  ");
        }
        System.out.print(" ^\n");
        for ( int i = 0; i < (this.accf-1)%(arr.length-1); i ++){
            System.out.print("  ");
        }
        System.out.print(" | end\n");

    }
    public void add(int elem){
        if (this.accf==-1){
            this.arr[0]=elem;
            this.accf=1;
        }else if ((this.accf)%(this.arr.length)!=this.accd){
            if (this.arr.length-1 != this.accf-1){
                this.arr[this.accf]=elem;
                this.accf+=1;
            }else{
                this.arr[0]=elem;
                this.accf=0;
            }
        }else{
            assert 1<0 : "It's not possible to add a number : arr is full";
            System.out.println("It's not possible to add a number : arr is full");
        }
        
        
    }

    public void del(){
        if (this.accd!=0){
            this.accd-=1;
        }else{
            this.accd = this.arr.length -1;
        }
    }

}

public class main {
    
    public static void main (String[] args){
        arr a = new arr();
        a.arr = new int[10];

        
        for (int i = 0 ; i<a.arr.length ; i++){
            a.add(i);
            a.print();
            System.out.println(a.accf);
            System.out.println(i);
        }
        a.add(3);
        a.print();
        System.out.println(a.accd);
        a.del();
        a.print();
        System.out.println(a.accd);

    }
}
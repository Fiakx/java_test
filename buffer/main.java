




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
            this.arr[this.accf]=elem;
            this.accf= (this.accf+1)%(this.arr.length);
            
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

    public void del_ind(int ind){
        /* We put the index of the number in the queue and it will delet it 
        (I must change things later, like the fact that it's more intresting to shift 
        to the right or to the left depending on the index relative to length of the array) 
        */
        for (int i =0; i <this.arr.length - ind; i++){
            this.arr[(i+ind)%this.arr.length]=this.arr[(ind+i+1)%this.arr.length];
            this.accf = (this.accf-1)%(this.arr.length-1);
        }
    }

}

public class main {
    
    public static void main (String[] args){
        arr a = new arr();
        a.arr = new int[10];

        /* tests zone */
        for (int i = 0 ; i<a.arr.length ; i++){
            a.add(i);
            System.out.println("accf :"+a.accf);
        }
        System.out.println("Before suppression :");
        a.print();
        a.del_ind(4);
        System.out.println("After suppression : ");
        a.print();

    }
}
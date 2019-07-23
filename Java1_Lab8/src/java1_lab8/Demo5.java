package java1_lab8;

public class Demo5 {

    public void Sort(int[] a, int i){
        if(i >= a.length){
            return;
        }
        
        for(int j = i + 1; j < a.length; j++){
            if(a[j] < a[i]){
                int tam = a[j];
                a[j] = a[i];
                a[i] = tam;
            }
        }
        
        Sort(a, i + 1);
    }
    
    public static void main(String[] args) {
        Demo5 obj = new Demo5();
        int[] x = {4, 6, 1, 8, 3};
        obj.Sort(x, 0);
        for(int i : x){
            System.out.print(i + " ");
        }
    }   
}
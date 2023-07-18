import java.util.Scanner;

class Heap {

    public static int n = 0;
    public static int originalSize = 0;

    public static void swap(int[] arr, int idx1, int idx2) {
        arr[idx1] = arr[idx1] + arr[idx2];
        arr[idx2] = arr[idx1] - arr[idx2];
        arr[idx1] = arr[idx1] - arr[idx2];

    }

    public static int[] heapify(int[] arr) {
        int[] heapArr = new int[n+10];
        int idx = 1;
        heapArr[idx++] = arr[0];

        while (idx <= n) {
            heapArr[idx] = arr[idx-1];

            int i = idx;
            int parent = i / 2;

            while (heapArr[parent] < heapArr[i] && i > 1) {
                swap(heapArr, parent, i);
                i = parent;
                parent = i / 2;
            }

            idx++;

        }

        return heapArr;
    }

    public static void insert(int[] arr, int element){

        if(n == originalSize+10){
            System.out.println("Heap is Full");
            return;
        }

        arr[++n] = element;

        int idx = n;
        int parent = idx/2;

        while(arr[parent] < arr[idx] && idx > 1){
            swap(arr, parent, idx);
            idx = parent;
            parent = idx/2;
        }
        
        
    }

    public static void printHeap(int[] arr){
        System.out.print("\nHeap Array : ");

        if(n < 1){
            System.out.print("Heap is Empty");
        }

        for(int i=1; i<=n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public static void delete(int[] arr){
        if(n < 1){
            System.out.println("Oops List is Empty !");
            return;
        }

        int deletedElement = arr[1];
        swap(arr, 1, n);
        n = n-1;

        int idx = 1;
        int left = idx * 2;
        int right = (idx * 2) + 1;

        int largest = arr[left] > arr[right] ? left : right;

        while(arr[idx] < arr[largest] && idx <=n && left <=n && right <=n){
            swap(arr, idx, largest);
            idx = largest;
            left = idx * 2;
            right = (idx * 2) + 1;

            if(left <=n && right <=n){
                largest = arr[left] > arr[right] ? left : right;
            }else{
                break;
            }

        }

        if(left <=n){
             if(arr[idx] < arr[left] && idx <=n){
            swap(arr, idx, left);
            idx = left;
            }
        }

       if(right <=n){
        if(arr[idx] < arr[right] && idx <=n){
            swap(arr, idx, right);
            idx = right;
        }
       }
        
        

        System.out.print("\nDeleted element : "+deletedElement);
        System.out.println("");

    }

    public static void isHeap(int[] arr){
        boolean isMaxHeap = true;

        

        for(int i=1; i<n;i++){
            int left = i*2;
            int right = (i*2)+1;

            if (i >= n || left >= n || right >= n) {
            isMaxHeap = true;
            break;
            }

            if(arr[i] < arr[left] || arr[i] < arr[right]){
                isMaxHeap =  false;
                break;
            }

        }
        if(isMaxHeap){
            System.out.println("      Yes Valid MaxHeap");
        }else{
            System.out.println("      No Invalid MaxHeap");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int[] arr = { 14, 77, 54, 99, 34, 65, 21, 5, 57 };

        // n = arr.length;
        // originalSize = arr.length;

       System.out.print("Enter how many elements to store in Array : "); 
        originalSize = sc.nextInt();

       int[] arr = new int[originalSize];
       
       System.out.println("Enter the Array : ");
        for(int i=0; i<originalSize; i++){
            System.out.print("arr["+i+"] : ");    
            arr[i] = sc.nextInt();
        }

       n = arr.length;

       int[] heapArr = heapify(arr);

       System.out.println("");

       boolean breakLoop = false;

       while(!breakLoop){
        System.out.println("");

        System.out.println("1. Insert Value in MaxHeap");
        System.out.println("2. Delete Value from MaxHeap");
        System.out.println("3. Print MaxHeap");
        System.out.println("4. type \"exit\" To Exit the Program");

        System.out.print("\nEnter your Choice : ");
        String choice = sc.next().toLowerCase();

        switch(choice) {
            case "1" : {
                System.out.print("\nEnter the value/Element : ");
                int element = sc.nextInt();
                insert(heapArr, element);
                break;
            }

            case "2" : {
                delete(heapArr);
                break;
            }

            case "3" : {
                printHeap(heapArr);
                break;
            }

            case "4": {
                isHeap(heapArr);
                break;
            }

            case "exit" : {
                breakLoop =true;
                break;
            }

            default : System.out.println("Invalid Input");
        }

        

       }
       
        
    }
}
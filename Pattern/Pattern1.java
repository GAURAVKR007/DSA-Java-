class Pattern1 {
    public static void main(String[] args) {
        int n = 4;

         int l =1;
    
    for(int i=0;i<n;i++){
        for(int j=n-l;j>0;j--){
            System.out.print(" ");
            
        }
        l=l+1;
        for(int k=0;k<=i;k++){
            System.out.print("#");
        }
        System.out.print("\n");
    }
    
    }
}
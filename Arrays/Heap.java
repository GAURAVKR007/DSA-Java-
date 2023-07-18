class Heap {

    public static void swap(int[] arr, int idx1, int idx2) {
        arr[idx1] = arr[idx1] + arr[idx2];
        arr[idx2] = arr[idx1] - arr[idx2];
        arr[idx1] = arr[idx1] - arr[idx2];

    }

    public static int[] heapify(int[] arr) {
        int[] heapArr = new int[arr.length];
        int idx = 1;
        heapArr[idx++] = arr[0];

        while (idx < arr.length) {
            heapArr[idx] = arr[idx];

            int i = idx;
            int parent = i / 2;

            while (heapArr[parent] < heapArr[i] && i > 1) {
                swap(heapArr, parent, idx);
                i = parent;
                parent = i / 2;
            }

            idx++;

        }

        return heapArr;
    }

    public static void main(String[] args) {
        int[] arr = { 14, 77, 54, 99, 34, 65, 21, 5, 57 };

        int[] heapArr = heapify(arr);

        boolean firstElementSkipped = false;
        System.out.print("Heap Array : ");
        for (int x : heapArr) {
            if (!firstElementSkipped) {
                firstElementSkipped = true;
                continue; // Skip the first element
            }
            System.out.print(x + " ");
        }
    }
}
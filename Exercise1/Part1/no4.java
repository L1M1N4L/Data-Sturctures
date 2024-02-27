package Exercise1.Part1;

    // Time complexity: O(n)
    public int partition(int[] n, int begin, int end) {
        /**
         * partitioning y and performing quicksort.
         */
        int pivot = n[end]; // O(1)
        int i = begin - 1; // O(1)
        for (int j = begin; j < end; j++) { // O(n)
            if (n[j] <= pivot) { // O(1)
                i++; // O(1)
                int temp = n[i]; // O(1)
                n[i] = n[j]; // O(1)
                n[j] = temp; // O(1)
            }
        }
        int temp = n[i + 1]; // O(1)
        n[i + 1] = n[end]; // O(1)
        n[end] = temp; // O(1)
        return i + 1; // O(1)
    }
    public void no4(int[] n, int begin, int end) {
         /**
         * Time complexity: O(n*log(n)) on average, O(n^2) in the worst case
         */
        if (begin < end) { // O(1)
            int partition = partition(n, begin, end); // O(n)
            no4(n, begin, partition - 1); // O(log n) average case, O(n) worst case
            no4(n, partition + 1, end); // O(log n) average case, O(n) worst case
        }
    }



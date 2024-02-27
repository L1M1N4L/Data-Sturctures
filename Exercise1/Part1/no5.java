package Exercise1.Part1;

public void no5(int[] n, int no) { // O(1)
/**
 * This method implements the bubble sort algorithm to sort the input array.
 * Time complexity: O(n^2)
 */
    int i, j, temp; // O(1)
    boolean swap; // O(1)
    for (i = 0; i < no - 1; i++) { // O(n)
        swap = false; // O(1)
        for (j = 0; j < no - i - 1; j++) { // O(n)
            if (n[j] > n[j + 1]) { // O(1)
                temp = n[j]; // O(1)
                n[j] = n[j + 1]; // O(1)
                n[j + 1] = temp; // O(1)
                swap = true; // O(1)
            }
        }
        if (swap == false) { // O(1)
            break; // O(1)
        }
    }
}




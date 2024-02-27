package Exercise1.Part1;

public void no3(int[] arr, int n) {
/**
 * Searches for an integer using binary search.
 * Time complexity: O(log n) (logarithmic).
 */
    int first = 0; // O(1)
    int last = arr.length - 1; // O(1)
    
    // While Loop: O(log n) - logarithmic time
    while (first <= last) { // O(log n)
        int mid = (last - first) / 2 + first; // O(1)
        
        if (mid == n) { // O(1)
            System.out.println(mid); // O(1)
            break; // O(1)
        } else if (mid < n) { // O(1)
            first = mid + 1; // O(1)
        } else { // O(1)
            last = mid - 1; // O(1)
        }
    }
}

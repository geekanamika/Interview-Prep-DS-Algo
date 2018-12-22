int bSearch(long *arr, long n, int key) {
    int l =0, r = n-1;
    int mid;
    while(l<=r) {
        mid = (l+r)/2;
        if(arr[mid] == key) {
            return mid;
        } else if (arr[mid]<key) {
            l = mid+1;
        } else {
            r = mid-1;
        }
    }
}
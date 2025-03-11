package minggu5;

public class Latihan20 {
    int uts[], uas[];

    Latihan20(int uts[], int uas[]){
        this.uts = uts;
        this.uas = uas;
    }

    int cariMax(int arr[], int l, int r){
        if (l==r) {
            return arr[l];
        }
        int mid = (l+r)/2;
        int leftMax = cariMax(arr, l, mid);
        int rightMax = cariMax(arr, mid+1, r);
        return Math.max(leftMax, rightMax);
    }

    int cariMin(int arr[], int l, int r){
        if (l==r) {
            return arr[l];
        }
        int mid = (l+r)/2;
        int leftMin = cariMin(arr, l, mid);
        int rightMin = cariMin(arr, mid+1, r);
        return Math.min(leftMin, rightMin);
    }

    double hitungRataUAS(){
        double total = 0;
        for(int i=0; i<uas.length; i++){
            total+=uas[i];
        }
        return total / uas.length;
    }
}

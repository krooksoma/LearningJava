public class ArrayBub {
    private long[] a;
    private int nElems;

    public ArrayBub(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i]);
            System.out.println(" ");
        }
    }

    public void bubbleSort(){
        int out, in, other;

        for(out = nElems -1 ; out > 1; out--){
            for(in = 0; in < out; in++){
                if( a[in] > a[in + 1]){
                    swap(in, in + 1);
                }
            }
        }
    }

    public void biDirectionBubbleSort() {
        int out=nElems-1, in, _out=0;

        boolean isSwap = true;

        while(isSwap) {
            isSwap = false;

            for(in=_out; in<out; in++) {
                if( a[in] > a[in+1] ) {
                    swap(in, in+1);
                    isSwap=true;
                    System.out.println("value of _out: " + _out);
                }
            }

            for(in=out-1; in>_out; in--) {
                if(a[in] < a[in-1]) {
                    swap(in, in-1);
                    isSwap=true;
                    System.out.println("value of out: " + out);
                }
            }

            _out++;
            out--;
        }

    }

    public void oddEvenSort() {
        boolean isSwap=true;

        while(isSwap) {
            isSwap = false;

            for(int in=1; in<nElems-1; in+=2) {
                if( a[in] > a[in+1] ) {
                    swap(in, in+1);
                    isSwap=true;
                }
            }

            for(int in=0; in<nElems-1; in+=2) {
                if( a[in] > a[in+1] ) {
                    swap(in, in+1);
                    isSwap=true;
                }
            }

        }

    }

    public void swap(int one, int two){
        long temp;

        temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}

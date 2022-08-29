import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

       double arr[]={4,1,3,2,5};
        int n=arr.length;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Harmonik.harmonik(arr,n));

    }
}

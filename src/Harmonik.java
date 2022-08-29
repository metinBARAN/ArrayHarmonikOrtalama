public class Harmonik {

      static double harmonik(double arr[],int n){
          double sum=0.0;

          for (int i=0;i<n;i++){
              sum=sum+(double)1/arr[i];

          }
          return n/sum;
    }
}

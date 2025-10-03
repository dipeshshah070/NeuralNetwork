import java.lang.Math;
public class SigCalc {
    //perform the sigmoid calculation
    public static double sigmoid(double z){
        double sig = (1/(1+Math.exp(-z)));
        System.out.println(sig);
        return sig;
    }
    //adding two vectors
    public static double[] addVec(double[] a, double[] b){
        if (a.length != b.length){ //checks the length of the vector
            System.out.println("Make sure the vector has the same length");
        }

        double[] addition = new double[a.length];
        for (int i=0; i < a.length-1; i++){
            addition[i] = a[i] + b[i];
        }
        return addition;
    }

    //multiply two vectors
    public static double[] mulVec(double[][] matrix, double[] vector){
        double[] result = new double[matrix.length];
        for (int i=0; i<matrix.length; i++){
            double sum = 0;
            for (int j=0; j < matrix[j].length; j++){
                sum += matrix[i][j]*vector[j];
            }
            result [i] = sum;
        }
        return result;
    }


    public static void main(String[] args) {
        SigCalc.sigmoid(1.1);
    }
}

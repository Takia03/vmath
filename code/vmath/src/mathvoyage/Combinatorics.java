package mathvoyage;

public class Combinatorics {
    private static Combinatorics instance;

    private Combinatorics() {
        // Private constructor to prevent external instantiation
    }

    /**
     * Returns the singleton instance of this class.
     * @return The singleton instance
     */
    public static Combinatorics getInstance() {
        if (instance == null) {
            instance = new Combinatorics();
        }
        return instance;
    }

    /**
     * Returns combination value.
     * @param n is the total number of items.
     * @param r is the number of items to be chosen.
     * @return the combination value.
     */
    public  double combination(int n, int r){
        if(n>r & n>0 & r>=0){
            /**calculate n!**/
            double nFactorial = vmath.algebra.factorial(n);
            /**calculate r!**/
            double rFactorial = vmath.algebra.factorial(r);
            /**calculate (n-r)!**/
            double nMinusrFactorial = vmath.algebra.factorial(n-r);
            /**calculate n!/r!*(n-r)!**/
            return nFactorial / (rFactorial*nMinusrFactorial);


        }

        return 0;
    }
    /**
     * Returns permutation value.
     * @param n is the total number of items.
     * @param r is the number of items to be arranged.
     * @return the permutation value.
     */
    public double permutation (int n, int r){
            if ( n>r & n>0 & r>0 ){
                /**calculate n!**/
                double nFctorial = vmath.algebra.factorial(n);

                /**calculate (n-r)!**/
                double nMinusrFctorial = vmath.algebra.factorial(n-r);

                /**calculate n!/(n-r)!**/
                return nFctorial/nMinusrFctorial;
            }
            return 0;
    }

//    /**
//     * Returns number of sets.
//     * @param setSize number of elements
//     * @return number of sets.
//     */
//    public double numberOfSubset(int setSize){
//    }

}
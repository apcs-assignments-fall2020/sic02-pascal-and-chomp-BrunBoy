/**
 * Write a description of class Pascal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pascal
{
    public static int[][] pascalTriangle(int n) {
        int[][]mat=new int[n];
        for (int i=1; i<n; i++){
            mat[0][0]=i;
        }
    }
}

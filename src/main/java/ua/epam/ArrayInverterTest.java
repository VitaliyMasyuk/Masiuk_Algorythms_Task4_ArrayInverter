package ua.epam;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.epam.ArrayInverter;

import java.util.Arrays;

public class ArrayInverterTest {
    private ArrayInverter rev;
    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = {5, 4, 3, 2, 1};

    private static void testInvert(int[] arr) {

        System.out.print(Arrays.toString(arr) + " -> ");
        ArrayInverter.invert(arr);
        System.out.println(Arrays.toString(arr));

    }

   @Before
    public void runRevert(){
                 rev = new ArrayInverter();
            }
           @Test
   public void testRevertArr() {
             rev.invert(arr1);
               Assert.assertArrayEquals( arr1, arr2);
         }

    @Test
 public void testNotNULL() {
            rev.invert(arr1);
                Assert.assertNotNull(rev);
            }


            @Test
    public void testRevert() {
                 int[] arr2 = {1,2,5};
                int[] arrI = rev.invert(arr2);
                Assert.assertArrayEquals(arr2, arrI);
            }
    public static void main(String[] args) {
        testInvert(new int[]{});
        testInvert(new int[]{0});
        testInvert(new int[]{0, 1});
        testInvert(new int[]{0, 1, 2, 3, 4});


    }



}

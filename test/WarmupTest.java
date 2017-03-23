/**
 * Created by cmitchell on 3/23/17.
 */


import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
public class WarmupTest {
    @Test

    /**
     * Given a String
     * When you take a random letter out
     * Then the letter will be removed
     */
    public void testToRemove3() throws Exception {

        //arrange

        Warmup warmup = new Warmup();


        //act
        String word = warmup.missingChar("burd", 2);

        //assert

        assertThat(word, equalTo("bud"));

    }

    @Test
    /**
     *Given a String(Chris)
     *When you take the 2 letter out
     *Then the string will be Chis
     */

    public void testToRemove2() throws Exception {

        //arrange

        Warmup warmup = new Warmup();


        //act
        String word = warmup.missingChar("flowa", 3);

        //assert

        assertThat(word, equalTo("floa"));

    }

    @Test
    /**
     *Given a String(Chris)
     *When you take the 1 letter out
     *Then the string will be hris
     */

    public void testToRemove1() throws Exception {

        //arrange

        Warmup warmup1 = new Warmup();


        //act
        String word = warmup1.missingChar("Chris", 1);

        //assert

        assertThat(word, equalTo("Cris"));

    }
    @Test
    /**
     *Given a String(Chris)
     *When you take the 5 letter out
     *Then the string will be Cris
     */

    public void testToRemove4() throws Exception {

        //arrange

        Warmup warmup2 = new Warmup();


        //act
        String word = warmup2.missingChar("Chris", 4);

        //assert

        assertThat(word, equalTo("Chri"));

    }

    @Test
    /**
     *Given a String(Chris)
     *When you take the 5 letter out
     *Then the string will be Cris
     */

    public void testToRemove0() throws Exception {

        //arrange

        Warmup warmup2 = new Warmup();


        //act
        String word = warmup2.missingChar("Chris", 0);

        //assert

        assertThat(word, equalTo("hris"));

    }

    @Test

    /**
     * Given a String
     * When you take a random letter out
     * Then the letter will be removed
     */

    public void testToRemove6() throws Exception {

        //arrange

        Warmup warmup = new Warmup();


        //act
        String word = warmup.missingChar("THE IRON YARD", 6);

        //assert

        assertThat(word, equalTo("THE IRN YARD"));

    }

    @Test

    /**
     * Given a String
     * When you take a random letter out
     * Then the letter will be removed
     */

    public void testToRemove7() throws Exception {

        //arrange

        Warmup warmup = new Warmup();


        //act
        String word = warmup.missingChar("THE IRON YARD", 7);

        //assert

        assertThat(word, equalTo("THE IRO YARD"));

    }



    @Test

    /**
     * Given a String
     * When you take a random letter out
     * Then the letter will be removed
     */

    public void testToRemove5() throws Exception {

        //arrange

        Warmup warmup = new Warmup();


        //act
        String word = warmup.missingChar("THE IRON YARD", 5);

        //assert

        assertThat(word, equalTo("THE ION YARD"));

    }
    @Test

    /**
     * Given a String
     * When you take a random letter out
     * Then the letter will be removed
     */

    public void testToRemove8() throws Exception {

        //arrange

        Warmup warmup = new Warmup();


        //act
        String word = warmup.missingChar("THE IRON YARD", 8);

        //assert

        assertThat(word, equalTo("THE IRONYARD"));

    }


    @Test

    /**
     * Given three integers
     * When you put the integers in
     * Then one of them will be an integer in the teens
     */

    public void testTheTeens() throws Exception {

        //arrange

        Warmup warmup1 = new Warmup();


        //act
        boolean word = warmup1.isTeen(1, 4, 3);

        //assert

        assertThat(word, equalTo(false));

    }

    @Test

    /**
     * Given three integers
     * When you put the integers in
     * Then one of them will be an integer in the teens
     */

    public void testTheTeens1() throws Exception {

        //arrange

        Warmup warmup1 = new Warmup();


        //act
        boolean word = warmup1.isTeen(5, 67, 13);

        //assert

        assertThat(word, equalTo(true));

    }

    @Test

    /**
     * Given three integers
     * When you put the integers in
     * Then one of them will be an integer in the teens
     */

    public void testTheTeens2() throws Exception {

        //arrange

        Warmup warmup1 = new Warmup();


        //act
        boolean word = warmup1.isTeen(13, 14, 18);

        //assert

        assertThat(word, equalTo(true));

    }

    @Test

    /**
     * Given three integers
     * When you put the integers in
     * Then one of them will be an integer in the teens
     */

    public void testTheTeens3() throws Exception {

        //arrange

        Warmup warmup1 = new Warmup();


        //act
        boolean word = warmup1.isTeen(7, 15, 166);

        //assert

        assertThat(word, equalTo(true));

    }

    @Test

    /**
     * Given three integers
     * When you put the integers in
     * Then one of them will be an integer in the teens
     */

    public void testTheTeens4() throws Exception {

        //arrange

        Warmup warmup1 = new Warmup();


        //act
        boolean word = warmup1.isTeen(8, 16, 5);

        //assert

        assertThat(word, equalTo(true));

    }

    @Test

    /**
     * Given three integers
     * When you put the integers in
     * Then one of them will be an integer in the teens
     */

    public void testTheTeens5() throws Exception {

        //arrange

        Warmup warmup1 = new Warmup();


        //act
        boolean word = warmup1.isTeen(2, 19, 1);

        //assert

        assertThat(word, equalTo(true));

    }




    @Test

    /**
     * Given three integers
     * When you put the integers in
     * Then one of them will be an integer in the teens
     */

    public void testTheTeens6() throws Exception {

        //arrange

        Warmup warmup1 = new Warmup();


        //act
        boolean word = warmup1.isTeen(20, 120, 14);

        //assert

        assertThat(word, equalTo(true));

    }

       @Test

    /**
     * Given two integers and 1 double
     * When you put the integers in
     * Then one of them will be an integer in the teens
     */

    public void testTheTeens7() throws Exception {

        //arrange

        Warmup warmup1 = new Warmup();


        //act
        boolean word = warmup1.isTeen(1.3, 4, 19);

        //assert

        assertThat(word, equalTo(true));

    }



    @Test

    /**
     * Given two integers and 1 double
     * When you put the integers in
     * Then one of them will be an integer in the teens
     */

    public void testTheTeens8() throws Exception {

        //arrange

        Warmup warmup1 = new Warmup();


        //act
        boolean word = warmup1.isTeen(3.3, 4, 16);

        //assert

        assertThat(word, equalTo(true));

    }

}
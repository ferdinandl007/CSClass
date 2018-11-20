package com.company;

public class Tester {
    /** Carries out tests on a binary search method in the AscendingSequences class.
     *
     * @param args   not used
     */
    public static void main(String[] args) {

        // First need to set up a sequence with some data:
        AscendingSequence as = new AscendingSequence(25);
        System.out.println("Adding some elements to the sequence:");
        int[] somexs = {1, -54, 34, 0, 2, 96, 2};
        as.insertLots(somexs);
        System.out.println(as);




        for (int i : somexs) {
            System.out.println("Can the binary search find element " + i);
            System.out.println("Result of search for:" + i + " "+ as.search(i));
        }



    /*
    with the fixed search method  it now works it finds the number in all cases

Test case 1

[-3, 3, 4, 5, 34, 40, 80]
Can the binary search find element 4
Result of search for:4 true
Can the binary search find element 5
Result of search for:5 true
Can the binary search find element 34
Result of search for:34 true
Can the binary search find element -3
Result of search for:-3 true
Can the binary search find element 3
Result of search for:3 true
Can the binary search find element 80
Result of search for:80 true
Can the binary search find element 40
Result of search for:40 true


 test case 2

 [4, 34, 43, 54, 1235, 3543, 23135]
Can the binary search find element 4
Result of search for:4 true
Can the binary search find element 54
Result of search for:54 true
Can the binary search find element 34
Result of search for:34 true
Can the binary search find element 43
Result of search for:43 true
Can the binary search find element 3543
Result of search for:3543 true
Can the binary search find element 23135
Result of search for:23135 true
Can the binary search find element 1235
Result of search for:1235 true



 test case 3

 [4, 34, 43, 54, 888, 1235, 3543]
Can the binary search find element 4
Result of search for:4 true
Can the binary search find element 54
Result of search for:54 true
Can the binary search find element 34
Result of search for:34 true
Can the binary search find element 43
Result of search for:43 true
Can the binary search find element 3543
Result of search for:3543 true
Can the binary search find element 888
Result of search for:888 true
Can the binary search find element 1235
Result of search for:1235 true
Can the binary search find element 99  which Doesn't exist
Result of search for: 99 false


 test case 4

[-3543, -54, 4, 34, 43, 135, 888]
Can the binary search find element 4
Result of search for:4 true
Can the binary search find element -54
Result of search for:-54 true
Can the binary search find element 34
Result of search for:34 true
Can the binary search find element 43
Result of search for:43 true
Can the binary search find element -3543
Result of search for:-3543 true
Can the binary search find element 888
Result of search for:888 true
Can the binary search find element 135
Result of search for:135 true
Can the binary search find element 99  which Doesn't exist
Result of search for: 99 false



  test case 5



Adding some elements to the sequence:
[-54, -33, 1, 34, 43, 96, 135]
Can the binary search find element 1
Result of search for:1 true
Can the binary search find element -54
Result of search for:-54 true
Can the binary search find element 34
Result of search for:34 true
Can the binary search find element 43
Result of search for:43 true
Can the binary search find element -33
Result of search for:-33 true
Can the binary search find element 96
Result of search for:96 true
Can the binary search find element 135
Result of search for:135 true

   test case 6

[-54, 0, 1, 2, 2, 34, 96]
Can the binary search find element 1
Result of search for:1 true
Can the binary search find element -54
Result of search for:-54 true
Can the binary search find element 34
Result of search for:34 true
Can the binary search find element 0
Result of search for:0 true
Can the binary search find element 2
Result of search for:2 true
Can the binary search find element 96
Result of search for:96 true
Can the binary search find element 2
Result of search for:2 true


     */


         /*
          the binary search seems to only find every second element in the array  this is clearly visible when testing the example

         [2, 4, 33, 35, 45, 70, 90]
        Can the binary search find element 2
        Result of search for:2 false
        Can the binary search find element 4
        Result of search for:4 true
        Can the binary search find element 33
        Result of search for:33 false
        Can the binary search find element 35
        Result of search for:35 true
        Can the binary search find element 45
        Result of search for:45 false
        Can the binary search find element 70
        Result of search for:70 true
        Can the binary search find element 90
         Result of search for:90 false






          */





        // Now do some more tests of your own. Include at least six examples.
        // Remember that you can clear the sequence and insertLots to make a new sequence to test
        // You can search also for elements that have been deleted etc

    }
}

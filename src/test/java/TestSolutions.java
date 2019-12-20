
import brickedTask.SolutionBrackets;
import chackIsAnyTriangularExistInAnArray.Solution2;
import codeWarsSpiralTask.CodeWarsNumbersSpiral;
import cookies.CookieEater;
import fish.SolutionFish;
import genomicRangeQuery.SolutionGenomicRangeQuery;
import maxProductOfThree.SolutionMaxProductOfThree;
import maxProfit.MaxProfit;
import minAvgTwoSlice.SolutionMinAvgTwoSlice;
import nested.SolutionNested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import passingCars.SolutionPassingCars;
import password.Passsword;
import src.smallestIntThatisNotInArray.Solution;
import task.SolutionMinValueOfArray;
import task.SolutionBinaryAB;

import java.util.Arrays;
import java.util.stream.Stream;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSolutions {

    private static Stream<Arguments> provideDataForSolutionWithSmallestIntThatIsNotInArray() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4},              5),
                Arguments.of(new int[]{1},                       2),
                Arguments.of(new int[]{-1,-2, -3, -4},           1),
                Arguments.of(new int[]{2,3},                     1),
                Arguments.of(new int[]{1, 3, 6, 4, 1, 2},        5)

        );
    }

    private static Stream<Arguments> provideDataForTriangularTest() {
        return Stream.of(

                Arguments.of(new int[]{1, 2, 5, 10, 8, 20},                       1),
                Arguments.of(new int[]{1, 50, 2, 10, 5, 5 , 5},                 0),
                Arguments.of(new int[]{1, 50, 2, -10,-50, -100, 5, 5 , 5},       0),
                Arguments.of(new int[]{},       0),
                Arguments.of(new int[]{1,2},       0),
                Arguments.of(new int[]{4,2,3},       1),
                Arguments.of(new int[]{1,2,3},       0)
        );
    }


    private static Stream<Arguments> provideDataForBrackedTask() {
        return Stream.of(

                Arguments.of("",                                 1),
                Arguments.of("{[()()]}",                         1),
                Arguments.of("([)()]",                           0)
        );
    }

    private static Stream<Arguments> prvidePasswords() {
        return Stream.of(
                Arguments.of("ala miala kota",                   -1),
                Arguments.of("test 5 a0A pass007 ?xy1",           7)
        );
    }

    private static Stream<Arguments> prvideCookies() {
        return Stream.of(
                Arguments.of(1,  1,          1),
                Arguments.of(10, 4,          5),
                Arguments.of(7, 5,          7),
                Arguments.of(11, 3,          11),
                Arguments.of(23, 11,          23),
                Arguments.of(13, 7,          13),
                Arguments.of(17, 2,          17)
        );
    }
    private static Stream<Arguments> provideABForABBinaryStream() {
        return Stream.of(
                Arguments.of(1,  1,          1),
                Arguments.of(0, 0,          0),
                Arguments.of(3, 7,          3)
        );
    }

    private static Stream<Arguments> provideValuesForMinAvgTwoSlice() {
        return Stream.of(
                Arguments.of(new int [] {4,2,2,4,5,1,5,8},         1),
                Arguments.of(new int [] {-220,-2,-32,-333333},         2),
                Arguments.of(new int [] {1,2,3,4,5,6,7,8,9,0,11,12,12,13,14,15,16,17},         0),
                Arguments.of(new int [] {9,8,7,6,5,4,3,2,1,0},         8)

        );
    }



    private static Stream<Arguments> provideValuesForPassingCars() {
        return Stream.of(
                Arguments.of(new int [] {0,1,0,1,0,0,0,0,1},         9),
                Arguments.of(new int [] {0,1,0,1,1},         5)
        );
    }


    private static Stream<Arguments> provideValuesForGenomicRangeQuery() {
        return Stream.of(
                Arguments.of("CAGCCTA", new int [] {2,5,0},new int [] {4,5,6},         new int[] {2,4,1})
        );
    }



    private static Stream<Arguments> provideValuesForMaxProductOfThree() {
        return Stream.of(
                Arguments.of(new int[]{1,2,0,5,6},         60),
                Arguments.of(new int[]{-5, 5, -5, 4},         125)

        );
    }



    private static Stream<Arguments> provideValuesForFishTask() {
        return Stream.of(
                Arguments.of(new int[]{4,3,2,1,5}, new int[]{0,1,0,0,0},        2),
                Arguments.of(new int[]{2,3}, new int[]{1,0},        1)
        );
    }





    private static Stream<Arguments> provideValuesForNestingTask() {
        return Stream.of(

                Arguments.of("",                                 1),
                Arguments.of("()()()()()",                         1),
                Arguments.of("(((((()()()()(((((())))))()()())))))",                         1),
                Arguments.of("()()(()()()",                         0),
                Arguments.of("()))",                           0)
        );
    }


    private static Stream<Arguments> provideValuesForCodeWarsTaskWithSpiral() {
        return Stream.of(
                Arguments.of(4,2,       40),
                Arguments.of(4,2,       22)
        );
    }


    private static Stream<Arguments> provideValuesForMaxProfit() {
        return Stream.of(
                Arguments.of(new int[]{4,3,2,1,5},         4),
                Arguments.of(new int[]{5,4,3,2,1},         0),
                Arguments.of(new int[]{23171, 21011, 21123, 21366, 21013, 21367},         356),
                Arguments.of(new int[]{2,3},    1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideDataForSolutionWithSmallestIntThatIsNotInArray")
    public void smallestIntThatIsNotInArrayTestShouldCheckIsNumberIsNotInArray(int[] input, int expected){

        Solution sol = new Solution();
        assertTrue(sol.solution(input)==expected);
    }


    @ParameterizedTest
    @MethodSource("provideDataForTriangularTest")
    public void shouldReturnOneIfItsTriangularInArrayAnd0IfThereIsNot(int[] input, int expected){
        Solution2 solution2 = new Solution2();

        assertTrue(solution2.solution(input)==expected);

    }

    @ParameterizedTest
    @MethodSource("provideDataForBrackedTask")
    public void shouldReturnOneIfBrick(String input, int expected){
        SolutionBrackets solutionBrackets = new SolutionBrackets();

        assertTrue(solutionBrackets.solution2(input)==expected);

    }


    @ParameterizedTest
    @MethodSource("prvidePasswords")
    public void shouldReturnLengthOfLongestPassword(String input, int expected){
        Passsword passsword = new Passsword();

        assertTrue(passsword.solution(input)==expected);

    }

    @ParameterizedTest
    @MethodSource("prvideCookies")
    public void shouldReturnHowManyCookiesWasEaten(int m, int n , int expected){
        CookieEater cookieEater = new CookieEater();

        System.out.println(cookieEater.solution2(m,n));
        assertTrue(cookieEater.solution2(m,n) == expected);

    }


    @ParameterizedTest
    @MethodSource("prvideCookies")
    public void shouldReturnSmallestInt(int [] input, int expected){
        SolutionMinValueOfArray sol = new SolutionMinValueOfArray();

        System.out.println(sol.solution(input));
        assertTrue(sol.solution(input) == expected);

    }


    @ParameterizedTest
    @MethodSource("provideABForABBinaryStream")
    public void shouldReturnSumBinaryReprezentationAB(int A, int B , int expected){
        SolutionBinaryAB solutionBinaryAB = new SolutionBinaryAB();
        assertTrue(solutionBinaryAB.solution(A ,B) == expected);

    }

    @ParameterizedTest
    @MethodSource("provideValuesForMinAvgTwoSlice")
    public void shouldReturnMinAvgTwoSliceOfArray(int [] input, int expected){
        SolutionMinAvgTwoSlice solutionMinAvgTwoSlice = new SolutionMinAvgTwoSlice();
        assertTrue(solutionMinAvgTwoSlice.solution2(input) == expected);

    }

    @ParameterizedTest
    @MethodSource("provideValuesForPassingCars")
    public void shouldReturnNumberOfPassingCars(int [] input, int expected){
        SolutionPassingCars solutionPassingCars = new SolutionPassingCars();
        assertTrue(solutionPassingCars.solution(input) == expected);

    }

    @ParameterizedTest
    @MethodSource("provideValuesForGenomicRangeQuery")
    public void shouldReturnArrayOfMinGenom(String input, int [] P, int [] Q, int[] expected){
        SolutionGenomicRangeQuery solutionGenomicRangeQuery = new SolutionGenomicRangeQuery();
        assertTrue(Arrays.equals(solutionGenomicRangeQuery.solution(input, P, Q) , expected));

    }

    @ParameterizedTest
    @MethodSource("provideValuesForMaxProductOfThree")
    public void shouldReturnMaxProductOfThree(int[] input, int expected){
        SolutionMaxProductOfThree solutionMaxProductOfThree = new SolutionMaxProductOfThree();
        assertTrue(solutionMaxProductOfThree.solution(input)== expected);

    }

    @ParameterizedTest
    @MethodSource("provideValuesForFishTask")
    public void shouldReturnNumberOfLivingFishes(int[] A , int[] B, int expected){
        SolutionFish solutionFish = new SolutionFish();
        assertTrue(solutionFish.solution2(A,B)== expected);

    }

    @ParameterizedTest
    @MethodSource("provideValuesForNestingTask")
    public void shouldReturnOneIfCorrectNestedAndZeroIfNot(String input, int expected){
        SolutionNested solutionNested = new SolutionNested();
        assertTrue(solutionNested.solution(input)== expected);

    }

    @ParameterizedTest
    @MethodSource("provideValuesForCodeWarsTaskWithSpiral")
    public void shouldReturnSumOfColumnInSquareNumberSpiral(int number, int column, long expected){
        CodeWarsNumbersSpiral codeWarsNumbersSpiral = new CodeWarsNumbersSpiral();
        assertTrue(codeWarsNumbersSpiral.solution(number,column)== expected);

    }

    @ParameterizedTest
    @MethodSource("provideValuesForMaxProfit")
    public void shouldReturnMaxProfit(int [] input, int expected){
        MaxProfit maxProfit = new MaxProfit();
        assertTrue(maxProfit.solution(input)== expected);

    }


}

package greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class book_97pTest {

    @Test
    public void case1() throws Exception {
        //given
        int[][] arr = {
                {3,1,2},
                {4,1,4},
                {2,2,2}
        };
        int[][] arr2 = {
                {7,3,1,8},
                {3,3,3,4}
        };
        int solution = book_97p.solution(arr);
        int solution2 = book_97p.solution(arr2);
        Assertions.assertEquals(solution, 2);
        Assertions.assertEquals(solution2, 3);


        //when

        //then
    }
}
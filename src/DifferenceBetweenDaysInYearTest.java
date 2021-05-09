import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class DifferenceBetweenDaysInYearTest {
    @Test
    public void test1_Predicate1() {
        int output = DifferenceBetweenDaysInYear.cal(7, 1, 6, 1, 2021);
        assertEquals(31, output);
    }
    @Test
    public void test2_Predicate1() {
        int output = DifferenceBetweenDaysInYear.cal(1, 3, 4, 15, 2019);
        assertEquals(102, output);
    }
    @Test
    public void test3_Predicate2() {
        int output = DifferenceBetweenDaysInYear.cal(2, 5, 4, 27, 2000);
        assertEquals(82, output);
    }
    @Test
    public void test4_Predicate2() {
        int output = DifferenceBetweenDaysInYear.cal(5, 6, 4, 28, 65);
        assertEquals(53, output);
    }
    @Test
    public void test5_Predicate2() {
        int output = DifferenceBetweenDaysInYear.cal(9, 9, 4, 11, 1200);
        assertEquals(32, output);
    }
}
import cookies.CookieEater;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CookieEaterTest {
    public CookieEaterTest() {
    }

    private static Stream<Arguments> provideCookies() {
        return Stream.of(
                Arguments.of(1, 1, 1),
                Arguments.of(10, 4, 5),
                Arguments.of(7, 5, 7),
                Arguments.of(11, 3, 11),
                Arguments.of(23, 11, 23),
                Arguments.of(13, 7, 13),
                Arguments.of(17, 2, 17)
        );
    }

    @ParameterizedTest
    @MethodSource("provideCookies")
    public void shouldReturnHowManyCookiesWasEaten(int m, int n, int expected) {
        CookieEater cookieEater = new CookieEater();

        System.out.println(cookieEater.solution2(m, n));
        Assertions.assertTrue(cookieEater.solution2(m, n) == expected);

    }
}
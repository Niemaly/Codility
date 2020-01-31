import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import password.Password;

import java.util.stream.Stream;

public class PasswordTest {
    public PasswordTest() {
    }

    private static Stream<Arguments> providePasswords() {
        return Stream.of(
                Arguments.of("ala miala kota", -1),
                Arguments.of("test 5 a0A pass007 ?xy1", 7)
        );
    }

    @ParameterizedTest
    @MethodSource("providePasswords")
    public void shouldReturnLengthOfLongestPassword(String input, int expected) {
        Password password = new Password();

        Assertions.assertTrue(password.solution(input) == expected);

    }
}
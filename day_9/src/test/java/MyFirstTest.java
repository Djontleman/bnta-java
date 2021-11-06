import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;


public class MyFirstTest {

    @Test
    void test() {
//        assertEquals(1, 1);
        assertThat(1).isEqualTo(1);
    }


}

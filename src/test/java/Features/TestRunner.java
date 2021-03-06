package Features;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestRunner {

    @Test
    void testParallel() {
        Results results = Runner.path("classpath:Features")
                .outputCucumberJson(true)
                .parallel(10);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }

}

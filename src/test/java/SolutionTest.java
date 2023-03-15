import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void shouldCheckParentheses (){
        assertTrue(solution.isValid("()"));
        assertTrue(solution.isValid("()[]{}"));
        assertTrue(solution.isValid("[{}]"));
        assertFalse(solution.isValid("([)]"));
        assertFalse(solution.isValid("(]"));
        assertFalse(solution.isValid("[{})"));
        assertFalse(solution.isValid("[]{)"));
        assertFalse(solution.isValid("}}()"));
        assertFalse(solution.isValid("}{"));
        assertFalse(solution.isValid("[([]])"));
    }
}

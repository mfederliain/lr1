package federline18.com;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("federline18.com", appContext.getPackageName());
    }
    @Test
    public void checkPromptEmail() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        String needString="Email";
        String someString=appContext.getString(R.string.prompt_email);
        System.out.println("need "+needString+"| have "+ someString);
        assertEquals(needString, someString);
    }
}

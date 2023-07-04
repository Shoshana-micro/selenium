import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class MyRunListener extends RunListener {

    public MyRunListener() {
        System.out.println("Creation of Run Listener...");
    }

    @Override
    public void testStarted(Description description) throws Exception {

        System.out.println("A Test is going to start " + description.toString());
        description.getAnnotations().forEach(a->{
            System.out.println("annotation " + a.annotationType() + " " + a.toString());
        });
    }


    @Override
    public void testRunStarted(Description description) throws Exception {
        String desc = description == null? "null":"val";
        System.out.println("A mvn test  testRunStarted " + desc);
    }
    @Override
    public void testRunFinished(Result result) throws Exception {
        System.out.println("A testRunFinished success " + result.wasSuccessful() + " runCount " + result.getRunCount() );
    }
    @Override
    public void testFinished(Description description) throws Exception {
        System.out.println("A Test is going to Finish  " + description.toString()  );
        description.getAnnotations().forEach(a->{
            System.out.println("annotation " + a.annotationType() + " "+ a.toString());
        });
    }
    @Override
    public void testFailure(Failure failure) throws Exception {
        System.out.println("A testFailure  " + failure.getMessage());
    }
    @Override
    public void testAssumptionFailure(Failure failure) {
        System.out.println("A testAssumptionFailure  " +failure.getMessage());
    }
    @Override
    public void testIgnored(Description description) throws Exception {
        System.out.println("A testIgnored name " + description.getMethodName());
    }
}

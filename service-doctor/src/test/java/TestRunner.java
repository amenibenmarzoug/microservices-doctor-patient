import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.eniso.pm.servicedoctor.service.DoctorServiceImplTest;

public class TestRunner {
	 public static void main(String[] args) {
	        getTestResult(DoctorServiceImplTest.class);
	        
	    }
	    
	    public static void getTestResult(Class clazz){
	        Result result = JUnitCore.runClasses(clazz);

	        for (Failure failure : result.getFailures()) {
	            System.out.println(failure.toString());
	            
	        }
	        System.out.println(" Test result "+clazz.getName()+" "+result.wasSuccessful());
	        
	    }	
}

package com.camunda.myBPM.DispBPM;

import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.junit.Test;

public class AcceptPaymentDelegateTest {

	@Test
	public void verifyThatTheDelegateSetsVariable() {
		
		
		//set up class under test
		AcceptPaymentDelegate delegate = new AcceptPaymentDelegate();
		
		
		//set up mock of Camunda execution
		DelegateExecution mockExecution = mock(DelegateExecution.class);
		
		
		//run the delegate behaviour
		try {
			delegate.execute(mockExecution); 
			} 
		catch (Exception e) {
			e.printStackTrace();
			fail("throw exception: " + e.getMessage());
			}
		//now verify that the mock was called
		verify(mockExecution, times(1)).setVariable(eq("PaymentOK"), any(Boolean.class));
		
	
	}

}

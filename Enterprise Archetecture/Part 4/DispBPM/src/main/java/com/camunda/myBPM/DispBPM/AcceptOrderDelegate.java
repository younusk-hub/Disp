package com.camunda.myBPM.DispBPM;

import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class AcceptOrderDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		Random rando = new Random();
		execution.setVariable("OrderAccepted", rando.nextBoolean());
		// TODO Auto-generated method stub

	}

}

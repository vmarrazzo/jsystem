/*
 * Copyright 2005-2010 Ignis Software Tools Ltd. All rights reserved.
 */
package jsystem.runner.agent.notifications;

import jsystem.framework.report.JSystemListeners;
import jsystem.framework.scenario.ScenariosManager;
import junit.framework.Test;

public class AddWarningNotification extends RunnerNotification {
	
	private static final long serialVersionUID = 2716339611635279200L;
	private int testIndex;

	public int getTestIndex() {
		return testIndex;
	}

	public AddWarningNotification(Object source,int testIndex) {
		super(AddWarningNotification.class.getName(), source);
		this.testIndex = testIndex;
	}

	public void invokeDispatcher(JSystemListeners mediator){
		Test t = ScenariosManager.getInstance().getCurrentScenario().getTest(getTestIndex()).getTest();
		mediator.addWarning(t);
	}
}

package com.directi.training.ocp.exercise.refactor;

import com.directi.training.ocp.exercise.ResourceType;

public class TimeSlotResource extends Resource {
	

	 @Override
	    public void markBusy(int resourceId) {
	      
	    }

	    @Override
	    public void markFree(int resourceId) {

	    }
	    @Override
	    int findFreeSlot() {
	    	return 0;
	    }
	    

}

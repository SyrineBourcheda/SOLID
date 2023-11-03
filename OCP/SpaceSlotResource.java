package com.directi.training.ocp.exercise.refactor;

public class SpaceSlotResource extends Resource {
	
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

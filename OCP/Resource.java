package com.directi.training.ocp.exercise.refactor;

import com.directi.training.ocp.exercise.ResourceType;

public abstract class Resource {
	abstract void  markBusy(int resourceId);
    abstract void markFree(int resourceId);
    abstract int findFreeSlot();
    
    
   // public abstract int allocate();

}
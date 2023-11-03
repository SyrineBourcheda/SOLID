package com.directi.training.ocp.exercise.refactor;

import com.directi.training.ocp.exercise.ResourceType;

public class ResourceAllocator {
	
	 public int allocate(Resource resource) {
		 int resourceId;
		 resourceId=resource.findFreeSlot();
		 resource.markBusy(resourceId);
		 return resourceId;
	 }
	 
	 public void free(Resource resource,int resourceId)
	    {
		 resource.markFree(resourceId);
	   
	        }
	    }


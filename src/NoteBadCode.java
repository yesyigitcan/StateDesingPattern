public class NoteBadCode{
	private String state;
	
	public NoteBadCode(String state) {
		this.state = state;
	}
	
	
	public String getState() {
		return this.state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	

	public void changeToIncomplete() throws StateTransitionException {
		if(this.state == "Completed") {
			throw new StateTransitionException("The note cannot be changed from Completed to Incompleted state");
		} else if(this.state == "Incompleted") {
			throw new StateTransitionException("Already Incompleted");
		} else if (this.state == "Cancelled") {
			throw new StateTransitionException("The note cannot be changed from Cancelled to Incompleted state");
		} else if (this.state == "Permanent") {
			throw new StateTransitionException("The note cannot be changed from Permanent to Incompleted state");
		}
	}

	public void changeToCancelled() throws StateTransitionException {
		if(this.state == "Completed") {
			throw new StateTransitionException("The note cannot be changed from Completed to Cancelled state");
		} else if(this.state == "Incompleted") {
			this.state = state;
		} else if (this.state == "Cancelled") {
			throw new StateTransitionException("Already Cancelled");
		} else if (this.state == "Permanent") {
			this.state = state;
		}
	}

	public void changeToPermanent() throws StateTransitionException {
		if(this.state == "Completed") {
			throw new StateTransitionException("The note cannot be changed from Completed to Permanent state");
		} else if(this.state == "Incompleted") {
			throw new StateTransitionException("The note cannot be changed from Incompleted to Permanent state");
		} else if (this.state == "Cancelled") {
			throw new StateTransitionException("The note cannot be changed from Cancelled to Permanent state");
		} else if (this.state == "Permanent") {
			throw new StateTransitionException("Already permanent");
		}
	}

	public void changeToCompleted() throws StateTransitionException {
		if(this.state == "Completed") {
			throw new StateTransitionException("Already Completed");
		} else if(this.state == "Incompleted") {
			this.state = state;
		} else if (this.state == "Cancelled") {
			throw new StateTransitionException("The note cannot be changed from Cancelled to Completed state");
		} else if (this.state == "Permanent") {
			throw new StateTransitionException("The note cannot be changed from Permanent to Completed state");
		}
	}
}
public class PermanentState implements INoteState {

	@Override
	public void changeToIncomplete(Note note) throws StateTransitionException {
		throw new StateTransitionException("The note cannot be changed from Permanent to Incomplete state");
	}

	@Override
	public void changeToCancelled(Note note) {
		note.setState(new CancelledState());	
	}

	@Override
	public void changeToPermanent(Note note) throws StateTransitionException {
		throw new StateTransitionException("Already in Permanent state");
	}

	@Override
	public void changeToCompleted(Note note) throws StateTransitionException {
		throw new StateTransitionException("The note cannot be changed from Permanent to Completed state");
	}
	
	public String toString() {
		return "Permanent";
	}
}
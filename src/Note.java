import java.util.*;

public class Note{
	private INoteState state;
	
	public Note(INoteState state) {
		this.state = state;
	}
	
	
	public INoteState getState() {
		return this.state;
	}
	
	public void setState(INoteState state) {
		this.state = state;
	}
	

	public void changeToIncomplete() throws StateTransitionException {
		this.state.changeToIncomplete(this);
	}

	public void changeToCancelled() throws StateTransitionException {
		this.state.changeToCancelled(this);
	}

	public void changeToPermanent() throws StateTransitionException {
		this.state.changeToPermanent(this);
	}

	public void changeToCompleted() throws StateTransitionException {
		this.state.changeToCompleted(this);
	}
}
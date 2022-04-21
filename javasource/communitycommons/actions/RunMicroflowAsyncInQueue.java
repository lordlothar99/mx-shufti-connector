// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import communitycommons.Misc;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Runs a microflow asynchronous, that is, this action immediately returns but schedules the microflow to be run in the near future. The queue guarantees a first come first serve order of the microflows, and only one action is served at a time.
 * 
 * The microflow is run with system rights in its own transaction, and is very useful to run heavy microflows on the background.
 */
public class RunMicroflowAsyncInQueue extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String microflow;

	public RunMicroflowAsyncInQueue(IContext context, java.lang.String microflow)
	{
		super(context);
		this.microflow = microflow;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		return Misc.runMicroflowAsyncInQueue(microflow);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "RunMicroflowAsyncInQueue";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}

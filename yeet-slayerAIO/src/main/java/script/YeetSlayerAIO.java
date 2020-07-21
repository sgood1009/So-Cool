package script;

import org.dreambot.api.methods.Calculations;
import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;

@ScriptManifest(author = "yeeter01", category = Category.SLAYER, name = "yeet slayer aio", version = 1.123)
public class YeetSlayerAIO extends AbstractScript
{

	/**
	 * script loop
	 */
	@Override
	public int onLoop()
	{
		log("yeet");
		return Calculations.random(Calculations.random(100), Calculations.random(1500));
	}

	/**
	 *
	 */
	@Override
	public void onStart()
	{
		// TODO do this
	}

	/**
	 *
	 */
	@Override
	public void onStart(String... args)
	{
		// TODO do this
	}

}

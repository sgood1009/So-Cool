package yeetdyesaio;

import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;

@ScriptManifest(author = "yeeter01", category = Category.MONEYMAKING, name = "YEETdyes AIO", version = 0.1)
public class YeetDyes extends AbstractScript {

	@Override
	public int onLoop() {
		return 100;
	}

	@Override
	public void onStart() {
	}

	@Override
	public void onStart(String... params) {
		onStart();
	}
}

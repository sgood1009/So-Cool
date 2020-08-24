package yeetpickeraio;

import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;

@ScriptManifest(author = "yeeter01", category = Category.MONEYMAKING, name = "YEETpicker AIO", version = 0.1)
public class YeetPicker extends AbstractScript {

	@Override
	public void onStart() {

	}

	@Override
	public void onStart(String... params) {
		onStart();
	}

	@Override
	public int onLoop() {
		return 100;
	}
}

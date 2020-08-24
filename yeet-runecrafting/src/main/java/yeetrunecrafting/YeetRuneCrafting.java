package yeetrunecrafting;

import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;

@ScriptManifest(author = "yeeter01", category = Category.RUNECRAFTING, name = "YEETrunecrafting", version = 0.1)
public class YeetRuneCrafting extends AbstractScript {

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

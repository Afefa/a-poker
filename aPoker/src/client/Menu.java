package client;

import com.zorrozua.asier.R;
import com.zorrozua.asier.R.id;
import com.zorrozua.asier.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class Menu extends Activity {

	public void onCreate(Bundle savedInstanceState) {

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.menulayout);
		
		final Intent joinorcreate = new Intent(this, JoinOrCreate.class);
		final Intent options = new Intent(this, Options.class);
		
		Button playButton = (Button) findViewById(R.id.playButton);
		playButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				startActivity(joinorcreate);
			}
		});

		Button optionsButton = (Button) findViewById(R.id.optionsButton);
		optionsButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				startActivity(options);
			}
		}); 

		Button exitButton = (Button) findViewById(R.id.exitButton);
		exitButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});

	}
}
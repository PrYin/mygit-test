package com.btcall.view;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		toStr();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.action_settings:
			Toast.makeText(MainActivity.this, "µ„ª˜¡À…Ë÷√", Toast.LENGTH_SHORT)
					.show();
			break;

		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}
	
	private void toStr(){
		
	}
}

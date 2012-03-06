package xeltor.games.foogika.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;

public class FooGikaMenu extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

		final Intent intent = new Intent(this, GameSettings.class);
        
        RelativeLayout layout = (RelativeLayout)findViewById(R.id.menulayout);
        RelativeLayout.LayoutParams mylayout = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.FILL_PARENT,
                RelativeLayout.LayoutParams.FILL_PARENT);
        Button btn=new Button(this);
        btn.setBackgroundResource(R.drawable.trololo);
        btn.setText("MyButton");
        btn.setLayoutParams(mylayout);
        btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(intent);
			}
		});
        layout.addView(btn);
    }
}
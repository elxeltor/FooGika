package xeltor.games.foogika.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

public class FooGikaMenu extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        
        RelativeLayout layout = (RelativeLayout)findViewById(R.id.menulayout);
        RelativeLayout.LayoutParams mylayout = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.FILL_PARENT,
                RelativeLayout.LayoutParams.FILL_PARENT);
        Button btn=new Button(this);
        btn.setId(133);
        btn.setBackgroundResource(R.drawable.trololo);
        btn.setText("MyButton");
        btn.setLayoutParams(mylayout);
        layout.addView(btn);
    }
}
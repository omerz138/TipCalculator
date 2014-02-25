/**
 * @author omerz138
 */
package il.ac.huji.tipcalculator;

import il.ac.huji.tipcalculator.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class TipCalculatorActivity extends Activity  {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tip_calculator);
		final Button calcBtt = (Button) findViewById(R.id.btnCalculate);
		final EditText billAm = (EditText) findViewById(R.id.edtBillAmount);
		final TextView txtTip = (TextView) findViewById(R.id.txtTipResult);
		final CheckBox roundChk = (CheckBox) findViewById(R.id.chkRound);
		
		calcBtt.setOnClickListener(new OnClickListener()  {
			double amount;
			public void onClick(View v) {
				
				amount = Double.parseDouble(billAm.getText().toString())*0.12;
				if(roundChk.isChecked()){
					txtTip.setText("Tip: $"+(int)Math.round(amount));
				}
				else{
					txtTip.setText("Tip: $"+amount);
				}

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tip_calculator, menu);
		return true;
	}
}

package css.mrauzi.participation3tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // declare variables here
    EditText etBill;
    EditText etNumParty;
    TextView tvTotalTip;
    TextView tvTipPerPerson;
    TipCalculatorInterface tipCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize variables
        etBill = (EditText)findViewById(R.id.editTextBill);
        etNumParty = (EditText)findViewById(R.id.editTextNumParty);
        tvTotalTip = (TextView)findViewById(R.id.textViewTotalTip);
        tvTipPerPerson = (TextView)findViewById(R.id.textViewTipPerPerson);
        tipCalc = new TipCalculator();
    }

    public void onClickCalcButton(View view) {
        //Double totalTip = 0.0;
        //Double totalTipPerPerson = 0.0;
        Double bill = Double.parseDouble(etBill.getText().toString());
        Integer numParty = Integer.parseInt(etNumParty.getText().toString());


        tvTotalTip.setText("Total Tip: " + tipCalc.calculateTotalTip(bill).toString());
        tvTipPerPerson.setText("Total Tip Per Person: " + tipCalc.calcTipPerPerson(bill, numParty).toString());
    }
}

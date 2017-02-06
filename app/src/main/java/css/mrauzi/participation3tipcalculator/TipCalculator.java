package css.mrauzi.participation3tipcalculator;


/**
 * Created by mrauzi on 2/6/2017.
 */
public class TipCalculator implements TipCalculatorInterface {

    private Double totalTip;
    private Double totalTipPerPerson;
    final Double BASIC_TIP = 0.1;
    //private Double bill;
    //private Integer numParty;

    @Override
    public Double calculateTotalTip(Double bill) {
        totalTip = bill * BASIC_TIP;
        return totalTip;
    }

    @Override
    public Double calcTipPerPerson(Double bill, Integer numParty){

        totalTipPerPerson = calculateTotalTip(bill) / numParty;
        return totalTipPerPerson;
    }
}

package css.mrauzi.participation3tipcalculator;

/**
 * Created by mrauzi on 2/6/2017.
 */
public interface TipCalculatorInterface {
    Double calculateTotalTip(Double bill);

    Double calcTipPerPerson(Double bill, Integer numParty);
}

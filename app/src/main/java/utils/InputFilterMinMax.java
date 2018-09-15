package utils;

import android.text.InputFilter;
import android.text.Spanned;

public class InputFilterMinMax implements InputFilter {
    private int minimumValue;
    private int maximumValue;
    private int defaultValue;
    private int defaultValue2;

    public InputFilterMinMax(int minimumValue, int maximumValue, int defaultValue, int defaultValue2) {
        this.minimumValue  = minimumValue;
        this.maximumValue  = maximumValue;
        this.defaultValue  = defaultValue;
        this.defaultValue2 = defaultValue2;
    }

    @Override
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
        try {
            int input = Integer.parseInt(dest.subSequence(0, dstart).toString() + source + dest.subSequence(dend, dest.length()));
            if (isInRange(minimumValue, maximumValue, defaultValue, defaultValue2, input))
                return null;
        }
        catch (NumberFormatException nfe) {
        }
        return "";
    }

    private boolean isInRange(int a, int b, int d, int d2, int c) {
        return b > a ? (c >= a && c <= b) || c == d || c == d2 : c >= b && c <= a;
    }

}
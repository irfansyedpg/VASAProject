package utils;

import android.text.InputFilter;
import android.text.Spanned;

public class InputFilterMinMax implements InputFilter {
    private int minimumValue;
    private int maximumValue;
    private int defaultValue;

    public InputFilterMinMax(int minimumValue, int maximumValue, int defaultValue) {
        this.minimumValue = minimumValue;
        this.maximumValue = maximumValue;
        this.defaultValue = defaultValue;
    }

    @Override
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
        try {
            int input = Integer.parseInt(dest.subSequence(0, dstart).toString() + source + dest.subSequence(dend, dest.length()));
            if (isInRange(minimumValue, maximumValue, defaultValue, input))
                return null;
        }
        catch (NumberFormatException nfe) {
        }
        return "";
    }

    private boolean isInRange(int a, int b, int d, int c) {
        return b > a ? (c >= a && c <= b) || c == d : c >= b && c <= a;
    }

}
package com.Nj.code;

public class Coefficient {
    private int value;

    public Coefficient(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }

    class calculeDeResultat {
        public double calculer(float note, Coefficient coefficient) {
            return note * coefficient.getValue();
        }
        public double calculeMoyenne(double total, int totalCoefficients) {
            if (totalCoefficients == 0) {
                throw new IllegalArgumentException("Le total des coefficients ne peut pas être zéro.");
            }
            return total / totalCoefficients;
        }
    }
}

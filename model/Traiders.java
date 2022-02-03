package sql.demo.model;

import java.math.BigDecimal;

public class Traiders {
    private String name;
    private int sfreqTick;
    private BigDecimal cash;
    private int changeProbability;
    private int traidingMethod;
    private String about;

    public Traiders() {
    }

    public Traiders(String name, int sfreqTick, BigDecimal cash, int traidingMethod, int changeProbability, String about) {
        this.name = name;
        this.sfreqTick = sfreqTick;
        this.cash = cash;
        this.changeProbability = changeProbability;
        this.traidingMethod = traidingMethod;
        this.about = about;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChangeProbability() {
        return changeProbability;
    }

    public void setChangeProbability(int changeProbability) {
        this.changeProbability = changeProbability;
    }

    public int getTraidingMethod() {
        return traidingMethod;
    }

    public void setTraidingMethod(int traidingMethod) {
        this.traidingMethod = traidingMethod;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public int getSfreqTick() {
        return sfreqTick;
    }

    public void setSfreqTick(int sfreqTick) {
        this.sfreqTick = sfreqTick;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}

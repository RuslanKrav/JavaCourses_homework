package sql.demo.model;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Share {
    private String name;
    private BigDecimal startPrice;
    private int changeProbability;
    private int delta;

    public Share() {
    }

    public Share(String name, BigDecimal startPrice, int changeProbability, int delta) {
        this.name = name;
        this.startPrice = startPrice;
        this.changeProbability = changeProbability;
        this.delta = delta;
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

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public BigDecimal getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(BigDecimal startPrice) {
        this.startPrice = startPrice;
    }
}


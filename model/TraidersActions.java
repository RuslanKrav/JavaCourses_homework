package sql.demo.model;

import sql.demo.repository.BaseTable;

public class TraidersActions extends BaseModel{
    private int operation;
    private long traiders_id;
    private long share_rate_id;
    private long amount;

    public TraidersActions() {
    }
    public TraidersActions(long id, int operation, long traiders_id, long share_rate_id, long amount) {
       super(id);
        this.operation = operation;
      this.traiders_id = traiders_id;
      this.share_rate_id = share_rate_id;
      this.amount = amount;
    }

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    public Object getTraiders_id() {
        return traiders_id;
    }

    public void setTraiders_id(long traiders_id) {
        this.traiders_id = traiders_id;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}

package sql.demo.repository;

import java.sql.SQLException;

public class TraidersRepository extends BaseTable implements TableOperations{
    public TraidersRepository() throws SQLException {
        super("traiders");
    }

    @Override
    public void createTable() throws SQLException {
        super.executeSqlStatement("CREATE TABLE traiders(\n" +
                "\tid BIGINT AUTO_INCREMENT PRIMARY KEY,\n" +
                "\tname VARCHAR(255) NOT NULL,\n" +
                "\tfreqTiсk INTEGER NOT NULL,\n" +
                "\tcash  DECIMAL(15,2) NOT NULL DEFAULT 1000,\n" +
                "\ttradingMethod INTEGER NOT NULL,\n" +
                "\tchangeProbability INTEGER NOT NULL DEFAULT 50,\n" +
                "\tabout VARCHAR(255) NULL\n" +
                ")", "Созданная таблица " + getTableName());
    }

    @Override
    public void createForeignKeys() throws SQLException {
        super.executeSqlStatement("ALTER TABLE traiders ADD CONSTRAINT check_traiders_tradingMethod\n" +
                "\tCHECK(tradingMethod IN (1,2,3));\n" +
                "ALTER TABLE traiders ADD CONSTRAINT check_traiders_changeProbability\n" +
                "\tCHECK(changeProbability <= 100 AND changeProbability > 0)", "Cозданы константы check_traiders_tradingMethod");
    }
}



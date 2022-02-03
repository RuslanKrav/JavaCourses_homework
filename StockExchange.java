package sql.demo;

import sql.demo.repository.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StockExchange {
    public  static final String DB_url="jdbc:h2:/db/stockExchange";
    public static final String DB_driver="org.h2.Driver";
    private static SharesRepository sharesRepository;
    private static TraidersRepository traidersRepository;
    private static ActionsRepository actionsRepository;
    private static RatesRepository ratesRepository;


    public StockExchange() throws ClassNotFoundException, SQLException{
        Class.forName(DB_driver);
        this.traidersRepository = new TraidersRepository();
        this.sharesRepository = new SharesRepository();
        this.actionsRepository = new ActionsRepository();
        this.ratesRepository = new RatesRepository();
    }

    public static void main(String[] args) {
        try{
          StockExchange stockExchange = new StockExchange();
          StockExchange.createTables();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("JDB driver for Database not found!");
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("SQL Error!");
        }
    }

    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(DB_url);
        System.out.println("Connected to Database!)");

        return connection;
    }

    public static void createTables() throws SQLException{
        sharesRepository.createTable();
        traidersRepository.createTable();
        traidersRepository.createForeignKeys();
        ratesRepository.createTable();
        ratesRepository.createForeignKeys();
        actionsRepository.createTable();
        actionsRepository.createForeignKeys();
    }
}

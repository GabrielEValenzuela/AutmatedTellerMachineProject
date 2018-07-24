package AtmMVC.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryConnection extends DataBaseConnection {

    public boolean getCustomer(int id, Customer customer) {

        Connection connection = getConnection();
        PreparedStatement statement = null;
        ResultSet result = null;

        String query = "SELECT * FROM customerTable WHERE customerId=" + id;
        try {
            statement = connection.prepareStatement(query);
            result = statement.executeQuery();
            if (result.next()) {
                customer.setFirstName(result.getString("firstName"));
                customer.setLastName(result.getString("lastName"));
                customer.setEmail(result.getString("email"));
                customer.setBalance(result.getFloat("balance"));
                customer.setDoubleCheck(result.getBoolean("doubleCheck"));
                customer.setPIN(result.getString("PIN"));
                customer.setCustomerId(result.getInt("customerId"));
                customer.setBank(result.getString("bankAssociated"));
            }
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
            }
        }
    }

    public boolean getCard(int id, Card card) {

        Connection connection = getConnection();
        PreparedStatement statement = null;
        ResultSet result = null;

        String query = "SELECT * FROM cardTable WHERE cardId=" + id;
        try {
            statement = connection.prepareStatement(query);
            result = statement.executeQuery();
            if (result.next()) {
                card.setCardId(result.getInt("cardId"));
                card.setCustomerAssociated(result.getInt("customerAssociated"));
                card.setCurrentStatus(result.getBoolean("currentStatus"));
            }
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
            }
        }
    }

    public void updateBalance(float amount, Customer customer) {
        float buffer = amount + customer.getBalance();
        String query = "UPDATE customerTable SET balance= ? WHERE customerId=" + customer.getCustomerId();
        customer.setBalance(buffer);
        Connection connection = getConnection();
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement(query);
            statement.setDouble(1, buffer);
            statement.executeUpdate();

        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public void blockCard(Card card) {
        String query = "UPDATE cardTable SET currentStatus= ? WHERE cardId=" + card.getCardId();
        Connection connection = getConnection();
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement(query);
            statement.setBoolean(1, false);
            statement.executeUpdate();

        } catch (Exception e) {
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println(e);
            }

        }

    }
}
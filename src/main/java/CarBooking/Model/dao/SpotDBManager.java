package CarBooking.Model.dao;

import CarBooking.Model.Spot;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SpotDBManager {
    private final Connection conn;

    public SpotDBManager() throws SQLException, ClassNotFoundException {
        conn = new DBConnector().openConnection();
    }

    public void addSpot(Spot spot) throws SQLException {
        String query = "INSERT INTO Spot (Location, PriceRatePH, PriceRatePD, PriceRateON, SSpot, MSpot, LSpot, PassAvaliable, DiscountAvaliable) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, spot.getLocation());
        pstmt.setDouble(2, spot.getPriceRatePH());
        pstmt.setDouble(3, spot.getPriceRatePD());
        pstmt.setDouble(4, spot.getPriceRateON());
        pstmt.setInt(5, spot.getsSpot());
        pstmt.setInt(6, spot.getmSpot());
        pstmt.setInt(7, spot.getlSpot());
        pstmt.setInt(8, spot.getPassAvailable());
        pstmt.setInt(9, spot.getDiscountAvailable());

        int result = pstmt.executeUpdate();
        pstmt.close();


    }
}

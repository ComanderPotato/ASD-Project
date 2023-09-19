package CarBooking.Model.dao;

import CarBooking.Model.Spot;

import java.sql.SQLException;

public class TestSpot {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        SpotDBManager spotDBManager = new SpotDBManager();

        Spot testSpot = new Spot("UTS", 1.5, 10.0, 14.0, 20, 100, 500, 1, 0);
        spotDBManager.addSpot(testSpot);
    }
}

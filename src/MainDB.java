import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainDB {
    public static void main(String[] args){
        Connection c = DatabaseCon.getConnection();
        if (c!=null) {
            try {
                System.out.println("Connected to database bro✅");
                Statement st = c.createStatement();

                st.executeUpdate("TRUNCATE TABLE player RESTART IDENTITY CASCADE");

                st.executeUpdate("INSERT INTO player (name,age,salary,sport_id,club_id) VALUES ('Араухо',36,999000,1,1)");
                st.executeUpdate("INSERT INTO player (name,age,salary,sport_id,club_id) VALUES ('Yamal',18,667000,1,1)");
                st.executeUpdate("INSERT INTO player (name,age,salary,sport_id,club_id) VALUES ('vini',26,800000,1,2)");
                System.out.println("Players inserted successfully!");

                ResultSet rs = st.executeQuery("SELECT * FROM player");
                while (rs.next()) {
                    System.out.println(
                            rs.getInt("player_id") + " " +
                                    rs.getString("name") + " " +
                                    rs.getInt("age") + " " +
                                    rs.getDouble("salary")
                    );
                }
                c.close();
            } catch (Exception e) {
                System.out.println("Ошибка при работе с базой!");
                e.printStackTrace();
            }
        }
    }
}

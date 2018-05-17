package kazan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DBManager {
	
	private DBManager instance;
	private Connection connection;
	
	public DBManager getInstance(){
		if(instance == null){
			instance = new DBManager();
		}
		return instance;
	}

	public Connection getConnection(){
		return connection;
	}
	
	private DBManager(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test_3", "root", "zdravko1");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	public void insertIntoRakijii(Rakijiq r){
		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO rakijii(rakijiq_name, rakijiq_age) VALUES(?,?)");
			ps.setString(1, r.getName());
			ps.setInt(2, r.getAge());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insertIntoBerachi(Berach b){
		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO berachi(berach_name, berach_age) VALUES(?,?)");
			ps.setString(1, b.getName());
			ps.setInt(2, b.getAge());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insertIntoRikii(String date, String type, Rakijiq r, int litri){
		try {
			//TODO with rakijiq_id
			PreparedStatement ps = connection.prepareStatement("INSERT INTO rakii(date, rakiq_type, rakijiq_name, rakiq_litri) VALUES(?,?,?,?)");
			ps.setString(1, date);
			ps.setString(2, type);
			ps.setString(3, r.getName());
			ps.setInt(4, litri);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void rakiiStatistics(){
		List<String> rakii = new ArrayList<>();
		List<Integer> rakiiQuant= new ArrayList<>();
		try {
			Statement s = connection.createStatement();
			ResultSet rs = s.executeQuery("SELECT rakiq_type, rakiq_litri FROM rakii");
			while(rs.next()){
				rakii.add(rs.getString("rakiq_type"));
				rakiiQuant.add(rs.getInt("rakiq_litri"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		HashMap<String, Integer> statistics = new HashMap<>();
		for (int i = 0; i < rakii.size(); i++) {
			if(!statistics.containsKey(rakii.get(i))){
				statistics.put(rakii.get(i), rakiiQuant.get(i));
				continue;
			}
			statistics.put(rakii.get(i), statistics.get(rakii.get(i))+rakiiQuant.get(i));
		}
		for (String s : statistics.keySet()) {
			System.out.println("Rakiq ot " +s+ " : " +statistics.get(s)+ " kila.");
		}
	}
	
	public void naiMladBerach(){
		try {
			Statement ps = connection.createStatement();
			ResultSet rs = ps.executeQuery("SELECT berach_name FROM berachi ORDERED BY berach_age LIMIT 1");
			rs.next();
			System.out.println("Nai mlad berach: " + rs.getString("berach_name"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}

package com.anime.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.anime.bean.Anime;

public class AnimeDao {

public static Connection getConnection(){
    Connection con=null;
    try{
    	Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anime","root","0511101");
    }catch(Exception e){
    	e.printStackTrace();  // より詳細なエラーメッセージを出力する }
    }
    return con;
}
//public static int save(Anime u){
//    int status=0;
//    try{
//        Connection con=getConnection();
//        PreparedStatement ps=con.prepareStatement(
//"insert into register(name,password,email,sex,country) values(?,?,?,?,?)");
//        ps.setString(1,u.getAnime());
//        ps.setString(2,u.getAnime_img());
//        ps.setString(3,u.getAnime_url());
//        ps.setString(4,u.getRate());
//        ps.setString(5,u.isGenreAction());
//        status=ps.executeUpdate();
//    }catch(Exception e){System.out.println(e);}
//    return status;
//}
//public static int update(Anime u){
//    int status=0;
//    try{
//        Connection con=getConnection();
//        PreparedStatement ps=con.prepareStatement(
//"update register set name=?,password=?,email=?,sex=?,country=? where id=?");
//        ps.setString(1,u.getName());
//        ps.setString(2,u.getPassword());
//        ps.setString(3,u.getEmail());
//        ps.setString(4,u.getSex());
//        ps.setString(5,u.getCountry());
//        ps.setInt(6,u.getId());
//        status=ps.executeUpdate();
//    }catch(Exception e){System.out.println(e);}
//    return status;
//}
//public static int delete(Anime u){
//    int status=0;
//    try{
//        Connection con=getConnection();
//        PreparedStatement ps=con.prepareStatement("delete from register where id=?");
//        ps.setInt(1,u.getId());
//        status=ps.executeUpdate();
//    }catch(Exception e){System.out.println(e);}
//
//    return status;
//}
public static List<Anime> getAllRecords(){
    List<Anime> list=new ArrayList<>();

    try{
        Connection con=getConnection();
        PreparedStatement ps=con.prepareStatement("select * from anime_data");
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            Anime u=new Anime();
            u.setAnime(rs.getString("anime"));
            u.setAnime_img(rs.getString("anime_img"));
            u.setAnime_url(rs.getString("anime_url"));
            u.setRate(rs.getFloat("rate"));
            u.setEpisodes(rs.getInt("episodes"));
            u.setVotes(rs.getInt("votes"));
            u.setAnimeId(rs.getInt("anime_id"));
            
            list.add(u);
        }
    }catch(Exception e){System.out.println(e);}
    return list;
}

    // 特定のアニメをIDで取得
    public static Map<String, String> getAnimeById(String animeId) {
        Map<String, String> anime = new HashMap<>();
        try{
            Connection con = getConnection();
            String query = "SELECT * FROM anime_data WHERE anime_id = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, animeId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                anime.put("anime_id", rs.getString("anime_id"));
                anime.put("anime", rs.getString("anime"));
                anime.put("anime_url", rs.getString("anime_url"));
                anime.put("anime_img", rs.getString("anime_img"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return anime;
    }
//public static Anime getRecordById(int id){
//    Anime u=null;
//    try{
//        Connection con=getConnection();
//        PreparedStatement ps=con.prepareStatement("select * from register where id=?");
//        ps.setInt(1,id);
//        ResultSet rs=ps.executeQuery();
//        while(rs.next()){
//            u=new Anime();
//            u.setId(rs.getInt("id"));
//            u.setName(rs.getString("name"));
//            u.setPassword(rs.getString("password"));
//            u.setEmail(rs.getString("email"));
//            u.setSex(rs.getString("sex"));
//            u.setCountry(rs.getString("country"));
//        }
//    }catch(Exception e){System.out.println(e);}
//    return u;
//}
}

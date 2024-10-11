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

public class AnimeCommentDao {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/anime";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "0511101";

    // コメントを追加する
    public static boolean addComment(String username, String comment, String animeId) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "INSERT INTO comments (username, comment, anime_id) VALUES (?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, comment);
            stmt.setString(3, animeId);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // 特定のアニメに対する全てのコメントを取得する
    public static List<Map<String, String>> getCommentsByAnimeId(String animeId) {
        List<Map<String, String>> comments = new ArrayList<>();
        System.out.println("Received animeId: " + animeId);  // anime_idを出力
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "SELECT username, comment, created_at FROM comments WHERE anime_id = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, animeId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Map<String, String> comment = new HashMap<>();
                comment.put("username", rs.getString("username"));
                comment.put("comment", rs.getString("comment"));
                comment.put("created_at", rs.getString("created_at")); // タイムスタンプの取得
                comments.add(comment);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return comments;
    }
}
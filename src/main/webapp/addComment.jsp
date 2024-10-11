<%@page import="java.sql.*,com.anime.dao.AnimeCommentDao"%>
<%
    String username = request.getParameter("username");
    String comment = request.getParameter("comment");
    String animeId = request.getParameter("anime_id");

    if (username != null && comment != null && animeId != null) {
        // コメントをデータベースに追加
        boolean success = AnimeCommentDao.addComment(username, comment, Integer.parseInt(animeId));

        if (success) {
            // 成功した場合はアニメの詳細ページにリダイレクト
            response.sendRedirect("AnimeDeatails.jsp?anime_id=" + animeId);
        } else {
            // 失敗した場合のエラーメッセージ表示
            out.println("コメントの追加に失敗しました。もう一度お試しください。");
        }
    } else {
        out.println("すべてのフィールドを入力してください。");
    }
%>
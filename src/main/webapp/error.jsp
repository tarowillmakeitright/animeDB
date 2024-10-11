<%@ page isErrorPage="true" %>
<%@page import="com.anime.dao.*,com.anime.bean.*,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>エラーが発生しました</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
</head>
<body>
    <div class="container text-center">
        <h1 class="mt-5">申し訳ありません、エラーが発生しました。</h1>
        <p>お探しのページが見つからないか、サーバーで問題が発生しました。</p>
        <p>もう一度お試しください。または、以下のリンクからホームに戻ってください。</p>
        <a href="index.jsp" class="btn btn-primary">ホームに戻る</a>
    </div>

    <div class="container mt-5">
        <h4>エラーメッセージ</h4>
        <p><%= exception != null ? exception.getMessage() : "詳細はサーバーログを確認してください。" %></p>
    </div>
</body>
</html>
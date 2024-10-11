<%@ include file="header.jsp"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<body>
	<%
	String animeId = request.getParameter("anime_id");
	System.out.println("Received anime_id: " + animeId);

	// リクエストパラメータからアニメIDを取得
	// ここでanime_idがnullか確認
	if (animeId == null) {
		response.sendRedirect("error.jsp");
	} else {
		//コメント情報を取得
		List<Map<String, String>> comments = AnimeCommentDao.getCommentsByAnimeId(animeId);

	}
	// アニメ情報を取得
	Map<String, String> anime = AnimeDao.getAnimeById(animeId);
	%>


	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<div id="carouselExampleSlidesOnly" class="carousel slide"
					data-bs-ride="carousel">
					<div class="carousel-inner">
						<div class="carousel-item active">
							<img src="<%=anime.get("anime_img")%>" class="d-block"<%=anime.get("anime")%>">
							<h1 style="color: white;">
								<%=anime.get("anime")%></h1>
							<p>Some representative placeholder content for the first
								slide.</p>
						</div>
					</div>
				</div>
				<h2>コメント一覧</h2>
				<ul>
					<%
					// POSTリクエストで送信された
					String username = request.getParameter("username");
					String comment = request.getParameter("comment");
					String createdAt = request.getParameter("created_at");

					System.out.println("Received anime_id: " + animeId);
					System.out.println("Received username: " + username);
					System.out.println("Received comment: " + comment);
					System.out.println("Received created_at: " + createdAt);
					%>
					<%
					if (username != null && comment != null && animeId != null) {
						boolean success = AnimeCommentDao.addComment(username, comment, animeId);
						if (success) {
							System.out.println("Comment added successfully.");
						} else {
							System.out.println("Failed to add comment.");
						}
					}

					List<Map<String, String>> comments = AnimeCommentDao.getCommentsByAnimeId(animeId);
					if (comments == null || comments.isEmpty()) {
					%>
					<li>コメントがまだありません。</li>
					<%
					} else {
					for (Map<String, String> userComment : comments) {
					%>
					<li><strong><%=userComment.get("username")%>:</strong> <%=userComment.get("comment")%><small><%=userComment.get("created_at")%></small></li>
					<%
					}
					}
					%>
				</ul>
				<h2>コメントを追加</h2>
				<form action="AnimeDeatails.jsp" method="post">
					<!-- アニメIDをhiddenで渡す -->
					<input type="hidden" name="anime_id" value="<%=animeId%>">

					<!-- ユーザーが入力するフィールド -->
					<label for="username">ユーザー名:</label> <input type="text"
						id="username" name="username" required> <br> <label
						for="comment">コメント:</label>
					<textarea id="comment" name="comment" required></textarea>
					<br>

					<button type="submit">コメントを投稿</button>
				</form>
			</div>
		</div>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>

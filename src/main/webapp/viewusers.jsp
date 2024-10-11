<%@ include file="header.jsp"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String animeId = request.getParameter("anime_id");
System.out.println("Received animeId: " + animeId);
List<Anime> list = AnimeDao.getAllRecords();
request.setAttribute("list", list);
%>

<main role="main">
    <div class="container">
        <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 row-cols-md-4 g-3">
            <!-- ループ開始 -->
            <c:forEach items="${list}" var="u">
                <div class="col">
                    <a target="_blank" href="${u.getAnime_url()}">
                        <img src="${u.getAnime_img()}" class="card-img-top" alt="${u.getAnime()}">
                    </a>
                    <div class="card-body">
                        <h4 class="card-title">${u.getAnime()}</h4>
                        <p class="card-text">This is a wider card with supporting text
                            below as a natural lead-in to additional content. This content is
                            a little bit longer.</p>
                        <ul class="list-group list-group-flush">
                            <li class="list-group-item">Rate: ${u.getRate()}</li>
                            <li class="list-group-item">Votes: ${u.getVotes()}</li>
                            <li class="list-group-item">Episodes: ${u.getEpisodes()}</li>
                        </ul>
                        <div class="card-body">
                            <button type="button" class="btn btn-primary">
                                <a href="AnimeDeatails.jsp?anime_id=${u.getAnimeId()}" class="card-link" style="color:white;">コメント一覧</a>
                            </button>
                            <button type="button" class="btn btn-primary">
                                <a href="${u.getAnime_url()}" class="card-link" style="color:white;">公式Webサイト</a>
                            </button>
                        </div>
                    </div>
                </div>
            </c:forEach>
            <!-- ループ終了 -->
        </div>
    </div>
</main>
<%-- <main role="main">
	<c:forEach items="${list}" var="u">
		<div class="container">
			<div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 row-cols-md-4 g-3">
				<div class="col">
					<a target="_blank" href="${u.getAnime_url()}"> <img
						src="${u.getAnime_img()}" class="card-img-top"
						alt="${u.getAnime()}">
					</a>
					<div class="card-body">
						<h4 class="card-title">${u.getAnime()}</h4>
						<p class="card-text">This is a wider card with supporting text
							below as a natural lead-in to additional content. This content is
							a little bit longer.</p>
						<ul class="list-group list-group-flush">
							<li class="list-group-item">Rate: ${u.getRate()}</li>
							<li class="list-group-item">Votes: ${u.getVotes()}</li>
							<li class="list-group-item">Episodes: ${u.getEpisodes()}</li>
						</ul>
						<div class="card-body">
							<button type="button" class="btn btn-primary">
								<a href="AnimeDeatails.jsp?anime_id=${u.getAnimeId()}"
									class="card-link" style="color:white;">コメント一覧</a>
							</button>
							<button type="button" class="btn btn-primary">
								<a href="#" class="card-link" style="color:white;">公式Webサイト</a>
							</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</c:forEach>
</main>
 --%>
<%@ include file="footer.jsp"%>

</body>
</html>

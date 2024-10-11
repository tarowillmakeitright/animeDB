package com.anime.bean;

public class Anime {
private String anime; //アニメの名前
private String anime_url; //公式Webサイト　
private String anime_img; //アニメの画像URL
private int episodes; //エピソード
private int votes; // 投票（いいねボタンが押された数）
private int weight; //わからん考えてくれ
private float rate; //５段階評価の平均値
private int rate_1; //5段階の評価１　うーん
private int rate_2; //5段階の評価2　まあまあ
private int rate_3; //5段階の評価3　普通
private int rate_4; //5段階の評価4　すごくいい
private int rate_5; //5段階の評価5 ものすごくいい
private boolean genreAction; //アクション
private boolean genreAdventure; //アドベンチャー
private boolean genreComedy; //コメディー
private boolean genreDrama; //ドラマ
private boolean genreFamily; //家族
private boolean genreFantasy; //ファンタジー
private boolean genreFood; //食い物
private boolean genreHarem; //えっち
private boolean genreHistorical; //歴史
private boolean genreHorror; //ホラー
private boolean genreKids; //子供
private boolean genreIsekai; //異世界
private boolean genreJosei; //女性
private boolean genreMagic; //マジック
private boolean genreMartialArts; //格闘
private boolean genreMecha; // ロボット
private boolean genreMusic; //音楽
private boolean genreMystery; //ミステリー
private boolean genreRomance; // 恋
private boolean genreSciFi; //SF
private boolean genreSeinen; //青年
private boolean genreSgdrama; //ドラマ
private boolean genreShojo; //少女
private boolean genreShonen; //少年
private boolean genreSliceOfLife; //
private boolean genreSports; //スポーツ
private boolean genreSupernatural; //
private boolean genreThriller; //スリル
private int animeId;
//generate getters and setters


public String getAnime() {
	return anime;
}
public void setAnime(String anime) {
	this.anime = anime;
}
public String getAnime_url() {
	return anime_url;
}
public void setAnime_url(String anime_url) {
	this.anime_url = anime_url;
}
public String getAnime_img() {
	return anime_img;
}
public void setAnime_img(String anime_img) {
	this.anime_img = anime_img;
}
public int getEpisodes() {
	return episodes;
}
public void setEpisodes(int episodes) {
	this.episodes = episodes;
}
public int getVotes() {
	return votes;
}
public void setVotes(int votes) {
	this.votes = votes;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public float getRate() {
	return rate;
}
public void setRate(float rate) {
	this.rate = rate;
}

public int getRate_1() {
	return rate_1;
}
public void setRate_1(int rate_1) {
	this.rate_1 = rate_1;
}
public int getRate_2() {
	return rate_2;
}
public void setRate_2(int rate_2) {
	this.rate_2 = rate_2;
}
public int getRate_3() {
	return rate_3;
}
public void setRate_3(int rate_3) {
	this.rate_3 = rate_3;
}
public int getRate_4() {
	return rate_4;
}
public void setRate_4(int rate_4) {
	this.rate_4 = rate_4;
}
public int getRate_5() {
	return rate_5;
}
public void setRate_5(int rate_5) {
	this.rate_5 = rate_5;
}

public boolean isGenreAction() {
	return genreAction;
}
public void setGenreAction(boolean genreAction) {
	this.genreAction = genreAction;
}
public boolean isGenreAdventure() {
	return genreAdventure;
}
public void setGenreAdventure(boolean genreAdventure) {
	this.genreAdventure = genreAdventure;
}
public boolean isGenreComedy() {
	return genreComedy;
}
public void setGenreComedy(boolean genreComedy) {
	this.genreComedy = genreComedy;
}
public boolean isGenreDrama() {
	return genreDrama;
}
public void setGenreDrama(boolean genreDrama) {
	this.genreDrama = genreDrama;
}
public boolean isGenreFamily() {
	return genreFamily;
}
public void setGenreFamily(boolean genreFamily) {
	this.genreFamily = genreFamily;
}
public boolean isGenreFantasy() {
	return genreFantasy;
}
public void setGenreFantasy(boolean genreFantasy) {
	this.genreFantasy = genreFantasy;
}
public boolean isGenreFood() {
	return genreFood;
}
public void setGenreFood(boolean genreFood) {
	this.genreFood = genreFood;
}
public boolean isGenreHarem() {
	return genreHarem;
}
public void setGenreHarem(boolean genreHarem) {
	this.genreHarem = genreHarem;
}
public boolean isGenreHistorical() {
	return genreHistorical;
}
public void setGenreHistorical(boolean genreHistorical) {
	this.genreHistorical = genreHistorical;
}
public boolean isGenreHorror() {
	return genreHorror;
}
public void setGenreHorror(boolean genreHorror) {
	this.genreHorror = genreHorror;
}
public boolean isGenreKids() {
	return genreKids;
}
public void setGenreKids(boolean genreKids) {
	this.genreKids = genreKids;
}
public boolean isGenreIsekai() {
	return genreIsekai;
}
public void setGenreIsekai(boolean genreIsekai) {
	this.genreIsekai = genreIsekai;
}
public boolean isGenreJosei() {
	return genreJosei;
}
public void setGenreJosei(boolean genreJosei) {
	this.genreJosei = genreJosei;
}
public boolean isGenreMagic() {
	return genreMagic;
}
public void setGenreMagic(boolean genreMagic) {
	this.genreMagic = genreMagic;
}
public boolean isGenreMartialArts() {
	return genreMartialArts;
}
public void setGenreMartialArts(boolean genreMartialArts) {
	this.genreMartialArts = genreMartialArts;
}
public boolean isGenreMecha() {
	return genreMecha;
}
public void setGenreMecha(boolean genreMecha) {
	this.genreMecha = genreMecha;
}
public boolean isGenreMusic() {
	return genreMusic;
}
public void setGenreMusic(boolean genreMusic) {
	this.genreMusic = genreMusic;
}
public boolean isGenreMystery() {
	return genreMystery;
}
public void setGenreMystery(boolean genreMystery) {
	this.genreMystery = genreMystery;
}
public boolean isGenreRomance() {
	return genreRomance;
}
public void setGenreRomance(boolean genreRomance) {
	this.genreRomance = genreRomance;
}
public boolean isGenreSciFi() {
	return genreSciFi;
}
public void setGenreSciFi(boolean genreSciFi) {
	this.genreSciFi = genreSciFi;
}
public boolean isGenreSeinen() {
	return genreSeinen;
}
public void setGenreSeinen(boolean genreSeinen) {
	this.genreSeinen = genreSeinen;
}
public boolean isGenreSgdrama() {
	return genreSgdrama;
}
public void setGenreSgdrama(boolean genreSgdrama) {
	this.genreSgdrama = genreSgdrama;
}
public boolean isGenreShojo() {
	return genreShojo;
}
public void setGenreShojo(boolean genreShojo) {
	this.genreShojo = genreShojo;
}
public boolean isGenreShonen() {
	return genreShonen;
}
public void setGenreShonen(boolean genreShonen) {
	this.genreShonen = genreShonen;
}
public boolean isGenreSliceOfLife() {
	return genreSliceOfLife;
}
public void setGenreSliceOfLife(boolean genreSliceOfLife) {
	this.genreSliceOfLife = genreSliceOfLife;
}
public boolean isGenreSports() {
	return genreSports;
}
public void setGenreSports(boolean genreSports) {
	this.genreSports = genreSports;
}
public boolean isGenreSupernatural() {
	return genreSupernatural;
}
public void setGenreSupernatural(boolean genreSupernatural) {
	this.genreSupernatural = genreSupernatural;
}

public boolean isGenreThriller() {
	return genreThriller;
}
public void setGenreThriller(boolean genreThriller) {
	this.genreThriller = genreThriller;
}
public int getAnimeId() {
	return animeId;
}
public void setAnimeId(int animeId) {
	this.animeId = animeId;
}

}
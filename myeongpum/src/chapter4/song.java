package chapter4;
/*노래를 나타내는 Song이라는 클래스를 설계하라. SOng 클래스는 다음과 같은 필드를 갖는다.
 * 노래의 제목을 나타내는 title
 * 가수를 나타내는 artist
 * 노래가 속한 앨범 제목을 나타내는 album
 * 노래의 작곡가를 나타내는 composer, 자곡가는여러 명 있을 수 있다.
 * 노래가 발표된 연도를 나타내는 year
 * 노래가 속한 앨범에서의 트랙번호를나타내는 track
 * 
 * 생성자는 기본 생성자와 모든 필드를 초기화하는 생성자를 작성하고, 노래의 정보를 화면에
 * 출력하는 show() 메소드도 작성하라. ABBA의 "Dancing Queen" 노래를 SOng 객체로 생성하고
 * show() 를 이용하여 이 노래의 정보를 출력하는 프로그램을 작성하라.
 */
public class song {
	private String title;
	private String artist;
	private String album;
	private String[] composer;
	int year;
	int track;
	
	public song() {
		this.title = "Dancing Queen";
		this.artist = "ABBA";
		this.album = "ABBA_Dancing Queen";
		this.composer = new String[] {"ABBA"};
		this.year = 2000;
		this.track = 1;		
	}
	
	public void show() {
		System.out.println(getTitle());
		System.out.println(getArtist());
		System.out.println(getAlbum());
		System.out.println(getComposer()[0].toString());
		System.out.println(getYear());
		System.out.println(getTrack());
	}
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getArtist() {
		return artist;
	}


	public void setArtist(String artist) {
		this.artist = artist;
	}


	public String getAlbum() {
		return album;
	}


	public void setAlbum(String album) {
		this.album = album;
	}


	public String[] getComposer() {
		return composer;
	}


	public void setComposer(String[] composer) {
		this.composer = composer;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getTrack() {
		return track;
	}


	public void setTrack(int track) {
		this.track = track;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		song sg = new song();
		sg.show();
	}

}

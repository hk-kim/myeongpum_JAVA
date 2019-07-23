package chapter4;
/*�뷡�� ��Ÿ���� Song�̶�� Ŭ������ �����϶�. SOng Ŭ������ ������ ���� �ʵ带 ���´�.
 * �뷡�� ������ ��Ÿ���� title
 * ������ ��Ÿ���� artist
 * �뷡�� ���� �ٹ� ������ ��Ÿ���� album
 * �뷡�� �۰�� ��Ÿ���� composer, �ڰ�¿��� �� ���� �� �ִ�.
 * �뷡�� ��ǥ�� ������ ��Ÿ���� year
 * �뷡�� ���� �ٹ������� Ʈ����ȣ����Ÿ���� track
 * 
 * �����ڴ� �⺻ �����ڿ� ��� �ʵ带 �ʱ�ȭ�ϴ� �����ڸ� �ۼ��ϰ�, �뷡�� ������ ȭ�鿡
 * ����ϴ� show() �޼ҵ嵵 �ۼ��϶�. ABBA�� "Dancing Queen" �뷡�� SOng ��ü�� �����ϰ�
 * show() �� �̿��Ͽ� �� �뷡�� ������ ����ϴ� ���α׷��� �ۼ��϶�.
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

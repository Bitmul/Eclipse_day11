package adsd;

import java.util.Scanner;

class EzenComputer {
	private String area;
	private final static String hak = "EZEN";
	private String subname[] = new String[max_cnt];
	private String time[] = new String[max_cnt];
	private String name;
	private String phone;
	private int birth;
	private int old;
	private int cnt = 0;
	private final static int max_cnt = 6;

	public EzenComputer() {
	}

	// 기본인적사항만 포함
	public EzenComputer(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	// 수강정보 미포함
	public EzenComputer(String name, String phone, String area, int birth, int old) {
		this.name = name;
		this.phone = phone;
		this.area = area;
		this.birth = birth;
		this.old = old;
	}

	public void prntsub(Scanner scan) {
		for (;;) {
			if (this.cnt == this.max_cnt - 1)
				break;
			System.out.println("과목을 추가하려면 추가할 과목의 갯수를,프로그램을 종료하려면 0을 입력하세요.");
			int temp = scan.nextInt();
			if (temp == 0)
				break;
			if (this.cnt + temp < this.max_cnt) {
				this.cnt = cnt + temp;
				this.Sub(scan, temp);
				this.suinfo();
			} else
				System.out.println("\n최대 수강신청 갯수를 넘어서 추가할 수 없습니다.");
		}
	}

	public int getCnt() {
		return cnt;
	}

	public String getSubname(int i) {
		
		return this.subname[i];
	}
	
	public int getLen() {
		
		return this.subname.length;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	// 수강정보 포함한 입력
	public EzenComputer(String name, String phone, String area, String sub, String time, int birth, int old) {
		this.name = name;
		this.phone = phone;
		this.area = area;
		this.birth = birth;
		this.old = old;
		this.subname[0] = sub;
		this.time[0] = time;
	}

	// 수강정보 추가
	public void Sub(Scanner tscan, int start) // 입력받을 스캐너, 과목을 추가할 배열의 인덱스. 초기 실행의 경우 최댓값으로 둔다.
	{
		if (this.cnt < max_cnt) {
			System.out.println("수강하고 있는 강의와 기간을 입력해주십시오.");
			//
			for (int i = this.cnt - start; i < this.cnt; i++) {
				this.subname[i] = tscan.next();
				this.time[i] = tscan.next();
			}
		} else
			System.out.println("현재 수강하고 있는 강의 갯수가 최대입니다.");
	}

	public void suinfo() {
		if (subname[0] != null) {
			for (int i = 0; i < this.cnt; i++) {
				System.out.println(this.subname[i] + "(" + this.time[i] + ")");
			}
		} else
			System.out.println("수강한 과목이 없습니다.");
	}

	public void Hakinfo() {
		System.out.println("학원 이름 : " + this.hak);
		if (this.area != null)
			System.out.println("학원 지역 : " + this.area);
		else
			System.out.println("학원 지역값이 없습니다.");
	}

	public void Stuinfo() {
		if (this.name != null)
			System.out.println("학생 이름 : " + this.name);
		else
			System.out.println("학생 이름값이 없습니다");
		if (this.birth != 0)
			System.out.println("생년월일 : " + this.birth);
		else
			System.out.println("학생 생년월일값이 없습니다");
		if (this.old != 0)
			System.out.println("나이 : " + this.old);
		else
			System.out.println("학생 나이값이 없습니다");
		if (this.phone != null)
			System.out.println("전화번호 : " + this.phone);
		else
			System.out.println("학생 전화번호값이 없습니다");
	}

	public void setStuinfo(String name,int birth, int old,String phone) {
		this.setName(name);
		this.setPhone(phone);
		this.setBirth(birth);
		this.setOld(old);
	}

	public void infoAll() {
		System.out.println(this.name + "학생 통합 정보\n");
		this.Hakinfo();
		this.Stuinfo();
		this.suinfo();
	}
	
	//학생 이름으로 검색 -> 모든 정보 출력
	//지점 정보로 검색 -> 학생 정보만 출력
	//과목을 수강하는 학생만 검색 -> 학생정보,수강정보 출력
	


	public static int getMaxCnt() {
		return max_cnt;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String[] getSubnames() {
		return subname;
	}

	public void setSubname(String[] subname) {
		this.subname = subname;
	}

	public String[] getTime() {
		return time;
	}

	public void setTime(String[] time) {
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public int getOld() {
		return old;
	}

	public void setOld(int old) {
		this.old = old;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public static String getHak() {
		return hak;
	}
}
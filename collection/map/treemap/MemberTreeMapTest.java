package collection.map.treemap;

import collection.Member2;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap =new MemberTreeMap();
		
		Member2 memberPack = new Member2(1001, "박진영"); 
		Member2 memberSong = new Member2(1002, "송유나"); 
		Member2 memberKim = new Member2(1003, "김유신"); 
		Member2 memberSon = new Member2(1004, "손흥민"); 
		
		memberTreeMap.addMember(memberPack);
		memberTreeMap.addMember(memberSong);
		memberTreeMap.addMember(memberKim);
		memberTreeMap.addMember(memberSon);
		
		memberTreeMap.showAllMember();
		
		System.out.println("========객체 삭제========");
		memberTreeMap.removeMember(1002);
		memberTreeMap.removeMember(memberSon.getMemberId());
		memberTreeMap.showAllMember();
		
	}
}

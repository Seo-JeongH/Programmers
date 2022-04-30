//2022 카카오 블라인드 신고 결과 받기
//레벨 1 2022.02.24
//https://coding-grandpa.tistory.com/106 거의 보고 따라했음 ... 어렵다 ...
package kakao;

import java.util.*;

public class kakao2022_singo {

	public static int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];

		HashSet<String> set = new HashSet<String>();
		for(String a : report) {
			set.add(a);
		}
//		Iterator it = set.iterator();
//		for(int i = 0; i < set.size(); i++) {
//			System.out.println(it.next());    
//		}
		
		Map<String, ArrayList<String>> hash = new HashMap<>();
		for(String a : set) {
			int blank = a.indexOf(" ");
			String reporter = a.substring(0, blank);
			String reportee = a.substring(blank + 1);
			
			ArrayList<String> reporterList = hash.getOrDefault(reportee, null);
			if(reporterList == null) {
				reporterList = new ArrayList<>();
			}
			
			reporterList.add(reporter);
			hash.put(reportee, reporterList);
		}
		
		Map<String, Integer> reporterHash = new HashMap<>();
		for(ArrayList<String> notifyList : hash.values()) {
			if(notifyList.size() >= k) { 
				for(String reporter : notifyList) {
					reporterHash.put(reporter, reporterHash.getOrDefault(reporter, 0) + 1);
				}
			}
		}
		
		for(int i = 0 ; i < id_list.length; i++) {
			answer[i] = reporterHash.getOrDefault(id_list[i], 0);
//			System.out.println(answer[i]);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		String id_list[] = {"muzi", "frodo", "apeach", "neo"};
		String report[] = {"muzi frodo", "apeach frodo", "frodo neo", "apeach muzi"};
		int k = 2;
		solution(id_list, report, k);

	}

}

package programmers.step2;

import java.util.HashMap;

// 스킬트리
public class pb49993 {

	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		
		solution(skill, skill_trees);
	}
	
	public static int solution(String skill, String[] skill_trees) {
		HashMap<Character, Integer> idxMap = new HashMap<>();
		int idx = 0;
		for(char c : skill.toCharArray()) {
			idxMap.put(c, idx);
			idx ++;
		}
        
		int answer = 0;
		char first = skill.charAt(0);
		
		for(String s : skill_trees) {
			boolean pass = true;
			char[] arr = s.toCharArray();
			int passedIdx = -1; // 초기 비교 값은 최소 idx로 잡는다.
			
			for(int i=0; i<s.length(); i++) {
				if(arr[i] == first) {
					passedIdx = 0;
					continue;
				}
				
				if(idxMap.containsKey(arr[i])) {
					if(passedIdx == -1) {
						pass = false;
						break;
					} else {
						if(idxMap.get(arr[i]) != passedIdx + 1) {
							pass = false;
							break;
						} else {
							passedIdx = idxMap.get(arr[i]);
						}
					}
				}
			}
			
			if(pass == true) answer ++;
		}
		
		System.out.println(answer);
        return answer;
    }
}

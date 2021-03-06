package com.algorithm._00_알고리즘_구현.youtube1;

/*
이진탐색
- 어떤 값을 찾을때 정렬의 특징을 이용해 빨리 찾는다.
- 정렬되어있을 경우, 어떤 값을 찾을때 : O(N) -> O(lgN)
- 처음부터 생각하기 어려움, 쉬운 방법부터 생각

[개념]
- 1 ~ 4 중에 특정 숫자를 찾아야할때
   - 모두 탐색 O(N)
   (예시)
   for 문으로 숫자를 비교하여 찾는다.

   - 이진탐색 O(lgN)
   (예시)
   1 2 | 3 4 절반을 나누고, 2 < 3이므로 3, 4 영역으로 가서 3 | 4를 반으로 나눠서 3을 비교하여 3을 찾았다.

[핵심 코드] : 외워둬야한다.
def search(st, en, target) :
   if st == en:
      // ~~
      return

   mid = (st + en) // 2
   if (nums[mid] < target):
      search(mid + 1, en, target)
   else
      search(st, mid, target)

[아이디어]
- N개의 수 먼저 정렬 (이진탐색은 먼저 정렬이 되어있어야 한다.)
- M개의 수가 있는지 확인? -> M개의 수를 하나씩 이진탐색 수행한다.

[시간복잡도]
- N개의 수 정렬: O(N * lgN)
- M개의 수 이진탐색 : O(M * lgN)
- O((N+M)lgN) = 2e5 * 20 = 4e6 -> 가능

[팁]
- 처음부터 생각하기 어려우므로, 쉬운 방법(for 등)부터 생각
  -> 어떤 값을 여러번 탐색해야하는 경우
- 입력의 개수가 10의 5승 정도의 경우라면 이진탐색을 사용하는게 아닐까? 생각해보자.

*/
public class _06_이진탐색 {
}

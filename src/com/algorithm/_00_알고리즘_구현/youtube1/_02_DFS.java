package com.algorithm._00_알고리즘_구현.youtube1;

/*
DFS
- 그래프 탐색 : 어떤 것들이 연속해서 이어질때 모두 확인하는 방법이다.
  (Graph : Vertex(어떤것) + Edge(이어지는것))
- Depth-first search (깊이 우선 탐색)
- 자식의 자식을 우선으로 탐색한다.
- Stack, 재귀함수로 풀 수 있다.
- 사실 그래프 탐색은 BFS 로만도 풀 수 있다. DFS 를 사용하는 이유는 재귀함수(백트래킹에서 아주 유용)을 사용하기 위해 배운다.

[재귀함수]
- 자기 자신을 다시 호출하는 함수
- 주의할점
 > 재귀 함수가 종료되는 시점을 반드시 명시한다.
 > 재귀 함수의 깊이가 너무 깊어지면 stack overflow 발생한다.
- DFS, 백트래킹에서 주로 사용한다.

[아이디어]
- 시작점에 연결된 Vertex 찾기
- 연결된 Vertex 를 계속해서 찾는다. (끝날때까지)
- 더이상 연결된 Vertex 없을 경우 다음 노드를 찾게된다.
(자식의 자식을 찾을때까지 계속 진행, 더이상 찾을 수 없으면 다시 위로 올라가서 다음 노드를 찾는것)

[시간복잡도]
O(V+E)

[자료구조]
- 검색할 그래프 : 2차원 배열
- 방문 여부 확인 : 2차원 배열 (재방문 금지)
- 재귀함수 사용
 */
public class _02_DFS {
}

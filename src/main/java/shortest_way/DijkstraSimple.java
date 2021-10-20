package shortest_way;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class DijkstraSimple {

    public static final int INF = (int) 1e9;
    public static int n, m, start;
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1번부터 시작한다고 가정한다.
        n = sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();

        // 그래프 초기화
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 모든 간선 정보 입력
        for (int i = 0; i < m; i++) {
            int node = sc.nextInt();
            int toNode = sc.nextInt();
            int wage = sc.nextInt();

            graph.get(node).add(new Node(toNode, wage));
        }
        boolean[] visited = new boolean[n + 1];
        int[] d = new int[n + 1];

        Arrays.fill(d, INF);

        dijkstra(start, d, visited);

        for (int i = 1; i <= n; i++) {
            if (d[i] == INF) {
                System.out.println("INF");
            } else {
                System.out.println(d[i]);
            }
        }
    }

    private static void dijkstra(int start, int[] d, boolean[] visited) {
        // 시작 노드에 대해서 초기화
        d[start] = 0;
        visited[start] = true;

        for (int i = 0; i < graph.get(start).size(); i++) {
            d[graph.get(start).get(i).getIndex()] = graph.get(start).get(i).getDistance();
        }

        // 시작 노드를 제외한 전체 n-1개의 노드에 대해 반복
        for (int i = 0; i < n - 1; i++) {
            // 현재 최단 거리가 가장 짧은 노드를 꺼내서 방문 처리
            int now = getSmallestNode(d, visited);
            visited[now] = true;

            // 현재 노드와 연결된 다른 노드를 확인
            for (int j = 0; j < graph.get(now).size(); j++) {
                int cost = d[now] + graph.get(now).get(j).getDistance();
                if (cost <= d[graph.get(now).get(j).getIndex()]) {
                    d[graph.get(now).get(j).getIndex()] = cost;
                }
            }
        }
    }

    private static int getSmallestNode(int[] d, boolean[] visited) {
        int min = INF;
        int index = 0;
        for (int i = 0; i < d.length; i++) {
            if (d[i] <= min && !visited[i]) {
                min = d[i];
                index = i;
            }
        }
        return index;
    }
    static class Node {
        private int index;
        private int distance;

        public Node(int index, int distance) {
            this.index = index;
            this.distance = distance;
        }

        public int getIndex() {
            return index;
        }

        public int getDistance() {
            return distance;
        }
    }

}


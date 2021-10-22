package dfs_bfs;

// nhn 모의 테스트
import java.util.Scanner;
import java.util.*;

class nhn_test {

    private static void solution(int sizeOfMatrix, int[][] matrix) {
        // TODO: 이곳에 코드를 작성하세요.
        int totalCount = 0;
        List<Integer> sizeList = new ArrayList<>();

        for(int i = 0; i < sizeOfMatrix; i++){
            for(int j = 0; j < sizeOfMatrix; j++){
                if( matrix[i][j] == 1){
                    // DFS 실행
                    sizeList.add(dfs(sizeOfMatrix, matrix, i, j));
                    totalCount += 1;
                }
            }
        }

        Collections.sort(sizeList);
        System.out.println(totalCount);
        for(int i=0; i<sizeList.size(); i++){
            System.out.print(sizeList.get(i) + " ");
        }


    }

    private static int dfs(int sizeOfMatrix, int[][] matrix, int x, int y){
        int result = 0;

        if(x < 0 || x >= sizeOfMatrix || y < 0 || y >= sizeOfMatrix){
            return 0;
        }

        if(matrix[x][y] == 1){
            matrix[x][y] = 2;
            result++;

            result += dfs(sizeOfMatrix, matrix, x + 1, y);
            result += dfs(sizeOfMatrix, matrix, x - 1, y);
            result += dfs(sizeOfMatrix, matrix, x, y - 1);
            result += dfs(sizeOfMatrix, matrix, x, y + 1);
            return result;
        }else{
            return 0;
        }
    }

    private static class InputData {
        int sizeOfMatrix;
        int[][] matrix;
    }

    private static InputData processStdin() {
        InputData inputData = new InputData();

        try (Scanner scanner = new Scanner(System.in)) {
            inputData.sizeOfMatrix = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

            inputData.matrix = new int[inputData.sizeOfMatrix][inputData.sizeOfMatrix];
            for (int i = 0; i < inputData.sizeOfMatrix; i++) {
                String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
                for (int j = 0; j < inputData.sizeOfMatrix; j++) {
                    inputData.matrix[i][j] = Integer.parseInt(buf[j]);
                }
            }
        } catch (Exception e) {
            throw e;
        }

        return inputData;
    }

    public static void main(String[] args) throws Exception {
        InputData inputData = processStdin();

        solution(inputData.sizeOfMatrix, inputData.matrix);
    }
}
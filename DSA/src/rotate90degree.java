public class rotate90degree {
        static int[][] rotate(int[][] arr) {
            int n = arr.length;

            // Transpose
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }

            // Reverse each row
            for (int i = 0; i < n; i++) {
            // Two pointer approche
                int left = 0;
                int right = n - 1;

                while (left < right) {
                    int temp = arr[i][left];
                    arr[i][left] = arr[i][right];
                    arr[i][right] = temp;

                    left++;
                    right--;
                }
            }

            return arr;
        }

        public static void main(String[] args) {
            int[][] arr = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int[][] ans = rotate(arr);

            for (int[] row : ans) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }
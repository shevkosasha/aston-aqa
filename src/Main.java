public class Main {
    public static void main(String[] args) {
        String[][] array2D = {{"9", "6", "3","2"}, {"4", "7", "1","5", "5"}, {"8", "5", "2","65"}, {"1", "null", "51","25"}};
        try {
            try {
                int result = sumArray2D(array2D);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен!");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("В ячейке [" + e.i + "][" + e.j + "] лежат неверные данные");
        }
    }

    public static int sumArray2D(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("wrong size");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("wrong size");
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += sum + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
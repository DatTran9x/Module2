package Bai9.NextDayCalculator.Calculator;

public class NextDayCalculator {
    public static int[] calculator(int[] input) {
        int thang = input[1];
        int nam = input[2];
        int[] result = input;
        if(thang>12){
            throw new UnsupportedOperationException();
        }
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                return thang31Ngay(input, result);
            case 12:
                return thang12(input, result);
            case 2:
                if (namNhuan(nam)) {
                    return thang2Nhuan(input, result);
                } else {
                    return thang2Thuong(input, result);
                }
            default:
                return thang30Ngay(input, result);
        }
    }


    private static int[] thang31Ngay(int[] input, int[] result) {
        if (input[0] < 31) {
            result[0] = input[0] + 1;
        } else if (input[0] == 31) {
            result[0] = 1;
            result[1] = input[1] + 1;
        } else throw new UnsupportedOperationException();
        return result;
    }

    private static int[] thang30Ngay(int[] input, int[] result) {
        if (input[0] < 30) {
            result[0] = input[0] + 1;
        } else if (input[0] == 30) {
            result[0] = 1;
            result[1] = input[1] + 1;
        } else throw new UnsupportedOperationException();
        return result;
    }

    private static int[] thang2Thuong(int[] input, int[] result) {
        if (input[0] < 28) {
            result[0] = input[0] + 1;
        } else if (input[0] == 28) {
            result[0] = 1;
            result[1] = input[1] + 1;
        } else throw new UnsupportedOperationException();
        return result;
    }

    private static int[] thang2Nhuan(int[] input, int[] result) {
        if (input[0] < 29) {
            result[0] = input[0] + 1;
        } else if (input[0] == 29) {
            result[0] = 1;
            result[1] = input[1] + 1;
        } else throw new UnsupportedOperationException();
        return result;
    }

    private static boolean namNhuan(int nam) {
        if (nam % 4 == 0) {
            if (nam % 100 == 0) {
                return nam % 400 == 0;
            } else return true;
        } else return false;
    }

    private static int[] thang12(int[] input, int[] result) {
        if (input[0] < 31) {
            result[0] = input[0] + 1;
        } else if (input[0] == 31) {
            result[0] = 1;
            result[1] = 1;
            result[2] = input[2]+1;
        } else throw new UnsupportedOperationException();
        return result;
    }
}

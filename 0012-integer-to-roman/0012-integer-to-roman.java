class Solution {

    private int maxVal(int n) {

        if (n >= 1000)
            return 1000;
        if (n >= 900)
            return 900;
        if (n >= 500)
            return 500;
        if (n >= 400)
            return 400;
        if (n >= 100)
            return 100;
        if (n >= 90)
            return 90;
        if (n >= 50)
            return 50;
        if (n >= 40)
            return 40;
        if (n >= 10)
            return 10;
        if (n >= 9)
            return 9;
        if (n >= 5)
            return 5;
        if (n >= 4)
            return 4;

        return 1;
    }

    public String intToRoman(int num) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
        map.put(4, "IV");
        map.put(9, "IX");
        map.put(40, "XL");
        map.put(90, "XC");
        map.put(400, "CD");
        map.put(900, "CM");

        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            int sub = maxVal(num);
            sb.append(map.get(sub));
            num -= sub;
        }

        return sb.toString();
    }
}
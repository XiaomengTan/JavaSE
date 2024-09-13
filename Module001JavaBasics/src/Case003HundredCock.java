public class Case003HundredCock {
    public static void main(String[] args) {
        //第一层循环依次带入公鸡的数量
        for (int big = 0; big <= 20; big++) {
            //第二层循环依次带入母鸡的数量
            for (int middle = 0; middle <= 33; middle++) {
                //计算出小鸡的数量
                int small = 100 - big - middle;
                //判断总价值是否等于一百同时小鸡数量能否被三整除
                if (small % 3 == 0 && 5 * big + 3 * middle + small / 3 == 100) {
                    System.out.println(big + "," + middle + "," + small);
                }
            }
        }
    }
}

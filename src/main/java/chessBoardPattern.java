public class chessBoardPattern {
    public static String[] pattern() {

        String[] arr = new String[8];
        String st = "";
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        st += "WW";
                        st += "|";

                    } else {
                        st += "BB";
                        st += "|";
                    }
                }
                arr[i] = st;
                st = "";
            } else {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        st += "BB";
                        st += "|";
                    } else {
                        st += "WW";
                        st += "|";
                    }

                }
                arr[i] = st;
                st = "";
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        String[] str;
        str = pattern();
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}

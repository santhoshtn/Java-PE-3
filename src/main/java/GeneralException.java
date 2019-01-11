
    public class GeneralException {

        public int x=10;

        public static void generateNegativeArraySizeException()
        {
            int arrSize = -8;
            try {
                int[] myArray = new int[arrSize];
            } catch (NegativeArraySizeException ex) {
                System.out.println("Can't create array of negative size");
            }
        }

        public static  void generateIndexOutOfBoundsException()
        {
            int a[]=new int[2];
            try{
                a[2]=5;
            }
            catch(IndexOutOfBoundsException ex)
            {
                System.out.println("Index out of bound");
            }
        }

        private static GeneralException initT() {
            return null;
        }

        public static void main(String[] args) {
            GeneralException t = initT();

            try {
                int i = t.x;
            }
            catch(NullPointerException ex)
            {
                System.out.println("Nullpointer Exception");
            }
            generateIndexOutOfBoundsException();
            generateNegativeArraySizeException();
        }
}

public class SnapCheckEncodeDecodeTest {
    public static void main(String args[]) {
        String sentence = "Im a determined and hard worker and would love to carve out a longterm role at the company  ";
        SnapCheckEncodeDecodeTest tester = new SnapCheckEncodeDecodeTest();
        System.out.println(tester.encodeStringTest(sentence));

    }

    public String encodeStringTest(String sentence) {
        //step 1
        sentence = sentence.replace(" ", "").trim();
        // step 2 - find length
        int len = sentence.length();
        //step 3 - grab row * column measurements
        int floorRow = (int) Math.floor(Math.sqrt(len));
        int ceilCol = (int) Math.ceil(Math.sqrt(len));

        StringBuilder encodedString = new StringBuilder(); //use StringBuilder to build string - not synchronized & faster performance
        for(int character=0; character<ceilCol; character++) { //ceilCol is the column length, floorRow not necessary as long as column count utilized
            for(int charIterator = character; charIterator< len; charIterator+=ceilCol) {
                // System.out.print(sentence.charAt(charIterator));
                encodedString.append(sentence.charAt(charIterator));

            }
            encodedString.append(" ");

        }
        String newString = encodedString.toString();
        return newString.trim();
    }
}
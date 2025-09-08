package CodeChallenges;

public class IndexOfFirstOccurence {
    public int indexFirstOccurence(String hayStack, String needle) {
        int hlen = hayStack.length();
        int nlen = needle.length();
        for (int i = 0; i < hlen - nlen; i++) {
            if (hayStack.substring(i, i + nlen).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}

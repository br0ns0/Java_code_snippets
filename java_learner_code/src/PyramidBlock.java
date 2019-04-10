public class PyramidBlock {

    public int getPyramidBlocks(int levels) {
        int totalBlocks = 0;
        for (int i = 1; i <= levels; i++) {
            totalBlocks += (i * i);
            // or like this ==> totalBlocks = numBlocks + (i*i);
        }
        return totalBlocks;
    }
}

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] res = new int[image.length][];
        int index = 0;
        for(int[] img : image)
        {
            for(int i = 0; i < img.length/2; i++)
            {
                int tmp = img[i];
                img[i] = img[(img.length - 1) - i];
                img[(img.length - 1) - i] = tmp;
            }

            for(int i = 0; i < img.length; i++)
            {
                if(img[i] == 1)
                    img[i] = 0;
                else if(img[i] == 0)
                    img[i] = 1;
            }
            res[index++] = img;
        }
        return res;
    }
}

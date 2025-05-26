public class MoveZeroesToEnd{

    public static void moveZeroes(int[] arr)
    {
        if(arr.length==0 || arr.length==1)
        {
            return;
        }

        int nz=0,z=0;
        while(nz < arr.length)
        {
            if(arr[nz]!=0)
            {
                int temp=arr[nz];
                arr[nz]=arr[z];
                arr[z] = temp;

                nz++;
                z++;
            }
            else
            {
                nz++;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {0,1,13,0,2};
        moveZeroes(arr);
        for(int i =0; i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        
    }
}
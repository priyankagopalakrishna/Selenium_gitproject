package practice;

public class NonrepeatingElements {

	public static void main(String[] args) {

		int  flag = 0, count  = 0;
        int arr[] = new int[]{2,4,6,3,2,4,7,3};
        
        
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                if(i != j)
                {
                    if(arr[i] != arr[j])
                    {
                        flag = 1;
                    }
                    else
                    {
                        flag = 0;
                        break;
                    }
                }
            }
            if(flag == 1)
            {
            	//System.out.println(i);
                count++;
              System.out.print(arr[i]+" ");
            }
        }
        System.out.println("");
       // System.out.println("Number of non repeated elements are:"+count);
        
        
	}

}

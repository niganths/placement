class Main{
    public static void main(String [] args)
    {
        pattern3(3);
    }
    static void pattern3(int n)
    {
        for(int row=1;row<=n;row++)
        {
            int space=n-row;
            for(int s=1;s<=space;s++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=3*n;col++)
            {
                if(col==1||col==2*row-1||col==n+(2*row)||col==5){
                System.out.print("*");
            }
           
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
    static void pattern2(int n)
    {
        int og=n;
         n=2*n-2;
        for(int row=0;row<=n;row++)
        {
            for(int col=0;col<=n;col++) 
            {
                int index=og-Math.min((Math.min(row,col)),(Math.min(n-row,n-col)));
                System.out.print(index);
            }
            System.out.print("\n");
        }
    }
    
    static void pattern1(int n)
    {
        for(int row=1;row<=n;row++)
        {
            int space=n-row;
            for(int s=1;s<=space;s++)
            {
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--)
            {
                System.out.print(col+"");
            }
            for(int col=2;col<=row;col++)
            {
                System.out.print(col+"");
            }
            
            
            System.out.print("\n");
        }
         for(int row=2;row<=n;row++)
        {
            int space=row-1;
            for(int s=1;s<=space;s++)
            {
                System.out.print(" ");
            }
            for(int col=n-row+1;col>=2;col--)
            {
                System.out.print(col);
            }
            for(int col=1;col<=n-row+1;col++)
            {
                System.out.print(col);
            }
            
            
            System.out.print("\n");
        }
        
    }
}
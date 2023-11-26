class Main{
    public static void main(String [] args)
    {
        pattern13(5);
    } 
    
 static void pattern13(int n)
    {
        for(int row=1;row<=n;row++)
        {
            int space=row-1;
            for(int s=1;s<=space;s++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=2*n-2*row+1;col++)
            {
                if(col==1||row==1||col== 2 * (n - row) + 1){
                System.out.print("*");}
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
 static void pattern12(int n)
    {
        for(int row=1;row<=n;row++)
        {
            int space=n-row;
            for(int s=1;s<=space;s++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=2*row-1;col++)
            {
                if(col==1||col==2*row-1||row==n){
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
     
  
     static void pattern11(int n)
    {
        for(int row=1;row<=n;row++)
        {
            int totalspace=row-1;
            for(int s=1;s<=totalspace;s++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=n-row+1;col++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
           
        }
    }
    
     
    static void pattern10(int n)
    {
        for(int row=1;row<=n;row++)
        {
            int totalspace=n-row;
            for(int s=1;s<=totalspace;s++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
           
        }
    }
     static void pattern9(int n)
    {
        for(int row=1;row<=n;row++)
        {
            int totalspace=row-1;
            for(int s=1;s<=totalspace;s++)
            {
                System.out.print(" ");
            }
             
            
            for(int col=1;col<=2*n-2*row+1;col++)
              
            {
               
                System.out.print("*");
            }
            System.out.print("\n");
           
        }
    }
    
    
     static void pattern8(int n)
    {
        for(int row=0;row<n;row++)
        {
            int totalspace=n-row;
            for(int s=1;s<=totalspace;s++)
            {
                System.out.print(" ");
            }
             
            
            for(int col=0;col<2*row+1;col++)
              
            {
               
                System.out.print("*");
            }
            System.out.print("\n");
           
        }
    }
    
    static void pattern7(int n)
    {
        for(int row=1;row<=n;row++)
        {
            int totalspace=row-1;
            for(int s=1;s<=totalspace;s++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=n-row+1;col++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
           
        }
    }
    static void pattern6(int n)
    {
        for(int row=1;row<=n;row++)
        {
            int totalspace=n-row;
            for(int s=1;s<=totalspace;s++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
           
        }
    }
    
    static void pattern5(int n)
    {
        for(int row=1;row<=2*n;row++)
        {
            int totalcols=row>n?2*n-row:row;
            for(int col=1;col<=totalcols;col++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    
     static void pattern4(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print(col+" ");
            }
            System.out.print("\n");
        }
    }
    
    
    
    static void pattern3(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n-row+1;col++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    
     static void pattern2(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    
    
    
    static void pattern1(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n;col++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

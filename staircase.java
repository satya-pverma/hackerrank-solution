 static void staircase(int n) {
int sp;
        
        for(int i=0;i<n;i++)
        {
            for( sp=0;sp<n-i-1;sp++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("#");
            }
             System.out.println();
             
        }

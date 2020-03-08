static void miniMaxSum(int[] arr) {
        int mins=0;
        int maxs=0;
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
          if(arr[i]>max)
          {
              max=arr[i];
          }
          if(arr[i]<=min)
          {
              min=arr[i];
          }
        }
        for(int i=0;i<arr.length;i++)
        {
          maxs=maxs+arr[i];
          mins=mins+arr[i];
        }
        System.out.println((mins-max)+" "+(maxs-min));

    }

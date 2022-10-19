

int minimumOperations(int* arr, int numsSize){
    int count = 0,min = 101,flag = 0;
    for (int i = 0;i < numsSize; i++)
    {
        if (arr[i]!= 0)
        {
            flag = 1;
        }
    }
    while(flag)
    {
        flag = 0,min = 101;
        for (int i = 0; i < numsSize; i++)
        {
            if (arr[i] < min && arr[i] != 0)
            {
                min = arr[i];
            }
        }
        for (int i = 0; i < numsSize; i++)
        {
            if (arr[i] != 0)
            {
                arr[i]-=min;
            }
        }
        for (int i = 0; i < numsSize; i++)
        {
            if (arr[i] != 0)
            {
                flag = 1;
            }
        }
        count++;
    }
    return count;
}

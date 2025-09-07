class Solution(object):
    def findSpecialInteger(self, arr):
        """
        :type arr: List[int]
        :rtype: int
        """
        count=1
        
        for i in range(1,len(arr)):
            if arr[i] == arr[i-1]:
                count=count+1
            else:
                count=1
            if(count>len(arr)/4):
                return arr[i]   
        return arr[0]

        
from typing import List

class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        def back(nums, l, p):
            if len(p) == len(nums):
                l.append(p[:])  # append a copy of current path
                return
            for i in range(len(nums)):
                if nums[i] in p:
                    continue
                p.append(nums[i])
                back(nums, l, p)
                p.pop()
        
        l = []  # not [[]]
        p = []
        back(nums, l, p)
        return l

from typing import List


class Solution:

    def sortedSquares(self, nums: List[int]) -> List[int]:
        start, end = 0, len(nums) - 1
        res = []

        while end >= start:
            if nums[start]**2 > nums[end]**2:
                res.append(nums[start]**2)
                start += 1
            else:
                res.append(nums[end]**2)
                end -= 1

        return res[::-1]


if __name__ == "__main__":
    nums = [-4, -4, -3]
    sol = Solution()
    print(sol.sortedSquares(nums))

from typing import List


class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        start = 0
        end = len(nums) - 1

        while end >= start:
            mid = int((end - start) / 2) + start
            if nums[mid] == target:
                return mid

            if nums[mid] > target:
                end = mid - 1
            else:
                start = mid + 1

        return end + 1


if __name__ == "__main__":
    sol = Solution()
    pos = sol.searchInsert([1, 3, 5, 6], 5)
    print(pos)

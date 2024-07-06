from typing import List


class Solution:
    def search(self, nums: List[int], target: int) -> int:
        start = 0
        end = len(nums) - 1
        while end > start:
            mid = int(((end - start) / 2) + start)
            if nums[mid] == target:
                return mid
            if target < mid:
                end = mid - 1
            else:
                start = mid + 1

        return -1


if __name__ == "__main__":
    sol = Solution()

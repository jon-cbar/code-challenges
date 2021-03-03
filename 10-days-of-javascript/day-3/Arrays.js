function getSecondLargest(nums) {
    let largest = nums[0];
    let secondLargest = largest;
    nums.forEach(current => {
        if (current > largest) {
            secondLargest = largest
            largest = current
        } else if (current != largest && current > secondLargest) {
            secondLargest = current
        }
    });
    return secondLargest;
}
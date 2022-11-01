/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(arr, val) {
    let count = 0;
    let n = arr.length;
    for(let i = 0; i < n; i++){
        if(arr[i] != val){
            arr[count] = arr[i];
            count ++;
        }
    }
    return count;
};

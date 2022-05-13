package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <p>
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 5/10/22 15:27
 */
@SuppressWarnings("All")
public class _1_two_sum {
    
    public static void main(String[] args) {
        System.out.println(Arrays.stream(twoSum1(new int[]{2, 7, 11, 15}, 26)).mapToObj(String::valueOf).sorted().collect(Collectors.joining(",")));
        System.out.println(Arrays.stream(twoSum1(new int[]{2, 7, 11, 15}, 9)).mapToObj(String::valueOf).sorted().collect(Collectors.joining(",")));
        System.out.println(Arrays.stream(twoSum1(new int[]{3, 3, 3}, 6)).mapToObj(String::valueOf).sorted().collect(Collectors.joining(",")));
    }
    
    private static int[] twoSum4(int[] nums, int target) {
        int[] index = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                index[0] = i;
                index[1] = nums[i];
                break;
            } else {
                map.put(nums[i], i);
            }
            if (map.containsKey(target - nums[nums.length - 1 - i])) {
                index[0] = i;
                index[1] = nums.length - 1 - i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        return index;
    }
    
    private static int[] twoSum3(int[] nums, int target) {
        int[] index = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                index[0] = i;
                index[1] = nums[i];
                break;
            } else {
                map.put(nums[i], i);
            }
            if (map.containsKey(target - nums[nums.length - 1 - i])) {
                index[0] = i;
                index[1] = nums.length - 1 - i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        return index;
    }
    
    
    private static int[] twoSum2(int[] nums, int target) {
        int[] index = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                index[0] = i;
                index[1] = map.get(target - nums[i]);
                break;
            }
        }
        return index;
    }
    
    private static int[] twoSum1(int[] nums, int target) {
        int[] index = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    index[0] = i;
                    index[1] = j;
                    break;
                }
            }
        }
        return index;
    }
}

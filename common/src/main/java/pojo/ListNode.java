package pojo;

import lombok.*;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 6/9/22 17:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListNode {
    int val;
    ListNode next;
    
    public static ListNode getOne() {
        int i = 1;
        return new ListNode(i++, new ListNode(i++, new ListNode(i, null)));
    }
}
package club.bugmakers.bruce.lombok;

import lombok.Data;

/**
 * @description: @Data注解作用比较全，其包含注解的集合@ToString，@EqualsAndHashCode，所有字段的@Getter和所有非final字段的@Setter, @RequiredArgsConstructor
 * @author: ouyangqiangqiang
 * @date: 2018/8/31 10:13
 */
@Data
public class Demo08Data {

    private Integer id;
}

# sort
java实现的排序算法

O标记时间复杂度
- 忽略常数项 (例: 2n, 忽略2)
- 忽略低次项 (例: n²+n, 忽略n)

| 中文名称 | 英文名称  | 平均时间复杂度 | 最坏时间复杂度 | 最好时间复杂度 | 空间复杂度 | 稳定性 |
| -------- | --------- | -------------- | -------------- | -------------- | ---------- | ------ |
| 选择排序 | selection | n²             | n²             | n²             | 1          | 0      |
| 冒泡排序 | bubble    | n²             | n²             | n              | 1          | 1      |
| 插入排序 | insertion | n²             | n²             | n              | 1          | 1      |
| 堆排序   | heap      | n log2 n       | n log2 n       | n log2 n       | 1          | 0      |
| 希尔排序 | shell     | n的1.3次方     | n²             | n              | 1          | 0      |
| 归并排序 | merge     | n log2 n       | n log2 n       | n log2 n       | n          | 1      |
| 快速排序 | quick     | n log2 n       | n²             | n log2 n       | n log2 n   | 0      |
| 桶排序   | bucket    | n + k          | n²             | n              | n + k      | 1      |
| 计数排序 | counting  | n + k          | n + k          | n + k          | n + k      | 1      |
| 基数排序 | radix     | n * k          | n * k          | n + k          | n + k      | 1      |


/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new ArrayList<>();
        for (Interval i : intervals) {
            if (newInterval == null || i.end < newInterval.start) {
                result.add(i);
            } else if (i.start > newInterval.end) {
                // 在i 和 i前一个间隔 之间
                result.add(newInterval);
                result.add(i);
                newInterval = null;
            } else {
                // 不断寻找间隔的起点和终点 中途不加元素
                newInterval.start = Math.min(newInterval.start, i.start);
                newInterval.end = Math.max(newInterval.end, i.end);
            }
        }
        if (newInterval != null) {
            result.add(newInterval);
        }
        return result;
    }
}
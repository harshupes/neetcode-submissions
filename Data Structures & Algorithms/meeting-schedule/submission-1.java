class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

        if (intervals == null || intervals.size() == 0) {
            return true;
        }

        Collections.sort(intervals, (a, b) -> a.start - b.start);

        int end1 = intervals.get(0).end;

        for (int i = 1; i < intervals.size(); i++) {

            int start2 = intervals.get(i).start;

            if (start2 < end1) {
                return false;
            }

            end1 = intervals.get(i).end;
        }

        return true;
    }
}
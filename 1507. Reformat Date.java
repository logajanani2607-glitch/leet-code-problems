class Solution {
    public String reformatDate(String date) {
        int n = date.length();
        String year = date.substring(n - 4);
        String monthStr = date.substring(n - 8, n - 5);
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int m = 1;
        for (; m <= 12; m++) {
            if (months[m - 1].equals(monthStr)) break;
        }
        String month = (m < 10 ? "0" : "") + m;
        int dayNum = date.charAt(1) >= '0' && date.charAt(1) <= '9' 
            ? (date.charAt(0) - '0') * 10 + (date.charAt(1) - '0') 
            : (date.charAt(0) - '0');
        String day = (dayNum < 10 ? "0" : "") + dayNum;
        return year + "-" + month + "-" + day;
    }
}

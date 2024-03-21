package JavaQA.Leetcode.Top150InterviewQuestion.TwoPointers;

public class IsSubsequnce {

    public static boolean isSubsequence(String s,  String t){
        if(s.isEmpty()){
            return true;
        }
        int startS =0;  // Pointer for s string
        int endT =0; // pointer for t string
        while(endT<t.length()){
            // endT se isliye start kiya kyuki endT se t.length tak ke under character ko khojana
            // tha isliye humne endT se start kiya
            if(s.charAt(startS) == t.charAt(endT)){
                startS++;
                if(startS == s.length()){
                    return true;
                }
            }
            endT++;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));

    }
}
package com.stefanfrunzaqa.gitworkflow;

public class GitWorkFlow {
    public static void main(String[] args) {
        String step1 = "Perform git stash to store uncommitted changes";
        String step2 = "Perform git switch to move to the local master branch";
        String step3 = "Perform git fetch to fetch the origin branches";
        String step4 = "Perform git pull to get the latest changes from the origin/master branch";
        String step5 = "Add your changes that are related to the task";
        String step6 = "Review your changes and check your code before committing them";
        String step7 = "Execute git commit";
        String step8 = "Execute git push";
        String step9 = "Navigate to the GitHub branch";
        String step10 = "Create a Pull Request from origin/new_branch_name into origin/master";
        String step11 = "Add the Pull Request details and request review from your colleagues";
        String step12 = "If at least 2 colleagues approve it, then merge the branch";
        String step13 = "After that, you can delete the origin/new_branch_name";
        String step14 = "Switch back to the master local branch";
        String step15 = "Perform git fetch and git pull on the local master branch";

        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
        System.out.println(step12);
        System.out.println(step13);
        System.out.println(step14);
        System.out.println(step15);
    }
}
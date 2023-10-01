package md.tekwillacademy.gitworkflow;

public class GitWorkFlow {
    public static void main(String[] args) {
        String step1 = "Execute git stash in the console" ;
        String step2 = "Perform git checkout master - to move to the local master branch";
        String step3 = "Execute git fetch command - to see if there are any changes on remote/origin";
        String step4 = "Execute git pull - this will download the latest changes from origin/master to local master";
        String step5 = "Execute git branch New_Branch_Name command to create a new branch that is same as local master";
        String step6 = "Perform git checkout New_Branch_Name - as result we are redirected to the newly created branch";
        String step7 = "Add the task related changes in the solution";
        String step8 = "Execute git commit command from the Intellij Idea to store the changes at the local level - on the current branch";
        String step9 = "Execute git push from the Intellij Idea panel - as result  new remote branch is created with origin/New_Branch_Name";
        String step10 = "Crete a pul request from Origin/New_Branch_Name into master";
        String step11 = "Add the Pull Request details like name, description and reviewers";
        String step12 = "is we collect at least one approval then we can merge and continue with another task";
        String step13 = "Do not forget that locally you are still on the New_Name_Branch";

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

    }
}

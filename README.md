### CSE 234 - Mobile Programming
#### *Akdeniz University, Computer Engineering Department, 2021-2022 Spring*
#
## Lab02 Assignment

Deadline:   March 6, 2022, 23:59

### Description
You are expected to make another Dice Roller application. Based on the exercise we make in Lab02 lecture, you should add another dice to the app, so that one Roll button gives 2 dice results. 

Applications sample layout should be as in the figure below. 

![Sample Layout](https://cdn.discordapp.com/attachments/805488533880045598/948487945076228127/cse234-lab02-layout.png)

*Sample Layout*

You should do followings;
- Use a button
- Use two ImageView's
- Use provided dice images: [Link](https://github.com/google-developer-training/android-basics-kotlin-dice-roller-with-images-app-solution/raw/master/dice_images.zip)
- Update 'MainActivity.kt' code that rolles 2 different dices on the event of the click event of the button. 


PS: You will upload your project to a Gitlab. The instructions are given below.

GitLab Guideline
1. `CREATE Gitlab Account`: Create a [GitLab](https://about.gitlab.com/) account if you don't have one.
2. `FORK PROJECT: Fork the project as public [Project Link](https://gitlab.com/22b_cse-234_mobile-programming_-_1/cse234-lab02-assignment). 
3. `ANDROID STUDIO - ENABLE VCS`: On Android Studio, Click VCS->Enable Version Control Integration. Select "Git" and click "OK". Now you can see your forked repository in your profile. 
4. On Android Studio, change Project view from "Android" to "Project"
5. `ANDROID STUDIO - ADD REMOTE`: On Android Studio, Click Git->Manage Remotes. Then click "+" button then paste your forked repository URL. You can find the HTTP URL of your repository by clicking Clone button.
6. `ANDROID STUDIO - ADD FETCH`: On Android Studio, click Git->Fetch.
7. tip: `ANDROID STUDIO - CREATE MAIN BRANCH`: Then on the bottom right sight of the Android Studio, click "master" branch, then click "New Branch". Then create a branch with a name of "main".
8. `ANDROID STUDIO - PULL REPO TO CURRENT BRANCH`: On Android Studio, click Git->Pull. Then select git pull - origin - main. And click Pull.
9. Complete your Project. 
10. `ANDROID STUDIO - COMMIT AND PUSH`: On Android Studio, click Git->Commit. New box will open on the left side of IDE. Check the checkbox "Unversioned Files" (Check every file). Below, write a commit massage that describes your changes such as "Second dice is implemented" or "First commit". Then click "Commit and Push" button.
11. If you make any changes on your project later you can commit and push the project again. 
12. `GITLAB - CREATE MERGE REQUEST` - If you want to turn in your project open the project on Gitlab. Click "Merge Request" on the left panel. Click "New Merge Request". Then select your main branch as source branch. Then click "Compare branches and continue". 
13. In new merge request screen, request title should be `StudentNo_NameLastname`. Ex: **202051075001_Erdinc_Turk**, Description should be "Lab02 Assignment", and keep the other options as it is.
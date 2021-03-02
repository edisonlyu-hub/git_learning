this is my first git repository.

test modify...

Creating a new branch is quick.

how to compare staging area with HEAD.

$ git clone --bare  /d/my_git/git_learning/.git ya.git
$ git clone --bare  file:///d/my_git/git_learning/.git intelligence.git
// 与远端建立关联
$ git remote add intelligence file:///d/my_git/git_learning_backup/intelligence.git
// push
$ git push --set-upstream intelligence master
Everything up-to-date
Branch 'master' set up to track remote branch 'master' from 'intelligence'.

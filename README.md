# psidev-cvs-legacy
psidev legacy works from sourceforge cvs

Export procedure
```
rsync -av rsync://psidev.cvs.sourceforge.net/cvsroot/psidev/* psidev-cvs-legacy-rsync
svn export --username=guest http://cvs2svn.tigris.org/svn/cvs2svn/trunk cvs2svn-trunk
cp cvs2svn-trunk/cvs2git-example.options cvs2git.options
vim cvs2git.options
```
add rsync folder after where the options file reads: *# edit the string after run_options.set_project, to mention *
```
cvs2svn-trunk/cvs2git --options=cvs2git.options --fallback-encoding utf-8
git clone git@github.com:mwalzer/psidev-cvs-legacy.git
cat cvs2git-tmp/git-{blob,dump}.dat | git fast-import --force
git push
```
# Heroku Basics

Steps for working with heroku :

# 1) Create heroku account.
https://www.heroku.com/

# 2) Install windows installer 
- https://devcenter.heroku.com/articles/deploying-spring-boot-apps-to-heroku
- https://www.geeksforgeeks.org/introduction-and-installation-of-heroku-cli-on-windows-machine/

# 3) Set system path for heruko
path => C:\Program Files\Heroku\bin

# 4) Check heroku version
- heroku -v

# 5) Run the command for heroku login
- heroku login

# 6) Add an already generated public ssh key using
- heroku key:add

# 7) If SSH-Key is not present , generate it using 
- ssh-keygen -t -rsa

# 8) List all heroku commands
- heroku --help

# Docker-demo
How to make docker image and run, access endpoint via docker server


To make the docker image, run this command:

"docker build -t dockerkubedemo.jar ."

Then,

check 
"docker images"

 "docker run -p 9090:8080 dockerkubedemo.jar"
 
 Here 9090 is selected by me as the port where we can access the url via docker container, 8080 is the local port.

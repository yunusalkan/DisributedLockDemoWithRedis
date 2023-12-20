# Getting Started

### How to run project ?

* Run “docker-compose up -d” command to install and run redis on docker container


* Run the <code>SpringRedisDistributedLockApplication</code>


* Execute below script on terminal to execute multiple request to endpoint,

      * ab -n 10 -c 5 http://localhost:0/perform/lock-key

* From the "Run/Debug Configuration" on IntelliJ add "Allow multiple instances" and run application as multiple instance.
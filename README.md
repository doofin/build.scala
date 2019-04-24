# build.scala
hate strange sbt syntax? just write scala for build!

# how

SBT 1.X removes `Build` trait ,so you have to : 

write your projects under project/xx.scala

then reference xx.scala from build.sbt 

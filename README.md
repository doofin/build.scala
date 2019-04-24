# build.scala
hate strange sbt syntax? just write scala for build!

# how

SBT 1.X removes `Build` trait ,so this https://alvinalexander.com/scala/sbt-how-to-use-build.scala-instead-of-build.sbt won't work, you have to : 

write your projects under project/xx.scala

then reference xx.scala from build.sbt 

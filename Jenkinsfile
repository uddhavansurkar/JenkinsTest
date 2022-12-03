pipeline{

agent any

tools {
    maven 'maven-3.6.3'
  }

stages{

stage("compile"){
    steps{
      sh 'mvn clean compile'
    }
  }
  
  stage("build"){
    steps{
      echo 'building the application'
    }
  }
  
  stage("test"){
    steps{
      echo 'testing the application'
    }
  }
  
  stage("deploy"){
    steps{
      echo 'deploying the application'
    }
  }

}

}

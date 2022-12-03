pipeline{

agent any

tools {
    maven 'maven 3.8.6'
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

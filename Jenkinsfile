pipeline {
    agent none

environment {
    app_name = 'weatherreport'
    team_name = 'weather'
  }

  stages {
    stage('Build'){
    
      steps {
      node('gradle-build-agent') {
       checkout scm
       sh '''echo "Building ${app_name} build number is $BUILD_NUMBER"

      cd ${WORKSPACE}
      gradle :web:build
      
      cp -v ${WORKSPACE}/web/build/libs/*.jar ${WORKSPACE}/build/app.jar

      echo export DATE=`date +%Y-%m-%d` >${WORKSPACE}/build/info.txt
      echo export GIT=`git describe --contains --all HEAD |tr "/" _` >>${WORKSPACE}/build/info.txt
      echo export app_version=1.0 >>${WORKSPACE}/build/info.txt


      '''

      dir('build/'){
      stash includes: '**', name: 'builddir'
      stash includes: 'info.txt', name: 'info'
      }
      }
}
    }

  }
}
}

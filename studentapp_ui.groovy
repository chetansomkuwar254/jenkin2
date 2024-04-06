pipeline {
    agent any

    stages {
        stage('Pull') {
            steps {
                git branch: 'main', changelog: false, credentialsId: 'ssh-key', poll: false, url: 'https://github.com/chetansomkuwar254/jenkins-b2'
                echo 'Here we are pullin our project repository'
            }
        }
        stage('Build') {
            steps {
                echo 'Here we doing build operation'
            }
        }
        stage('Test') {
            steps {
                echo 'Here we are testing '
            }
        }
        stage('Quality Test') {
            steps {
                echo 'Here we are testing the quality'
            }
        stage('Deploy') {
            steps {
                echo 'Deploy Done'
            }
        
    }
}
    }

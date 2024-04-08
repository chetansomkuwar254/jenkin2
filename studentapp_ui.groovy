pipeline {
    agent any

    stages {
        stage('Pull') {
            steps {

            }
        }
        stage('Build') {
            steps {

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
        }
        stage('Deploy') {
            steps {
                echo 'Deploy Done'
            }
        
        }
    }
}


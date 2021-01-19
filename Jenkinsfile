
pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Send email') {
            steps {
                emailext    body:"",
                            subject:"",
                            to: "djilalisaiah.sid@gmail.com"

            }

        }
    }
}
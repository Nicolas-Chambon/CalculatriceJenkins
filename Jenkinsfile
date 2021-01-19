
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
                emailext    to: "djilalisaiah.sid@gmail.com",
                            replyTo: "n.chambon84@gmail.com"
            }

        }
    }
}
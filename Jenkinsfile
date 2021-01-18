pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
            sh 'mvn test'
//             sh 'mvn -B -DskipTests clean package'
//                 echo 'Hello world'
            }
        }
    }
}
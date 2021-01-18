pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'hello world'
                emailext to: 'n.chambon84@gmail.com'
            }
        }
    }
}

// pipeline {
//     agent {
//         docker {
//             image 'maven:3-alpine'
//         }
//     }
//     stages {
//         stage('Build') {
//             steps {
//                 sh 'mvn -B -DskipTests clean package'
//             }
//         }
//         stage('Test') {
//             steps {
//                 sh 'mvn test'
//             }
//         }
//     }
// }
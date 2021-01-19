// pipeline {
//     agent any
//     stages {
//         stage('Build') {
//             steps {
//                 sh 'pwd'
//             }
//         }
//         stage('Send email') {
//             steps {
//                 emailext body: '''${SCRIPT, template="groovy-html.template"}''',
//                             mimeType: 'text/html',
//                             subject: "Jenkins",
//                             to: "n.chambon84@gmail.com",
//                             replyTo: "n.chambon84@gmail.com",
//                             recipientProviders: [[$class: 'CulpritsRecipientProvider']]
//             }
//
//         }
//     }
// }

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
                emailext to: "n.chambon84@gmail.com",

            }

        }
    }
}
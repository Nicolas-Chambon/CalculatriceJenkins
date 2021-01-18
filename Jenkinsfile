pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'hello world'
            }
        }
        stage('Send email') {
            steps {
                emailext body: '''${SCRIPT, template="groovy-html.template"}''',
                            mimeType: 'text/html',
                            subject: "Jenkins",
                            to: "n.chambon84@gmail.com",
                            replyTo: "n.chambon84@gmail.com",
                            recipientProviders: [[$class: 'CulpritsRecipientProvider']]
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
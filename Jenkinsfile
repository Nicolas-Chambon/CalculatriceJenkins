pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'hello world'
            }
        }
        stage('Send email') {
            def mailRecipients = "n.chambon84@gmail.com"
            def jobName = currentBuild.fullDisplayName

            emailext body: '''${SCRIPT, template="groovy-html.template"}''',
                mimeType: 'text/html',
                subject: "[Jenkins] ${jobName}",
                to: "${mailRecipients}",
                replyTo: "${mailRecipients}",
                recipientProviders: [[$class: 'CulpritsRecipientProvider']]
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
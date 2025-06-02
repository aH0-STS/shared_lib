def call(String imageName, String credId) {
    withCredentials([usernamePassword(credentialsId: credId, passwordVariable: 'Password', usernameVariable: 'Docker')]) {
        sh """
        echo "\$Password" | docker login -u "\$Docker" --password-stdin
        docker push ${imageName}:latest
        """
    }
}

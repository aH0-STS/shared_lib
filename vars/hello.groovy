def call(String imageName, String tag) {
    docker.withRegistry('https://index.docker.io/v2/', 'docker-hub-cred') {
        def image = docker.build("${imageName}:${tag}")
        image.push()
    }
}

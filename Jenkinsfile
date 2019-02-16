node {
stage('pulling code from git'){
checkout scm
}
stage('Maven Build'){
sh 'mvn install'
}
stage('Build Image'){
sh 'sudo docker build -t spring-app:${BUILD_NUMBER} .'
}
stage('Push Image'){
sh 'docker login -u vishalgadiraju -p 741995G_v'
sh 'docker push vishalgadiraju/spring-app:${BUILD_NUMBER} '
}
}
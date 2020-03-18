def call(Map stageParams) {


checkout([
$class: 'GitSCM', 
branches: [[name: 'stageParams.branch']], 
userRemoteConfigs: [[credentialsId: 'jkey1', url: 'stageParams.url']]])

}

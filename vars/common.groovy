def call(String stageName){
	if("${stageName}" == "Build"){
		sh "mvn clean package"
	}
	else if("${stageName}" == "SonarQube Report"){
		sh "echo run code quality"
		sh "mvn clean sonar:sonar"
	}
	else if("${stageName}" == "Upload Into Nexus"){
		sh "mvn clean deploy"
	}
}

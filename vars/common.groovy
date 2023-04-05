def call(String stageName){
	if("${stageName}" == "Build"){
		sh "mv clean package"
	}
	else if("${stageName}" == "SonarQube Report"){
		sh "echo run code quality"
		sh "mv clean sonar:sonar"
	}
	else if("${stageName}" == "Upload Into Nexus"){
		sh "mv clean deploy"
	}
}

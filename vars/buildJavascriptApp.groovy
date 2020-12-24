def call(Map config=[:], Closure body) {
	node {
		git url: "https://github.com/werne2j/sample-nodejs"

		stage("Install App") {
			sh "npm install"
		}

		stage("Test") {
			sh "npm test"
		}

		stage ("Deploy App") {
			if (config.deploy) {
				sh "npm publish"
			}
		}

		body()
	}
}
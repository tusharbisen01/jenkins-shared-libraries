def call(String repoUrl, String branch) {
    echo "Checking out branch: ${branch}"
    echo "Repository: ${repoUrl}"

    checkout([
        $class: 'GitSCM',
        branches: [[name: "*/${branch}"]],
        userRemoteConfigs: [[
            url: repoUrl
        ]]
    ])
}

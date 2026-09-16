def call(String repoUrl, String branch) {
    echo "Checking out branch: ${main}"
    echo "Repository: ${https://github.com/tusharbisen01/Wanderlust-Mega-Project.git}"

    checkout([
        $class: 'GitSCM',
        branches: [[name: "*/${main}"]],
        userRemoteConfigs: [[
            url: https://github.com/tusharbisen01/Wanderlust-Mega-Project.git
        ]]
    ])
}

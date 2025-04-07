pipeline 
{
    agent any
    stages 
    {
        stage('Build') 
        {
            steps 
            {
                echo 'Build Application'
            }
        }
        stage('Test') 
        {
            steps 
            {
                echo 'Test Application'
            }
        }
        stage('Deploy') 
        {
            steps 
            {
                echo 'Deploy Application'
            }
        }
    }
    post
    {
        always
        {
            emailext body: 'Summary of Jenkins', subject: 'Pipeline Status', to: 'rushi.test.37@gmail.com'
        }
    }
}

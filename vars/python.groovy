def gitdownload(repo)
{
  git branch: 'main', url: "https://github.com/Bhavya0729/${repo}.git"
}
def build()
{
  sh "mvn clean package"
}
def deployment(jobname,ip)
{
 sh """
scp /var/lib/jenkins/workspace/${jobname}/Helloworld.java ubuntu@${ip}:/home/ubuntu/ten
"""
}
def testing(jobname)
{
sh """
    javac /var/lib/jenkins/workspace/${jobname}/Helloworld.java
    java -cp /var/lib/jenkins/workspace/${jobname} Helloworld > /var/lib/jenkins/workspace/${jobname}/test_output.txt
"""
}
def release(jobname,ip)
{
 sh """
scp /var/lib/jenkins/workspace/${jobname}/Helloworld.java ubuntu@${ip}:/home/ubuntu/ten
"""
}

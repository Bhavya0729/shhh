def gitdownload(repo)
{
  git branch: 'main', url: "https://github.com/Bhavya0729/${repo}.git"
}
def build()
{
  sh "python3 python.py"
}
def deployment(jobname,ip)
{
 sh """
scp /var/lib/jenkins/workspace/${jobname}/python.py ubuntu@${ip}:/home/ubuntu/ten
"""
}
def testing(jobname)
{
sh """
sh 'python3 "/var/lib/jenkins/workspace/${jobname}/python.py"'
"""
}

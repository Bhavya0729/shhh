def gitdownload(repo)
{
  git branch: 'main', url: "https://github.com/Bhavya0729/${repo}.git"
}
def build()
{
  sh "python3 python.py"
}

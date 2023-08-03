def gitDown(repo)
{
	git "https://github.com/intelliqittrainings/${repo}.git"
}

def mavenbuild()
{
	sh 'mvn package'
}

def tomdeploy(jobname,ip,context)
{
	sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}

def runselinium(jobname)
{
	sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}

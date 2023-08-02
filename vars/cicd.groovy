def gitDown(repo)
{
	git "https://github.com/intelliqittrainings/${repo}.git"
}

def mavenbuild()
{
	sh 'mvn package'
}

def tomdeploy(Jobn,ip,context)
{
	sh "scp /var/lib/jenkins/workspace/${Jobn}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}




#!/bin/sh

export CATALINA_HOME="$(dirname "$0")/server/apache-tomcat-9.0.43"

/bin/sh "$(dirname "$0")/server/apache-tomcat-9.0.43/bin/shutdown.sh"

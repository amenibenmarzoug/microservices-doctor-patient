FROM quay.io/wildfly/wildfly-centos7
ARG WAR_FILE=target/*.war
COPY ${WAR_FILE} /opt/jboss/wildfly/standalone/deployments/
EXPOSE 8085
# Set the default command to run on boot
# This will boot WildFly in the standalone mode and bind to all interface
#CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-c", "standalone-full.xml", "-b", "0.0.0.0"]
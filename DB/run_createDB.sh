#!/bin/bash

##################
# 0. Prerequisite
##################

# please type your system DB information for DB handling
sysdba="system";
sysdba_pw="1234";

if [ -z "$sysdba" ] 
then
    echo "please sysdba information into \$sysdba and \$sysdba_pw"
    exit -1 >> /dev/null;
fi

dba="farmilies";
dba_pw="farmilies";

##################
# 1. Create User Account
##################
echo ">> job start"
sqlplus -S $sysdba/$sysdba_pw<< EOF
CREATE USER $dba IDENTIFIED BY $dba_pw;
GRANT CONNECT, RESOURCE, DBA TO $dba;
exit
EOF

##################
# 2. Run DDL 
##################
cp -f ./farmilies.ddl ./farmilies.sql 
sqlplus -s $dba/$dba_pw @farmilies.sql << EOF
exit
EOF
echo ">> job finish"

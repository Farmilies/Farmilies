var oracledb = require('oracledb');
oracledb.getConnection(
    {
        user          : "farmilies",
        password      : "farmilies",
        connectString : "localhost/XE"
    },
    function(err, connection)
    {
        if (err) { console.error(err); return; }
        connection.execute(
            "SELECT department_id, department_name "
            + "FROM departments "
            + "WHERE department_id < 70 "
            + "ORDER BY department_id",
            function(err, result)
            {
                if (err) { console.error(err); return; }
                console.log(result.rows);
            });
    });
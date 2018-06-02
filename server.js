// default server
var express = require('express'), routes = require('./routes'), user = require('./routes/user'), http = require('http'), path = require('path'), router = require(__dirname
		+ '/router/controller');

var app = express();
var fs = require('fs');

// all environments
app.set('port', process.env.PORT || 8082);
app.set('views', __dirname + '/views');

app.set('view engine', 'ejs');
// // view engine default change
// app.engine('html', require('ejs').renderFile);
// app.set('view engine', 'html');

// app.use(express.favicon());
app.use(express.logger('dev'));
app.use(express.bodyParser());
app.use(express.methodOverride());
app.use(app.router);
app.use(express.static(path.join(__dirname, 'public')));

// development only
if ('development' == app.get('env')) {
	app.use(express.errorHandler());
}

app.get('/', routes.index);
// app.get('/users', user.list);

//
// fs.readFile('qr.html', function(error,data)
// {
//
// if(error)
// {
// console.log(error);
// }
// else{
// res.wirteHead(200, {'Content-Type': 'text/html'});
// res.end(data);
// }
// });

http.createServer(app).listen(app.get('port'), function() {
	console.log('Launch Server port :' + app.get('port'));
});

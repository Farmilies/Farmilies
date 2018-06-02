module.exports = function(app)
{
     app.get('/',function(req,res){
        res.render('main')
     });
     app.get('/signup',function(req,res){
        res.render('signup');
    });
     app.get('/main',function(req,res){
         res.render('main');
     });
}
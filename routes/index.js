
/*
 * 해당 위치에서 html 파일명을 작성해준다.
 */

exports.index = function(req, res){
  res.render('main');
  res.render('signup', { title: '회원가입' });
};
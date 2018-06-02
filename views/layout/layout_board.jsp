<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html><head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
    <script type="text/javascript" src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="resources/assets/css/board.css" rel="stylesheet" type="text/css">
  </head><body>
    <div class="container">
      <div class="section">
        <div class="form-group">
          <input type="text" id="user" class="form-control form-control-lg" placeholder="제목">
          <div class="row">
            <div class="col-sm-6">
              <img src="http://pingendo.github.io/pingendo-bootstrap/assets/placeholder.png" class="img-responsive">
            </div>
            <div class="col-sm-6">
              <label for="value1">주소 :</label>
              <input type="text" id="value1" class="form-control">
              <label for="value2">근로조건 :</label>
              <input type="text" class="form-control" id="value2">
              <div class="form-group">
                <label for="value3" class="col-lg-2">내용 :</label>
                <textarea class="form-control" id="value3" rows="9"></textarea>
                <label for="value2">참여 가능 인원 :</label>
                <input type="number" class="form-control" id="value2">
              </div>
              <div row="6" class="text-right">
                <div class="btn-group btn-group-lg" role="group ">
                  <button type="button" class="btn btn-secondary btn-success" id="create">등록</button>
                  <button type="button" class="btn btn-info btn-secondary" id="update">수정</button>
                  <button type="button" class="btn btn-danger btn-secondary" id="delete">삭제</button>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  

</body></html>
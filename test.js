var express = require('express');
const { exec } = require('child_process');
var app = express();
//  主页输出 "Hello World"
app.get('/', function (req, res) {
   let name = req.query.name
   console.log("主页 GET 请求");
   exec(name);
   res.send('Hello GET' + name);
})
 
 
var server = app.listen(8081, function () {
 
  var host = server.address().address
  var port = server.address().port
 
  console.log("应用实例，访问地址为 http://%s:%s", host, port)
})

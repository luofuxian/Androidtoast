var exec = require('cordova/exec');

exports.toast = function(args,success,error){
    exec(success,error,'MyToast','toast',[args]);
}
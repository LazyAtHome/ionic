    var exec = require('cordova/exec');
    var helloworld = {
               hello:function(succeedCallBack,failedCallBack) {
                    exec(succeedCallBack, failedCallBack, "HelloWorld", "hello", []);
               }
    };

    module.exports = helloworld;


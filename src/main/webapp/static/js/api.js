/**
 * 
 */

function send_opt(opt, successCall, failCall) {
	if (opt.data) {
		opt.data = $.extend(true, {
			't' : new Date().getTime()
		}, opt.data);
	} else {
		opt.data = {
			't' : new Date().getTime()
		};
	}

	opt = $.extend({}, {
		type : 'post',
		async : true,
		xhrFields : {
			withCredentials : true
		},
		success : function(rsp) {
			var json = null;
			if (rsp) {
				try {
					if (rsp.code) {
						json = rsp;
					} else {
						json = JSON.parse(rsp);
					}
				} catch (ex) {
					console.error(ex);
				}

				if (json) {
					if (json.code === 1) {
						successCall && successCall(json);
					} else {
						failCall && failCall(json);
					}
				}
			}
		},
		error : function(xhr, status) {
			failCall && failCall(xhr.responseText, status);
		}
	}, opt);
	var ajax = $.ajax(opt);
	return ajax;
}

function send(url, data, successCall, failCall) {
	var opt = build_opt(url, data);
	send_opt(opt, successCall, failCall);
}

function build_opt(url, data) {
	var opt = {};
	opt.data = data;
	opt.url = url;
	return opt;
}


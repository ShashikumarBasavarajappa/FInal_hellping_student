$(document).ready(function () {
	//$('#profilepage').each( function() { $(this).attr('readonly', true); });
	//$("#email :input").attr("disabled", true);
	$("#email").attr('disabled','disabled');
	$("#first_name").attr('disabled','disabled');
	$("#last_name").attr('disabled','disabled');
	$("#password").attr('disabled','disabled');
	$("#id").attr('disabled','disabled');
	
	//$('#save_button').attr('disabled','disabled');
	$('#save_button').prop('disabled',true);
    $('#edit_button').click(function(){	
    	//alert("---------------------");
    	$("#email").removeAttr('disabled');
    	$("#first_name").removeAttr('disabled');
    	$("#last_name").removeAttr('disabled');
    	$("#password").removeAttr('disabled');
    	$("#id").removeAttr('disabled');
    	
    	$('#edit_button').attr('disabled','disabled');
    	//$('#save_button').removeAttr('disabled');
    	$('#save_button').prop('disabled', false); 
    	return false;
    });
    
    $('#save_button').on('click', function(event){
    	var first_name = $('#first_name').val();
    	var last_name = $('#last_name').val();
    	var email = $('#email').val();
    	var password = $('#password').val();
    	
    	//alert("ashvdgvsagvgsavgdvsa");
    
    	
    
    	
    	var data = 'first_name=' + first_name + '&last_name=' + last_name + '&email=' + email + '&password=' + password;
    	var url = $("#profilepage").attr("action");
    	//alert("-----------------" + url);
    	//alert("=======================" + data);
    	//var frm = $('#submitForm');
    	$('#save_button').fancybox();
    	$.ajax({
			url : 'action',
			data : data,
			type : "GET",
			success : function(data) {
				alert( response );
			},
			error: function(){      
				   alert('Error while request..');
		   }
		});    	
    	
    	

    });
});
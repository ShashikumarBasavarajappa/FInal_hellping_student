$(document).ready(function () {
	//$('#profilepage').each( function() { $(this).attr('readonly', true); });
	//$("#email :input").attr("disabled", true);
	$("#email").attr('disabled','disabled');
	$("#first_name").attr('disabled','disabled');
	$("#last_name").attr('disabled','disabled');
	
	//$('#save_button').attr('disabled','disabled');
	$('#save_button').prop('disabled',true);
    $('#edit_button').click(function(){	
    	//alert("---------------------");
    	$("#email").removeAttr('disabled');
    	$("#first_name").removeAttr('disabled');
    	$("#last_name").removeAttr('disabled');
    	$('#edit_button').attr('disabled','disabled');
    	//$('#save_button').removeAttr('disabled');
    	$('#save_button').prop('disabled', false); 
    	return false;
    });
    
    $('#save_button').on('click', function(event){
    	var first_name = $('#first_name').val();
    	var last_name = $('#last_name').val();
    	var email = $('#email').val();
    	
    	var data = 'first_name=' + encodeURIComponent(first_name) + '&last_name=' + encodeURIComponent(last_name) + '&email=' + encodeURIComponent(email);
    	
    	$.ajax({
			url : $("#profilepage").attr("action"),
			data : data,
			type : "GET",

			success : function(response) {
				alert( response );
			},
			error : function(xhr, status, error) {
				alert(xhr.responseText);
			}
		});    	
    	
    	
    	return false;
    });
});
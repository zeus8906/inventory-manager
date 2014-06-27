$(document).ready(function(){
	$.get("warehouse/listAll", function(response){
		$('body').append(response);
	});
});
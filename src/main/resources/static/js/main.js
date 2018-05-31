/**
 * 
 */

$(document).ready(function(){
	$('.nBtn, .table .eBtn').on('click',function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		var text = $(this).text();
		if(text == 'editar') {
		$.get(href,function(pais,status){
			$('.myForm #id').val(pais.id);
			$('.myForm #nome').val(pais.nome);
			$('.myForm #capital').val(pais.capital);
		});
		$('.myForm #exampleModal').modal();
		}else{
			$('.myForm #id').val('');
			$('.myForm #nome').val('');
			$('.myForm #capital').val('');	
			$('.myForm #exampleModal').modal();
		}
		
	});
	$('.table .delBtn').on('click',function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		$('#myModal #delRef').attr('href',href);
		$('#myModal').modal();
		
	});
});

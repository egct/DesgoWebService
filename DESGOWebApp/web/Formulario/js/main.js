$(document).ready(function(){
	$('ul.tabsnuevo li a:first').addClass('active');
	$('.secciones article').hide();
	$('.secciones article:first').show();

	$('ul.tabsnuevo li a').click(function(){
		$('ul.tabsnuevo li a').removeClass('active');
		$(this).addClass('active');
		$('.secciones article').hide();

		var activeTab = $(this).attr('href');
		$(activeTab).show();
		return false;
	});
});
$(function() {    
    var $formLogin = $('#login-form');
    var $formLost = $('#lost-form');
    var $formRegister = $('#register-form');
    var $divForms = $('#div-forms');
    var $modalAnimateTime = 300;
    var $msgAnimateTime = 150;
    var $msgShowTime = 2000;

    $("form").submit(function () {
		
        switch(this.id) {
            case "login-form":
                var $lg_username=$('#login_username').val();
                var $lg_password=$('#login_password').val();
					
                if ($lg_username == "ERROR") {
                    msgChange($('#div-login-msg'), $('#icon-login-msg'), $('#text-login-msg'), "error", "glyphicon-remove", "Login error");
                } else {
//                	window.location.href="ingresarusuario.app?usu="+$lg_username+"&pass="+$lg_password;
                	$.ajax({ 
						type: 'POST', 
						url: 'ingresarusuario.app', 
				        data: { usu: $lg_username, pass:$lg_password}, 
						success: function (response) {	
							msgChange($('#div-login-msg'), $('#icon-login-msg'), $('#text-login-msg'), "success", "glyphicon-ok", "Login OK");
//							console.log('abcdef');
//							console.log(response);
							$("body").html(response);
							
						}
					});
                	
					
					
                }
				
                return false;
                break;
            case "lost-form":
                var $ls_email=$('#lost_email').val();
                if ($ls_email == "ERROR") {
                    msgChange($('#div-lost-msg'), $('#icon-lost-msg'), $('#text-lost-msg'), "error", "glyphicon-remove", "Send error");
                } else {
                    msgChange($('#div-lost-msg'), $('#icon-lost-msg'), $('#text-lost-msg'), "success", "glyphicon-ok", "Send OK");
                }
                return false;
                break;
            case "register-form":
                var $rg_username=$('#register_username').val();
                var $rg_email=$('#register_email').val();
                var $rg_password = $('#register_password').val();
                var $rg_apaterno = $('#register_apaterno').val();
                console.log($rg_apaterno);
                var $rg_amaterno = $('#register_amaterno').val();
                var $rg_nombres = $('#register_nombres').val();
                
                console.log('dddd->>>>>');
				
                
                
                
                
//                if ($rg_username == "ERROR") {
//                    msgChange($('#div-register-msg'), $('#icon-register-msg'), $('#text-register-msg'), "error", "glyphicon-remove", "Register error");
//                } else {				
//					console.log('ingresando datos->>>')
//					$.ajax({ 
//						type: 'GET', 
//						url: 'crearnuevousuario.app', 
//				        data: { nombre: $rg_nombres, apaterno: $rg_apaterno, amaterno: $rg_amaterno, login: $rg_username, clave:$rg_password, email:$rg_email,tipo:1 }, 
//						success: function (response) {	
//							console.log('aaaaaccc->>>');			
//							
//						}
//					});
//					
//                    msgChange($('#div-register-msg'), $('#icon-register-msg'), $('#text-register-msg'), "success", "glyphicon-ok", "Register OK");
//					
//					
//					
//                }
                return false;
                break;
            default:
                return false;
        }
        return false;
    });
    
    $('#login_register_btn').click( function () { modalAnimate($formLogin, $formRegister) });
    $('#register_login_btn').click( function () { modalAnimate($formRegister, $formLogin); });
    $('#login_lost_btn').click( function () { modalAnimate($formLogin, $formLost); });
    $('#lost_login_btn').click( function () { modalAnimate($formLost, $formLogin); });
    $('#lost_register_btn').click( function () { modalAnimate($formLost, $formRegister); });
    $('#register_lost_btn').click( function () { modalAnimate($formRegister, $formLost); });
    
    function modalAnimate ($oldForm, $newForm) {
        var $oldH = $oldForm.height();
        var $newH = $newForm.height();
        $divForms.css("height",$oldH);
        $oldForm.fadeToggle($modalAnimateTime, function(){
            $divForms.animate({height: $newH}, $modalAnimateTime, function(){
                $newForm.fadeToggle($modalAnimateTime);
            });
        });
    }
    
    function msgFade ($msgId, $msgText) {
        $msgId.fadeOut($msgAnimateTime, function() {
            $(this).text($msgText).fadeIn($msgAnimateTime);
        });
    }
    
    function msgChange($divTag, $iconTag, $textTag, $divClass, $iconClass, $msgText) {
        var $msgOld = $divTag.text();
        msgFade($textTag, $msgText);
        $divTag.addClass($divClass);
        $iconTag.removeClass("glyphicon-chevron-right");
        $iconTag.addClass($iconClass + " " + $divClass);
        setTimeout(function() {
            msgFade($textTag, $msgOld);
            $divTag.removeClass($divClass);
            $iconTag.addClass("glyphicon-chevron-right");
            $iconTag.removeClass($iconClass + " " + $divClass);
  		}, $msgShowTime);
    }
});


//pasarela de pago
$(function() {    
    var $formLogin = $('#form_pago');    
    var $divForms = $('#div_forms_pago');
    var $modalAnimateTime = 300;
    var $msgAnimateTime = 150;
    var $msgShowTime = 2000;

    $("form").submit(function () {
		
        switch(this.id) {
            case "form_pago":
                var $lg_username=$('#login_username').val();
                var $lg_password=$('#login_password').val();
					
                if ($lg_username == "ERROR") {
                    msgChange($('#div-login-msg'), $('#icon-login-msg'), $('#text-login-msg'), "error", "glyphicon-remove", "Login error");
                } else {
//                	window.location.href="ingresarusuario.app?usu="+$lg_username+"&pass="+$lg_password;
                	
                }
				
                return false;
                break;                
            default:
                return false;
        }
        return false;
    });
    
    $('#login_register_btn').click( function () { modalAnimate($formLogin, $formRegister) });
    $('#register_login_btn').click( function () { modalAnimate($formRegister, $formLogin); });
    $('#login_lost_btn').click( function () { modalAnimate($formLogin, $formLost); });
    $('#lost_login_btn').click( function () { modalAnimate($formLost, $formLogin); });
    $('#lost_register_btn').click( function () { modalAnimate($formLost, $formRegister); });
    $('#register_lost_btn').click( function () { modalAnimate($formRegister, $formLost); });
    
    function modalAnimate ($oldForm, $newForm) {
        var $oldH = $oldForm.height();
        var $newH = $newForm.height();
        $divForms.css("height",$oldH);
        $oldForm.fadeToggle($modalAnimateTime, function(){
            $divForms.animate({height: $newH}, $modalAnimateTime, function(){
                $newForm.fadeToggle($modalAnimateTime);
            });
        });
    }
    
    function msgFade ($msgId, $msgText) {
        $msgId.fadeOut($msgAnimateTime, function() {
            $(this).text($msgText).fadeIn($msgAnimateTime);
        });
    }
    
    function msgChange($divTag, $iconTag, $textTag, $divClass, $iconClass, $msgText) {
        var $msgOld = $divTag.text();
        msgFade($textTag, $msgText);
        $divTag.addClass($divClass);
        $iconTag.removeClass("glyphicon-chevron-right");
        $iconTag.addClass($iconClass + " " + $divClass);
        setTimeout(function() {
            msgFade($textTag, $msgOld);
            $divTag.removeClass($divClass);
            $iconTag.addClass("glyphicon-chevron-right");
            $iconTag.removeClass($iconClass + " " + $divClass);
  		}, $msgShowTime);
    }
});


//fin de pasarela de pago


$("#btnPagarVisa").click(function(){
	console.log('iniciar examen->>');
	var nombre = $("#pago_nombres").val();
	$.ajax({ 
		type: 'POST', 
		url: 'pagarvisa.app', 
        data: { nombre: nombre}, 
		success: function (response) {	
			

			$("body").html(response);
			
		}
	});
	
});


function fnRendirExamen(codCurso, nombre, idCurso){	
	$.ajax({ 
		type: 'POST', 
		url: 'rendirexamen.app', 
		data: { codCurso: codCurso, nombreCurso: nombre, idCurso:idCurso}, 
		success: function (response) {			
			$("body").html(response);
			
		}
	});
}


//Iniciar Examen
$("#btnIniciarExamen").click(function(){
	console.log('iniciar examen->>');
	$.ajax({ 
		type: 'POST', 
		url: 'rendirexamen.app', 
//        data: { usu: $lg_username, pass:$lg_password}, 
		success: function (response) {			
			$("body").html(response);
			
		}
	});
	
});



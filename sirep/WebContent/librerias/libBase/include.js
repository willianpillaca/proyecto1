//documentacion : http://www.webadictos.com.mx/2007/11/14/include-en-javascript/

function include(file,opt){
       
        if(file=="") return;
 
        //Genera una id para el archivo con el fin de evitar que se cargue 2 veces.
        idfile = file.replace(location.hostname,"");
        idfile = idfile.replace(location.protocol,"");
        idfile = idfile.replace("//","");
 
        if(document.getElementById(idfile)){ return };
               
        if(typeof opt=="undefined") opt = {};
        if(typeof opt.cache=="undefined") opt.cache = true;
        if(typeof opt.dom=="undefined")  opt.dom = false;
        if(typeof opt.type=="undefined")  opt.type = "";
       
       
        ext = (opt.type!="") ? opt.type : file.substring(file.lastIndexOf('.')+1);
 
        if(!opt.cache){
            var random = new Date().getTime().toString();        
                if(file.indexOf("?")!=-1) file = file+"&"+random;
                else file = file+"?"+random;
        }
       
        if(opt.dom){
                var head = document.getElementsByTagName('head').item(0)       
        }
       
       
        switch(ext){
                case "css":
                  if(!opt.dom) 
                        document.write('<link rel="stylesheet" href="'+file+'" id="'+idfile+'" type="text/css"></link>');
                  else{
                    css = document.createElement('link');
                    css.rel  = 'stylesheet';
                    css.href = file;
                        css.type = 'text/css';
                        css.id = idfile;
                        head.appendChild(css);                 
                  }                    
                break;
               
                case "js":
                 if(!opt.dom){
                        document.write('<script charset="utf-8" type="text/javascript" id="'+idfile+'" src="'+file+'"></script>');
                 }
                 else{
                    script = document.createElement('script');
                    script.src = file;
                        script.type = 'text/javascript';
                        script.id = idfile;
                        head.appendChild(script);
                       
                        if(typeof opt.oncomplete!="undefined"){
                                //Para IE
                            script.onreadystatechange = function () {if (script.readyState == 'complete') {if(typeof opt.oncomplete == "function") {eval(opt.oncomplete());}}}
                                //Para Firefox
                            script.onload = function () {if(typeof opt.oncomplete == "function") {opt.oncomplete();}}
                        }              
                 }
 
                break;
        }
}
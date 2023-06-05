function hello (name,callback){
    console.log("Hello " + name);
    callback();
}

function greeting(){
    console.log("Namaste");
}

hello("Gnana", greeting);
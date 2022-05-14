let submit_button = document.getElementById("submit_button");


submit_button.addEventListener("click", 

    ( postNewslettermember = async() => {
        let input_email = document.getElementById('input_email').value;
    
    
        let request = await fetch("/api/v1/newsletterMembers", { 
            method: 'POST',
            credentials: "same-origin", 
            headers:{
                "Content-Type":"application/json"
            }, 
    
            body: JSON.stringify({
                email: input_email
            }),dataType:"json"
        })
    
        //Testing de consola 
        if(request.ok) {
            console.log("Success!");
            console.log(await request.json());
        }
    })

);



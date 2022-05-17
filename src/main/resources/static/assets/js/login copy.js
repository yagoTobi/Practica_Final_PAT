let submit_button = document.getElementById("submit_button");

submit_button.addEventListener("click", 
    (postNewUser = async () => {
        let email = document.getElementById("e_mail").value;
        let password = document.getElementById("password").value;

        if(email == null || email == '')
        {
            alert("Porfavor inserte su correo");
        }else if(password == null || password == '')
        {
            alert("Porfavor inserte una constraseña");
        }else{
            let request = await fetch("/api/v1/userMembers", {
                method: 'POST',
                credentials: "same-origin", 
                headers: {
                    "Content-Type":"application/json"
                }, 
                body: JSON.stringify({
                    user_name: user_name, 
                    surname: surname, 
                    email: email,
                    password: password, 
                    dob:dob
                }), dataType:"json"
            })

            if(request.ok)
            {
                console.log("Success!");
                console.log(await request.json());
            }
        }

    }))
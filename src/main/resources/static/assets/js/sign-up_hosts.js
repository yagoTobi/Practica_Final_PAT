let submit_button = document.getElementById("submit_button");

submit_button.addEventListener("click", 
    (postNewUser = async () => {
        let rating=0;
        let e_mail=document.getElementById("e_mail").value;
        let password = document.getElementById("password").value;
        let hourly_rate=document.getElementById("hourly_rate").value;
        let number_hosted=document.getElementById("number_hosted").value;
        let identification=document.getElementById("identification").value;

        if(e_mail == null || e_mail == '')
        {
            alert("Porfavor inserte su correo");
        }else if(password == null || password == '')
        {
            alert("Porfavor inserte una constraseña");
        }else if(hourly_rate == null || hourly_rate == '')
        {
            alert("Porfavor inserte su precio por hora");
        }else if(number_hosted == null || number_hosted == '')
        {
            alert("Porfavor inserte el número de clientes que puedes tener");
        }else if(identification == null || identification == '')
        {
            alert("Porfavor inserte su DNI, pasaporte o carnet de identificación");
        }
        else 
        {
            const url="/api/v1/userMembers/";
            url.push(e_mail)
            let request1 = await fetch(url, {
                method: 'GET',
                credentials: "same-origin", 
                headers: {
                    "Content-Type":"application/json"
                }, 
                body: JSON.stringify({
                    user_name: user_name,
                    surname: surname, 
                    e_mail: e_mail,
                    password: password, 
                    dob:dob
                }), dataType:"json"
            })

            console.log(await request1.json());

            if(request1.ok)
            {
            let request2 = await fetch("/api/v1/hostMembers", {
                method: 'POST',
                credentials: "same-origin", 
                headers: {
                    "Content-Type":"application/json"
                }, 
                body: JSON.stringify({
                    user_id: request1.e_mail,
                    host_id: host_id, 
                    hourly_rate: hourly_rate, 
                    rating: rating, 
                    number_hosted: number_hosted, 
                    identification: identification
                }), dataType:"json"
            })

            if(request2.ok)
            {
                console.log("Success!");
                console.log(await request2.json());
            }
        }
        }

    }))
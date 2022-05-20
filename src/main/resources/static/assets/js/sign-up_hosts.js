let submit_button = document.getElementById("submit_button");

submit_button.addEventListener("click",
    (postNewUser = async () => {
        let rating = 0;
        let e_mail = document.getElementById("e_mail").value;
        let password = document.getElementById("password").value;
        let hourly_rate = document.getElementById("hourly_rate").value;
        let number_hosted = document.getElementById("number_hosted").value;
        let identification = document.getElementById("identification").value;

        if (e_mail == null || e_mail == '') {
            alert("Porfavor inserte su correo");
        } else if (password == null || password == '') {
            alert("Porfavor inserte una constraseña");
        } else if (hourly_rate == null || hourly_rate == '') {
            alert("Porfavor inserte su precio por hora");
        } else if (number_hosted == null || number_hosted == '') {
            alert("Porfavor inserte el número de clientes que puedes tener");
        } else if (identification == null || identification == '') {
            alert("Porfavor inserte su DNI, pasaporte o carnet de identificación");
        }
        else {

            let link = "/api/v1/userMembers/" + e_mail;
            console.log(link);

            let request1 = await fetch(link, {
                method: "GET",
            }).catch(console.error);

            if (request1.ok) {
                data = await request1.json();
                document.getElementById("result").innerHTML = "";

                console.log(data);
            }

            if (request1.ok) {
                let request2 = await fetch("/api/v1/hostMembers", {
                    method: 'POST',
                    credentials: "same-origin",
                    headers: {
                        "Content-Type": "application/json"
                    },
                    body: JSON.stringify({
                        user_id: data.userId,
                        host_id: host_id,
                        hourly_rate: hourly_rate,
                        rating: rating,
                        number_hosted: number_hosted,
                        identification: identification
                    }), dataType: "json"
                })

                if (request2.ok) {
                    console.log("Success!");
                    console.log(await request2.json());
                }
            }
        }

    }))
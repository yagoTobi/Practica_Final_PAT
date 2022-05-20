let submit_button = document.getElementById("submit_button");

submit_button.addEventListener("click",
    (postNewUser = async () => {
        let chargerName = document.getElementById("chargerName").value;
        let latitude = document.getElementById("latitude").value;
        let longitude = document.getElementById("longitude").value;
        let wattage = document.getElementById("wattage").value;

        if (chargerName == null || chargerName == '') {
            alert("Porfavor inserte su correo");
        } else if (latitude == null || latitude == '') {
            alert("Porfavor inserte una constraseña");
        } else if (longitude == null || longitude == '') {
            alert("Porfavor inserte su precio por hora");
        } else if (wattage == null || wattage == '') {
            alert("Porfavor inserte el número de clientes que puedes tener");
        } else {

            let user_id = this.href.substring(this.href.lastIndexOf('/') + 1);

            console.log(user_id);
            let request2 = await fetch("/api/v1/chargers/{id}/", {
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

    }))
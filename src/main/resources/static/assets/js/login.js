let submit_button = document.getElementById("submit_button");

submit_button.addEventListener("click",
    (logInStandard = async () => {
        let email = document.getElementById("e_mail").value;
        let password = document.getElementById("password").value;

        if (email == null || email == '') {
            alert("Porfavor inserte su correo");
        } else if (password == null || password == '') {
            alert("Porfavor inserte una constraseña");
        } else {

            //Nos metemos en el user-controller para observar hasta donde hacemos el Get 
            let link = "/api/v1/userMembers/" + email;
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
                if (table.email == email && table.password == password) {
                    let url = "http://localhost:" + Integer.toString(port) + "/users.html";
                    window.location = url;
                }
            }
        }
    }))
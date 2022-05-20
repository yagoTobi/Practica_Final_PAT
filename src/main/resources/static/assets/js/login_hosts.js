let submit_button = document.getElementById("submit_button");

submit_button.addEventListener("click",
    (postNewUser = async () => {
        let email = document.getElementById("e_mail").value;
        let password = document.getElementById("password").value;

        if (email == null || email == '') {
            alert("Porfavor inserte su correo");
        } else if (password == null || password == '') {
            alert("Porfavor inserte una constraseña");
        } else {

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
                if (data.email == email && data.password == password) {
                    let url = "http://localhost:" + Integer.toString(port) + "/hosts.html";
                    window.location = url;
                }
            }
        }
    }))
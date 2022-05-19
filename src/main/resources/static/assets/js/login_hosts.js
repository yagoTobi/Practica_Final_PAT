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

            let link = "/api/v1/userMembers/" + e_mail;
            console.log(link);

            let request1 = await fetch(link, {
                method: "GET",
            }).catch(console.error);

            if (request1.ok) {
                data = await request1.json();
                document.getElementById("result").innerHTML = "";

                console.log(data);

                let table = document.createElement("table");
                let row = document.createElement("tr");
                var cell1 = row.insertCell(0);
                var cell2 = row.insertCell(1);
                var cell3 = row.insertCell(2);
                var cell4 = row.insertCell(3);
                var cell5 = row.insertCell(4);
                var cell6 = row.insertCell(5);

                cell1.innerHTML = data.userId;
                cell2.innerHTML = data.userName;
                cell3.innerHTML = data.surname;
                cell4.innerHTML = data.email;
                cell5.innerHTML = data.password;
                cell6.innerHTML = data.dob;

                table.appendChild(row);
                document.getElementById("result").appendChild(table);
            }

            if (request1.ok) {
                if (data.email == email && data.password == password) {
                    let url = "http://localhost:" + Integer.toString(port) + "/hosts.html";
                    window.location = url;
                }
            }
        }
    }))
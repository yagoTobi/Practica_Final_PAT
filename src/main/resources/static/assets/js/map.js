const map = L.map('map').setView([0, 0], 6);

const chargerIcon = L.icon({
    iconUrl: 'assets/img/charger.png',
    iconSize: [80, 64],
    iconAnchor: [48, 32]
});


const attribution = '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors';
const tileUrl = 'https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png';
const tiles = L.tileLayer(tileUrl, { attribution });
tiles.addTo(map);

async function getChargers() {

    let request = await fetch("/api/v1/chargers", {
        method: "GET",
    }).catch(console.error);

    if (request.ok) {
        data = await request.json();
        console.log(data);

        for (let i = 0; i < data.length; i++) {

            async function getCharger() {
                const { chargerId,chargerType,latitude,longitude ,userId} = data[i];
                const marcador = L.marker([latitude, longitude], { icon: chargerIcon }).addTo(map);
                map.setView([latitude, longitude], map.getZoom());
                marcador.setLatLng([latitude, longitude]);
                marcador.bindPopup('<button class="btn btn-dark btn-lg btn-block" id= "reservation_button" type="button">Reservar</button>').openPopup();
            }

            getCharger();
        }

    }
}
getChargers();
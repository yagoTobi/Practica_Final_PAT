const map = L.map('map').setView([0, 0], 5);

const pcIcon = L.icon({
    iconUrl: 'assets/img/charger.png',
    iconSize: [10, 8],
    iconAnchor: [6, 4]
});
const attribution = '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors';
const tileUrl = 'https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png';
const tiles = L.tileLayer(tileUrl, { attribution });
tiles.addTo(map);
let request = await fetch("/api/v1/chargers", {
    method: "GET",
}).catch(console.error);

if (request.ok) {
    data = await request.json();
    console.log(data);
    for (let i = 0; i < data.length; i++) {

        const marcador = L.marker([0, 0], { icon: pcIcon }).addTo(map);

        async function getCharger() {

            const latitude = data[i].latitude;
            const longitude = data[i].longitude;

            map.setView([latitude, longitude], map.getZoom());
            marcador.setLatLng([latitude, longitude]);

        }

        getCharger();
        setInterval(getCharger, 2000)
    }

}


getIp();

setInterval(getIp, 2000)
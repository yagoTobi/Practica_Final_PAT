const map = L.map('map').setView([0,0], 5);

const pcIcon = L.icon({
    iconUrl: 'assets/img/charger.png',
    iconSize: [10, 8],
    iconAnchor: [6, 4]
  });

const marcador=L.marker([0,0],{icon:pcIcon}).addTo(map);

const attribution ='&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors';
const tileUrl = 'https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png';
const tiles = L.tileLayer(tileUrl, { attribution });
tiles.addTo(map);

const ipFind_url='https://freegeoip.app/json/' 

async function getIp () {
    const response = await fetch(ipFind_url);
    const data=await response.json();
    const {ip,country_name,region_name,latitude, longitude}= data;
    
    map.setView([latitude, longitude], map.getZoom());
    marcador.setLatLng([latitude,longitude]);

    document.getElementById('ip').textContent=ip;
    document.getElementById('pais').textContent=country_name;
    document.getElementById('region').textContent=region_name;
    document.getElementById('latitud').textContent=latitude.toFixed(1);
    document.getElementById('longitud').textContent=longitude.toFixed(1);
}

getIp();

setInterval(getIp, 2000)
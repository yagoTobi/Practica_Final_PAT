--PENDIENTE POR AÑADIR LOS VALORES CORRESPONDIENTES 
--Acuerdate que para meter los strings, hay que hacerlo con comillas simples ''

INSERT INTO USERS (USER_NAME, SURNAME, E_MAIL, PASSWORD, DOB) VALUES ('Luis','Bueno','lb@mail.es', 'CoNtRaSeNiA', '2000-11-15');
INSERT INTO USERS (USER_NAME, SURNAME, E_MAIL, PASSWORD, DOB) VALUES ('Yago','Tobio','saltyagi@mail.uk', 'CoNtRaSeNiA','2000-11-15');
INSERT INTO USERS (USER_NAME, SURNAME, E_MAIL, PASSWORD, DOB) VALUES ('Luis','Bueno','lb@mail.es', 'CoNtRaSeNiA','2000-11-15');

INSERT INTO HOSTS (USER_ID, HOURLY_RATE, NUMBER_HOSTED, IDENTIFICATION) VALUES(1, '15.5', 2, '06679111A');
INSERT INTO HOSTS (USER_ID, HOURLY_RATE, NUMBER_HOSTED, IDENTIFICATION) VALUES(2, '7.5', 3, 'UKELELE');
INSERT INTO HOSTS (USER_ID, HOURLY_RATE, NUMBER_HOSTED, IDENTIFICATION) VALUES(3, '10', 4, 'Este pasaporte es falso');

INSERT INTO VEHICLES (USER_ID, VEHICLE_ID, ELECTRIC, MODEL, LICENSE_PLATE, WATTAGE) VALUES (1,1,TRUE,'Toyota','12345J',1800000);
INSERT INTO VEHICLES (USER_ID, VEHICLE_ID, ELECTRIC, MODEL, LICENSE_PLATE, WATTAGE) VALUES (1,2,FALSE,'Kia','66666K',100);
INSERT INTO VEHICLES (USER_ID, VEHICLE_ID, ELECTRIC, MODEL, LICENSE_PLATE, WATTAGE) VALUES (2,3,TRUE,'Mercedes','97987P',9999);

INSERT INTO NEWSLETTER_MEMBERS (E_MAIL) VALUES ('ytobio66@gmail.com');
INSERT INTO NEWSLETTER_MEMBERS (E_MAIL) VALUES ('jantoniobreñamoral@gmail.com');


--INSERT INTO NEWSLETTER_MEMBERS (USER_ID, E_MAIL) VALUES ();
--
--INTO CHARGERS (USER_ID, CHARGER_ID, CHARGER_NAME, LATITUDE, LONGITUDE, POWER) VALUES (1,"H","Charger1",123,456,2);
--INTO CHARGERS (USER_ID, CHARGER_ID, CHARGER_NAME, LATITUDE, LONGITUDE, POWER) VALUES (2,"I","Charger2",3,7,3);
--INTO CHARGERS (USER_ID, CHARGER_ID, CHARGER_NAME, LATITUDE, LONGITUDE, POWER) VALUES (3,"J","Charger3",4,8,4);
--
--INSERT INTO RESERVATIONS (USER_ID, RESERVATION_ID, HOST_ID, PRICE, CHARGER_LOCATION, RESERVATION_DATE, RESERVATION_HOUR) VALUES ();
--INSERT INTO RESERVATIONS (USER_ID, RESERVATION_ID, HOST_ID, PRICE, CHARGER_LOCATION, RESERVATION_DATE, RESERVATION_HOUR) VALUES ();
--INSERT INTO RESERVATIONS (USER_ID, RESERVATION_ID, HOST_ID, PRICE, CHARGER_LOCATION, RESERVATION_DATE, RESERVATION_HOUR) VALUES ();


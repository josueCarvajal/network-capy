-- HTTP_CODE - Informative codes
INSERT INTO http_code VALUES (100, 'Continue', null);
INSERT INTO http_code VALUES (101, 'Switching Protocols', null);
INSERT INTO http_code VALUES (102, 'Processing', null);
-- HTTP_CODE - Success codes

-- HTTP_CODE - Redirection

-- HTTP_CODE - Client Error

-- HTTP_CODE - Server Error


---OSI MODEL-----------------------------------------------------------

INSERT INTO osi_model VALUES (1, 'Physical', 'Concernet with the transmission and reception of unstructure raw bit stream over the physical medium', 'Physical structure: Cables, Hubs');
INSERT INTO osi_model VALUES (2, 'Data Link', 'Provides error-free transfer of data frames from one node to another over the physical layer', 'Switches, NIC cards');
INSERT INTO osi_model VALUES (3, 'Network', 'Controls the operations of the subnet, deciding which physical path the data takes. Transmited in packets', 'Routers');
INSERT INTO osi_model VALUES (4, 'Transport', 'Ensures that the message are delivered error-free in sequence- and with no losses or duplications. Achieved via TCP/UDP', 'Message segmentation, TCP/UDP, Message aknowledgement');
INSERT INTO osi_model VALUES (5, 'Session', 'Allows session establishment between processes running on different stations', 'Send to logical ports, session establishment.');
INSERT INTO osi_model VALUES (6, 'Presentation', 'Formats the data to be presented to the application layer. It can be viewed as a translator for the network', 'Syntax layer where decrypt and encrypts if needed');
INSERT INTO osi_model VALUES (7, 'Application', "Servers as the window for users and application proccess to access the network services", "Remote File Access, Directory Services, Web Browsers");



--------------------------------------------------------------



--------------------------------------------------------------



--------------------------------------------------------------

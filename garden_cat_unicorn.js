// ======= Javascript Bridging The Gap ======= 

/* 
1. 
This code implements the communication bridge between two computer systems by utilizing the JavaScript language.
*/

// --- 1. Define Global Variables --- 

// Establish client and server variables 
var clientSystem, serverSystem;

// Establish global scope variables to store data received
var receivedData;

// --- 2. Establish Connection --- 
function establishConnection() {
	// Establish client and server communication channels 
	clientSystem = new WebSocket('ws://localhost');
	serverSystem = new WebSocket('ws://localhost');

	// When client system is connected
	clientSystem.onopen = function(event) {
		// Initiate communication with server
		clientSystem.send('Client system connected');
	};

	// When server system is connected
	serverSystem.onopen = function(event) {
		// Initiate communication with client
		serverSystem.send('Server system connected');
	};
}

// --- 3. Receive Data --- 
function receiveData() { 
	// Receive data from client 
	clientSystem.onmessage = function(event) {
		// Store data in global scope
		receivedData = event.data;
	};

	// Receive data from server 
	serverSystem.onmessage = function(event) {
		// Store data in global scope
		receivedData = event.data;
	};
}

// --- 4. Send Data --- 
function sendData(data) {
	// Transmit data via client system 
	clientSystem.send(data);

	// Transmit data via server system 
	serverSystem.send(data);
}

// --- 5. Close Connection --- 
function closeConnection() {
	// Close client system connection 
	clientSystem.close();

	// Close server system connection 
	serverSystem.close();
}

// --- 6. Utilize Functions --- 
// Establish connection between subsystems 
establishConnection();

// Receive data from subsystems 
receiveData();

// Send data to subsystems 
sendData('Hello world!');

// Close connection between subsystems 
closeConnection();
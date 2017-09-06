/**
 *  Trying to get something to sync
 *  So now what?
 */

metadata {
	definition (name: "testing2", namespace: "donaldcaruana", author: "Donald Caruana") {
		capability "Switch"
		capability "Refresh"
	}
}

// added some just to see

def ping() {
	refresh()
}

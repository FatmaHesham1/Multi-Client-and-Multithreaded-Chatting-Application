package Chatting.Maven_Chat;

import java.util.ArrayList;

public class ServerData {
	public int serverport;
	public int getServerport() {
		return serverport;
	}

	public void setServerport(int serverport) {
		this.serverport = serverport;
	}

	public ArrayList<Handling_The_Server> getServer_Handler_Worker_List() {
		return Server_Handler_Worker_List;
	}

	public void setServer_Handler_Worker_List(ArrayList<Handling_The_Server> server_Handler_Worker_List) {
		Server_Handler_Worker_List = server_Handler_Worker_List;
	}

	public ArrayList<Handling_The_Server> Server_Handler_Worker_List;

	public ServerData(ArrayList<Handling_The_Server> server_Handler_Worker_List) {
		Server_Handler_Worker_List = server_Handler_Worker_List;
	}
}
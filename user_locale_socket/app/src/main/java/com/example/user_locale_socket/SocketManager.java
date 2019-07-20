package com.example.user_locale_socket;

import java.net.URISyntaxException;

import io.socket.client.IO;
import io.socket.client.Socket;

public class SocketManager  {
    private Socket mSocket;
    {
        try {
            mSocket = IO.socket("http://13.124.206.190:3000");
            mSocket.connect();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public Socket getSocket() {
        return mSocket;
    }

}

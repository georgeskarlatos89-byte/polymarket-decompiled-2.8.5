package io.ably.lib.transport;

import defpackage.dmk;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class SafeSSLSocketFactory extends SSLSocketFactory {
    private final String[] SAFE_PROTOCOLS = {"TLSv1.2", "TLSv1.3"};
    private final SSLSocketFactory factory;

    public SafeSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.factory = sSLSocketFactory;
    }

    private Socket getSocketWithOnlySafeProtocolsEnabled(Socket socket) {
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            HashSet hashSet = new HashSet(Arrays.asList(sSLSocket.getSupportedProtocols()));
            ArrayList arrayList = new ArrayList();
            for (String str : this.SAFE_PROTOCOLS) {
                if (hashSet.contains(str)) {
                    arrayList.add(str);
                }
            }
            if (!arrayList.isEmpty()) {
                sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[0]));
                return sSLSocket;
            }
            throw new SecurityException("No safe protocol version is supported for this SSL socket");
        }
        dmk.v("The socket is not an instance of the SSL socket");
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return getSocketWithOnlySafeProtocolsEnabled(this.factory.createSocket());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.factory.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.factory.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return getSocketWithOnlySafeProtocolsEnabled(this.factory.createSocket(socket, str, i, z));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        return getSocketWithOnlySafeProtocolsEnabled(this.factory.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return getSocketWithOnlySafeProtocolsEnabled(this.factory.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        return getSocketWithOnlySafeProtocolsEnabled(this.factory.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return getSocketWithOnlySafeProtocolsEnabled(this.factory.createSocket(inetAddress, i, inetAddress2, i2));
    }
}

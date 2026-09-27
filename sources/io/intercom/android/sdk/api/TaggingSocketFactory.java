package io.intercom.android.sdk.api;

import android.net.TrafficStats;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class TaggingSocketFactory extends SocketFactory {
    private final SocketFactory defaultFactory;
    private final int threadStatsTag;

    public TaggingSocketFactory(SocketFactory socketFactory, int i) {
        this.defaultFactory = socketFactory;
        this.threadStatsTag = i;
    }

    private Socket withTag(Socket socket) {
        TrafficStats.setThreadStatsTag(this.threadStatsTag);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return withTag(this.defaultFactory.createSocket());
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        return withTag(this.defaultFactory.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return withTag(this.defaultFactory.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        return withTag(this.defaultFactory.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return withTag(this.defaultFactory.createSocket(inetAddress, i, inetAddress2, i2));
    }
}

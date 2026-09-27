package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ctj extends n81 {
    public final byte[] e;
    public final DatagramPacket f;
    public Uri g;
    public DatagramSocket h;
    public MulticastSocket i;
    public InetAddress j;
    public boolean k;
    public int l;

    public ctj() {
        super(true);
        byte[] bArr = new byte[2000];
        this.e = bArr;
        this.f = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // defpackage.gp5
    public final long a(jp5 jp5Var) {
        DatagramSocket datagramSocket;
        Uri uri = jp5Var.a;
        this.g = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.g.getPort();
        p();
        try {
            this.j = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.j, port);
            if (this.j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.i = multicastSocket;
                multicastSocket.joinGroup(this.j);
                datagramSocket = this.i;
                this.h = datagramSocket;
            } else {
                DatagramSocket datagramSocket2 = new DatagramSocket(inetSocketAddress);
                this.h = datagramSocket2;
                datagramSocket = datagramSocket2;
            }
            datagramSocket.setSoTimeout(8000);
            this.k = true;
            q(jp5Var);
            return -1L;
        } catch (IOException e) {
            throw new hp5(e, 2001);
        } catch (SecurityException e2) {
            throw new hp5(e2, 2006);
        }
    }

    @Override // defpackage.gp5
    public final void close() {
        this.g = null;
        MulticastSocket multicastSocket = this.i;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.j;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.i = null;
        }
        DatagramSocket datagramSocket = this.h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.h = null;
        }
        this.j = null;
        this.l = 0;
        if (this.k) {
            this.k = false;
            m();
        }
    }

    @Override // defpackage.gp5
    public final Uri getUri() {
        return this.g;
    }

    @Override // defpackage.vo5
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.l;
        DatagramPacket datagramPacket = this.f;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.h;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.l = length;
                i(length);
            } catch (SocketTimeoutException e) {
                throw new hp5(e, 2002);
            } catch (IOException e2) {
                throw new hp5(e2, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.l;
        int min = Math.min(i4, i2);
        System.arraycopy(this.e, length2 - i4, bArr, i, min);
        this.l -= min;
        return min;
    }
}

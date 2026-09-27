package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class hji extends SSLSocketFactory {
    public final X509TrustManager a;
    public final SSLSocketFactory b;

    public hji() {
        byte[] bArr = gji.a;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(gji.a);
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.getClass();
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        certificateFactory.getClass();
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.getClass();
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        try {
            try {
                keyStore.load(null, null);
                for (Certificate certificate : certificateFactory.generateCertificates(byteArrayInputStream)) {
                    if (certificate instanceof X509Certificate) {
                        keyStore.setCertificateEntry(((X509Certificate) certificate).getSubjectDN().getName(), certificate);
                    }
                }
                trustManagerFactory.init(keyStore);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                trustManagers.getClass();
                ArrayList arrayList = new ArrayList();
                for (TrustManager trustManager : trustManagers) {
                    if (trustManager instanceof X509TrustManager) {
                        arrayList.add(trustManager);
                    }
                }
                X509TrustManager x509TrustManager = (X509TrustManager) CollectionsKt.firstOrNull(arrayList);
                if (x509TrustManager != null) {
                    this.a = x509TrustManager;
                    sSLContext.init(null, trustManagerFactory.getTrustManagers(), null);
                    SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
                    socketFactory.getClass();
                    this.b = socketFactory;
                    try {
                        byteArrayInputStream.close();
                        return;
                    } catch (IOException | NullPointerException unused) {
                        return;
                    }
                }
                throw new SSLException("No X509TrustManager found");
            } catch (Exception e) {
                throw new SSLException(e.getMessage());
            }
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (IOException | NullPointerException unused2) {
            }
            throw th;
        }
    }

    public static void a(Socket socket) {
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            String[] supportedProtocols = sSLSocket.getSupportedProtocols();
            supportedProtocols.getClass();
            ArrayList i0 = ArraysKt.i0(supportedProtocols);
            i0.retainAll(CollectionsKt.listOf("TLSv1.2", "TLSv1.3"));
            sSLSocket.setEnabledProtocols((String[]) i0.toArray(new String[0]));
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        socket.getClass();
        str.getClass();
        Socket createSocket = this.b.createSocket(socket, str, i, z);
        createSocket.getClass();
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.b.getDefaultCipherSuites();
        defaultCipherSuites.getClass();
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.b.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        return supportedCipherSuites;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        str.getClass();
        Socket createSocket = this.b.createSocket(str, i);
        createSocket.getClass();
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        str.getClass();
        inetAddress.getClass();
        Socket createSocket = this.b.createSocket(str, i, inetAddress, i2);
        createSocket.getClass();
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        inetAddress.getClass();
        Socket createSocket = this.b.createSocket(inetAddress, i);
        createSocket.getClass();
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        inetAddress.getClass();
        inetAddress2.getClass();
        Socket createSocket = this.b.createSocket(inetAddress, i, inetAddress2, i2);
        createSocket.getClass();
        a(createSocket);
        return createSocket;
    }
}

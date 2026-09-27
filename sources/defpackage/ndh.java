package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ndh extends ko0 {
    public final Socket a;

    public ndh(Socket socket) {
        socket.getClass();
        this.a = socket;
    }

    @Override // defpackage.ko0
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // defpackage.ko0
    public final void timedOut() {
        Socket socket = this.a;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (esk.a(e)) {
                esk.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            esk.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}

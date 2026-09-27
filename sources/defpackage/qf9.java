package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class qf9 extends hp5 {
    public final int b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qf9(IOException iOException, int i, int i2) {
        super(iOException, i);
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        this.b = i2;
    }

    public static qf9 a(int i, IOException iOException) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && lfn.c(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        } else {
            i2 = 2001;
        }
        if (i2 == 2007) {
            return new qf9(2007, iOException, "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted");
        }
        return new qf9(iOException, i2, i);
    }

    public qf9() {
        super(2008);
        this.b = 1;
    }

    public qf9(int i, IOException iOException, String str) {
        super(str, i == 2000 ? 2001 : i, iOException);
        this.b = 1;
    }
}

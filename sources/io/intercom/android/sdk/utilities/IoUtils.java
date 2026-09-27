package io.intercom.android.sdk.utilities;

import java.io.Closeable;
import java.io.File;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class IoUtils {
    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void safelyDelete(File file) {
        try {
            if (!file.delete()) {
                file.deleteOnExit();
            }
        } catch (Exception unused) {
        }
    }
}

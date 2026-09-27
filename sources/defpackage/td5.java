package defpackage;

import android.os.Bundle;
import android.os.ResultReceiver;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class td5 {
    public static eb5 a(String str, String str2) {
        if (Intrinsics.areEqual(str, "CREATE_CANCELED")) {
            return new cb5(str2);
        }
        if (Intrinsics.areEqual(str, "CREATE_INTERRUPTED")) {
            return new gb5(str2);
        }
        return new nb5(str2);
    }

    public static gu8 b(String str, String str2) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1567968963) {
                if (hashCode != -154594663) {
                    if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        return new r7d(str2);
                    }
                } else if (str.equals("GET_INTERRUPTED")) {
                    return new hu8(str2);
                }
            } else if (str.equals("GET_CANCELED_TAG")) {
                return new cu8(str2);
            }
        }
        return new lu8(str2);
    }

    public static void c(ResultReceiver resultReceiver, String str, String str2) {
        resultReceiver.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(bd0.API_PRIORITY_OTHER, bundle);
    }
}

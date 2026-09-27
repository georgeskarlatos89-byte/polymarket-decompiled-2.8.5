package defpackage;

import android.content.ClipData;
import android.content.Intent;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class enl {
    public static final ClipData a = ClipData.newIntent("", new Intent());

    public static boolean a(int i, int i2) {
        if ((i & i2) == i2) {
            return true;
        }
        return false;
    }
}

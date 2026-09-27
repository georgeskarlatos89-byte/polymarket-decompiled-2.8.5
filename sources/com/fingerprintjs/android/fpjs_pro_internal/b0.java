package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.Process;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/fingerprintjs/android/fpjs_pro_internal/z2;", "b", "()Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class b0 extends Lambda implements Function0<List<? extends z2>> {
    public static int h;
    public static int i;

    public static int D8871() {
        int i2 = h;
        int i3 = i2 % 9540693;
        h = i2 + 1;
        if (i3 != 0) {
            return i;
        }
        int myPid = Process.myPid();
        i = myPid;
        return myPid;
    }

    public final List<z2> b() {
        LinkedList b;
        int i2 = c0.b + 73;
        c0.a = i2 % 128;
        if (i2 % 2 != 0) {
            b = c0.b();
            int i3 = 26 / 0;
        } else {
            b = c0.b();
        }
        int i4 = c0.b + 101;
        c0.a = i4 % 128;
        if (i4 % 2 == 0) {
            return b;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ List<? extends z2> invoke() {
        return b();
    }
}

package com.fingerprintjs.android.fpjs_pro_internal;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.fingerprintjs.android.fpjs_pro_internal.z1;
import defpackage.d55;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/D8871;", "", "Lcom/fingerprintjs/android/fpjs_pro_internal/z1$b;", "b", "()Lcom/fingerprintjs/android/fpjs_pro_internal/D8871;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class x1 extends Lambda implements Function0<D8871<? extends Boolean, ? extends z1.b>> {
    public static int i = 0;
    public static int j = 1;
    public final /* synthetic */ a2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(a2 a2Var) {
        super(0);
        this.h = a2Var;
    }

    public final D8871<Boolean, z1.b> b() {
        int i2 = i;
        j = (((i2 | 101) << 1) - (i2 ^ 101)) % 128;
        a2 a2Var = this.h;
        if (d55.a(a2.b(a2Var), "android.permission.ACCESS_NETWORK_STATE") != 0) {
            i = (j + 67) % 128;
            setPivotYN16904 setpivotyn16904 = new setPivotYN16904(z1.b.a);
            int i3 = i + 57;
            j = i3 % 128;
            if (i3 % 2 != 0) {
                return setpivotyn16904;
            }
            throw null;
        }
        int i4 = j;
        i = ((i4 & 1) + (i4 | 1)) % 128;
        int b = e4.b();
        ConnectivityManager connectivityManager = (ConnectivityManager) a2.a(new Object[]{a2Var}, e4.b(), e4.b(), 612437174, -612437173, b, e4.b());
        connectivityManager.getClass();
        Network activeNetwork = connectivityManager.getActiveNetwork();
        activeNetwork.getClass();
        int b2 = e4.b();
        NetworkCapabilities networkCapabilities = ((ConnectivityManager) a2.a(new Object[]{a2Var}, e4.b(), e4.b(), 612437174, -612437173, b2, e4.b())).getNetworkCapabilities(activeNetwork);
        networkCapabilities.getClass();
        vD14832N6715 vd14832n6715 = new vD14832N6715(Boolean.valueOf(networkCapabilities.hasTransport(4)));
        int i5 = i;
        int i6 = (i5 & 7) + (i5 | 7);
        j = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 20 / 0;
        }
        return vd14832n6715;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ D8871<? extends Boolean, ? extends z1.b> invoke() {
        int i2 = j;
        i = ((i2 ^ 67) + ((i2 & 67) << 1)) % 128;
        D8871<Boolean, z1.b> b = b();
        int i3 = j;
        int i4 = (i3 ^ 17) + ((i3 & 17) << 1);
        i = i4 % 128;
        if (i4 % 2 == 0) {
            return b;
        }
        throw null;
    }
}

package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.os.Process;
import com.fingerprintjs.android.fpjs_pro_internal.C1722;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "", "b", "()Ljava/util/Map;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class h4 extends Lambda implements Function0<Map<String, Boolean>> {
    public static int i = 0;
    public static int j = 0;
    public static int k = 0;
    public static int l = 1;
    public final /* synthetic */ i4 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(i4 i4Var) {
        super(0);
        this.h = i4Var;
    }

    public static int vD14832N6715() {
        int i2 = i;
        int i3 = i2 % 8829571;
        i = i2 + 1;
        if (i3 != 0) {
            return j;
        }
        int myPid = Process.myPid();
        j = myPid;
        return myPid;
    }

    public final Map<String, Boolean> b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String pivotYN16904 = C1722.h3.e.setPivotYN16904();
        i4 i4Var = this.h;
        bc b = i4.b(i4Var);
        int i2 = i4.c + 27;
        i4.d = i2 % 128;
        int i3 = i2 % 2;
        Context context = i4Var.b;
        if (i3 != 0) {
            linkedHashMap.put(pivotYN16904, b.setPivotYN16904(context, "development_settings_enabled"));
            String pivotYN169042 = C1722.b3.e.setPivotYN16904();
            bc b2 = i4.b(i4Var);
            int i4 = i4.c + 27;
            i4.d = i4 % 128;
            if (i4 % 2 != 0) {
                linkedHashMap.put(pivotYN169042, b2.setPivotYN16904(context, "adb_enabled"));
                k = (l + 97) % 128;
                return linkedHashMap;
            }
            throw null;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Map<String, Boolean> invoke() {
        int i2 = k;
        int i3 = (i2 ^ 97) + ((i2 & 97) << 1);
        l = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Boolean> b = b();
        if (i4 == 0) {
            int i5 = 28 / 0;
        }
        return b;
    }
}

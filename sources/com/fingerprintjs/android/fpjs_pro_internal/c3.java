package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class c3 extends Lambda implements Function0<String> {
    public static int i = 0;
    public static int j = 1;
    public static int k;
    public static int l;
    public final /* synthetic */ d3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(d3 d3Var) {
        super(0);
        this.h = d3Var;
    }

    public static int D8871() {
        int i2 = k;
        int i3 = i2 % 9415414;
        k = i2 + 1;
        if (i3 != 0) {
            return l;
        }
        int maxMemory = (int) Runtime.getRuntime().maxMemory();
        l = maxMemory;
        return maxMemory;
    }

    public final String b() {
        int i2 = j + 113;
        i = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.h};
        int a = q2.a();
        int a2 = q2.a();
        int a3 = q2.a();
        int a4 = q2.a();
        if (i3 == 0) {
            String b = d3.b(objArr, 1782223651, a2, a, a4, a3, -1782223651);
            int i4 = j + 61;
            i = i4 % 128;
            if (i4 % 2 == 0) {
                return b;
            }
            throw null;
        }
        d3.b(objArr, 1782223651, a2, a, a4, a3, -1782223651);
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ String invoke() {
        int i2 = i + 101;
        j = i2 % 128;
        if (i2 % 2 != 0) {
            return b();
        }
        b();
        throw null;
    }
}

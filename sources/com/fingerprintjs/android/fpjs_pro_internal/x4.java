package com.fingerprintjs.android.fpjs_pro_internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", "b", "()Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class x4 extends Lambda implements Function0<List<? extends String>> {
    public static int i = 0;
    public static int j = 1;
    public static int k;
    public static int l;
    public final /* synthetic */ z4 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(z4 z4Var) {
        super(0);
        this.h = z4Var;
    }

    public static int vD14832N6715() {
        int i2 = k;
        int i3 = i2 % 7488151;
        k = i2 + 1;
        if (i3 != 0) {
            return l;
        }
        int freeMemory = (int) Runtime.getRuntime().freeMemory();
        l = freeMemory;
        return freeMemory;
    }

    public final List<String> b() {
        int i2 = j + 37;
        i = i2 % 128;
        int i3 = i2 % 2;
        z4 z4Var = this.h;
        Object[] objArr = {z4Var};
        int b = s.b();
        int b2 = s.b();
        int b3 = s.b();
        int b4 = s.b();
        if (i3 == 0) {
            List<String> D8871 = ((bc) z4.b(objArr, b, 1553402766, b2, -1553402765, b3, b4)).D8871((List) z4.b(new Object[]{z4Var}, s.b(), 2140404088, s.b(), -2140404088, s.b(), s.b()));
            D8871.getClass();
            int i4 = j + 91;
            i = i4 % 128;
            if (i4 % 2 == 0) {
                return D8871;
            }
            throw null;
        }
        ((bc) z4.b(objArr, b, 1553402766, b2, -1553402765, b3, b4)).D8871((List) z4.b(new Object[]{z4Var}, s.b(), 2140404088, s.b(), -2140404088, s.b(), s.b())).getClass();
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ List<? extends String> invoke() {
        int i2 = i;
        j = (((i2 | 3) << 1) - (i2 ^ 3)) % 128;
        List<String> b = b();
        j = (i + 123) % 128;
        return b;
    }
}

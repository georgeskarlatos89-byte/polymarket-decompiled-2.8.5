package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.br;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/w5;", "b", "()Lcom/fingerprintjs/android/fpjs_pro_internal/w5;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class w0 extends Lambda implements Function0<w5> {
    public static int i = 0;
    public static int j = 1;
    public final /* synthetic */ X26477 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(X26477 x26477) {
        super(0);
        this.h = x26477;
    }

    public final w5 b() {
        int i2 = i + 21;
        j = i2 % 128;
        int i3 = i2 % 2;
        X26477 x26477 = this.h;
        if (i3 != 0) {
            int a = br.component9.a();
            w5 w5Var = (w5) X26477.b(new Object[]{x26477}, br.component9.a(), -1838074377, br.component9.a(), a, br.component9.a(), 1838074377);
            int i4 = i;
            j = ((i4 & 5) + (i4 | 5)) % 128;
            return w5Var;
        }
        int a2 = br.component9.a();
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ w5 invoke() {
        j = (i + 89) % 128;
        w5 b = b();
        int i2 = j;
        int i3 = (i2 ^ 81) + ((i2 & 81) << 1);
        i = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 65 / 0;
        }
        return b;
    }
}

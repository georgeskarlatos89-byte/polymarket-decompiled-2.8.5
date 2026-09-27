package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro.NotAvailableWithoutUA;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class o4 extends Lambda implements Function1<String, Boolean> {
    public static final o4 h = new Lambda(1);
    public static int i = 0;
    public static int j = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.Lambda, com.fingerprintjs.android.fpjs_pro_internal.o4] */
    static {
        if (((1 ^ 105) + ((1 & 105) << 1)) % 2 == 0) {
        } else {
            throw null;
        }
    }

    public o4() {
        super(1);
    }

    public final Boolean a(String str) {
        boolean z;
        int i2 = i;
        j = ((i2 & 9) + (i2 | 9)) % 128;
        if (str.length() == 0) {
            i = (j + 21) % 128;
            z = true;
        } else {
            int i3 = j;
            i = ((i3 & 31) + (i3 | 31)) % 128;
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        int i4 = j;
        i = (((i4 | 19) << 1) - (i4 ^ 19)) % 128;
        return valueOf;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(String str) {
        NotAvailableWithoutUA.component9();
        NotAvailableWithoutUA.component9();
        Boolean a = a(str);
        int i2 = i;
        int i3 = (i2 ^ 7) + ((i2 & 7) << 1);
        j = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 91 / 0;
        }
        return a;
    }
}
